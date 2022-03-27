package com.company;

public class Director extends Crew{
    private double royalties;

    public Director(String name, double pay, String department){
        super(name, pay, department);
    }

    public void setRoyalties(double profit){
       this.royalties = profit*0.01;
    }

    public double getRoyalties(){
        return royalties;
    }

    @Override
    public double getTotal_earned(){
        double pay = pay() + royalties;
        return pay;
    }

}
