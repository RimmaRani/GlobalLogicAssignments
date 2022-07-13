package SortingTechniques;

	class BubbleSort{
		//Method to print array element
		void printElements(int array[]) {
			int totalLength=array.length;
			for (int elem=0;elem<totalLength;elem++) {
				System.out.println(array[elem]+" ");
			}
		}
		
		void bubblesort(int array[]) {
			int temp;
			int totalLength=array.length;
			for(int i=0;i<totalLength;i++) 
				for (int j=i+1;j<totalLength;j++) 
					if (array[j]<array[i]) {
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
	}
	public class BubbleSortImplementation {
	public static void main(String[] args) {     //main method to test the above codes
	
		//create an object to the class to access the methods
		BubbleSort ob=new BubbleSort();
		int array[]= {10,20,50,30,40,};
		System.out.println("Before Sorting the elements are: ");
		ob.printElements(array);
		System.out.println("After sorting the elements ");
		ob.bubblesort(array);
		ob.printElements(array);
	}

}
