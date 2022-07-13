package ExceptionHandlingIntro;

import java.io.IOException;

public class ThrowKeyWordExample {

	//method
	static void checkEligibility(int age,int weight) {
		if(weight<12&&age<40) {
			throw new ArithmeticException("Student is not elogible for registration");
			
		}else {
			System.out.println("student entry invalid");
		}
	}
	
	static void checkString(String name) throws IOException {
		name="Sachin";
		if(name=="Sachin") {
			throw new IOException("string is valid");
		}
	}
	public static void main(String[] args) throws IOException {
	 System.out.println("Welcome to the registration Process");
	 //calling method
	 checkEligibility(10,39);
	 checkString("Sachin");
	 
	}

}
