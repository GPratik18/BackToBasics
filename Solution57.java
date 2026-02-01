import java.math.BigInteger;
import java.util.*;

public class Solution57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger a = new BigInteger("5");
        
        System.out.println(a.modPow(n, new BigInteger("100")).toString());
        
    }
}