package com.company;

import java.util.*;

//Author: Anne Cuzeau

public class App {
    public static void main(String args[]){

        /* Instantiates the following objects (the entire movie team):
        - 2 Crew members (account and makeup artist)
        - 3 Actors
        - 1 PA
        - 1 director
        */
        Crew makeupArtist = new Crew("John Doe", 50000, "Makeup");
        Crew accountant = new Crew("Arty Jiul", 30000, "Accounting");
        PA pa = new PA("Kelly Doey", 20, 1500, "Production");
        Director director = new Director("Frances Dormant", 10000, "Direction");
        Actor lead = new Actor("Nia Quale", 80000, "Lead");
        Actor supporting = new Actor("Malik Neeo", 80000, "Supporting Male");
        Actor supporting2 = new Actor("Malia Otu", 80000, "Supporting Female");

        //Add all crew members (crew, PA) to List of type Crew
        List<Crew> listCrew = new ArrayList<Crew>();
        listCrew.add(makeupArtist);
        listCrew.add(accountant);
        listCrew.add(pa);

        //Add all Actors to List of type Actor
        List<Actor> listActors = new ArrayList<Actor>();
        listActors.add(supporting);
        listActors.add(supporting2);
        listActors.add(lead);

        //Instantiate a new movie
        Movie newMovie = new Movie("Horror", 400000.0, 6000000, director, listActors, listCrew);

        //Print two constants: current Budget and Money Earned
        System.out.println("Movie budget = $"+ String.format("%,.2f", newMovie.getBudget()));
        System.out.println("Money earned = $"+ String.format("%,.2f", newMovie.getMoneyEarned()));

        //Call payDay method, which will calculate profit and pay every team member, then print Money Spent and Profits
        newMovie.payday();

        /*Print out:
        - how much the PA earned
        - how much the director made in royalties*/
        System.out.println("PA earned = $"+ String.format("%,.2f", pa.getTotal_earned()));
        System.out.println("Director royalties = $"+ String.format("%,.2f", director.getRoyalties()));

    }
}
