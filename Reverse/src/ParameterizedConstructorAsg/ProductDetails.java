package ParameterizedConstructorAsg;

public class ProductDetails {

	int pid;
	String pname;
	String pdesc;
	int pprice;
	
	
	
	public ProductDetails(int pid, String pname, String pdesc, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.pprice = pprice;
	}



	public static void main(String[] args) {
		ProductDetails pobj=new ProductDetails(111,"HandWash","Used in handwashing", 50);
		System.out.println("Product id is : "+pobj.pid);
		System.out.println("Product name is : "+pobj.pname);
		System.out.println("Product description is :"+pobj.pdesc);
		System.out.println("Price of the prouct is: "+pobj.pdesc);
	}

}
