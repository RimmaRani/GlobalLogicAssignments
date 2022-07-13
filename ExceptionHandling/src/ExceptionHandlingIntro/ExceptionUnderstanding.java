package ExceptionHandlingIntro;

public class ExceptionUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int numone=10;
		int divide=numone/0;
		System.out.println(divide);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is handled as divide by 0 is arithmetic Exception(subclass)");
		}
		catch(Exception e) {
			System.out.println("this catch will not implement because this is the auper class of Arithmetic exception");
		}
	}

}
