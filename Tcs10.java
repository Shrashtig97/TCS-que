import java.util.Scanner;
class Tcs10 {
    public static void main(String[]args)
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter no. of element in arrary");
          int n = sc.nextInt();
        System.out.println("Enter the date");
          int d = sc.nextInt();
        System.out.println("Enter the fine");
           int f = sc.nextInt();
           
        int arr[] = new int[n];
        System.out.println("Enter the element ");
        int countEven = 0 ,countOdd = 0 , res = 0;
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();

            if(arr[i] %2 == 0)
            {
               countEven++;
            }
            else{
                countOdd++;
                
            }
            
        }
        if(d%2!=0) 
        {
            res = f*countEven ;
            System.out.println(res);
        }
        else{
            res = f*countOdd;
            System.out.println(res);
            
        }

        

    }
    
}
