package com.company.Kermisprogramma;

import java.io.*;

abstract public class Attractie {
    static String naam;
    int prijs;
    int oppervlakte;
//    int[] verkochteTickts = new int[ticket1, ticket2, ticket3, ticket4, ticket5, ticket6];
    //Parentclass
//    static int[] verkochteTickets = new int[6];

}

class Hawaii extends Attractie implements RisicoRijkeAttractie {
    static int ticket1;
    public boolean opstellingsKeuring(
    ) {
        return false;
    }
    static int draaien()throws RuntimeException {
        if (ticket1 > 5){
            System.out.println("De monteur moet erbij geroepen worden");
            try {

            }
            catch (Exception e){

            }
        }
        ticket1 = ++ticket1;
        naam = "De Hawaiii";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket1 + " tickets verkocht in - " +naam);
        return ticket1;
    }
}

class Spin extends Attractie implements RisicoRijkeAttractie {

    static int ticket2;
        public boolean opstellingsKeuring() {
        return false;
    }
    static int draaien()throws RuntimeException {
        if (ticket2 > 10){
            System.out.println("De monteur moet erbij geroepen worden");
            try {

            }
            catch (Exception e){

            }
        }
        ticket2 = ++ticket2;
        naam = "De legendarische spin";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket2 + " tickets verkocht in - " +naam);
        return ticket2;
    }
}

class Ladder extends com.company.Kermisprogramma.Attractie {
    static int ticket3;
    static int draaien(){
        ticket3 = ++ticket3;
        naam = "De laddddddderrrrzat";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket3 + " tickets verkocht in - " +naam);
        return ticket3;
    }
}

class Spiegelpaleis extends com.company.Kermisprogramma.Attractie {
    static int ticket4;
    static int draaien(){
        ticket4 = ++ticket4;
        naam = "Het spiegelpaleis";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket4 + " tickets verkocht in - " +naam);
        return ticket4;
    }
}

class Botsauto extends com.company.Kermisprogramma.Attractie {
    static int ticket5;
    static int draaien(){
        ticket5 = ++ticket5;
        naam = "De Bouncycars";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket5 + " tickets verkocht in - " +naam);
        return ticket5;
    }
}

class Spookhuis extends com.company.Kermisprogramma.Attractie {
    static int ticket6;
    static int draaien(){
        ticket6 = ++ticket6;
        naam = "De HAUNTED house";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket6 + " tickets verkocht in - " +naam);
        return ticket6;
    }
}

interface RisicoRijkeAttractie {
    public boolean opstellingsKeuring();
}

/*
    int rondjes1 = 0;
    int rondjes2 = 0;
    int totaalrondjes1 = 0;
    int totaalrondjes2 = 0;
 */