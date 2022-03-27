package com.company;

public abstract class Person {

    protected String name;
    protected double pay;
    protected double total_earned;

    public Person(String name, double pay) {
        this.name = name;
        this.pay = pay;
        total_earned = 0;
    }

    public double pay(){
        this.total_earned += pay;
        return pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getTotal_earned() {
        return total_earned;
    }

    public void setTotal_earned(double total_earned) {
        this.total_earned = total_earned;
    }
}
