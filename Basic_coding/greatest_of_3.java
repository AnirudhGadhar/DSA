import java.util.Scanner;

public class greatest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int number2 = sc.nextInt();
        System.out.println("Enter number 3:");
        int number3 = sc.nextInt();
        greatest(number1, number2, number3);

    }

    public static void greatest(int number1, int number2, int number3)
    {
        if (number1 == number2 && number2 == number3)
    {
             System.out.println("equal");
             
            }

             else if(number1>number2 && number1>number3)
             {
                System.out.println("number 1 is greatest " + number1);
               
             }
                else if(number2>number1 && number2>number3)
                {
                System.out.println("number 2 is greatest " + number2);
               
                }
    
                else if(number3>number1 && number3>number2)
                {
                System.out.println("number 3 is greatest " + number3);
              
                }
    }
}
