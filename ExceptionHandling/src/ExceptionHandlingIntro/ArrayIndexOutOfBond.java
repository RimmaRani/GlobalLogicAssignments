package ExceptionHandlingIntro;

public class ArrayIndexOutOfBond {

	public static void main(String[] args) {
		//Exception Handling Implimenetaion
		
		try{
			int arr[]=new int[7];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=5;
		arr[8]=7;
		
		for(int i=0;i<arr.length;i++)	
			System.out.print(arr[i]+" ");
		System.out.println();
		}
		
		catch(ArrayIndexOutOfBoundsException ec) {
			System.out.println("this will execute in this case");
		}
		
	catch(Exception e) {
		System.out.println("Exception Handled");
	}
	finally {
		System.out.println("Final execute whether exception is there or not");
	}

}}
