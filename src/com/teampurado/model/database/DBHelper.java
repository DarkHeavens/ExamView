package com.teampurado.model.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DarkHeavens & ProfessorSci
 */
public class DBHelper {
    //connection
    private Connection conn;
    //queries
    private Statement stmt;
    private PreparedStatement prestmt;
    
    //table elements
    private String TEACHER = "teacher",
            SUBJECT = "subject",
            SUBJECT_TEACHER = "subject_teacher",
            STUDENT = "student",
            ATTEMPT = "attempt",
            EXAM = "exam",
            QUESTION_BANK = "question_bank",
            QUESTION = "question",
            REPORT = "report";
    
    public DBHelper(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examView","root","");
            
            String createTable = "create table if not exists "+TEACHER+
                    " (id char(10) not null,"+
                    " name varchar(50),"+
                    " password varchar(126),"+
                    " primary key(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+SUBJECT+
                    " (id varchar(20) not null,"+
                    " name varchar(50),"+
                    " passord varchar(126),"+
                    " primary key(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+SUBJECT_TEACHER+
                    " (teacherID char(10),"+
                    " subjectID varchar(20),"+
                    " day varchar(8),"+
                    " time varchar(60),"+
                    " primary key(teacherID,subjectID),"+
                    " foreign key(teacherID) references examView.teacher(id),"+
                    " foreign key(subjectID) references examView.subject(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+EXAM+
                    " (examID tinyint not null auto_increment,"+
                    " teacherID char(10),"+
                    " subjectID varchar(10),"+
                    " numOfItems smallint,"+
                    " timeLimit char(8),"+
                    " password varchar(126),"+
                    " primary key(examID),"+
                    " foreign key(teacherID) references examView.teacher(id),"+
                    " foreign key(subjectID) references examView.subject(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+QUESTION_BANK+
                    " (qBankID tinyint not null,"+
                    " examID tinyint,"+
                    " primary key(qBankID),"+
                    " foreign key(examID) references examView.exam(examID))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+QUESTION+
                    " (questionNo smallint not null auto_increment,"+
                    " qBankID tinyint,"+
                    " numOfPoints tinyint,"+
                    " answer text,"+
                    " choices text,"+
                    " password varchar(126),"+
                    " primary key(questionNo),"+
                    " foreign key(qBankID) references examView.question_bank(qBankID))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+STUDENT+
                    " (id char(10) not null,"+
                    " name varchar(50),"+
                    " passord varchar(126),"+
                    " primary key(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+ATTEMPT+
                    " (examID tinyint not null,"+
                    " studentID char(10),"+
                    " startTime char(8),"+
                    " endTime char(8),"+
                    " primary key(examID,studentID),"+
                    " foreign key(examID) references examView.exam(examID),"+
                    " foreign key(studentID) references examView.student(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists "+REPORT+
                    " (examID tinyint not null,"+
                    " studentID char(10),"+
                    " totalScore int,"+
                    " primary key(examID),"+
                    " foreign key(examID) references examView.exam(examID),"+
                    " foreign key(studentID) references examView.student(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

}
