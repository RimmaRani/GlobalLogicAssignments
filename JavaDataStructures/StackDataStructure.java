package DataStructures_Arrays;

class Stack{
	static final int MAX=100;
	int top;
	int arr[]=new int[MAX];
	
	boolean isEmpty() {
		return (top<0);
	}
	Stack() {
		top=-1;
	}
	boolean push (int value) {
		if(top>=(MAX-1)) {
			System.out.println("Stack is overflow");
			return false;
		}else {
			arr[++top]=value;
		System.out.println(value+"Pushed into stack: ");	
		}return true;
	}
}
public class StackDataStructure {

	public static void main(String[] args) {
		

	}

}
