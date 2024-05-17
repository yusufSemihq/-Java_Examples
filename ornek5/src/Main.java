import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Lütfen Bir Sayı Giriniz :");
        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();

        if (sayi == 0){
            System.out.println("Girdiğiniz Sayı 1 Basamaklıdır");
        }else{
            int basamak = 0;
            while (true){
                if (sayi == 0){
                    break;
                }

                int kalan = sayi % 10;
                sayi = (sayi - kalan)/ 10;
                basamak++;
            }
            System.out.println("Girdiğiniz Sayı" +basamak+ "Basamaklıdır");
        }



    }
}