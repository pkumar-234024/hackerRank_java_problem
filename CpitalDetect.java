class CapitalDetect{
	static boolean solution(String word){
		
		if (word == null ) return false;
        int len = word.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i))) count++;
        }
        if (count == 1) return Character.isUpperCase(word.charAt(0));
        return count == 0 || count == len;
    
	}
	public static void main(String[] args) {
		String s = "Leetcode";
		System.out.println(solution(s));
	}
}