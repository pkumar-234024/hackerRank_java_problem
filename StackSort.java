import java.util.Stack;
class StackSort{
	static void sort(Stack<Integer> s1){
		Stack<Integer> r = new Stack<>();
		System.out.println("After Sorting the element");
		while(!s1.isEmpty()){
			int temp = s1.pop();
			while(!r.isEmpty() && r.peek() >temp){
				s1.push(r.pop());
			}
			r.push(temp);

		}
		while(!r.isEmpty()){
			s1.push(r.pop());
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		
		s1.push(12);
		s1.push(5);
		s1.push(9);
		s1.push(15);
		s1.push(7);
		s1.push(100);
		System.out.println("Before Sorting the element");
		System.out.println(s1);
		sort(s1);
	}
}