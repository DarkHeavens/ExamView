package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class SubjectTeacher {
    
    private byte subjTchrID;
    private String teacherID;
    private String subjectCode;

    public SubjectTeacher(String teacherID, String subjectCode) {
        this.teacherID = teacherID;
        this.subjectCode = subjectCode;
    }

    public byte getSubjTchrID() {
        return subjTchrID;
    }

    public void setSubjTchrID(byte subjTchrID) {
        this.subjTchrID = subjTchrID;
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
    
}
