import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,d,q,x,y;
        n = sc.nextInt();
        ArrayList[] set = new ArrayList[n];
        for(int i=0;i<n;i++){
            d = sc.nextInt();
            set[i] = new ArrayList();
            for(int j=0;j<d;j++){
                set[i].add(sc.nextInt());
            }
        }

        System.out.println("set length"+set.length);
        System.out.println("set[1] length"+set[1].size());
        q = sc.nextInt();
        for(int i=0;i<q;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            try{
                System.out.println(set[x-1].get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }

    }
}
