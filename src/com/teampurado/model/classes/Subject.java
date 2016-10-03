package com.teampurado.model.classes;

/**
 *
 * @author DarkHeavens
 */
public class Subject {
    
    private String code;
    private String description;

    public Subject(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
