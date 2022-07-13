package ParameterizedConstructorAsg;
import java.util.*;
public class UserDetails {
	int userid;
	String fname;
	String lname;
	String city;
	
	public UserDetails(int userid, String fname, String lname, String city) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
	}


public static void main(String[] args) {

		UserDetails info=new UserDetails(121,"Reema","angural","Jammu");
		System.out.println("Userid of the user is: "+ info.userid);
		System.out.println("First name of the user is: "+info.fname);
		System.out.println("Last name of the user is: "+info.lname);
		System.out.println("City of the user is: "+info.city);
		}

	}


