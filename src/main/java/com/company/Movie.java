package com.company;
import java.util.*;

public class Movie {
    protected String genre;
    protected double budget;
    protected double moneySpent;
    protected double moneyEarned;
    protected double profit;
    protected Director director;
    protected List<Actor> actors;
    protected List<Crew> crew;

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

    public void payday(){

        for (Actor item: actors) {
            moneySpent += item.pay();
        }

        for (Crew item: crew) {
            moneySpent += item.pay();
        }

        moneySpent += director.pay();
        System.out.println("Money spent = "+ String.format("%,.2f",moneySpent));
        setProfit(moneySpent);
    }

    public double getProfit(){
        return profit;
    }

    public void setProfit(double moneySpent) {
        this.profit = budget - moneySpent + moneyEarned;
        director.setRoyalties(profit);
        System.out.println("Profit = "+ String.format("%,.2f",getProfit()));
    }

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
