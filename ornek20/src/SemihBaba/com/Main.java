package SemihBaba.com;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sayi1, sayi2;
        int gecici;

        System.out.println("1. Sayıyı Giriniz :");
        sayi1 = sc.nextInt();
        System.out.println("2. Sayıyı Giriniz :");
        sayi2 = sc.nextInt();

        System.out.println("Değerler Değiştiriliyor...");


        gecici = sayi1 ;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("1. Sayı =" +sayi1);
        System.out.println("2. Sayı =" +sayi2);



    }
}