package com.example.coscape;

public class Mentor {
    private String name;
    private String specialization;
    private String email;

    public Mentor(String name, String specialization, String email) {
        this.name = name;
        this.specialization = specialization;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getEmail() {
        return email;
    }
}