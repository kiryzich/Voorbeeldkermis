package com.company.Kassa;

import com.company.Kassa.*;
import java.util.Scanner;

public class Klant {
    public Klant(){
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