package LinkedListJavaCollections;

import java.util.LinkedList;

public class LinkedListActions {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		// Adding items in the list
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		int sum = 0;
		// adding the items
		
		for(int i=0 ; i<list1.size() ; i++) {
			sum = sum + list1.get(i);
		}
		
		System.out.println("Sum of all the elements in the linked list are: " + sum);

	}

	}


