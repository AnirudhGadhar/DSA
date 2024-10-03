import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
      
        int square = squareRoot(number);
        int cube = cubeRoot(number);
    }

    public static int squareRoot(int number) {
        int result = number * number;
        System.out.println("Square of the number is " + result);
        return result;
    }

    public static int cubeRoot(int number) {
        int result = number * number * number;
        System.out.println("Cube of the number is " + result);
        return result;
    }
}