
interface Myinterface2 {
//abstractmethods
	public void method1(int num);
	public void method2(String name);
	public void method3(float num);
	
}
class Demo implements Myinterface2{

	@Override
	public void method1(int num) {
		if (num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
		
	}

	@Override
	public void method2(String name) {
		System.out.println("My name is "+name);
		
	}

	@Override
	public void method3(float num) {
		if (num/3==0) {
			System.out.println(num +" is in decimal value");
		}else
		{
			System.out.println(num +" is not in decimal value");
		}
		
	}
	
}
public interface Myinterface {
	
	public static void main(String[] args) {
		Myinterface2 obj=new Demo();
		obj.method1(55);
		obj.method2("Reema");
		obj.method3(44);
	}
}


