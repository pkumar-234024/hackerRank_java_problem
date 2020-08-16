import java.util.*;
class Comperision_String{
	static String Result(String s1, String s2){
		String f = "NO";
		int count =0;
		if (s1=="" || s2=="") {
			return f;
		}
		for(int i=0;i<s2.length();i++){
			for(int j=0;j<s1.length();j++){
				if(s2.charAt(i)==s1.charAt(j))
					count++;
				if(s1.charAt(j)=='\0')
					break;
			}
		}
		if(count>0)
			return "YES";
		return f;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "hello";
		String s2 = "m";
		System.out.println(Result(s1,s2));
	}
}