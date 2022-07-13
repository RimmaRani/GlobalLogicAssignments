package Java8MethodReference;

import java.util.HashMap;
import java.util.Map;

public class Java8ForEachMethodIml {

	public static void main(String[] args) {
		Map<String,Integer> price=new HashMap<String,Integer>();
		//Adding elements to the map
		price.put("IPhone", 32);
		price.put("OnePlus", 53000);
		
		//Iterate without using the lambda 
		for(Map.Entry<String, Integer> entry : price.entrySet()) {
			System.out.println("Phone- "+entry.getKey()+ "Price: "+ entry.getValue());
		}
		//lets implement the lambda
		price.forEach((key,value)->System.out.println("Phone -"+key+"price: "+value));

	}

}
