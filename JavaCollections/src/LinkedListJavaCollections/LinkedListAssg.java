package LinkedListJavaCollections;

import java.util.LinkedList;

public class LinkedListAssg {

	public static void main(String[] args) {
		//Creating an object for linkedList
		LinkedList<String> list=new LinkedList<String>();
		//Adding elements to the linkedList
		list.add("Reema");
		list.add("Engineer");
		list.add("Java");
		list.add("Programmimg");
		System.out.println("First Linked List: " +list);
		
		LinkedList<String> collect = new LinkedList<String>();
	      collect.add("A");
	      collect.add("Computer");
	      collect.add("Programming");
	      System.out.println("Second LinkedList is"+collect);
	      
		//Adding an element to the first position
		list.addFirst("LinkedList");
		System.out.println(list);
		
		//Adding element at a particular index by passing as an argument
		list.add(2,"Java2");
		System.out.println(list);
		
		// Appending the collection to the list
		list.addAll(collect);
		System.out.println(list);
		
		 // Appending the collection to the list
	    list.addAll(2, collect);
	    System.out.println(list);
	    
	    // Adding new elements at the beginning
        list.addFirst("abc");
        list.addFirst("def");
		
        // Adding new elements at the beginning
        list.addLast("xyz");
        System.out.println(list);
        
        // Clearing the list
        list.clear();
        
        //Creating another linked list and copying
        LinkedList list2 = new LinkedList();
        list2 = (LinkedList) collect.clone();
        System.out.println(list2);
        
         // check if the value is present in the linkedlist or not
     		if (list2.contains("Reema")) {
     			System.out.println("LinkedList contains the given value");
     		} else {
     			System.out.println("LinkedList does not contains the given value");
     		}
		
     		System.out.println("List 3 Elements are "+list2);
     		
     	   // get the value from the linkedlist
    		System.out.println(list2.get(2));
    		
    		// get the first value from the linkedlist
    		System.out.println(list2.getFirst());

    		// get the last value from the linkedlist
    		System.out.println(list2.getLast());
    		
    		// check the index of the item
    		System.out.println("index of Programming in the list is: " + list2.indexOf("Programming"));
    		
    		// check the size of the linked list
    		System.out.println("Size of the linked list is: " + list2.size());
    		
    		// replace the value at the given position in linkedlist
    		list2.set(2, "Language");
    		System.out.println(list2);
    		
    		// Using set() method to replace A with B
            System.out.println("The Object that is replaced is: " + list2.set(0, "B"));
    		System.out.println(list2);
    		
    		//Sublist of the LinkedList
    		System.out.println(list2.subList(1, 2));
           
	}

}
