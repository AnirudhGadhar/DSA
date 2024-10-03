public class SecondLargestOptimal {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 55, 66};
        int secondLar = SecondLargest(a);
            System.out.println("Second largest element is: " + secondLar);
        
    }

    public static int SecondLargest(int[] a) {
    
        int lar = -1;
        int secondLar = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > lar) {
                secondLar = lar;
                lar = a[i];
                
            } else if (a[i] > secondLar && a[i] < lar) {
                secondLar = a[i];
            }
        }

        return secondLar;
    }
}
