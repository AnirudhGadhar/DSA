public class DuplicatesRemove {

    public static int duplicates(int arr[]) {

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Length of the array with unique elements
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2, 2, 3, 3};

        int result = duplicates(arr);
        System.out.println("Number of unique elements: " + result);

        // Optional: Print the unique elements
        for (int k = 0; k < result; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
