package SemihBaba.com;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bakiye = 1000;

        System.out.println("Bakiyeniz =" +bakiye);
        System.out.println("\n ****İŞLEMLER****\n");
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Kart İade");

        System.out.println("\n İşleminizi Seçiniz :");
        int islem = sc.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz =" +bakiye);
                System.out.println("Çekmek İstediğiniz Tutarı Seçiniz :");
                int tutar = sc.nextInt();
                if (tutar > bakiye){
                    System.out.println("Yetersiz Bakiye. Tekrar Deneyiniz : ");
                    tutar = sc.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni Bakiyeniz =" +bakiye);
                break;

            case 2:
                System.out.println("Bakiyeniz =" +bakiye);
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz :");
                tutar = sc.nextInt();
                bakiye += tutar;
                System.out.println("Yeni Bakiyeniz =" +bakiye);
                break;

            case 3:
                System.out.println("Bakiyeniz =" +bakiye);
                break;

            case 4:
                System.out.println("Kartınızı Almayı Unutmayınız.!!");

            default:
                System.out.println("Yanlış İşlem Yaptnız Tekrar Deneyiniz ");


        }












    }
}