package com.company;

public class Actor extends Person{
    protected String role;

    public Actor(String name, double pay, String role){
        super(name, pay);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}