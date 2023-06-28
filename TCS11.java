import java.util.Scanner;
class TCS11 {
public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the vechicle");
    int v = sc.nextInt();
    System.out.println("Enter the Wheel");
    int w = sc.nextInt();
    int x , y ; 

    if(2<=w && w%2==0 && v<w)
    {
        x = (w-2*v)/2;
         y = v- x ;
    System.out.println("No of four wheeler"+x);
    System.out.println("No. of two wheeler"+y);
    }
    else{
        System.out.println("Invalid Input");
    }
}    
}
