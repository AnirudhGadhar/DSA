import java.util.Scanner;
public class sum_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
       int a = sc.nextInt();
       System.out.println("enter b");
       int b = sc.nextInt();
        int sum=0;
        for(int i=a; i<=b; i++)
        sum = sum+i;
                System.out.println(sum);
    }
    
}
