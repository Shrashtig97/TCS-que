import java.util.*;
import java.math.BigInteger;

public class TCS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger res = BigInteger.ONE; // Initialize result
        // Multiply res with 2, 3, ...N
        for (int i = 1; i <= n - 1; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        res = res.multiply(BigInteger.valueOf(2));
        System.out.println(res);
    }

}
