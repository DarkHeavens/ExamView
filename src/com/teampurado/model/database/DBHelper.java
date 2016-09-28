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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","");
            
            String createtable = "create table if not exists "+TEACHER+
                    "(id char(10) not null, "+
                    " name varchar(50), "+
                    " primary key(id))";
            stmt = conn.createStatement();
            stmt.execute(createtable);
            
            createtable = "create table if not exists "+SUBJECT+
                    "(id varchar(20) not null, "+
                    " name varchar(50), "+
                    " primary key(id))";
            //stmt = conn.createStatement();
            stmt.execute(createtable);
            createtable = "create table if not exists "+SUBJECT+
                    "(id varchar(20) not null, "+
                    " name varchar(50), "+
                    " primary key(id))";
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
