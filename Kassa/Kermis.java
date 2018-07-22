package com.company.Kassa;

import java.util.Scanner;

class Kassa{
    int ticketAantal;
    //   double ticketPrijs;
    static int ticketBestellen(){
        System.out.println("Hoeveel tickets wilt u bestellen?");
        Scanner sc2 = new Scanner(System.in);
        int inputTicket = sc2.nextInt();
        int ticketAantal = inputTicket;
        return ticketAantal;
    }
}

public class Kermis { // deze lijst moet de andere lijsten aanroepen
    Kermis() {
        System.out.println("Welkom bij de kermis.");
    }

    String[] attractie = {"De botsauto's", "De legendarische spin", "Het spiegelpaleis", "Het spookhuis", "De hawaaiiiii", "Het ladderzatklimmen"};
    double[] prijs = {250,225,275,320,290,500};

    void start() {
        System.out.println("Kies een nummer om verder te gaan");
        System.out.println();
        bestellen();
    }

    void doorGaanMetBestellen() { //voor het plaatsen van NOG een bestelling
        System.out.print("Wilt u nog een ticket kopen? [ja] of [nee]");
        System.out.println("");
        Scanner sc2 = new Scanner(System.in);
        String weer = sc2.nextLine();
        switch (weer) {
            case "ja":
            case "Ja":
            case "jA":
            case "JA":   // 4 verschillende (2 letters op 2 maniers = 2^2 = 4 maniered) geschreven zodat de Ja hoe dan ook gepakt wordt!
                System.out.println("In welke attractie wilt u nu?");
                bestellen();
                break;
            case "nee":
            case "Nee":
            case "NEE": // de andere spelfouten pakt de default maar hoor!
                System.out.println("De omzet voor vandaag wordt nu geprint!");
                Omzet.printLijst();
                Omzet.printBelasting();
                Omzet.printRisico();
                break;
            default:
                System.out.println("Dit is geen geldige keuze, probeer het opnieuw! [Derp Derp]");
                doorGaanMetBestellen();
                break;
        }
    }

    void menuTwee(){
        Scanner sc2 = new Scanner(System.in);
        String z = sc2.nextLine();
        switch (z) {
            case "b":
                System.out.println("BELASTING");
                doorGaanMetBestellen();
                break;
            case "o":
                System.out.println("OMZET");
                doorGaanMetBestellen();
                break;
            default :
                System.out.println("Uw keuze staat er niet bij, kies opnieuw");
                bestellen();
                break;
        }
    }

    void bestellen() {
        System.out.println("Voor welke attractie wilt u een ticket kopen?");
        int x;
        for (x = 0; x < attractie.length; x++) {
            System.out.println((x + 1) + " - " + attractie[x] + " dit kost €" + (prijs[x]/100) + ".");
        }
        System.out.println("7 - Andere actie");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        switch (y) {
            case 1:
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + (prijs[(y-1)]/100) + "0.");
                Botsauto.draaien();
                doorGaanMetBestellen();
                break;
            case 2:
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + (prijs[(y-1)]/100) + ".");
                Spin.draaien();
                doorGaanMetBestellen();
                break;
            case 3:
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + (prijs[(y-1)]/100) + ".");
                Spiegelpaleis.draaien();
                doorGaanMetBestellen();
                break;
            case 4:
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + (prijs[(y-1)]/100) + "0.");
                Spookhuis.draaien();
                doorGaanMetBestellen();
                break;
            case 5:
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + (prijs[(y-1)]/100) + "0.");
                Hawaii.draaien();
                doorGaanMetBestellen();
                break;
            case 6:
                System.out.println("U heeft een ticket gekocht voor " + attractie[(y-1)] + ", met een prijs van €" + (prijs[(y-1)]/100) + "0.");
                Ladder.draaien();
                doorGaanMetBestellen();
                break;
            case 7:
                System.out.println("b - Belastinginspecteur");
                System.out.println("o - Omzet printen");
                menuTwee();
                break;
            default :
                System.out.println("Uw keuze staat er niet bij, kies opnieuw");
                bestellen();
                break;
        }
    }
}


class Bestelling {
    public Bestelling(){
        int[] ticketsVerkocht = new int[6];
        int risicoTicketSpin = 0;
        int risicoTicketHawaii = 0;
    }
    static String naam;
    int ID = 1;
    int klantTeller = 1;
    String voorstellen(){
        System.out.println("naam?");
        Scanner sc3 = new Scanner(System.in);
        String inputNaam = sc3.nextLine();
        inputNaam = naam;
//        Klant.tellenKlant(ID);
        return naam;
    }
    int tellenKlant(int ID){
        klantTeller = (++ID);
        System.out.println(naam);
        return ID;
    }

}
// if String.equals("Arne"){ start inspecteur)