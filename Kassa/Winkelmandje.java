package com.company.Kassa;

import java.util.Scanner;

public class Winkelmandje{
    int ticketAantal;
    //   double ticketPrijs;
    int ticketBesellen(){
        System.out.println("Hoeveel tickets wilt u bestellen?");
        Scanner sc2 = new Scanner(System.in);
        int inputTicket = sc2.nextInt();
        int ticketAantal = inputTicket;
        return ticketAantal;
    }
//            System.out.println(+ Winkelmandje.ticketAantal + " besteld");
}