package Constructors;

public class StaticMainMethod {

	static int num=100;
	static String name="Programming is Fun";
	static String code="Java Programming";
	static float pi=3.14f;
	
	static void display() {
		System.out.println("This statement belong to static method");
		
	}
	
	static void name() {
		System.out.println("This is static name");
	}
	
	void fun() {
		System.out.println("this is from non static method");
		display();
	}
	void fun2() {
		System.out.println("this is from non static method2");
		display();
	}
	
	public static void main(String[] args) {
		
		System.out.println("accessed static variable without object");
		System.out.println(num);
		System.out.println(name);
		System.out.println(code);
		System.out.println(pi);
		
		display();
		name();
		StaticMainMethod object = new StaticMainMethod();
		object.fun();
		object.fun2();
	}

}
