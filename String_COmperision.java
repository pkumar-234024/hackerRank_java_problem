import java.util.Scanner;

public class String_COmperision {
    static String result(String s1, String s2 ){
        String flag = "NO";
        int count=0;
        if(s1==null || s2==null){
            return flag;
        }
        if(s1.length()>=s2.length()){
            for(int i=0;i<s1.length();i++){
                
            }
        }
        return flag;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(result(s1,s2));
    }
}
