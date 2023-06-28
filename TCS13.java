import java.util.*;
public class TCS13 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the element");
        
        int count =0 ;
        int max;
        for(int i=0 ; i<n ; i++){
         arr[i] = sc.nextInt();
        }
        max =  arr[0];
         for(int i=0 ; i<n ; i++)
         {
             if(arr[i]>=max)
             {
                count++;
               max = arr[i];
             }
         }
         System.out.println(" No is greater than 0 index are: " +  count++);

     }
}
