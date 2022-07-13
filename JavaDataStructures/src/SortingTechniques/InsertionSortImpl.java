package SortingTechniques;
class InsertionSort{
/* A utility function to print array of size n*/
 void printArray(int arr[])
{
    int n = arr.length;
    for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");

    System.out.println();
}
 
 void sort(int arr[])
 {
     int n = arr.length;
     for (int i = 1; i < n; ++i) {     //i=1
         int temp = arr[i];          //temp=11
         int j = i - 1;               //j=0
         while (j >= 0 && arr[j] > temp) {   //12>11
             arr[j + 1] = arr[j];            //11<=>12     [11,12,13,5,6]
             j = j - 1;                       
         }
         arr[j + 1] = temp;         //12=temp        
     }
 }}
//Main method to test above methods
public class InsertionSortImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 5, 6 };
		 
        InsertionSort ob = new InsertionSort();
        System.out.println("Unsorted Array: ");
        //Printing unsorted array
        ob.printArray(arr);
        //Printing sorted array
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
	}

}
