import java.util.Scanner;

class Find_the_fine{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			int sum = 0;
			int n = sc.nextInt();
			int d = sc.nextInt();
			int[] a = new int[n];
			int[] p =  new int[n];
			for(int i =0;i<n;i++){
				a[i] = sc.nextInt();
			}
			for(int j=0;j<n;j++){
				p[j] = sc.nextInt();
			}
			if(d%2==0){
				for(int i=0;i<n;i++){
					if(a[i]%2 != 0){
						sum = sum+p[i];
					}
				}
			}
			else{
				for(int i=0;i<n;i++){
					if(a[i]%2 != 0){
						sum = sum+p[i];
					}
				}		
			}
			System.out.println(sum);

		}
	}
}