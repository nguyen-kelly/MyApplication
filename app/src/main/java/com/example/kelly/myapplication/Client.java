package com.example.kelly.myapplication;

public class Client {
    private String name;
    private String number;
    private String uid;

    // private sessions

    public Client(String name, String number, String uid) {
        this.name = name;
        this.number = number;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getUid() {
        return uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
