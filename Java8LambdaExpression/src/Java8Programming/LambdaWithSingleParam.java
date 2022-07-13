package Java8Programming;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Singleparameter{
	//function-abstract function impl
	public int incrementByFive(int a);
}

//if we want to use lambda exp then we need inteface

interface Stringconcat{
	public String sConcat(String a,String b);
}


public class LambdaWithSingleParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleparameter lambda=(number)->number+5;
		System.out.println("Given number 22 is incremented by 5 and is : "+ lambda.incrementByFive(22));
	
		//creating an object for interface sconCat
		Stringconcat object = (Firstname, Lastname) -> Firstname+ Lastname;
		System.out.println("My name is : "+object.sConcat("Reema", "Angural"));
	
		List<String>  list =new ArrayList<String>();
		list.add("Apple");
		list.add("Kiwi");
		list.add("Orange");
		
		//we don't need to store in any other variable but we can use forEach()
		
		//iterate--lambda function
		list.forEach((fruits) -> System.out.println(fruits)); //foreach is method
		System.out.println("*********");
		//Another variable-display
		for(String dis:list)
			System.out.println(dis);
		
		List<Integer>  list2 =new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println("The numbers are: ");
		list2.forEach((fruits) -> System.out.println(fruits));
	
	
	
	
	}
	}


