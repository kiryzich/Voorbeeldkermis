package com.company.Kassa;

/* UITLEG POS systeem bij de kermis - Arne van Buel
Ik zal zo veel mogelijk van de stappen proberen te beschrijven. Dit gedeelte beschrijft alleen de klantreis door het programma heen.
Bij binnenkomst krijgt de klant een NAAM en een IDNUMMER (voor de opdracht begin ik bij 1)
*/

public class Kermis {
    public static void main(String[] args) {
        Klant klantID = new Klant();
        Omzet omzet = new Omzet();
        klantID.voorstellen();
        Assortiment entree = new Assortiment();
        entree.start();
    }
}
