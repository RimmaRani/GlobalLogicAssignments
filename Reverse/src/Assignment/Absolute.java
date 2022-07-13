package Assignment;                                    //package name
import java.util.*;                                    //package for scanner class
public class Absolute {                                

	public static void main(String[] args) {            //main class
	Scanner sc=new Scanner(System.in);                   //scanner class for taking user's input
	float numone=sc.nextFloat();                         //taking float number as input
	
	if (numone==0)                                       //if condition
	{
		System.out.println("Zero");
	}
	else if (numone>0){                                   //if number is greater than 0 then it is positive else negative
		System.out.println("Positive");
	}else {
		System.out.println("Negative");
	}
	
	if (Math.abs(numone)<1) {                              //Maths.abs function to find the absolute number
		System.out.println("Small");
	}
	else if(Math.abs(numone)>1000000)                       
	{
		System.out.println("Large");
	}

	}

}
