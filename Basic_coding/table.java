
import java.util.Scanner;
public class table{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        System.out.println("the table of " + number + " is" );
          table(number);
    }
        public static int table(int number)
        {

             for(int i=1; i<10; i++)
             {
               
               System.out.println(number + "*" + i +"=" + number*i );
             }
             return number;
        }
    
}