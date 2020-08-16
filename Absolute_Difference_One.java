import java.util.Scanner;
class Absolute_Difference_One{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
			int num = sc.nextInt();
			int key = sc.nextInt();
			String[] arr = new String[num];
			for(int i=0;i<num;i++){
				arr[i] = sc.next();
			}
			for(int j=0;j<num;j++){
				String temp = arr[j];
				if(Integer.parseInt(arr[j]) <= key && arr[j].length() == 2){
					if((int) temp.charAt(0)-(int) temp.charAt(1) == 1 || (int) temp.charAt(1)-(int) temp.charAt(0) == 1)
						System.out.print(arr[j]+" ");
				}
			}
		}
	}
}
