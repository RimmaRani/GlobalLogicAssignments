class SuperConstructor {
	
	SuperConstructor(){
		System.out.println("Constructor of parent Class");
	}
}
	class Subsuperclass extends SuperConstructor {
		//sub class constructor
		Subsuperclass() {
			super();
			System.out.println("constructor of subclass");
		}
	}

	
	public class SuperConstructorClass {
		
	public static void main(String[] args) {
		Subsuperclass object =new Subsuperclass();

	}

}