package com.teampurado.model.classes;

import java.sql.Time;

/**
 *
 * @author ProfessorSci
 */
public class Exam {
    
    private byte examID;
    private String teacherID;
    private String subjectID;
    private short numOfItems;
    private Time timeLimit;
    private String password;

    public Exam(byte examID, String teacherID, String subjectID, short numOfItems, Time timeLimit, String password) {
        this.examID = examID;
        this.teacherID = teacherID;
        this.subjectID = subjectID;
        this.numOfItems = numOfItems;
        this.timeLimit = timeLimit;
        this.password = password;
    }

    public byte getExamID() {
        return examID;
    }

    public void setExamID(byte examID) {
        this.examID = examID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public short getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(short numOfItems) {
        this.numOfItems = numOfItems;
    }

    public Time getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Time timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
