import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to be reverse: ");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("The reverseof the given number is : " + rev);
	
	if(num==rev)
	{
		System.out.println("Number is not palindrome");
	}
	else
	{
		System.out.println("Number is Palindrome");
	}
}
}
