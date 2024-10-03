public class SortedOrNotSorted {

    // Function to check if the array is sorted in ascending order
    public static boolean isarraySorted(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            // If any element is greater than the next one, the array is not sorted
            if (arr[i] >= arr[i - 1])
             {
               
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 9, 888};
        boolean result = isarraySorted(arr);

        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
