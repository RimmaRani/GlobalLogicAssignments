package Java8Programming;

public class Java8LambdaExpression {

	//Method=<access specifier><return type> functionName(){ }
	//lambda expression implementation
	//Lambda Exp doesn't have 1.Function name 2. return type
	//but LE has 1. body 2. parameter list
	
	interface Addition{
		//abstract method
		public void numbers() ;
	}
	
	public static void main(String[] args) {
		//without lambda addition implementation using annonymous function
		Addition object=new Addition() {
			@Override
			public void numbers() {
				System.out.println("Addition operation to be performed.");
			}
		};
		object.numbers();
		
		//Lambda implementation
		Addition obj=() -> {
			System.out.println("addition operation to be performed using lambda");
		};
		obj.numbers();
	}

}
