import java.util.*;
import java.util.Stack;
class Check_Balence_Symbol{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter test case : ");
		int t=sc.nextInt();
		Boolean isbalanced = true;

		while(t-- !=0 ){
			Stack<Character> stack = new Stack();
			System.out.print("Enter String : ");
			String s = sc.next();
			int l = s.length();
			for(int i=0;i<l;i++){
				char ch = s.charAt(i);
				if(ch == '(' || ch == '{' || ch == '['){
					stack.push(ch);
					continue;
				}
				if(stack.isEmpty()){
					isbalanced = false;
					break;
				}
				if (ch == ')') {
					if(stack.peek() == '('){
						stack.pop();
					}else{
						isbalanced = false;
						break;
					}
				}
				if (ch == '}') {
					if(stack.peek() == '{'){
						stack.pop();
					}else{
						isbalanced = false;
						break;
					}
				}
				if (ch == ']') {
					if(stack.peek() == '['){
						stack.pop();
					}else{
						isbalanced = false;
						break;
					}
				}
			}
			if(!stack.isEmpty())
				isbalanced = false;
			if(isbalanced){
				System.out.print("balanced\n");
			}else{
				System.out.print("not balanced\n");
			}
		}
	}
}