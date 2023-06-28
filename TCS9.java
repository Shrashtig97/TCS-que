class TCS9 {
    public static void main(String[]args)
    {
        String a = "99";
        int len = a.length();
        int res =0 ;
        int r = 3 ; 

        for(int i=0 ; i<len ; i++)
        {
            res = res+a.charAt(i) - '0';
        }
        res = res*3;

        String b = Integer.toString(res);
        System.out.println(b);

        int sum = 0 ;
        for(int i=0 ; i<b.length() ; i++){
            sum = sum+b.charAt(i)-'0';
        }
        System.out.print(sum);
    }
    
}
