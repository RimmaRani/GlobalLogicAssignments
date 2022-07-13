package SortingTechniques;
class SelectionSort{
	 // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    //finding the sorted array
    void sort(int arr[])
    {
        int n = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
  
            // Swap the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
public class SelectionSortImpl {
	//Main method to test the above methods
	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        System.out.println("Unsorted Array: ");
        //Printing unsorted array
        ob.printArray(arr);
        //Printing sorted array
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

	}

}
