package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class Attempt {

    private String studentID;
    private byte examID;
    private String startTime;
    private String endTime;

    public Attempt(String studentID, byte examID, String startTime, String endTime) {
        this.studentID = studentID;
        this.examID = examID;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
}
