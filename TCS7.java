import java.util.*;
class TCS7
{
       public static void main(String[] args)
       {
               Scanner sc=new Scanner(System.in);
               String str=sc.next(); // take input in string
               int n=sc.nextInt(); // take intger input no of curtain in a box
               int max=0,count=0;
               for(int i=0;i< str.length();i++)
               {
                       if(i%n==0)
                       {
                         if(max < count)
                         max = count ;
                         count =0 ;
                       }
                       if(str.charAt(i)=='a')
                             count++; 
                }
                if(max < count)
                max = count ;
                System.out.println(max);     
       }
}
