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
                    " description varchar(50),"+
                    " primary key(code))");
            
            execute("create table if not exists "+SUBJECT_TEACHER+
                    " (subjTchrID tinyint not null auto_increment,"+
                    " teacherID char(10) not null,"+
                    " subjectCode varchar(20) not null,"+
                    " primary key(subjTchrID),"+
                    " foreign key(teacherID) references examview.teacher(id) on delete cascade on update cascade,"+
                    " foreign key(subjectCode) references examview.subject(code) on delete cascade on update cascade)");
            
            execute("create table if not exists "+EXAM+
                    " (examID tinyint not null auto_increment,"+
                    " teacherID char(10) not null,"+
                    " subjectCode varchar(20) not null,"+
                    " description text not null,"+
                    " numOfItems smallint,"+
                    " timeLimit char(8),"+
                    " password varchar(126),"+
                    " status boolean not null,"+
                    " primary key(examID),"+
                    " foreign key(teacherID) references examview.subject_teacher(teacherID) on delete cascade on update cascade,"+
                    " foreign key(subjectCode) references examview.subject_teacher(subjectCode) on delete cascade on update cascade)");
            
            execute("create table if not exists "+QUESTION_BANK+
                    " (QBankID tinyint,"+
                    " questionNo int,"+
                    " numOfPoints tinyint,"+
                    " ask text,"+
                    " answer text,"+
                    " choices text,"+
                    " primary key(questionNo),"+
                    " foreign key(QBankID) references examview.exam(examID))");
            
            execute("create table if not exists "+STUDENT+
                    " (id char(10) not null,"+
                    " name varchar(50),"+
                    " password varchar(126),"+
                    " primary key(id))");
            
            execute("create table if not exists "+ATTEMPT+
                    " (examID tinyint not null,"+
                    " studentID char(10) not null,"+
                    " status boolean not null,"+
                    " primary key(examID),"+
                    " foreign key(examID) references examview.exam(examID) on delete cascade on update cascade,"+
                    " foreign key(studentID) references examview.student(id) on delete cascade on update cascade)");
            
            execute("create table if not exists "+REPORT+
                    " (studentID char(10) not null,"+
                    " examID tinyint not null,"+
                    " myScore int,"+
                    " totalScore int,"+
                    " primary key(studentID),"+
                    " foreign key(examID) references examview.exam(examID) on delete cascade on update cascade,"+
                    " foreign key(studentID) references examview.attempt(studentID) on delete cascade on update cascade)");    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void add(Subject obj) {
        execute("insert into "+SUBJECT+" values ('"+
                obj.getCode()+"','"+
                obj.getDescription()+"')");
    }
    
    public void add(SubjectTeacher obj) {
        execute("insert into "+SUBJECT_TEACHER+" (teacherID,subjectCode) values ('"+
                obj.getTeacherID()+"','"+
                obj.getSubjectCode()+"')");
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
