package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class Attempt {

    private String studentID;
    private String examID;
    private String startTime;
    private String endTime;

    public Attempt(String studentID, String examID, String startTime, String endTime) {
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

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
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
