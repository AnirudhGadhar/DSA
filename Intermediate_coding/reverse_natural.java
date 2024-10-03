import java.util.Scanner;
public class reverse_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=n; i>=1; i--)
        {
            System.out.println(i);

        }
    }
}
