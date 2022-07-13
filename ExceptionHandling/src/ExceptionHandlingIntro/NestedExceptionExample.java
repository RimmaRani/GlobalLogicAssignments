package ExceptionHandlingIntro;

public class NestedExceptionExample {

	public static void main(String[] args) {
		try {
			try {
				int b=5/2;
				System.out.println(b);
			}catch(Exception e){
				
			}
			try {
				int a=5/0;
				System.out.println(a);
			}catch(Exception e) {
				System.out.println("Arithmetic Exception Occurred");
			}
			try {
				System.out.println("Nested try block is implemented");
			}catch(Exception e){
				
			}
		}catch(Exception e){
			
		}
		finally {
			System.out.println("we need to have the try block all time");
		}
	}

}
