


import java.util.Scanner;
public class grade {
       public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value < 0 || value > 100)
        {
            System.out.println("Invalid");
        }
        else if(value < 50)
        {
            System.out.println("fail");
        }
        else if(value>=50 && value <60)
        {
            System.out.println("grade d");
        }
        else if(value>= 60 && value<70)
        {
            System.out.println("grade c");
        }
        else if(value>= 70 && value<80)
        {
            System.out.println("grade b");
        }
        else if(value>= 80 &&value<90)
        {
            System.out.println("grade a");
        }
        
        
        else if(value>= 90 && value<100)
        {
            System.out.println("grade a+");
        }
        
        }
       }

