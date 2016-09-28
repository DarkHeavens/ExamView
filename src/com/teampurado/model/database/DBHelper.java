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
                    " (teacherID char(10) not null,"+
                    " subjectID varchar(20) not null"+
                    " day varchar(8), "+
                    " time varchar(60)"+
                    " primary key(teacherID),"+
                    " primary key(subjectID),"+
                    " foreign key(id) references examview.teacher(id),"+
                    " foreign key(id) references examview.subject(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
            createTable = "create table if not exists"+EXAM+
                    " (examID tinyint not null"+
                    " teacherID char(10)"+
                    " subjectID varchar(10)"+
                    " numOfItems smallint"+
                    " timeLimit char(8)"+
                    " password varchar(126)"+
                    " primary key(examID),"+
                    " foreign key(examID) references examview.exam(examID),"+
                    " foreign key(id) references examview.teacher(id),"+
                    " foreign key(id) references examview.subject(id))";
            stmt = conn.createStatement();
            stmt.execute(createTable);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
