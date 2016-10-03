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
                    " primary key(id))");
            
            execute("create table if not exists "+SUBJECT_TEACHER+
                    " (teacherID char(10),"+
                    " subjectCode varchar(20),"+
                    " day varchar(8),"+
                    " time varchar(60),"+
                    " primary key(teacherID,subjectID),"+
                    " foreign key(teacherID) references examview.teacher(id),"+
                    " foreign key(subjectCode) references examview.subject(code))");
            
            execute("create table if not exists "+EXAM+
                    " (examID tinyint not null auto_increment,"+
                    " teacherID char(10),"+
                    " subjectCode varchar(20),"+
                    " numOfItems smallint,"+
                    " timeLimit char(8),"+
                    " password varchar(126),"+
                    " primary key(examID),"+
                    " foreign key(teacherID) references examview.teacher(id),"+
                    " foreign key(subjectCode) references examview.subject(code))");
            
            execute("create table if not exists "+QUESTION_BANK+
                    " (QBankID int not null,"+
                    " examID tinyint,"+
                    " primary key(QBankID),"+
                    " foreign key(examID) references examview.exam(examID))");
            
            execute("create table if not exists "+QUESTION+
                    " (questionNo smallint not null auto_increment,"+
                    " QBankID int,"+
                    " numOfPoints tinyint,"+
                    " ask text"+
                    " answer text,"+
                    " choices text,"+
                    " primary key(questionNo),"+
                    " foreign key(QBankID) references examview.question_bank(QBankID))");
            
            execute("create table if not exists "+STUDENT+
                    " (id char(10) not null,"+
                    " name varchar(50),"+
                    " password varchar(126),"+
                    " primary key(id))");
            
            execute("create table if not exists "+ATTEMPT+
                    " (studentID char(10) not null,"+
                    " examID tinyint,"+
                    " startTime char(8),"+
                    " endTime char(8),"+
                    " primary key(studentID,examID),"+
                    " foreign key(studentID) references examView.student(id),"+
                    " foreign key(examID) references examView.exam(examID))");
            
            execute("create table if not exists "+REPORT+
                    " (examID tinyint not null,"+
                    " studentID char(10),"+
                    " totalScore int,"+
                    " primary key(examID),"+
                    " foreign key(examID) references examView.exam(examID),"+
                    " foreign key(studentID) references examView.student(id))");    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void add(Attempt obj) {
        executeQuery("insert into "+ATTEMPT+" values ("+
                obj.getStudentID()+","+
                obj.getExamID()+","+
                obj.getStartTime()+","+
                obj.getEndTime()+")");
    }
    
    public void add(Exam obj) {
        execute("insert into "+EXAM+" values ("+
                obj.getExamID()+","+
                obj.getTeacherID()+","+
                obj.getSubjectID()+","+
                obj.getNumOfItems()+","+
                obj.getTimeLimit()+","+
                obj.getPassword()+")");
    }
    
    public void add(Question obj) {
        execute("insert into "+QUESTION+" values ("+
                obj.getQuestionNo()+","+
                obj.getqBankID()+","+
                obj.getNumOfPoints()+","+
                obj.getAnswer()+","+
                obj.getChoices()+")");
    }
    
    public void add(QuestionBank obj) {
        execute("insert into "+QUESTION_BANK+" values ("+
                obj.getQBankID()+","+
                obj.getExamID()+")");
    }
    
    public void add(Report obj) {
        execute("insert into "+REPORT+" values ("+
                obj.getExamID()+","+
                obj.getStudentID()+","+
                obj.getTotalScore()+")");
    }
    
    public void add(Subject obj) {
        execute("insert into "+SUBJECT+" values ("+
                obj.getCode()+","+
                obj.getDescription()+")");
    }
    
    public void add(SubjectTeacher obj) {
        execute("insert into "+SUBJECT_TEACHER+" values ("+
                obj.getTeacherID()+","+
                obj.getSubjectCode()+","+
                obj.getDay()+","+
                obj.getTime()+")");
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
