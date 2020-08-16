import java.util.*;
class Search_Element{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			int n = sc.nextInt();
			int temp,count=0,i;
			int[] a = new int[n];
			for(int j=0;j<n;j++)
				a[j] = sc.nextInt();
			int x = sc.nextInt();
			for (i=0;i<n ;i++ ) {
				if(a[i] == x){
					temp = i;
					count++;
					break;
				}
			}
			if(count != n)
				System.out.println(i);
			else
				System.out.println(-1);
		}
	}
}