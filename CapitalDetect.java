<<<<<<< HEAD
class CapitalDetect{
	static boolean solution(String word){
		
		if(word.equals(word.toUpperCase()))
			return true;
		if(word.equals(word.toLowerCase()))
			return true;
		char c = word.charAt(0);
		if((int) c > 65 && (int) c < 90){
			for(int i=1;i<word.length()-1;i++){
				if((int) word.charAt(i)>65 && (int) word.charAt(i)<90){
					if(i == word.length()-1){
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String s = "FFFFFFFFFFFFf";
		System.out.println(solution(s));
	}
=======
class CapitalDetect{
	static boolean solution(String word){
		
		if(word.equals(word.toUpperCase()))
			return true;
		if(word.equals(word.toLowerCase()))
			return true;
		char c = word.charAt(0);
		if((int) c > 65 && (int) c < 90){
			for(int i=1;i<word.length()-1;i++){
				if((int) word.charAt(i)>65 && (int) word.charAt(i)<90){
					if(i == word.length()-1){
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String s = "FFFFFFFFFFFFf";
		System.out.println(solution(s));
	}
>>>>>>> 90b92974cf07572f73fba1b45ebbafa469b72cf4
}