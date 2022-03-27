package com.company;

import java.util.*;


public class App {
    public static void main(String args[]){
        Crew makeupArtist = new Crew("John Doe", 50000, "Makeup");
        Crew accountant = new Crew("Arty Jiul", 30000, "Accounting");
        PA pa = new PA("Kelly Doey", 20, 1500, "Production");
        Director director = new Director("Frances Dormant", 10000, "Direction");
        Actor lead = new Actor("Nia Quale", 80000, "Lead");
        Actor supporting = new Actor("Malik Neeo", 80000, "Supporting Male");
        Actor supporting2 = new Actor("Malia Otu", 80000, "Supporting Female");

        List<Crew> listCrew = new ArrayList<Crew>();
        listCrew.add(makeupArtist);
        listCrew.add(accountant);
        listCrew.add(pa);

        List<Actor> listActors = new ArrayList<Actor>();
        listActors.add(supporting);
        listActors.add(supporting2);
        listActors.add(lead);

        Movie newMovie = new Movie("Horror", 400000.0, 6000000, director, listActors, listCrew);
        System.out.println("Budget = "+ String.format("%,.2f", newMovie.getBudget()));
        System.out.println("Money earned = "+ String.format("%,.2f", newMovie.getMoneyEarned()));
        System.out.println("Let's do payday!");
        newMovie.payday();
        System.out.println("PA = "+ String.format("%,.2f", pa.getTotal_earned()));
        System.out.println("Director royalties= "+ String.format("%,.2f", director.getRoyalties()));
        System.out.println("Director Pay= "+ String.format("%,.2f", director.getPay()));
        System.out.println("Director Total Pay = "+ String.format("%,.2f", director.getTotal_earned()));
    }
}
