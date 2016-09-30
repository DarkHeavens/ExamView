package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class SubjectTeacher {
    private String teacherID;
    private String subjectID;
    private String day;
    private String time;

    public SubjectTeacher(String teacherID, String subjectID, String day, String time) {
        this.teacherID = teacherID;
        this.subjectID = subjectID;
        this.day = day;
        this.time = time;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
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
