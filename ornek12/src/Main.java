import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınız :");


        int age = sc.nextInt();
          System.out.println(age >= 18 ?  "Ehliyet Alabilirsiniz" : "Ehliyet Almazsınız!");
    }
}