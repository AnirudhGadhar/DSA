import java.util.Scanner;

public class LeftRotateByD {

   
    public static void rotate(int[] arr, int D) {
        int n = arr.length;
        D = D % n; // handle cases where D > n

        // store the first D elements in a temporary array
        int[] temp = new int[D];
        for (int i = 0; i < D; i++) {
            temp[i] = arr[i];
        }

        // shift the remaining elements to the left
        for (int i = D; i < n; i++) {
            arr[i - D] = arr[i];
        }

        // append the temporary array to the end of the original array
        for (int i = n - D; i < n; i++) {
            arr[i] = temp[i - (n - D)];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of places to rotate (D): ");
        int D = sc.nextInt();

        rotate(arr, D);

        System.out.println("Rotated array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}