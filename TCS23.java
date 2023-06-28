import java.util.Scanner ;
class TCS23 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total no. of monkey");
        int n = sc.nextInt();
        System.out.println("Enter the no. of banana eat");
        int k = sc.nextInt();
        System.out.println("Enter the eatable peanut");
        int j = sc.nextInt();
        System.out.println("Total banana And peanut");
        int m= sc.nextInt();
        int p = sc.nextInt();
      int atebanana =0 , atepeanut = 0 ;
        if( n<0 && m<0 || k==0 || j==0 || p==0 )
        {
            System.out.println("invalid input");
        }
        else{
            if(k>0){
                atebanana = m/k;
                m = m%k;
            }
            if(j>0)
            {
                atepeanut = p/j;
                p = p%j;
            }
        n = n -(atebanana+atepeanut);
        if(m!=0 || p!=0)
        {
            n=n-1 ;
        }
        System.out.println("No of remaining monkey on the tree"+" "+ n);
        }
    }    
}
