import java.util.LinkedList;
import java.util.List;
class Solution{
	public List<Integer> pascalTriangel(int rowIndex){
		List<Integer> l = new LinkedList<>();
		rowIndex = rowIndex+1;
		int[][] arr = new int[rowIndex][rowIndex];  
		for (int line = 0; line < rowIndex; line++) {
    		for (int i = 0; i <= line; i++) 
    		{ 
    		    if (line == i || i == 0) 
        		arr[line][i] = 1; 
    			else // Other values are sum of values just above and left of above 
        			arr[line][i] = arr[line-1][i-1] + arr[line-1][i]; 
    			System.out.print(arr[line][i]); 
    			if(line == rowIndex-1){
    				l.add(arr[line][i]);
    			}

    		} 
    		System.out.println(""); 
		} 	
		return l;
	} 
	
}



class PascalTriangle{
	public static void main(String[] args) {
		int n = 3;
		Solution s = new Solution();
		List<Integer> l = new LinkedList<>();
		l = 
		for(int ll:l){
			System.out.print(ll);
		}
	}
}