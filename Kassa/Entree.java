package com.company.Kassa;

/* UITLEG POS systeem bij de kermis - Arne van Buel
Ik zal zo veel mogelijk van de stappen proberen te beschrijven. Dit gedeelte beschrijft alleen de klantreis door het programma heen.
Bij binnenkomst krijgt de klant een NAAM en een IDNUMMER (voor de opdracht begin ik bij 1)
*/

import com.company.Attracties.*;
import java.util.Scanner;

public class Entree {
    public static void main(String[] args) {
        Klant klantID = new Klant();
        Lijst entree = new Lijst();
        entree.start();
//        botsauto1.rijden();
    }
}

class Klant{
    String naam;
}


class Winkelmandje{
 //   double ticketPrijs;
    static int ticketBesellen(){
        System.out.println("Hoeveel tickets wilt u bestellen?");
        Scanner sc2 = new Scanner(System.in);
        int inputTicket = sc2.nextInt();
        int ticketAantal = inputTicket;
        return ticketAantal;
    }
}

class TellerEen{

}