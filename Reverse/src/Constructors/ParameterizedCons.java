package Constructors;

public class ParameterizedCons {
	int empid;
	String empfname;
	String emplname;
	int pincode;
	
	public ParameterizedCons(int empid,String empfname,String emplname,int pincode) {
		this.empid=empid;
		this.empfname=empfname;
		this.emplname=emplname;
		this.pincode=pincode;
	}
	
	public void display() {
	System.out.println(this.empid+" "+this.empfname+" "+this.emplname+" "+this.pincode);
	}
	
	

	@Override
	public String toString() {
		return "ParameterizedCons [empid=" + empid + ", empfname=" + empfname + ", emplname=" + emplname + ", pincode="
				+ pincode + "]";
	}

	public static void main(String args[]) {
		ParameterizedCons emp=new ParameterizedCons (101,"Rimma","Rani",184120);
		System.out.println(emp.empid);
		
		System.out.println(emp.empfname);
		System.out.println(emp.emplname);
		System.out.println(emp.pincode);
	}
}
