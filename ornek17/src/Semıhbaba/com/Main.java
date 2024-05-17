package Semıhbaba.com;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int kenar1,kenar2;


        System.out.println("1. Kenarı Giriniz : ");
        kenar1 = sc.nextInt();
        System.out.println("2. Kenarı Giriniz :");
        kenar2 = sc.nextInt();

        System.out.println("Diktörgenin Alanı =" +(kenar1 * kenar2));
        System.out.println("Diktörgenin Çevresi =" +(2*(kenar1 + kenar2)) );
    }
}