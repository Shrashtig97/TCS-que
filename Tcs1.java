import java.util.*;
class Tcs1{
    public static void main(String[]args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size]; 

        System.out.println("Enter the no. of packet");
      for(int i = 0 ; i<size ; i++)
      {
          arr[i] = sc.nextInt();
      }   
      int count=0; 
      for(int i=0 ; i<size;i++)
      {
           if(arr[i]!=0)
           {
               arr[count++] = arr[i];
              
           }
      }
      for(int i=count ; i<size ; i++)
      {
          arr[i]=0;
      }
      for(int i=0 ; i<size ; i++)
      {
          System.out.print(arr[i]);
      }           
    }
}