package OperationsFileHandling2;

import java.io.File;

public class FileExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Getting the file by creating object of File class
        File f = new File("C:\\Reema2.txt");
 
        // Checking if the specified file exists or not
        if (f.exists())
 
            // Show if the file exists
            System.out.println("Exists");
        else
 
            // Show if the file does not exists
            System.out.println("Does not Exists");
	}

}
