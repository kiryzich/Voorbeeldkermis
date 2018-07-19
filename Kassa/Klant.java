package com.company.Kassa;

import java.util.Scanner;

public class Klant {
    String naam;
    String voorstellen(){
        System.out.println("naam?");
        Scanner sc3 = new Scanner(System.in);
        String inputNaam = sc3.nextLine();
        inputNaam = naam;
        tellenKlant();
        return naam;
    }

    int ID;
    int tellenKlant(){
        int klantTeller = (++ID);
        System.out.println(naam);
        return ID;
    }
}
