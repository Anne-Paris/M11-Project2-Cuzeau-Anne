package com.company;

public class PA extends Crew{
    private double hoursWorked;
    private double totalPay;
    public PA(String name, double pay, double hoursWorked, String department){
        super(name, pay, department);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double pay() {
        totalPay = hoursWorked*pay;
        total_earned += totalPay;
        return totalPay;
    }

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