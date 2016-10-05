package com.teampurado.model.classes;

/**
 *
 * @author ProfessorSci
 */
public class QuestionBank {
    
    private int QBankID;
    private byte examID;
    private String teacherID;

    public QuestionBank(int QBankID, byte examID, String teacherID) {
        this.QBankID = QBankID;
        this.examID = examID;
        this.teacherID = teacherID;
    }

    public QuestionBank(byte examID, String teacherID) {
        this.examID = examID;
        this.teacherID = teacherID;
    }

    public int getQBankID() {
        return QBankID;
    }

    public void setQBankID(int QBankID) {
        this.QBankID = QBankID;
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
    
}
