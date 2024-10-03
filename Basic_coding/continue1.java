import java.util.Scanner;

public class continue1{
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
           
        
        if(i%3==0 )
            continue;
            System.out.println(i);
        }
    }
}                                       