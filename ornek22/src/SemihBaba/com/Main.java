package SemihBaba.com;
import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("1.Sayıyı Giriniz :");
        int sayi1 = sc.nextInt();
        System.out.println("2. Sayıyı Giriniz :");
        int sayi2 = sc.nextInt();


        System.out.println("****İŞLEMİNİZİ SEÇİNİZ****");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");


        System.out.println("Seçiminizi Giriniz :");
        int secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama İşleminin Sonucu :" + (sayi1 + sayi2));
                break;

            case 2:
                System.out.println("Çıkarma İşleminin Sonucu :" + (sayi1 - sayi2));
                break;

            case 3:
                System.out.println("Çarpma İşleminin Sonucu :" + (sayi1 * sayi2));
                break;

            case 4:
                System.out.println("Bölme İşleminin Sonucu :" + (float)sayi1 /sayi2);

        }


    }
}