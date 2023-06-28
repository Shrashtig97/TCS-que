import java.util.Scanner;
public class TCS21 {
    public static void main(String[]args)
    {
         float int_cost = 18 , ext_cost = 12 ,cost =0 ; 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of interior wall");
         float n = sc.nextInt();
         System.out.println("Enter the size of exterior wall");
         float x = sc.nextInt();
         if(n<0 || x<0)
         {
            System.out.println("Invalid Input");
         }
         else if(n==0 || x==0 )
         {
            System.out.println("estimate cost is 0");    
         }
         else
         {

            for(int i= 0 ; i<n ;i++)
            {
                System.out.println("Enter the area of interior wall");
                float interior_wall_area = sc.nextFloat();
                cost += int_cost * interior_wall_area ;
            }

            for(int i= 0 ; i<x ;i++)
            {
                System.out.println("Enter the area of exterior wall");
                float exterior_wall_area = sc.nextFloat();
                cost += ext_cost * exterior_wall_area ;
            }
            System.out.println("Total cost estimate" + cost);
         }
    
    }
    
}
