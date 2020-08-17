

class Solution{
	public int[] distributeCandies(int candies, int num_people) {
		int[] arr = new int[num_people];
		if (candies<0 || num_people <0){
			return arr;
		}
		int i=0, j=1;
		while(candies>0){
			if(candies < j){
				j = candies;
			}
			arr[i] = arr[i] + j;
			i++;
			if(i >= num_people){
				i=0;
			}
			j++;
			candies = candies - j+1;
			System.out.println(candies);

		}

		return arr;
        
    }
}

class DistributrCandieToPeople{
	public static void main(String[] args) {
		int candies = 11;
		int num_people = 2;
		Solution s =new Solution();
		int[] arr = s.distributeCandies(candies, num_people);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
}