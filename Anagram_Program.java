import java.util.*;
class Anagram_Program{
	public static Boolean anagram(String s1, String s2){
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length()!=s2.length())
			return false;
		int[] letter = new int[128];
		char[] s1_chararray = s1.toCharArray();
		for(char c: s1_chararray){
			letter[c]++;
		}
		for(int i=0;i<s2.length();i++){
			int c = (int) s2.charAt(i);
			letter[c]--;
			if(letter[c]<0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "aaaaa";
		String s2 = "aa";
		Boolean res = anagram(s1,s2);
		System.out.println((res)?"Anagram":"Not Anagram");

	}
}