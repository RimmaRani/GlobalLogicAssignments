import java.util.*;
public class Car2 {
	
	String colour;
	String brand;   
	String model;  
	int manfyear;
	
	public Car2(String colour, String brand, String model, int manfyear) {   //Constructor
		super();
		this.colour = colour;
		this.brand = brand;
		this.model = model;
		this.manfyear = manfyear;
	}
	
	void colour()
	{
		System.out.println("The Colour of the Car is"+ colour);
	}

	void brand() 
	{
		System.out.println("The brand of the colour is"+ brand);
	}
	
	void model()
	{
		System.out.println("The model of the car is" + model);
	}
	
	void manfyear()
	{
		System.out.println("Manufacturing year of the car is: "+ manfyear);
	}
	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the colour of the car: ");
		String colour =sc.nextLine();
		System.out.println("Enter the brand of the car: ");
		String brand =sc.nextLine();
		System.out.println("Enter the model of the car: ");
		String model =sc.nextLine();
		System.out.println("Enter the manufacturing year of the car: ");
		String manfyear =sc.nextLine();
		
		
		Car2 obj=new Car2("blue", "toyota", "Calarie", 2000);
		System.out.println(obj.colour);
		System.out.println(obj.brand);
		System.out.println(obj.model);
		System.out.println(obj.manfyear);
		
		obj.colour();
		obj.brand();
		obj.model();
		
		sc.close();
	}
}

