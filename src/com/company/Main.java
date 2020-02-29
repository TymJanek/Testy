package com.company;

import java.util.Scanner;


public class Main{
    final static int MAXTAB=99;
    public static void main(String[] args) {
        int[] tablica = new int[MAXTAB];
        int ile, i, j, min, minpos;
        System.out.println("\n\nJestem program sortujacy\n\nile liczb chcesz sortowac\n");
        ile = wczytaj_liczbe(0, MAXTAB);

        for (i = 0; i < ile; i++) {
            System.out.println("Wczytuje liczbe nr. " + (i + 1));
            tablica[i] = wczytaj_liczbe(0, 999);
        }
        for (i = 0; i < ile; i++) {
            min = tablica[i];
            minpos = i;

            for (j = i + 1; j < ile; j++) {
                if (tablica[j] < min) {
                    min = tablica[j];
                    minpos = j;
                }
            }

            przesun_1_w_gore(tablica, i, minpos);
            tablica[i] = min;
        }

System.out.println("\nPosortowane:");
for (i=0; i<ile; i++)
            System.out.println("\nliczba "+ i + " "+ tablica[i]);

}
    static int wczytaj_liczbe(int min, int max){
        int wynik;
        do{
            System.out.println("podaj liczbe calkowita z zakresu? "+ min + " - " + max);
            Scanner input=new Scanner(System.in);
            wynik=input.nextInt();
        }while ( true && wynik >= max && wynik <= min);
        return wynik;
    }


    /* funkcja przesuwa zawartość tablicy <tab> od pozycji <from>
do pozycji <to > o jedną pozycję w górę */
    static void przesun_1_w_gore(int []tab, int from, int to){
        tab[to] = tab[from];
    }
}