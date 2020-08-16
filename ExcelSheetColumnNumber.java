
class Solution{
	public int titleToNumber(String s){
		int columnNumber = 0;
		for(int i=0;i<s.length();i++){
			columnNumber = (columnNumber*26) + (s.charAt(i) - 'A' + 1);

		}
		if(columnNumber <= 2147483647)
			return columnNumber;

		return 0;
	}
}

class ExcelSHeetColumnNumber{
	public static void main(String[] args) {
		String str = "FXSHRXZ";
		Solution s = new Solution();
		System.out.println(s.titleToNumber(str));
		
	}
}