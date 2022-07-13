package ExceptionHandlingIntro;

class InvalidProductException extends Exception{
	public InvalidProductException(String s) {
		super(s);
	}
}
public class CustomAnotherExample {
//method
	void productCheck(int weight) throws InvalidProductException {
		if(weight<100) {
			throw new InvalidProductException("Product Invalid");
		}
	}
	
	public static void main(String[] args) {
		CustomAnotherExample obj=new CustomAnotherExample();
		try {
			obj.productCheck(90);
		}
		catch(InvalidProductException e) {
			System.out.println("caught the exception");
			System.out.println(e.getMessage());
		}

	}

}
