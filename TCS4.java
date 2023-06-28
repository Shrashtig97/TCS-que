import java.util.*;
class TCS4 {
 public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in); //to take input
    System.out.println("Enter the size of array"); //for size of array
    int n = sc.nextInt();   // take array size

    int arr[] = new int[n]; //store the array size
    System.out.println("Enter the element");  
    
    for( int i=0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt(); //take a input risk factor value
    }
      int countZero = 0; // to count zero risk value
      int countOne = 0 ; // to count one risk value 
      int countTwo = 0 ;  // to count two risk value

    for(int i =0 ; i<n ; i++){
    if(arr[i] == 0){
         countZero += 1 ; //increment 0 value risk
        }
        else if(arr[i]==1){
           countOne +=1;   // increment 1 value risk
        }
        else{
         countTwo += 1 ; // increment two value risk
        }
    }

    for(int i=0 ; i<countZero ; i++)   //print 0 
    {
        System.out.print(0+ " ");  
    }
    for(int i=0 ; i<countOne ; i++) //print 1
    {
        System.out.print(1 + " ");
    }
    for(int i=0 ; i<countTwo ; i++) //print 2 
    {
        System.out.print(2 + " ");
    }
 }   
}
