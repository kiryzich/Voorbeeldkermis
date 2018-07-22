package com.company.Attracties;

abstract public class Attractie {
    Hawaii attractieEen = new Hawaii();
    static String naam;
    int prijs;
    int oppervlakte;
//    attractieEen.naam = "Hawaii";
    int draaien;
    //Parentclass
}

class Hawaii extends Attractie implements RisicoRijkeAttractie{


    @Override
    public boolean opstellingsKeuring(
                                      ) {
        return false;
    }
    void draaien(){
        System.out.println(attractieEen.naam + "draait!");
    }
}

class Spin extends Attractie implements RisicoRijkeAttractie{
    @Override
    public boolean opstellingsKeuring() {
        return false;
    }
}

class Ladder extends Attractie {
}

class Spiegelpaleis extends Attractie {
}

class Botsauto extends Attractie {
}

class Spookhuis extends Attractie{
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