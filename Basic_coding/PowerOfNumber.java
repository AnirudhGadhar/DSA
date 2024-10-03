import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        double base = sc.nextDouble();
        System.out.println("Enter exponent:");
        double exponent = sc.nextDouble();
        
        double result = power(base, exponent);
        System.out.println("The power of " + base + " to the power " + exponent + " is " + result);
    }

    public static double power(double base, double exponent) {
        double result = 1;

        for (int i = 0; i < exponent; i++) {
            result =result *  base; 
        }

        return result;
    }
}
