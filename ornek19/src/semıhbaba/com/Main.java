package semıhbaba.com;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ürünün KDV'siz Fiyatını Giriniz :");
        int fiyat = sc.nextInt();

        double yeni_fiyat = fiyat + (fiyat * 0.18);
        System.out.println("KDV'li Fiyat = " + yeni_fiyat);
    }
}