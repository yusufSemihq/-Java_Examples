//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
      public static boolean test(){
          System.out.println("Test Çalıştırıldı ");
            return false ;
      }

      public static void main(String[] args) {

          boolean b = true ;

          System.out.println(b);

          System.out.println(!b);
          System.out.println(b & true);


          //false & false = false
          //false & true = false
          //true & false = false
          //true & true = true


          //flase | false = false
          //false | true  = true
          //true  | false = true
          //true  | true  = true


          System.out.println(b | false);
          System.out.println(b || test());



      }

}