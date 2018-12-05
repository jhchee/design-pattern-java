package com.vincent.mvc_pattern;

/**
 * Depict the student model
 * Student model contains the logic to alter the data field
 * Controller will receive the control of the model, so that it alter the value using the logic
 * View in turns will be notified by controller so that it will update the user
 */
public class Student {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}