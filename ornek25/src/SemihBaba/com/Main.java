package SemihBaba.com;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Sayıyı Giriniz :");
        int sayi1 = sc.nextInt();
        System.out.println("2. Sayıyı Giriniz :");
        int sayi2 = sc.nextInt();
        System.out.println("3. Sayıyı Giriniz :");
        int sayi3 = sc.nextInt();


        int enbuyuk = sayi1;

        if (sayi2 > enbuyuk){
            enbuyuk = sayi2;
        }
        if (sayi3 > enbuyuk){
            enbuyuk = sayi3;
        }
        System.out.println("Girilen Sayılardan En Büyüğü = " +enbuyuk);





    }
}