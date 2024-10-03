
public class secondlar {
    public static void main(String[] args) {
        
    
    int a[] = {2, 3,4 ,7 ,88 ,6 ,8};
    int largest = a[0];     /*  consider a[0]  element as largest, traverse all the elements and check tht a[i] is greater than any other elemnts,  i value changes and  it compares for new values of i. thn greatest element is printed */
                                      
    
    for(int i=0; i<a.length; i++)

      if(a[i]>largest)
             largest = a[i];

       System.out.println("largest is" + largest);

     int secondlar = -1;                /* for second largest, conside seclargest = -1;
      */
     for(int i=0 ; i<a.length; i++)
      if(a[i]> secondlar && a[i] != largest )
              secondlar = a[i];

              System.out.println("second largest " + secondlar);



              
    }
}
 














































































