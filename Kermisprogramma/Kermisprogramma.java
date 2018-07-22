package com.company.Kermisprogramma;

/* UITLEG POS systeem bij de kermis - Arne van Buel
Ik zal zo veel mogelijk van de stappen proberen te beschrijven. Dit gedeelte beschrijft alleen de klantreis door het programma heen.
*/

public class Kermisprogramma {
    public static void main(String[] args) {
        Kassa kassa = new Kassa();
        Omzet omzet = new Omzet();
        Kermis entree = new Kermis();
        Hawaii hawaii = new Hawaii();
        Botsauto botsauto = new Botsauto();

        entree.start();
    }
}
