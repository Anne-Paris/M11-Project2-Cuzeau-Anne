package com.company;

public class Crew extends Person{
    protected String department;

    public Crew(String name, double pay, String department){
        super(name, pay);
        department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
