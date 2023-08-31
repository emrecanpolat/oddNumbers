package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int sayi = 1;
        int ciftSayilar=0;
        while (sayi%2!=0){
            System.out.println("Bir sayı giriniz:");
            sayi = input.nextInt();
            if (sayi%2==0 && sayi>0){
                ciftSayilar+=sayi;
                System.out.println(ciftSayilar);
            }

        }
        System.out.println("son toplam: "+ ciftSayilar);

    }



}


