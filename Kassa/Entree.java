package com.company.Kassa;

/* UITLEG POS systeem bij de kermis - Arne van Buel
Ik zal zo veel mogelijk van de stappen proberen te beschrijven. Dit gedeelte beschrijft alleen de klantreis door het programma heen.
Bij binnenkomst krijgt de klant een NAAM en een IDNUMMER (voor de opdracht begin ik bij 1)
*/

import com.company.Attracties.*;
import java.util.Scanner;

public class Entree {

    public static void main(String[] args) {
        Botsauto botsauto1 = new Botsauto();
        Lijst entree = new Lijst();
        entree.start();
        botsauto1.rijden();
    }
}

class Lijst { // deze lijst moet de andere lijsten aanroepen
    Lijst() {
        System.out.println("Welkom bij de kermis. Wat wilt u gaan doen?");
    }
    String[] eten = {"Hamburger"};
    int[] prijs = {10};
    void start(){
        System.out.println("Kies een nummer om verder te gaan");
        bestellen();
    }

    void doorGaanMetBestellen() {
        System.out.print("Wilt u nog een bestelling doen? [ja] of [nee]");
        Scanner sc2 = new Scanner(System.in);
        String weer = sc2.nextLine();
        switch (weer) {
            case "ja":
                System.out.println("U kunt uw volgende bestelling plaatsen!");
                bestellen();
                break;
            case "nee":
                System.out.println("Bedankt voor uw bestelling!");
                break;

        }
    }
    void bestellen(){
        System.out.println("Kies een product");
        System.out.print("01 - Hamburger");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        switch (y){
            case 1: y = 0;
                System.out.println("U keuze is een " + eten[0] + ", met een prijs van €" +prijs[0]);
                doorGaanMetBestellen();
                    break;
            case 2: y = 1;
            break;

        }



        }
 //       eten[0];
 //       prijs[0];
 //       System.out.println("bestellen");
    }