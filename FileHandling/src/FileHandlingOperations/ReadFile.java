package FileHandlingOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		char[] array=new char[1000];
		try {

		FileReader input=new FileReader("Reema.txt");
		//Read the letter/character
		input.read(array);
		System.out.println("Data in the file");
		System.out.println(array);
		//close the file is an important task
		input.close();
		
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
