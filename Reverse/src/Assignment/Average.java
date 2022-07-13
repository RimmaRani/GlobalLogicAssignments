package Assignment;                               //pacakge
import java.util.*;                               //package for scanner class
public class Average {                           //Average class

	public static void main(String[] args) {       //main clss
		Scanner sc=new Scanner(System.in);          //Scanner class for taking user's input
		System.out.println("Enter first number ");
		int numone=sc.nextInt(); 					//taking ist number as input from user
		System.out.println("Enter Second number ");
		int numtwo=sc.nextInt();					//taking second number as input from user
		System.out.println("Enter Third number ");
		int numthree=sc.nextInt();                   //taking ithird number as input from user
		
		int avg=(numone+numtwo+numthree)/3;			//formaula for average
		System.out.println("The average of three numbers are: "+avg);    //print the average of three numbers
		

	}

}
