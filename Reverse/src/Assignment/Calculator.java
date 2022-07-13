package Assignment;                                              //Package
import java.util.*;                                              //Package for scanner class

public class Calculator {                                        //Calculator class

	public static void main(String[] args) {                      //main method
		String yn;                                                //variable 
		do {												   	//do loop
		
		Scanner sc= new Scanner(System.in);                      //Scanner class for taking users input
		System.out.println("Enter first numbers");              
		int numone=sc.nextInt();								//entering first number from user
		System.out.println("Enter second numbers");
		int numtwo=sc.nextInt();                     			//entering second number from user
		int res;												//declaring variable for result  
		System.out.println("Enter operator (+,-,*,/)");			//entering operator
		String op=sc.next();
		
		switch(op)												//taking switch cases for choosing operation
		{
		case "+":
			res=numone+numtwo;
			System.out.println("Addition is: "+res);  			//if op i + then addition will perform
			break;												//break is for breaking the loop
		case "-":
			res=numone-numtwo;
			System.out.println("Subtraction is : "+res);		//if op is - then subtraction will perform
			break;
		case "*":
			res=numone*numtwo;
			System.out.println("Multiplication is: "+res);		//if op is * then multiplication
			break;
		case "/":
			res=numone/numtwo;
			System.out.println("Division is: "+res);  			//if op is / then division will perform
			break;
		default:												//default case
			System.out.println("Invalid symbol");				//if none of the above symbol will provided by user then its is in the default case
		}
		 System.out.println("Do you want to continue(Press y for yes and n for no)"); //choosing if user want to cintinue the operations
		 yn=sc.next();                                           //taking input from user
		}while(yn.equals("y")||yn.equals("Y"));          		//if it is y then operations will start 

	}

}
