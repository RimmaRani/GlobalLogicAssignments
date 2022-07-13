package Java8Programming;

@FunctionalInterface
	interface Greetings{    //inteface captures the behaviour of the object
		//abstract method
		public String say();
	}
	
@FunctionalInterface
	interface MyfunctionalInterface{
		//A method with no argument
		public String sayHello();
		
	}

	public class LambdaExpImplementation {
	public static void main(String[] args) {
		Greetings object=() -> {      //Implementation of lambda--overridden
			return "Good evening EveryOne";
		};
		System.out.println(object.say());
		
		MyfunctionalInterface msg= () -> {
			return "Good morning Guys";
		};
		System.out.println(msg.sayHello());
	}

}
