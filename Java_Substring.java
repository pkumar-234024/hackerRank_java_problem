import java.util.*;
class Java_Substring{
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] list = new String[s.length()-k+1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<(s.length()-k)+1;i++){
        	list[i] = s.substring(i,i+k);
        }
        smallest = list[0];
        largest = list[0];
        for(int i=0;i<list.length;i++){
        	if(list[i].compareTo(smallest)<=0)
        		smallest = list[i];
        
        	if(list[i].compareTo(largest)>0)
        		largest = list[i];
        }
        return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}
}