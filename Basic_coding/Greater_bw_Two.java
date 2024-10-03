import java.util.Scanner;

public class Greater_bw_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int number2 = sc.nextInt();
        greater(number1, number2);
    }

    public static void greater(int number1, int number2) {
        if (number1 == number2) { 
            System.out.println("Both numbers are equal.");
        } else if (number1 > number2) {
            System.out.println("Number 1 is greater than Number 2. Value: " + number1);
        } else {
            System.out.println("Number 2 is greater than Number 1. Value: " + number2);
        }
    }
}
