import java.math.BigInteger;
import java.util.*;
public class Java_BigInteger {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b = sc.next();
        BigInteger biginteger =new BigInteger(a);
        BigInteger biginteger1 =new BigInteger(b);

        System.out.println(biginteger.add(biginteger1));
        System.out.println(biginteger.multiply(biginteger1));
    }
}
