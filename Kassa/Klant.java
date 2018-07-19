package com.company.Kassa;

import java.util.Scanner;

public class Klant {
    static String naam;
    static String voorstellen(){
        System.out.println("naam?");
        Scanner sc3 = new Scanner(System.in);
        String inputNaam = sc3.nextLine();
        inputNaam = naam;
        tellenKlant();
        return naam;
    }
    static int ID;
    static int tellenKlant(){
        int klantTeller = (++ID);
        System.out.println(ID);
        return ID;
    }
}
