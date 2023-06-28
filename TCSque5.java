import java.util.*;
public class TCSque5 {
    public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in); //to take input
    System.out.println("Enter the size of array"); //for size of array
    int n = sc.nextInt();   // take array size

    int arr[] = new int[n]; //store the array size
    System.out.println("Enter the element");  
   int i ; 
    for(  i=0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt(); //take a input risk factor value
    }
    int count = 0;
 int max =arr[0];
    for( i=0 ; i<n ; i++)
    {
        if(arr[i]>=max)
        {
          count++;
         // max = arr[i];
    
        }
    }
    System.out.println(" no is "+count);
}
}
