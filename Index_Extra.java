import java.util.*;
class Index_Extra{
	static int findExtra(int[] a,int[] b, int n){
		for(int i=0;i<n;i++){
			if(a[i] == b[i])
				continue;
			else if(a[i+1] == b[i] || a[i-1] == b[i])
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n-1];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			for(int j=0;j<n-1;j++){
				b[j] = sc.nextInt();
			}
			System.out.println(findExtra(a,b,n));
		}
	}
}