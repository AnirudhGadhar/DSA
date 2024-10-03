



// left rotate is 
// [1, 2, 3, 4, 5] -> [2,3,4,5,1]
import java.util.Scanner;
public class left_rotate{
    public static void leftRotate(int[] arr) {
        int value = arr[0];
       
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = value;
    }
    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        leftRotate(arr);
        for(int i=0; i<arr.length; i++)
       System.out.println(arr[i]);
       
            


    }
}