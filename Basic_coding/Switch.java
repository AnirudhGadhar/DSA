import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number");
          int number = sc.nextInt();
        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();
        
        switch(number)
    {        
        case 1 :    int res = num1 + num2;
        System.out.println(res);
                       break;
           case 2 :   res = num1 - num2;
           System.out.println(res);
                       break;
             case 3 :  res  = num1 * num2;
             System.out.println(res);
                       break;  
           case 4 :   res = num1 / num2;
           System.out.println(res);
                       break;
                      
        default:  System.out.println("Invalid number entered.");
                      break;           
    }
}
}