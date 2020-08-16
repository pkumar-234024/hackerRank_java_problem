import java.util.*;
class Closest_Pair{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0 ){
			Stack<Integer> stk = new Stack<>();
			int p1=0,p2=0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			for(int j=0;j<m;j++)
				b[j] = sc.nextInt();
			int x = sc.nextInt();
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					int dsum = x-(a[i]+b[j]);
					if(dsum<0)
						dsum = -dsum;
					if(stk.isEmpty()){
						stk.push(dsum);
					}
					if(stk.peek()>dsum){
						stk.pop();
						stk.push(dsum);
						p1 = a[i];
						p2 = b[j];
					}
				}
			}
			System.out.println(p1+" "+p2);
		}
	}
}