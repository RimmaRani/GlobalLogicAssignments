import java.util.*;
	class DerivedClass extends MainClass{
	
		//To check even and odd
	void EvenOdd() {
		int num=10;
		if (num%2==0) {
			System.out.println("Number is even ");
		}
		else {
			System.out.println("Number is odd");
		}
	}
	
	//check even and odd from 1 to 20
	void check() {									//function check
		for (int i=1;i<=20;i++) {         			//making a for loop to take all numbers from 1 to 20
			if (i%2==0) {							// if i mod 2 is 0 then number is even 
				System.out.println(i+" is even ");
			}
			else {       							//if above condition will false then no is odd
				System.out.println(i+" is odd");
			}
		}}
	
	//To check the largest between 3
	void show() {
		int num1, num2, num3;
        Scanner s = new Scanner(System.in);					//Scanner class is used to take user's input
        System.out.print("Enter the first number:");
        num1 = s.nextInt();									//taking ist number as input from user
        System.out.print("Enter the second number:");
        num2 = s.nextInt();									//taking 2nd number as input from user
        System.out.print("Enter the third number:");
        num3 = s.nextInt();									//taking 3rd number as input from user
        if(num1 > num2 && num2 > num3) 						//checking if num1 is greater than num2 and num3, if that so num1 is greater
        {
            System.out.println("Largest number is:"+num1);
        }
        else if(num2 > num3)								//checking num2 is greater than num3,if that so num2 is greater
        {
            System.out.println("Largest number is:"+num2);
        }
        else												//if both above conditions are false then this condition will execute
        {
            System.out.println("Largest number is:"+num3);
        }
 }
	
	//to check whether person is eligible or not
	void vote()
	{
		Scanner sc = new Scanner(System.in);  //Scanner class is used to take user's input
	      System.out.println("Enter your Name: ");
	      String name=sc.nextLine();   			//taking name as input from user
	      System.out.println("Enter your age: ");
	      int age=sc.nextInt();					//taking age as input from user
	      if(age>=18)							//checking whether age ig greater than 18 or not
	      {
	          System.out.println("Congratulation "+name+", You are eligible for Voting");
	      }
	      else
	      {
	          System.out.println(name+", You are not eligible for voting");
	      }    
	}
	}
	
	public class MainClass {   //Main Class is Parent Class

	
	public static void main(String[] args) {   //main method
	DerivedClass logic =new DerivedClass();    //making an object
	logic.EvenOdd();							//invoking an object for EvenOdd method
	System.out.println("**********************");  
	logic.check();								//invoking an object for check method
	System.out.println("**********************");
	logic.show();								////invoking an object for show method
	System.out.println("***********************");
	logic.vote();								//invoking an object for vote method
	}


}