package Java8MethodReference;

//@functionalInterface
interface Methodref{
	//Abstract method
	public void display();
}

class MethodReferenceTwo{
	static void printable(){
		System.out.println("Another static method");
	}
}
public class MethodReference {
//static method
	static void satSomething() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Methodref object=MethodReference:: satSomething; //classname::static method
		object.display();
        Thread obj=new Thread(MethodReferenceTwo::printable);
        obj.start();
	}

}
