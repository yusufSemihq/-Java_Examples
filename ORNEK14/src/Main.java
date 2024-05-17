import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int puan = 0;
        System.out.println("Lütfen Bir Sayı Giriniz :");
        Scanner input = new Scanner(System.in);
        puan = input.nextInt();
        char sonuc;

        if (puan > 90){
            sonuc = 'A';
        } else if (puan >= 80) {
            sonuc = 'B';
        } else if (puan >= 70) {
            sonuc = 'C';
        } else if (puan >= 60) {
            sonuc = 'D';
        } else if (puan >= 50) {
            sonuc = 'E';
        }else {
            sonuc = 'F';
        }
        System.out.println("Sonuç :" +sonuc);


    }
}