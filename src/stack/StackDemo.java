package stack;

import java.util.Arrays;

public class StackDemo {

	public static void main(String[] args) {
//		ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
//		arrayStack.push(1);
//		
//		System.out.println(arrayStack.top());
//		System.out.println(arrayStack.size());
//		System.out.println(arrayStack.isEmpty());
//		
//		System.out.println(arrayStack.pop());
//		System.out.println(arrayStack.size());
		
		Integer[] a = {1,2,3}; // autoboxes from int -> Integer
		System.out.println(Arrays.toString(a));
		// reverse array
		reverse(a);
		System.out.println(Arrays.toString(a));
		
		
		//matching
		System.out.println(isMatched("(())"));
		System.out.println(isMatched(""));
		System.out.println(isMatched(null));
		System.out.println(isMatched("([)]"));
		
		
		// html
		System.out.println("\n\nHTML\n");
		System.out.println(isHTMLMatched("<a><b></b></a>"));
		System.out.println(isHTMLMatched("<a></b></b></a>"));
		System.out.println(isHTMLMatched(""));
		System.out.println(isHTMLMatched(null));
	}
	
	public static <E> void reverse(E[] a) {
		Stack<E> buffer = new LinkedStack<E>();
		for(int i = 0; i < a.length; i++) {
			buffer.push(a[i]);
		}
		
		for(int i = 0; i < a.length; i++) {
			a[i] = buffer.pop();
		}
	}
	
	public static boolean isMatched(String expression) {
		if(expression == null || expression.length() == 0) {
			return false;
		}
		
		final String opening = "({[";
		final String closing = ")}]";
		
		Stack<Character> stack = new LinkedStack<Character>();
		char[] ch = expression.toCharArray();
		for(char c: ch) {
			if(opening.indexOf(c) != -1) {
				stack.push(c);
			}else if(closing.indexOf(c) != -1) {
				if(stack.isEmpty()) {
					return false;
				}
				
				if(closing.indexOf(c) != opening.indexOf(stack.pop())) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static boolean isHTMLMatched(String html) {
		if(html == null || html.length() == 0) {
			return false;
		}
		
		Stack<String> stack = new LinkedStack<>();
		
		int j = html.indexOf('<');
		while(j != -1) {
			int k = html.indexOf('>', j+1);
			
			if(k == -1) {
				return false; // invalid tag
			}
			
			String tag = html.substring(j+1,k);
			
			if(!tag.startsWith("/")) {
				// opening tag
				stack.push(tag);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				if(!tag.substring(1).equals(stack.pop())) {
					return false;
				}
			}
			j = html.indexOf('<', k+1);
		}
		return stack.isEmpty();
	}

}
