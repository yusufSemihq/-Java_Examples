package semıhbaba.com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int yol ,saat;

        System.out.println("Yol Mesafenizi Giriniz (KM) :");
        yol = sc.nextInt();
        System.out.println("Gitmek İstediğiniz Süreyi Giriniz (Saat) : ");
        saat = sc.nextInt();

        System.out.println("Gitmeniz Gereken Ortalama Hız =" + (yol / saat) + "KM/S'dir");
    }
}