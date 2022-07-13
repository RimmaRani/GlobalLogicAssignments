package WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		//primitive data types to wrapper object
		int numberone=10;
		double numbertwo=20;
		
		Integer aObj=Integer.valueOf(numberone);
		Double bObj=Double.valueOf(numbertwo);
		
		if (aObj instanceof Integer) {
		
			System.out.println("An object of Integer is created");
		}
		
		if (bObj instanceof Double) {
		System.out.println("An object of double is craeted");
		}
		
	}

}
