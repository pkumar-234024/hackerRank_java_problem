import java.util.regex.*;
import java.util.Scanner;
class MyRegex{
	String temp = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	String pattern = temp+"."+temp+"."+temp+"."+temp;
}
class Java_Regex{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String IP = in.next();
		System.out.println(IP.matches(new MyRegex().pattern));

	}
}