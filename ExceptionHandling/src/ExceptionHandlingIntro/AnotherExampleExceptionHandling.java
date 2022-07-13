package ExceptionHandlingIntro;

public class AnotherExampleExceptionHandling {

	static void myMethod() {
	try {
		int num=10/4;
		System.out.println(num);
		try {
			int num2=100/0;
			System.out.println(num2);
		}
		catch(Exception e) {
			System.out.println("Exception Handled but our eyes are on finally");
		}
		finally {
			System.out.println("Nested Finally Block");
		}
	}
	finally {
		System.out.println("this is finally block");
	}
	}
	public static void main(String[] args) {
		try {
			int array[]=new int[5];
			array[5]=30/2;
			array[4]=8/0;
			
		}
		catch(Exception e) {
			System.out.println("Found an exception and its handled");
			
		}
		finally {
			System.out.println("I am execuing finally block");
		}
		myMethod();
	}

}
