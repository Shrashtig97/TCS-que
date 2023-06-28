import java.util.*;
public class Tcs {
    public static void main(String[]args)
    {
        int present = 0 ;
        int a[] = {3,5,2,0};
        int b[] = {0,2,4,4};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int c = sc.nextInt();
      
        int maxval=0;

       for(int i = 0 ; i<c ; i++)
       {
          present = present+a[i] - b[i];
          
          if(maxval<present){
          maxval=present;
          }
       }
       System.out.println(maxval);
    }
    
}
