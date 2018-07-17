package com.company.Kassa;
// Mijn idee is om een entree te maken waarbij muntjes gekocht kunnen worden.
// De muntjes krijgen uiteraard een waarde mee.
import com.company.Attracties.*;
import com.company.Eten.*;
import java.util.Scanner;

public class Entree {
    public static int prijs = 0;

    public static void main(String[] args) {
        Botsauto botsauto1 = new Botsauto();
        Hamburger mexicano = new Hamburger();
        Lijst entree = new Lijst();
        entree.start();
        mexicano.voorstellen();
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
    void bestellen(){
        System.out.println("Kies een product");
        System.out.print("01 - Hamburger");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        switch (y){
            case 1: y = 0;
                System.out.println("U keuze is een " + eten[0] + ", met een prijs van €" +prijs[0]);
                    break;
            case 2: y = 1;
            break;

        }

 //       eten[0];
 //       prijs[0];
 //       System.out.println("bestellen");
    }
}