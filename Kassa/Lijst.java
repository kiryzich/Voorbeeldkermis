package com.company.Kassa;

import java.util.Scanner;

public class Lijst { // deze lijst moet de andere lijsten aanroepen
    Lijst() {
        System.out.println("Welkom bij de kermis. Wat wilt u gaan doen?");
    }

    String[] attractie = {"De botsauto's", "De legendarische spin", "Het spiegelpaleis", "Het spookhuis", "De hawaaiiiii", "Het ladderzatklimmen"};
    double[] prijs = {2.50,2.25,2.75,3.20,2.90,5.00};

    void start() {
        System.out.println("Kies een nummer om verder te gaan");
        bestellen();
    }

    void doorGaanMetBestellen() { //voor het plaatsen van NOG een bestelling
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
            System.out.println((x + 1) + " - " + attractie[x] + " dit kost €" + prijs[x] + ".");
        }

        System.out.println("TOT HIER <<<<<<<<<<< PLACEHOLDER");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        switch (y) {
            case 1:
                y = 1;
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + prijs[(y-1)]);
                Winkelmandje.ticketBesellen();
  //              System.out.println("U heeft " + ticketAantal + " tickets besteld voor de " + attractie[(y-1)] + ". Dit kost €" + (prijs[(y-1)] * Winkelmandje.ticketAantal) + ".");
                doorGaanMetBestellen();
                break;
            case 2:
                y = 2;
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + prijs[(y-1)]);
                doorGaanMetBestellen();
                break;
            case 3:
                y = 3;
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + prijs[(y-1)]);
                doorGaanMetBestellen();
                break;
            case 4:
                y = 4;
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + prijs[(y-1)]);
                doorGaanMetBestellen();
                break;
            case 5:
                y = 5;
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + prijs[(y-1)]);
                doorGaanMetBestellen();
                break;
            case 6:
                y = 6;
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + prijs[(y-1)]);
                doorGaanMetBestellen();
                break;
            default :
                System.out.println("Uw keuze staat er niet bij, kies opnieuw");
                bestellen();
                break;
        }
    }
}
