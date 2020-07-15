import java.util.Scanner;
class User_Valid {
    public static final String username = "^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\\\d|[_]]{7,29}$";
}
public class UserName_Vlidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();

            System.out.println(s.matches(User_Valid.username));
        }
        sc.close();
    }
}
