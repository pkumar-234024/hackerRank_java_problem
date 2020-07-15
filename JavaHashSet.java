import java.util.HashSet;
import java.util.LinkedList;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        set.add(4);
        set.add(5);
        LinkedList<Integer> ll = new LinkedList<>();


        System.out.println(set.size());
    }
}
