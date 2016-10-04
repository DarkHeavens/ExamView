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
            QUESTION = "question",
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
                    " description varchar(50),"+
                    " primary key(code))");
            
            execute("create table if not exists "+SUBJECT_TEACHER+
                    " (teacherID char(10) not null,"+
                    " subjectCode varchar(20) not null,"+
                    " day varchar(8) not null,"+
                    " time varchar(60) not null,"+
                    " primary key(teacherID,subjectCode),"+
                    " foreign key(teacherID) references examview.teacher(id) on delete cascade on update cascade,"+
                    " foreign key(subjectCode) references examview.subject(code) on delete cascade on update cascade)");
            
            execute("create table if not exists "+EXAM+
                    " (examID tinyint null auto_increment,"+
                    " teacherID char(10) not null,"+
                    " subjectCode varchar(20) not null,"+
                    " numOfItems smallint,"+
                    " timeLimit char(8),"+
                    " password varchar(126),"+
                    " status boolean not null,"+
                    " primary key(examID),"+
                    " foreign key(teacherID) references examview.teacher(id) on delete cascade on update cascade,"+
                    " foreign key(subjectCode) references examview.subject(code) on delete cascade on update cascade)");
            
            execute("create table if not exists "+QUESTION_BANK+
                    " (QBankID int not null,"+
                    " examID tinyint null,"+
                    " teacherID char(10) not null,"+
                    " description text not null,"+
                    " primary key(QBankID),"+
                    " foreign key(examID) references examview.exam(examID) on delete set null on update cascade,"+
                    " foreign key(teacherID) references examview.teacher(id) on delete cascade on update cascade)");
            
            execute("create table if not exists "+QUESTION+
                    " (questionNo smallint not null auto_increment,"+
                    " QBankID int not null,"+
                    " numOfPoints tinyint,"+
                    " ask text,"+
                    " answer text,"+
                    " choices text,"+
                    " primary key(questionNo),"+
                    " foreign key(QBankID) references examview.question_bank(QBankID) on delete cascade on update cascade)");
            
            execute("create table if not exists "+STUDENT+
                    " (id char(10) not null,"+
                    " name varchar(50),"+
                    " password varchar(126),"+
                    " primary key(id))");
            
            execute("create table if not exists "+ATTEMPT+
                    " (studentID char(10) not null,"+
                    " examID tinyint null,"+
                    " status boolean not null,"+
                    " primary key(studentID),"+
                    " foreign key(studentID) references examview.student(id) on delete cascade on update cascade,"+
                    " foreign key(examID) references examview.exam(examID) on delete set null on update cascade)");
            
            execute("create table if not exists "+REPORT+
                    " (studentID char(10) not null,"+
                    " examID tinyint null,"+
                    " totalScore int,"+
                    " primary key(studentID),"+
                    " foreign key(examID) references examview.exam(examID) on delete set null on update cascade,"+
                    " foreign key(studentID) references examview.student(id) on delete cascade on update cascade)");    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void add(Attempt obj) {
        execute("insert into "+ATTEMPT+" values ('"+
                obj.getStudentID()+"',"+
                obj.getExamID()+","+
                obj.isStatus()+")");
    }
    
    public void add(Exam obj) {
        execute("insert into "+EXAM+" values ("+
                obj.getExamID()+",'"+
                obj.getTeacherID()+"','"+
                obj.getSubjectCode()+"',"+
                obj.getNumOfItems()+",'"+
                obj.getTimeLimit()+"','"+
                obj.getPassword()+"',"+
                obj.isStatus()+")");
    }
    
    public void add(Question obj) {
        execute("insert into "+QUESTION+" values ("+
                obj.getQuestionNo()+","+
                obj.getQBankID()+","+
                obj.getNumOfPoints()+",'"+
                obj.getAsk()+"','"+
                obj.getAnswer()+"','"+
                obj.getChoices()+"')");
    }
    
    public void add(QuestionBank obj) {
        execute("insert into "+QUESTION_BANK+" values ("+
                obj.getQBankID()+","+
                obj.getExamID()+",'"+
                obj.getTeacherID()+"','"+
                obj.getDescription()+"')");
    }
    
    public void add(Report obj) {
        execute("insert into "+REPORT+" values ("+
                obj.getExamID()+",'"+
                obj.getStudentID()+"',"+
                obj.getTotalScore()+")");
    }
    
    public void add(Subject obj) {
        execute("insert into "+SUBJECT+" values ('"+
                obj.getCode()+"','"+
                obj.getDescription()+"')");
    }
    
    public void add(SubjectTeacher obj) {
        execute("insert into "+SUBJECT_TEACHER+" values ('"+
                obj.getTeacherID()+"','"+
                obj.getSubjectCode()+"','"+
                obj.getDay()+"','"+
                obj.getTime()+"')");
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
