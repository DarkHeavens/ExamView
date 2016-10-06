package com.teampurado.model.database;

import com.teampurado.model.classes.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DarkHeavens & ProfessorSci
 */
public class DBHelper {
    
    private Connection conn;
    private Statement stmt;
    private PreparedStatement prestmt;
    
    public final static String TEACHER = "teacher",
            SUBJECT = "subject",
            SUBJECT_TEACHER = "subject_teacher",
            STUDENT = "student",
            ATTEMPT = "attempt",
            EXAM = "exam",
            QUESTION_BANK = "question_bank",
            REPORT = "report";
    
    private ResultSet rs;
    
    public DBHelper() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examview","root","");
            stmt = conn.createStatement();
            
            execute("create table if not exists "+TEACHER+
                    " (id char(10) not null,"+
                    " name varchar(50),"+
                    " password varchar(126),"+
                    " primary key(id))");
            
            execute("create table if not exists "+SUBJECT+
                    " (code varchar(20) not null,"+
                    " description text,"+
                    " primary key(code))");
            
            execute("create table if not exists "+SUBJECT_TEACHER+
                    " (teacherID char(10) not null,"+
                    " subjectCode varchar(20) not null,"+
                    " primary key(teacherID,subjectCode),"+
                    " foreign key(teacherID) references teacher(id) on delete cascade on update cascade,"+
                    " foreign key(subjectCode) references subject(code) on delete cascade on update cascade)");
            
            execute("create table if not exists "+EXAM+
                    " (examID tinyint not null auto_increment,"+
                    " teacherID char(10) not null,"+
                    " subjectCode varchar(20) not null,"+
                    " description text,"+
                    " numOfItems smallint default 5,"+
                    " timeLimit char(8),"+
                    " password varchar(126),"+
                    " status boolean not null,"+
                    " primary key(examID, teacherID, subjectCode),"+
                    " foreign key(teacherID) references subject_teacher(teacherID) on delete cascade on update cascade,"+
                    " foreign key(subjectCode) references subject_teacher(subjectCode) on delete cascade on update cascade)");
            
            execute("create table if not exists "+QUESTION_BANK+
                    " (QBankID tinyint not null,"+
                    " questionNo smallint not null,"+
                    " numOfPoints tinyint default 1,"+
                    " ask longtext,"+
                    " answer text,"+
                    " choices text,"+
                    " primary key(QBankID, questionNo),"+
                    " foreign key(QBankID) references exam(examID) on delete cascade on update cascade)");
            
            execute("create table if not exists "+STUDENT+
                    " (id char(10) not null,"+
                    " name varchar(50),"+
                    " password varchar(126),"+
                    " primary key(id))");
            
            execute("create table if not exists "+ATTEMPT+
                    " (examID tinyint not null,"+
                    " studentID char(10) not null,"+
                    " status boolean not null,"+
                    " primary key(examID,studentID),"+
                    " foreign key(examID) references exam(examID) on delete cascade on update cascade,"+
                    " foreign key(studentID) references student(id) on delete cascade on update cascade)");
            
            execute("create table if not exists "+REPORT+
                    " (examID tinyint not null,"+
                    " studentID char(10) not null,"+
                    " myScore int,"+
                    " totalScore int,"+
                    " primary key(studentID, examID),"+
                    " foreign key(examID) references exam(examID) on delete cascade on update cascade,"+
                    " foreign key(studentID) references attempt(studentID) on delete cascade on update cascade)");    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void init() {
        if(!execute("select * from information_schema.tables where table_rows = 0")) {
            add(new Teacher("1898006012","ANTONINO, MARK CEDRICK","java"));
            add(new Subject("OOP 1","Introduction to Object-Oriented Programming in Java"));
            add(new SubjectTeacher("1898006012","OOP 1"));
            add(new Student("2014012112","SANCHEZ, KENNETH","master"));
            add(new Student("2014011604","CANOY, JEM","disciple"));
            add(new Exam("1898006012","OOP 1","ExamView",(short)5,"00:10:00","java",true));
            add(new QuestionBank((byte)1,(short)1,(byte)1,"What is the correct syntax for the main method of a java class?","public static void main(String[] args)","public static int main(String[] args)|public int main(String[] args)|public static void main(String[] args)|None of the above."));
            add(new QuestionBank((byte)1,(short)2,(byte)1,"What is inheritance?","It is the process of where one object acquires the properties of the another.","It is the process of where one object acquires the properties of the another.|It is the ability of an object to take on many forms|Inheritance is a technique to define different methods of same type.|None of the above."));
            add(new QuestionBank((byte)1,(short)3,(byte)1,"All classes extends from _____.","Object Class","Main Class|Super class|Parent Class|Object Class"));
            add(new QuestionBank((byte)1,(short)4,(byte)1,"public class Outer\n{\n public void someOuterMethod()\n {\n  //Line 5\n  }\n public class Inner { }\n\n\n public static void main(String[] args) {\n {\n   Outer ot = new Outer();\n   //Line 10\n }\n}","new Inner(); //line 5","new Inner(); //line 5|new Inner(); //line 10|new ot.Inner(); //line 10|new Outer.Inner(); //line 10"));
            add(new QuestionBank((byte)1,(short)5,(byte)1,"How would you rate this program (Please answer honestly)?","100%","100%|100%|100%|100%"));
        }
    }
    
    public void add(Attempt obj) {
        execute("insert into "+ATTEMPT+" values ("+
                obj.getExamID()+",'"+
                obj.getStudentID()+"',"+
                obj.isStatus()+")");
    }
    
    public void add(Exam obj) {
        execute("insert into "+EXAM+" (teacherID, subjectCode, description, numOfItems, timeLimit, password, status)values ('"+
                obj.getTeacherID()+"','"+
                obj.getSubjectCode()+"','"+
                obj.getDescription()+"',"+
                obj.getNumOfItems()+",'"+
                obj.getTimeLimit()+"','"+
                obj.getPassword()+"',"+
                obj.isStatus()+")");
    }
    
    public void add(QuestionBank obj) {
        execute("insert into "+QUESTION_BANK+" values ("+
                obj.getQBankID()+","+
                obj.getQuestionNo()+","+
                obj.getNumOfPoints()+",'"+
                obj.getAsk()+"','"+
                obj.getAnswer()+"','"+
                obj.getChoices()+"')");
    }
    
    
    public void add(Report obj) {
        execute("insert into "+REPORT+" values ("+
                obj.getExamID()+",'"+
                obj.getStudentID()+"',"+
                obj.getMyScore()+","+
                obj.getTotalScore()+")");
    }
    
    public void add(Student obj) {
        execute("insert into "+STUDENT+" values ('"+
                obj.getId()+"','"+
                obj.getName()+"','"+
                obj.getPassword()+"')");
    }
    
    public void add(Subject obj) {
        execute("insert into "+SUBJECT+" values ('"+
                obj.getCode()+"','"+
                obj.getDescription()+"')");
    }
    
    public void add(SubjectTeacher obj) {
        execute("insert into "+SUBJECT_TEACHER+" values ('"+
                obj.getTeacherID()+"','"+
                obj.getSubjectCode()+"')");
    }
    
    public void add(Teacher obj) {
        execute("insert into "+TEACHER+" values ('"+
                obj.getId()+"','"+
                obj.getName()+"','"+
                obj.getPassword()+"')");
    }
    
    public final boolean execute(String sql) {
        try {
            return stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ResultSet executeQuery(String sql) {
        try {
            return stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
}
