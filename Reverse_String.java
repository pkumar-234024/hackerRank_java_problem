import java.io.*;
import java.util.*;

public class Reverse_String {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = "";
        for(int i=0;i<A.length();i++){
            reverse = reverse+A.charAt(A.length()-i-1);
        }
        if(A.compareTo(reverse)==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
