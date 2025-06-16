package com.pluralsight.model;

public class Student {
    private Long id;
    private final String firstName;
    private final String lastName;
    private final String major;
    public Student(Long id, String firstName, String lastName,
                   String major) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }
    public Student(String firstName, String lastName,
                   String major) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }
    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMajor() {
        return major;
    }
}

