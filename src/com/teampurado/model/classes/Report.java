package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class Report {
    
    private byte examID;
    private String studentID;
    private int myScore;
    private int totalScore;

    public Report(byte examID, String studentID, int myScore, int totalScore) {
        this.examID = examID;
        this.studentID = studentID;
        this.myScore = myScore;
        this.totalScore = totalScore;
    }

    public byte getExamID() {
        return examID;
    }

    public void setExamID(byte examID) {
        this.examID = examID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getMyScore() {
        return myScore;
    }

    public void setMyScore(int myScore) {
        this.myScore = myScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    
}
