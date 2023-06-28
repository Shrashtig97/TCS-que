 import java.util.*;
class TCS2{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the value");
    int n=sc.nextInt();

    int res=0, index=0;

    while(n>0){
        if((n & 1)==0){
            res=res+(int)Math.pow(2,index);
        }
        index++;
        n=n/2;
    }
    System.out.print("ans- "+res);
    }
}