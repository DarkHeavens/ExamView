package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class Attempt {

    private String studentID;
    private byte examID;
    private boolean status;

    public Attempt(String studentID, byte examID, boolean status) {
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
