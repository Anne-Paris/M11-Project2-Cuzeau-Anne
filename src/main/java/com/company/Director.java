package com.company;

public class Director extends Crew{
    //Instantiates two variables only used for director: royalties and totalPay
    private double royalties;
    private double totalPay;

    //Director constructor
    public Director(String name, double pay, String department){
        super(name, pay, department);
    }

    //Set royalties to 1% of profits
    public void setRoyalties(double profit){
       this.royalties = profit*0.01;
    }

    //Getter for royalty
    public double getRoyalties(){
        return royalties;
    }

    //Total earned includes royalties, both are accrued each time payday is ran
    @Override
    public double getTotal_earned(){
        totalPay += pay() + royalties;
        return totalPay;
    }

    //Getter and setter for total pay
    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
}
