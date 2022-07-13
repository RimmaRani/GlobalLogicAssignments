package Java8MethodReference;

@FunctionalInterface
interface Instancemethod{
	public void display();
}

public class ReferenceToInstanceMethod {

	public void nonStaticMethod() {
		System.out.println("This is non-static method");
	}
	
	public static void main(String[] args) {
		//create an object
		ReferenceToInstanceMethod methodReference = new ReferenceToInstanceMethod();
		//Reffering to non static method using refernce
		Instancemethod object = methodReference::nonStaticMethod;
		//interface object=interface object::methodname
		object.display();
	}

}
