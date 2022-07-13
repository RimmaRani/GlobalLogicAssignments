package DataStructures_Arrays;

import java.util.Stack;

public class ImplimentationStackUsingcollections {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack();
		stack.push(32);
		stack.push(43);
		stack.push(55);
		stack.push(77);
		
		System.out.println("Total size of stack"+stack.size());  //return size of stack
		for(int i=0;i<stack.size();i++) {
			System.out.println(stack);         
		}
		System.out.println(stack.pop());                  //deletes the last element
	}

}
