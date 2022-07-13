
public class Employee {

	//variables for employee constructor
	int empid;
	 String fname;
	 String lname;
	String city;
	String state;
	
	public Employee(int empid, String fname, String lname, String city, String state) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.state = state;
	}
	
	void display() {
		System.out.println("Employee id of the employee: "+ empid);
		System.out.println("First name of the Employee: "+ fname);
		System.out.println("Last name of the Employee: "+ lname);
		System.out.println("City of the Employee: "+ city);
		System.out.println("State of the Employee: "+ state);
	}
	
	static void basicDetails(int empid,String fname,String lname,String city,String state) {
		System.out.println("Employee id of the employee: "+ empid);
		System.out.println("First name of the Employee: "+ fname);
		System.out.println("Last name of the Employee: "+ lname);
		System.out.println("City of the Employee: "+ city);
		System.out.println("State of the Employee: "+ state);
	}
	
	public static void main(String[] args) {
		//System.out.println(empid);
		Employee obj = new Employee(512008, "Rimma Rani", "rimma.rani@gmail.com", "Engineering", "Jammu");
		obj.display();
		
		System.out.println("********************************");
		basicDetails(121,"Mahi","Mahi","jaipur","Rajasthan");
	}

}
