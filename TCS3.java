import java.util.Scanner;
class TCS3{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number of days you want");
    int n = sc.nextInt();

    System.out.println("enter the day you want to find");
    String day= sc.next();

   String arr[]={"mon","tues","wed","thurs","fri","sat","sun"};

   int res=1;
   int i=0;
   for(i=0;i<7;i++){
       if(arr[i].equals(day))
       {
           System.out.println("Hey");
          break;
       }
   }
   int val = 6-i;
   n = n-val;

   if(n>0){
   res += n/7;
   }
   System.out.println(res);
}
} 