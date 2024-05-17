package SemihBaba.com;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Boyunuzu Giriniz (1.75) :");
        float boyunuz = sc.nextFloat();
        System.out.println("Kilonuzu Giriniz :");
        float kilonuz = sc.nextFloat();

        float bki = kilonuz /(boyunuz * boyunuz);
        System.out.println("Beden Kitle İndeksiniz : " + bki);

        if (bki < 18){
            System.out.println("Zayıf");
        } else if (bki < 25) {
            System.out.println("Normal");
        } else if (bki < 30) {
            System.out.println("Hafif Şişman ");
        } else if (bki < 35) {
            System.out.println("Şişman");
        }else {
            System.out.println("Obez");
        }


    }
}