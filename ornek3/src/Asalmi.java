package com.company ;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Asalmi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz :");

        int sayi = scanner.nextInt();

        if (sayi > 1){
            boolean asalmi = true;
            for (int i = 2; i < sayi; i++){
                if (sayi % i == 0){
                    asalmi = false;
                    break;
                }
            }


            if (asalmi){
                System.out.println("Girilen Sayı Asaldır :");
            }else{
                System.out.println("Girilen Sayı Asal Değildir :");
            }

        }else {
            System.out.println("Asalıktan Söz Edilemez :");
        }

    }
}