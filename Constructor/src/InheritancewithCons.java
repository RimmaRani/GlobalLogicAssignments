class Studentin extends InheritancewithCons {

	public Studentin(int sturollno, String stuname, String city, String state) {
		super(sturollno, stuname, city, state);
		// TODO Auto-generated constructor stub
	}
}
	public class InheritancewithCons {
	//class data memeber
	int sturollno;
	String stuname;
	String city;
	String state;
	
	//Parent Class Constructor and data members
	public InheritancewithCons(int sturollno, String stuname, String city, String state) {
		super();
		this.sturollno = sturollno;
		this.stuname = stuname;
		this.city = city;
		this.state = state;
	}

	public static void main(String[] args) {
		Studentin obj=new Studentin(101,"Reema","Jammu","Jammu");
		System.out.println(obj.sturollno);
		System.out.println(obj.stuname);
		System.out.println(obj.city);
		System.out.println(obj.state);
	}

}	
	


