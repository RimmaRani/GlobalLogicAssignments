package DataStructures_Arrays;

class Test{
	static int[] getArray() {
		return new int[] {1,2,3,4,5};
	}
}
public class DataStructureArrayImpl {

	public static void main(String[] args) {
		int array[]= new int[5];					//Array Representation
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
	
		//traversing through the array
		for(int display:array) {
			System.out.println("Elements of an array: "+display);
		}
		
		System.out.println("***************************");
		int data[]= {10,20,3,4,5,6,7};
		for (int i=0;i<data.length;i++) {
			System.out.println("Elements of the array: "+data[i]);
		}
			int arreturn[]=getArray();
			for(int j=0;j<arreturn.length;j++) {
				System.out.println(arreturn[j]);
			}
		}

	private static int[] getArray() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
