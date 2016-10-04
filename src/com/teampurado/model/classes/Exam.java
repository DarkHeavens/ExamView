package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class Exam {
    
    private byte examID;
    private String teacherID;
    private String subjectCode;
    private short numOfItems;
    private String timeLimit;
    private String password;
    private boolean status;

    public Exam(byte examID, String teacherID, String subjectCode, short numOfItems, String timeLimit, String password, boolean status) {
        this.examID = examID;
        this.teacherID = teacherID;
        this.subjectCode = subjectCode;
        this.numOfItems = numOfItems;
        this.timeLimit = timeLimit;
        this.password = password;
        this.status = status;
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

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public short getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(short numOfItems) {
        this.numOfItems = numOfItems;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
