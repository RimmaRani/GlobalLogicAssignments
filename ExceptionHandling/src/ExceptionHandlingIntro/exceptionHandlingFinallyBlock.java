package ExceptionHandlingIntro;

public class exceptionHandlingFinallyBlock {

	public static void main(String[] args) {
		
try {
	int num=122/0;
	System.out.println(num);
}
catch(ArithmeticException e){
	System.out.println("Number should not be divided by 0");
}
finally {
	System.out.println("This is finally block ");
}
System.out.println("Out of try each finally");
	}

}
