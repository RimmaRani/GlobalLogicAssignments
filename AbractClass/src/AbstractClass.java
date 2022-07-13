
abstract class Animal{                    					 //abstract class
	public abstract void display();       					 //abstarct method
	String animal="Woof";                 					//variable declaration
}


class Dog extends Animal{             						 //inheritance //Dog is sub class inherits Animal Class
	public void display() {            						//normal method
		System.out.println(animal+" is First animal.");
	}
}

abstract class Animal2 {
	public abstract void display();       					 //abstract method for Aniaml2 class
	String animal="Roar";    								//variable declaration
}

class Lion extends Animal2{              					 //inheritance //Lion is sub class inherits Animal2 Class
	public void display() {           						 //normal method
		System.out.println(animal+ " is second animal");
	}
}


abstract class Bank {
	public abstract void display();                            //abstarct method for Bank class
	int balance=40000; 
}

class Savings extends Bank{                                    //inheritance //Savings is sub class inherits Bank Class
	public void display() {                                    //normal method
		System.out.println(balance+ " is current balance");
	}
}
	

abstract class Bank2 {
	public abstract void display();        					   //abstarct method for Bank2 class
	String account="Saving"; 
}

class Savings2 extends Bank2{                                  //inheritance //Savings2 is sub class inherits Bank2 Class
	public void display() {                                    //normal method
		System.out.println("My account type is "+ account);
	}
}


public class AbstractClass {

	public static void main(String[] args) {   //main method
		
		Animal object=new Dog();                            //Abstarction takes place for first method
		object.display();                                   //method calling
		
		Animal2 obj = new Lion();                           //Abstarction takes place for second method
		obj.display();										//method calling
		
		Bank ob=new Savings();								//Abstarction takes place for third method
		ob.display();										//method calling
		
		Bank2 obk=new Savings2();							//Abstarction takes place for fourth method
		obk.display();										//method calling
	}

}
