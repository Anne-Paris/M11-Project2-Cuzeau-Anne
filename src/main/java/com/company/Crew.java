package com.company;

public class Crew extends Person{
    protected String department;

    //Add Department to constructor for Crew
    public Crew(String name, double pay, String department){
        super(name, pay);
        this.department = department;
    }

    //Getter and setter for Department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
