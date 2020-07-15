import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import java.security.MessageDigest;
public class JavaCryptographyDEmo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the message ");
      String message = sc.nextLine();
      // creating a MessageDigest Object
      MessageDigest md = MessageDigest.getInstance("SHA-256");

        //Passing data to the created MessageDigest Object
      md.update(message.getBytes());

        //Compute the message digest
      byte[] digest = md.digest();
      System.out.println(Arrays.toString(digest));

//      Convert a bytecde into the HexCode
        StringBuffer HexString = new StringBuffer();
        for (byte b : digest) {
            HexString.append(Integer.toHexString(0xFF & b));

        }
        System.out.println(HexString);

    }
}
