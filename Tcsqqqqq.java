import java.util.*;
public class Tcsqqqqq {
    public static void main(String[]args)
    {
        int x ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        x = sc.nextInt();

        if(x==0)
        {
            System.out.println(" time = 0");
        }
        else if(x>=0 && x<=2000)
        {
            System.out.println("Time=25");
        }
        else if(x>=2001 && x<=4000){
            System.out.println("Time = 35");
        }
        else if(x>=4001 && x<=7000)
        {
            System.out.println("Time = 45");
        }
        else {
            System.out.println("Invalid output");
        }
    }
    
}
