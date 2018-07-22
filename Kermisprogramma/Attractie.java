package com.company.Kermisprogramma;

abstract public class Attractie {
    static String naam;
    int prijs;
    int oppervlakte;
    //Parentclass
//    static int[] verkochteTickets = new int[6];

}

class Hawaii extends Attractie implements RisicoRijkeAttractie {
    static int ticket;
    public boolean opstellingsKeuring(
    ) {
        return false;
    }
    static int draaien(){
        ticket = ++ticket;
        naam = "De Hawaiii";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket + " tickets verkocht in - " +naam);
        return ticket;
    }
}

class Spin extends com.company.Kermisprogramma.Attractie implements com.company.Kermisprogramma.RisicoRijkeAttractie {
    static int ticket;
        public boolean opstellingsKeuring() {
        return false;
    }
    static int draaien(){
        ticket = ++ticket;
        naam = "De legendarische spin";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket + " tickets verkocht in - " +naam);
        return ticket;
    }
}

class Ladder extends com.company.Kermisprogramma.Attractie {
    static int ticket;
    static int draaien(){
        ticket = ++ticket;
        naam = "De laddddddderrrrzat";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket + " tickets verkocht in - " +naam);
        return ticket;
    }
}

class Spiegelpaleis extends com.company.Kermisprogramma.Attractie {
    static int ticket;
    static int draaien(){
        ticket = ++ticket;
        naam = "Het spiegelpaleis";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket + " tickets verkocht in - " +naam);
        return ticket;
    }
}

class Botsauto extends com.company.Kermisprogramma.Attractie {
    static int ticket;
    static int draaien(){
        ticket = ++ticket;
        naam = "De Bouncycars";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket + " tickets verkocht in - " +naam);
        return ticket;
    }
}

class Spookhuis extends com.company.Kermisprogramma.Attractie {
    static int ticket;
    static int draaien(){
        ticket = ++ticket;
        naam = "De HAUNTED house";
        System.out.println(naam + " draait!");
        System.out.println("Check: " + ticket + " tickets verkocht in - " +naam);
        return ticket;
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