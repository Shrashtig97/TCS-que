import java.util.*;
public class Tcs14 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int m = sc.nextInt();
      System.out.println("Enter the element of arrary");
        int arr[][] = new int[n][m];
        for(int i = 0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
            arr[i][j] = sc.nextInt();
            
        }
            }
     int max = 0 ; 
     int count = 0 ;
     int index = 0 ;
     for(int i = 0 ; i<n ; i++)
     {
         for(int j = 0 ; j<n ;j++)
         {
             if(arr[i][j] == 1)
             {
                 count++;
             }
             if(count>max)
             {
                 max = count;
                 index = i+1;
             }
             
         }
        
     }
     System.out.println(index);
        }

}
