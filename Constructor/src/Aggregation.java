//aggregation works on has a relationship

class Address{     //initializing variables
		int streetNum;
		int houseNum;
		String areaname;
		String landmark;
		int pin;
		String city;
		String state;
		
		public Address(int street, int hno, String ano, String lm, int pin, String city,//constructor
				String state) {
			super();
			this.streetNum = street;//initializing the values to data memebers
			this.houseNum = hno;
			this.areaname = ano;
			this.landmark = lm;
			this.pin = pin;
			this.city = city;
			this.state = state;
		}
		
		
	}
//If we want to print address along with student name and roll no.
	
	public class Aggregation {
		int rollnum;
		String studentName;
		//creating has a relationship 
		Address studentAddr;   //static object (inbuilt)
		
		//constuctor
	public Aggregation(int rollnum, String studentName, Address studentAddr) {
			super();
			this.rollnum = rollnum;
			this.studentName = studentName;
			this.studentAddr = studentAddr;
		}


	public static void main(String[] args) {
		Address addr=new Address(48,68,"Vijaypur","Near RailwayStation",184120,"Jammu","Jammu and Kashmir");
		
		//aggregation class object creation
		Aggregation ag=new Aggregation(84,"Reema",addr);
		System.out.println(ag.rollnum);
		System.out.println(ag.studentName);
		System.out.println(ag.studentAddr.streetNum);
		System.out.println(ag.studentAddr.houseNum);
		System.out.println(ag.studentAddr.areaname);
		System.out.println(ag.studentAddr.landmark);
		System.out.println(ag.studentAddr.pin);
		System.out.println(ag.studentAddr.city);
		System.out.println(ag.studentAddr.state);
	}

}
