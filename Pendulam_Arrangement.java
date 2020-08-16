import java.util.*;
class Pendulam_Arrangement{
	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i=9;i>=0;i--){
			a[i] = i;
			System.out.print(a[i]+" ");

		}
		Arrays.sort(a);
		for(int i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}
	}
}