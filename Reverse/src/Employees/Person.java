package Employees;

//variable declaration
class Person1 {
String empname;
double salary;
int joinyear;
String national_insurance_number;

//Constructors
public Person1(String empname, double salary, int joinyear, String national_insurance_number) {
	super();
	this.empname = empname;
	this.salary = salary;
	this.joinyear = joinyear;
	this.national_insurance_number = national_insurance_number;
}
//getter methods

public double getSalary() {
	return salary;
}
public String getEmpname() {
	return empname;
}
public int getJoinyear() {
	return joinyear;
}
public String getNational_insurance_number() {
	return national_insurance_number;
}
}

//Employees class inherits the Person1 class properties
class Employees extends Person1 {

	public Employees(String empname, double salary, int joinyear, String national_insurance_number) {
		super(empname, salary, joinyear, national_insurance_number);         //super constructor to refer the objects of the immidiate parent class
		// TODO Auto-generated constructor stub
	}

	

}

public class Person{
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employees ep = new Employees("Reema", 7788.9, 2022, "20291");         //object creation of the sub class
	System.out.println("The name of the Employee is: "+ep.empname);       
	System.out.println("Salary of the employee is: "+ep.salary);
	System.out.println("Joining Year of the Employee is: "+ep.joinyear);
	System.out.println("Insurance number of the employee : "+ep.national_insurance_number);
	}
}