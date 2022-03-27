package com.company;

public class Actor extends Person{
    protected String role;

    //Add role to constructor for Actor
    public Actor(String name, double pay, String role){
        super(name, pay);
        this.role = role;
    }

    //Getter and setter for Role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}