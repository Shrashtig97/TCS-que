import java.util.*;
public class Tcs17 {
  public static void main(String[]args)
  {
      Scanner sc = new Scanner(System.in);
      int n = 10 ;
      System.out.println("Enter the no. of candies sold");
      int s = sc.nextInt();

      if(s>=0 && s<=5)
      {
          System.out.println("No of candides are " + (n-s));
      }
      else{
          System.out.println(" invalid input");
      }


  }  
}
