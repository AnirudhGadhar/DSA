

import java.util.Scanner;

public class positive_or_negative {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    System.out.println("enter the numbery");
    int number=sc.nextInt();
    if(number<0)
    System.out.println("negative");

    else if(number>0)
    System.out.println("positive");
                           else
 System.out.println("Zero");
   }

}
