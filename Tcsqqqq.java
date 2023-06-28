import java.util.*;
public class Tcsqqqq {
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a no of candies");
      int n = sc.nextInt();
       int candy= 10 ;
       int rem;
      if(n>=1 && n<=10)
      {
          rem = candy - n;
          System.out.println("No. of remaining candies"+" : "+rem);
      }
    }
}
