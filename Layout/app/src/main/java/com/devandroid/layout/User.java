package com.devandroid.layout;

public class User {
    private String name;
    private int tuoi;
    private String email;

    public User(String name, int tuoi, String email) {
        this.name = name;
        this.tuoi = tuoi;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
