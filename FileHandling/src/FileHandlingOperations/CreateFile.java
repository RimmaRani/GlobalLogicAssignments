package FileHandlingOperations;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		//Create an object for the current location
		File file=new File("Reema.txt");
		try {
			//trying to create a file based on the object
			boolean value=file.createNewFile();
			
			if(value) {
				System.out.println("The new file is created");
			}else {
				System.out.println("The file already exists");
			}
		}catch(Exception e){
			e.getStackTrace();
			System.out.println("Exception handles..file can't created");
		}
	}

}
