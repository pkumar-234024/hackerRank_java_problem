import java.util.Scanner;
class Binary_Search{
	static int bin_search(int[] arr,int left, int right, int key){
		int mid = (left + right)/2;
		while(left <= right){
			if(arr[mid] < key){
				left = mid+1;
			}
			else if (arr[mid]== key) {
				return mid;
			}
			else{
				right = mid-1;
			}
			mid = (left+right)/2;

		}
		if (left>right) {
			return -1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			int size_array = sc.nextInt();
			int[] arr = new int[size_array];
			for(int i=0;i<size_array;i++){
				arr[i] = sc.nextInt();
			}
			int key = sc.nextInt();
			System.out.println(bin_search(arr, 0,size_array-1,key));
		}
	}
}