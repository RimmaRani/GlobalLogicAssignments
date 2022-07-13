import java.util.Scanner;

	public class ConstructorAssignment2{
		int currentSpeed;
		String companyName;
		int topSpeed;

		ConstructorAssignment2(int currentSpeed, String companyName, int topSpeed) {
			this.currentSpeed = currentSpeed;
			this.companyName = companyName;
			this.topSpeed = topSpeed;
		}

		void currentSpeed() {
			System.out.println("Thecurrent speed of the car is: " + currentSpeed);
		}

		void companyName() {
			System.out.println("The company name of the car is:" + companyName);
		}

		void topSpeed() {
			System.out.println("The top speed of the car is: " + topSpeed);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the current speed of the car:");
			int currentSpeed = sc.nextInt();

			System.out.println("Enter the company name of the car:");
			sc.next();
			String companyName = sc.nextLine();
			System.out.println("Enter the top speed of the car:");
			int topSpeed = sc.nextInt();

			ConstructorAssignment2 car = new ConstructorAssignment2(currentSpeed, companyName, topSpeed);
			car.currentSpeed();
			car.companyName();
			car.topSpeed();
			sc.close();
		}

	}
	

