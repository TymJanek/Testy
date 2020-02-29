package com.company;

import java.util.Scanner;

public class Io_3 {
    final static int MAXTAB=99;
    final static int MAX_INT =0xffffffff;

    public static void main(String[] args) {
        int[] tablica = new int[MAXTAB];
        int[] tablica2 = new int[MAXTAB];
        int ile, i, j, k, minimum, minpos;
        System.out.println("\n\nJestem program sortujacy\n\nile liczb chcesz sortowac\n");
                ile=wczytaj_liczbe(0, MAXTAB);


        for (i=0; i<ile; i++) {
            System.out.println("Wczytuje liczbe nr " + (i+1));
            tablica[i]=wczytaj_liczbe(0, 999);
        }
        for (i=0 ; i<ile ; i++)
        {
            minimum = 0;
            minpos = 0;
            for (j = 0 ; j<ile ; j++)
            {
                if (tablica[j] < minimum)
                    minimum = tablica[j];
                minpos = j;
            }
            tablica2[j] = minimum;
            tablica[minpos] = MAX_INT;
        }
        System.out.println("\nPosortowane:");
        for (i = 0; i < ile; i++)
            System.out.println("\nliczba nr " + (i+1) + " " + tablica[i]);

    }


    static int wczytaj_liczbe(int min, int max){
        int wynik;
        do{
            System.out.println("podaj liczbe calkowita z zakresu? "+ min + " - " + max);
            Scanner input=new Scanner(System.in);
            wynik = input.nextInt();
        }while (wynik > max || wynik < min);
        return wynik;
    }

}
