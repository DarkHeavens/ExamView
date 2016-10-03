package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class SubjectTeacher {
    
    private String teacherID;
    private String subjectCode;
    private String day;
    private String time;

    public SubjectTeacher(String teacherID, String subjectCode, String day, String time) {
        this.teacherID = teacherID;
        this.subjectCode = subjectCode;
        this.day = day;
        this.time = time;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
