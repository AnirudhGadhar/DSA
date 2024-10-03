

        public class ThirdLargest {

            public static void main(String[] args) {

            
                int a[] = {2, 5, 666, 9765444, 877};
            int n = a.length;
        

                int largest = a[0];
                for (int i = 0; i < n; i++) {
                    if (a[i] > largest) 
                        largest=a[i];}
                        System.out.println("Largest number is: " + largest);
                    
                

                int secondLargest = -1;
                for (int i = 0; i < n; i++) {
                    if (a[i] > secondLargest && a[i] != largest) 
                        secondLargest = a[i];   
                }         
                    System.out.println("Second largest number is: " + secondLargest);
                
                int thirdlargest = -2;
                for (int i = 0; i < n; i++) {
                    if (a[i] > thirdlargest && a[i] != largest && a[i]!=secondLargest ) 
                    thirdlargest = a[i];
                }
                System.out.println("thrid largest number is: " + thirdlargest);

                
            }
        }
                                                                              