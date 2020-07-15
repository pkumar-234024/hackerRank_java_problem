import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<N;i++){
            int value = scan.nextInt();
            al.add(value);
        }
        int Q = scan.nextInt();
        for(int i=0;i<Q;i++){
            String query = scan.next();
            if(query.equals("Insert")){
                int index = scan.nextInt();
                int value = scan.nextInt();
                al.add(index,value);
            }
            if (query.equals("Delete")){
                int index = scan.nextInt();
                al.remove(index);
            }
        }
        scan.close();
        for(Integer list : al){
            System.out.print(list+" ");
        }

    }
}
