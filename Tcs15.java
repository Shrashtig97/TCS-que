import java.util.*;
public class Tcs15 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours");
        int h = sc.nextInt();

         int e[] = new int[h];
         int L[] = new int[h];

         System.out.println("no 0f guest enter per hours");
         for(int i = 0 ; i<h ; i++)
         {
             e[i] = sc.nextInt();
         }
         System.out.println("no 0f guest leave per hours");
         for(int i = 0 ; i<h ; i++)
         {
             L[i] = sc.nextInt();
         }
         int sum = 0  ; 
         int max = 0 ;
         for(int i = 0 ; i<h ; i++)
         {
            sum += e[i] -L[i] ;
                 
             if(sum > max ){
             max = sum; 
             }
         }
         System.out.println("Maximum no of guest = " + max);

        }
        
    
    
    }

