import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalDemo {
    static void swap(String[] s){
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                BigDecimal bd1 = new BigDecimal(s);
                BigDecimal bd2 = new BigDecimal(t1);
                return bd1.compareTo(bd2);
            }
        }));
        for (String st : s) {
            System.out.println(st);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] a = new String[num];
        for(int i=0;i<num;i++){
            a[i] = sc.next();
        }
        System.out.println("after test  :");
        swap(a);
    }
}
