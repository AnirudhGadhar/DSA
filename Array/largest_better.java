public class largest_better{
    public static void main(String[] args) {
        int a[] = {3,2,1,5,2};
        int largest = a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i] > largest)
                largest=a[i];
        }
        System.out.println("Largest number is: " + largest);
    
    }
}