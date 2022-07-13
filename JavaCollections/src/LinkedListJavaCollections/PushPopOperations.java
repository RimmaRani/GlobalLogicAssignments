package LinkedListJavaCollections;

import java.util.LinkedList;
import java.util.ListIterator;

public class PushPopOperations {

	public static void main(String[] args) {
		LinkedList<String> stack=new LinkedList<String>();
		// Pushing elements in the stack
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		// Printing the complete list
		System.out.println("elements in LinkedList" +stack);
		
		// using poll() to retrieve and remove the head
		System.out.println(stack.poll());
        // printing the resultant list
		System.out.println("After applying poll the list is: "+stack);
		
		 // using pollFirst() to retrieve and remove the head
		System.out.println(stack.pollFirst());
		System.out.println("After applying pollFirst"+stack);
		System.out.println(stack.pollLast());
		System.out.println("After applying pollLast:"+stack);
		
		//Adding new elements in the list
		stack.add("E");
		stack.add("F");
		stack.add("G");
		System.out.println("after adding elements list is: "+stack);
		
		 // peek at the head of the list
        System.out.println("After applying peek Head of the list : " + stack.peek());
        
        // peek at the first element of the list
        System.out.println("First element of the list is : " + stack.peekFirst());
		
        // peek at the last element of the list
        System.out.println("Last element of the list is : " + stack.peekLast());
        
        
        // Setting the ListIterator at a specified position
        ListIterator iter = stack.listIterator(2);
        while(iter.hasNext()){
            System.out.println(iter.next());
            }
        System.out.println("**************reverse order********************");
        
     // Iterate the linked list in reverse order
     		for (int i = stack.size() - 1; i >= 0; i--) {
     			System.out.println(stack.get(i));
     		}
     		
     		
	}

}
