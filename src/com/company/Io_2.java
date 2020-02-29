package com.company;
/* program realizuje sortowanie bąbelkow */
import java.util.Scanner;

public class Io_2{
    final static int MAXTAB = 99;
    static int wczytaj_liczbe(int min, int max){
        int wynik;
        do{
            System.out.println("podaj liczbe calkowita z zakresu? "+ min + " - " + max);
            Scanner input=new Scanner(System.in);
            wynik = input.nextInt();
        }while (wynik > max || wynik < min);
        return wynik;
    }
    public static void zamien_jezeli_wieksza(int [] tab, int pos_mn, int pos_wk){
        int tmp;
        if (tab[pos_mn] > tab[pos_wk]) {
            tmp = tab[pos_mn];
            tab[pos_mn] = tab[pos_wk];
            tab[pos_wk] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] tablica = new int[MAXTAB];
        int ile, i, j;
        System.out.println("\nJestem program sortujacy\n\nile liczb chcesz sortowac\n");
        ile = wczytaj_liczbe(0, MAXTAB);

        for (i = 0; i < ile; i++) {
            System.out.println("Wczytuje liczbe nr " + (i+1));
            tablica[i] = wczytaj_liczbe(0, 999);
        }
        for (i = 0; i < ile ; i++) {
            for (j = i; j < ile; j++) {
                zamien_jezeli_wieksza(tablica, i, j);
            }
        }
                System.out.println("Posortowane:");
                for (i = 0; i < ile; i++)
                    System.out.println("\nliczba nr " + (i+1) + " " + tablica[i]);
            }


}
