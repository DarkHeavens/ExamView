package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class Attempt {

    private byte examID;
    private String studentID;
    private boolean status;

    public Attempt(byte examID, String studentID, boolean status) {
        this.studentID = studentID;
        this.examID = examID;
        this.status = status;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public byte getExamID() {
        return examID;
    }

    public void setExamID(byte examID) {
        this.examID = examID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
