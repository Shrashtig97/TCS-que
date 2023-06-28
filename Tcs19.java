import java.util.Scanner ;

class Tcs19 {
public static void main(String[]args)
{ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the weight");
    int n = sc.nextInt(); // n is capacity of machine
    if(n == 0 )
    {
         System.out.println("Time estimate is 0");
    }
    else if(n>0 && n <=2000)
    {
        System.out.println("Time estimate is 25");
    }
    else if(n>2001 && n<4000)
    {
        System.out.println("Time estimate is 35");
    }
    else if(n>4000 && n< 7000)
    {
        System.out.println("time estimate is 45");
    }
     
}    

}
