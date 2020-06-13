package com.vmsoft.demo.demo.models;

public class Employee {


    private int id;
    private String name;
    private String last_name;
    private char status;

    public Employee() {

    }

    public Employee(int id, String name, String last_name, char status) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
