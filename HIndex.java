class Solution {
    public int hIndex(int[] citations) {        
      int[] bucket =new int[citations.length+1];

      for(int i=0; i< citations.length; i++){
       if(citations[i]>citations.length)
		bucket[citations.length]++;
	   else
		bucket[citations[i]]++;               
       }

      int count=0;
      for(int i=bucket.length-1; i>=0; i--){
	     count+=bucket[i];
	     if(count>=i)
	     	return i;
       }

        return 0;
    }
  }

class HIndex{
	public static void main(String[] args) {
		int[] arr = {3,0,6,1,5};	
		Solution s = new Solution();
		System.out.println(s.hIndex(arr));
	}
}