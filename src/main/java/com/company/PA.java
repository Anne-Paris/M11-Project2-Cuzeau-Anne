package com.company;

public class PA extends Crew{
    //Instantiates two variables only used for PA: hoursWorked and totalPay
    private double hoursWorked;
    private double totalPay;

    //Constructor for PA
    public PA(String name, double pay, double hoursWorked, String department){
        super(name, pay, department);
        this.hoursWorked = hoursWorked;
    }

    //Pay is hourly: hourly pay * hours worked
    @Override
    public double pay() {
        totalPay = hoursWorked*pay;
        total_earned += totalPay;
        return totalPay;
    }

    //Getters and setters for total pay and hours worked
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
}