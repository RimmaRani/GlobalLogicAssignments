package ExceptionHandlingIntro;

import java.util.Scanner;

public class EvenOddExceptionHandling {

	public static void main(String[] args) {
		
			  try{
				  while(true) {
			  int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			 System.out.println("Enter 0 to exit ");
			  n = sc.nextInt();
			 
			  if(n==0) {
				  break;
			  }
			  
			  if (n % 2 == 0)
			  {
			  System.out.println("Given number is Even.");
			  }
			  else
			  {
			  System.out.println("Given number is Odd.");
			  }
			  }}
			  catch(Exception e) {
				  System.out.println("The given value is not numeric value");
			  }

	}

}
