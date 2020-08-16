// remove instance if duplicate word
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class Java_Regex2{
	public static void main(String[] args) {
		String regex = "\\b(\\w+) (?:\\W+\\1\\b)";
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while(numSentences-- >0){
        	String input = in.nextLine();
        	Matcher m = p.matcher(input);
        	while(m.find()){
        		input = input.replaceAll(m.group(),m.group(1));
        	}
        	System.out.println(input);
        }
	}
}