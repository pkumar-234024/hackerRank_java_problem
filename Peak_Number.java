import java.util.*;
class Peak_Number{

	static int peakElement(int[] arr, int n){
		int peak=0,i=0;
		if(arr[0]>arr[1]){
			peak =i+1;
			System.out.println(peak);
		}
		// if(n<2){
			for(i=1;i<n-1;i++){
				if(arr[i-1]>arr[i]&&arr[i-1]>arr[i+1]){
					peak = i-1;
					System.out.println(peak);
				}
				else if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
					peak = i;
					System.out.println(peak);
				}
				else{
					peak = i+1;
					System.out.println(peak);
				}

			}
		// }
		if(arr[i]<arr[n-1]){
			peak = n-1;
			System.out.println(peak);
		}
		if(peak>=0)
			return peak;
		else
			return peak;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- != 0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(peakElement(arr,n));
		}
	}
}