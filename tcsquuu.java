import java.util.*;
public class tcsquuu {
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the value of row ");
    int row = sc.nextInt();

    System.out.println("enter the value of col ");
    int col = sc.nextInt();

    int arr[][] = new int[row][col];

    System.out.println("enter the value of array ");
    for(int i = 0 ; i<row ; i++)
    {
        for(int j = 0 ; j<col ; j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
   int max=0;
    for(int i = 0 ; i<row ; i++)
    {
        int count = 0;
        for(int j = 0 ; j<col ; j++)
        {
                if(arr[i][j]==1){
                count++;
                }
        }
        if(max<count){
            max=i+1;
        }
        }
        System.out.println(max);
    
    }
}

