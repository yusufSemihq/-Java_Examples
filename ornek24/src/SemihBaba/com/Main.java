package SemihBaba.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("2 Basamaklı Bir Sayı Giriniz :");
        int sayi = sc.nextInt();
        /*switch-case yapısını uzatarak
        istediğimiz basmaklı sayıyı yazdırabiliriz
         */

        int birler = sayi % 10;
        int onlar = sayi / 10;


        switch (onlar) {

            case 1:
                System.out.println("On");
                break;

            case 2:
                System.out.println("Yirmi");
                break;

            case 3:
                System.out.println("Otuz");
                break;

            case 4:
                System.out.println("Kırk");
                break;

            case 5:
                System.out.println("Elli");
                break;

            case 6:
                System.out.println("Altmış");
                break;

            case 7:
                System.out.println("Yetmiş");
                break;

            case 8:
                System.out.println("Seksen");
                break;

            case 9:
                System.out.println("Doksan");
                break;
        }
        switch (birler){
            case 1:
                System.out.print(" Bir");
                break;
            case 2:
                System.out.print(" İki");
                break;
            case 3:
                System.out.print(" Üç");
                break;
            case 4:
                System.out.print(" Dört");
                break;
            case 5:
                System.out.print(" Beş");
                break;
            case 6:
                System.out.print(" Altı");
                break;
            case 7:
                System.out.print(" Yedi");
                break;
            case 8:
                System.out.print(" Sekiz");
                break;
            case 9:
                System.out.print(" Dokuz");
                break;
        }






    }
}