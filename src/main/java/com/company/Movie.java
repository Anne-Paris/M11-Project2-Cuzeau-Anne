package com.company;
import java.util.*;

public class Movie {
    //Instantiate variables & objects for Movie
    protected String genre;
    protected double budget;
    protected double moneySpent;
    protected double moneyEarned;
    protected double profit;
    protected Director director;
    protected List<Actor> actors;
    protected List<Crew> crew;

    //Constructor for movie. Money spent and profit start at 0 (calculated after payday is called).
    public Movie (String genre, double budget, double moneyEarned, Director director, List<Actor> actors, List<Crew> crew){
        this.moneySpent = 0;
        this.profit = 0;
        this.budget = budget;
        this.genre = genre;
        this.moneyEarned = moneyEarned;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
    }

    //Method Payday
    public void payday(){

        //Iterates through each Actor to pay them and adds each pay to counter moneySpent.
        for (Actor item: actors) {
            moneySpent += item.pay();
        }

        //Iterates through each Crew member to pay them and adds each pay to counter moneySpent.
        //PA will be hourly, others are salary.
        for (Crew item: crew) {
            moneySpent += item.pay();
        }

        //Pay Director (salary) and add to counter moneySpent.
        moneySpent += director.pay();

        //Print out money spent
        System.out.println("Money spent = $"+ String.format("%,.2f",moneySpent));

        //Call the profit setter and pass money spent.
        setProfit(moneySpent);
    }

    //Getter for profit
    public double getProfit(){
        return profit;
    }

    //Setter for profit. Uses the equation: Profit = budget - moneySpent + moneyEarned, then calls the method to set royalties (Director) to 1% of profit.
    public void setProfit(double moneySpent) {
        this.profit = budget - moneySpent + moneyEarned;
        director.setRoyalties(profit);
        System.out.println("Profits = $"+ String.format("%,.2f",getProfit()));
    }

    //Getters and setters for all other variables and objects in Movies
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }
}
