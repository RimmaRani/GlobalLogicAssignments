
public class Car {
		String colour;
		String brand;   
		String model;  
		int manfyear;
		
	Car(){
		this.colour="Blue";
		this.brand="Toyota";
		this.model="Camry";
		this.manfyear=2000;
	}
	public static void main(String[] args) {
		Car obj=new Car();
		System.out.println(obj.colour);
		System.out.println(obj.brand);
		System.out.println(obj.model);
		System.out.println(obj.manfyear);
	}

}
