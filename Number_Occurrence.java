import java.util.*;
class Number_Occurrence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			int temp = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++){
				if(a[i] == x)
					temp++;
			}
			if(temp == 0)
				System.out.println(-1);
			else
				System.out.println(temp);
		}
	}
}