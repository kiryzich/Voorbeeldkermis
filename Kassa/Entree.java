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

class Klant{
    String naam;

}

class Teller{
    double[][][] tellerArray = new double[10][5][5]; // dit is een kubes met als doel: [klantID] (wij kunnen dus maar 10 klanten bedienen!!) [aantalAttr] [ritPrijs]. In het aantal attracties wordt gemeten door deze klant hoeveel tickets hij heeft gekocht. De laatste array staat vast en de klantID word per klant ++klantID gedaan. Hier koppel ik weer ene Sting naam; aan vast. Dit voor de laatste print!!

}

class Lijst { // deze lijst moet de andere lijsten aanroepen
    Lijst() {
        System.out.println("Welkom bij de kermis. Wat wilt u gaan doen?");
    }

    String[] attractie = {"De botsauto's", "De legendarische spin", "Het spiegelpaleis", "Het spookhuis", "De hawaaiiiii", "Het ladderzatklimmen"};
    int[] prijs = {10};

    void start() {
        System.out.println("Kies een nummer om verder te gaan");
        bestellen();
    }

    void doorGaanMetBestellen() {
        System.out.print("Wilt u nog een bestelling doen? [ja] of [nee]");
        System.out.println("");
        Scanner sc2 = new Scanner(System.in);
        String weer = sc2.nextLine();
        switch (weer) {
            case "ja":
            case "Ja":
            case "jA":
            case "JA":   // 4 verschillende (2 letters op 2 maniers = 2^2 = 4 maniered) geschreven zodat de Ja hoe dan ook gepakt wordt!
                System.out.println("U kunt uw volgende bestelling plaatsen!");
                bestellen();
                break;
            case "nee":
            case "Nee":
            case "NEE": // de andere spelfouten pakt de default maar hoor!
                System.out.println("Bedankt voor uw bestelling!");
                break;
            default:
                System.out.println("Dit is geen geldige keuze, probeer het opnieuw! [Derp Derp]");
                doorGaanMetBestellen();
                break;
        }
    }

    void bestellen() {
        System.out.println("Voor welke attractie wilt u een ticket kopen?");
        int x;
        for (x = 0; x < attractie.length; x++) {
            System.out.println((x + 1) + " - " + attractie[x] + "");
        }

        System.out.println("TOT HIER <<<<<<<<<<< PLACEHOLDER");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        switch (y) {
            case 1:
                y = 1;
                System.out.println("U keuze is een " + attractie[0] + ", met een prijs van €" + prijs[0]);
                doorGaanMetBestellen();
                break;
            case 2:
                y = 2;
                System.out.println("U keuze is een " + attractie[1] + ", met een prijs van €" + prijs[1]);
                doorGaanMetBestellen();
                break;
            default :
                System.out.println("Uw keuze staat er niet bij, kies opnieuw");
                bestellen();
                break;
        }
    }
}