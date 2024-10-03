
import java.util.Scanner;
public class array {
    
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int m = sc.nextInt();
        System.out.println("enter coloumns");
        int n =sc.nextInt();
        int arr[][] = new int [m][n];  

        System.out.println("enter the values of array");
        for(int i=0; i<m; i++)
        {
            for(int j =0; j<n; j++)                  //i helps to switch the rows of array and j helps to switch coloumns of array
              {
                arr[i][j] = sc.nextInt();
              }

        }

        System.out.println("the values of matrix are");

        System.out.println("enter the values of array");
        for(int i=0; i<m; i++)
        {
            for(int j =0; j<n; j++)
              {
                System.out.println(arr[i][j]);
              }

        }
   }
}