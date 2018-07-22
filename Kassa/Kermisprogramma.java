package com.company.Kassa;

/* UITLEG POS systeem bij de kermis - Arne van Buel
Ik zal zo veel mogelijk van de stappen proberen te beschrijven. Dit gedeelte beschrijft alleen de klantreis door het programma heen.
Bij binnenkomst krijgt de klant een NAAM en een IDNUMMER (voor de opdracht begin ik bij 1)
*/

public class Kermisprogramma {
    public static void main(String[] args) {
        Kassa kassa = new Kassa();
        Omzet omzet = new Omzet();
        Kermis entree = new Kermis();
        Hawaii attractieEen = new Hawaii();
        entree.start();
    }
}
