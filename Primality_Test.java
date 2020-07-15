import java.math.BigInteger;
import java.util.*;
public class Primality_Test {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String n=sc.next();
        BigInteger biginteger= new BigInteger(n);
        System.out.println(biginteger.isProbablePrime(1));

    }
}
