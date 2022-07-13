package Constructors;

import java.util.*;

public class StudentDetails {
int strrollno;
String sfname;
String Slname;
String City;

public StudentDetails(int strrollno, String sfname, String slname, String city) {
	super();
	this.strrollno = strrollno;
	this.sfname = sfname;
	Slname = slname;
	City = city;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("enter student rollno: ");
int rollno=sc.nextInt();
sc.nextLine();
System.out.println("Enter student firstname: ");
String fname=sc.nextLine();
System.out.println("Enter student Lastname: ");
String Lname=sc.nextLine();
System.out.println("Enter City: ");
String City=sc.nextLine();
System.out.println("\n"+rollno+"\n"+fname+"\n"+Lname+"\n"+City);

}
}