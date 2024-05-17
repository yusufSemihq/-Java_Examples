package com.company;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class EnBuyukBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç Tane Sayıyı Karşılaştıracaksınız :");

        int kactane = sc.nextInt();

        if (kactane > 0){
            int[] dizi = new int [kactane +1];
            for (int i = 0; i < dizi.length; i++){
                System.out.println("Sayı Giriniz :");
                int sayi = sc.nextInt();
                dizi[i] = sayi;
            }

            int enbuyuk = dizi[1];
            int enkucuk = dizi[1];


            for (int i = 0; i < dizi.length; i++){
                if(i > enbuyuk){
                    enbuyuk = i;
                }if (i < enkucuk){
                    enkucuk = i;
                }
            }

            System.out.println("En Büyük Sayı" +enbuyuk);
            System.out.println("En Küçük Sayı" +enkucuk);

        }else {
            System.out.println("0'dan Büyük Bir Değer Giriniz");
        }


    }
}