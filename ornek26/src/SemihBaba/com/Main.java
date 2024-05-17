package SemihBaba.com;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Vize Notunuzu Giriniz: ");
        int vize = scan.nextInt();
        System.out.print("Final Notunu Giriniz: ");
        int fınal = scan.nextInt();

        double not = (vize * 0.4) + (fınal * 0.6);

        System.out.println("Yıl Sonu Notunuz = " + not);

        if(not > 90) {
            System.out.println("AA ile Dersi Geçtiniz.");
        }
        else if(not > 85) {
            System.out.println("BA ile Dersi Geçtiniz.");
        }
        else if(not > 80) {
            System.out.println("BB ile Dersi Geçtiniz.");
        }
        else if(not > 75) {
            System.out.println("CB le Dersi Geçtiniz.");
        }
        else if(not > 50) {
            System.out.println("Koşullu Geçtiniz.");
        }
        else {
            System.out.println("Dersi Geçtiniz.");
        }
    }
}

