package FileHandlingOperations;

import java.io.File;
import java.util.Scanner;

public class FileHandlingDynamically {

	public static void main(String[] args) {
		try {
			File examine=new File("Reema.txt");
			Scanner dataReader=new Scanner(examine);
			System.out.println("enter the data");
			while(dataReader.hasNext()) {
				String data=dataReader.nextLine();
				System.out.println(data);
			}
			dataReader.close();
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
