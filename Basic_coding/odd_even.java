
import java.util.Scanner;


public class odd_even {


    public static void main(String[] args) {
         System.out.println("enter the number");
         Scanner sc = new Scanner(System.in);
         int value = sc.nextInt();

         if(value % 2 ==0)
         {
            System.out.println("even and number is " + value);
         }
         else
         {
            System.out.println("odd and number is " + value);
         }
    }
}
