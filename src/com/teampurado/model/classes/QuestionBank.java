package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class QuestionBank {
    
    private int QBankID;
    private String examID;
    private String teacherID;
    private String description;

    public QuestionBank(int QBankID, String examID, String teacherID, String description) {
        this.QBankID = QBankID;
        this.examID = examID;
        this.teacherID = teacherID;
        this.description = description;
    }

    public int getQBankID() {
        return QBankID;
    }

    public void setQBankID(int QBankID) {
        this.QBankID = QBankID;
    }

    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
