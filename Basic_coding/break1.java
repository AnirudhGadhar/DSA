import java.util.Scanner;

public class break1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the low");
    int low = scanner.nextInt();
        System.out.println("Enter the high");
        int high = scanner.nextInt();
        divide(low,high);
       
    }

    public static void divide(int low, int high)
    {
        //System.out.println("the numbers are");
        for(int i=low ; i<high; i++)
        {
            System.out.println(i);
        
        if(i%13==0)
            break;
        }
    }
}                                       