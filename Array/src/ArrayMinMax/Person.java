package ArrayMinMax;

public class Person {

	Person father;
	Person son;
	String name;
	String Address;
	
	
	public Person( String name, String address) {
		super();
		this.name = name;
		Address = address;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] ar=new Person[10];
		ar[0]=new Person("Reema","Jammu");
		ar[1]=new Person("Yash","Jaipur");
		ar[2]=new Person("Shubham","Madhya Pradesh");
		ar[3]=new Person("Sejal","Noida");
		ar[4]=new Person("Riya","Alwar");
		ar[5]=new Person("Simran","M.P");
		
		ar[0].son=ar[1];
		ar[1].father=ar[0];
		ar[5].father=ar[1];
		ar[1].son=ar[5];
		
		
		
		

	}

}
