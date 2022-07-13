package ParameterizedConstructorAsg;

public class EmployeeDetails {
	int empid;
	String empfname;
	String emplname;
	String empcity;
	
	
	public EmployeeDetails(int empid, String empfname, String emplname, String empcity) {
		super();
		this.empid = empid;
		this.empfname = empfname;
		this.emplname = emplname;
		this.empcity = empcity;
	}


public static void main(String[] args) {

		EmployeeDetails info=new EmployeeDetails(121,"Reema","angural","Jammu");
		System.out.println("Employee id of the user is: "+ info.empid);
		System.out.println("Employee First name of the user is: "+info.empfname);
		System.out.println("Employee Last name of the user is: "+info.emplname);
		System.out.println("City of the Employee: "+info.empcity);
		}

}
