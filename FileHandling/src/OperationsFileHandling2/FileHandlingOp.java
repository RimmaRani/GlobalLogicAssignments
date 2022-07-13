package OperationsFileHandling2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingOp {
public static void main(String[] args) {

				// for creating the file

				try {
					File Obj = new File("Myfile.txt");
					if (Obj.createNewFile()) {
						System.out.println("File created: " + Obj.getName());
					} else {
						System.out.println("File already exists.\n");
					}
					
				} catch (IOException e) {
					System.out.println("An error has occurred.\n");
					e.printStackTrace();
				}

				// for reading the file

				try {
					File Obj = new File("Myfile.txt");
					Scanner Reader = new Scanner(Obj);
					while (Reader.hasNextLine()) {
						String data = Reader.nextLine();
						System.out.println(data);
					}
					Reader.close();
					
				} catch (FileNotFoundException e) {
					System.out.println("An error has occurred.\n");
					e.printStackTrace();
				}

				// write into a file

				try {
					FileWriter Writer = new FileWriter("Myfile.txt");
					Writer.write("Data is written here");
					Writer.close();
					System.out.println("Successfully written.\n");
					
				} catch (IOException e) {
					System.out.println("An error has occurred.\n");
					e.printStackTrace();
				}

				try {
					File Obj = new File("Myfile.txt");
					
					if (Obj.exists()) {
						// Getting file name
						System.out.println("The name of the file is: " + Obj.getName());

						// Getting path of the file
						System.out.println("The absolute path of the file is: " + Obj.getAbsolutePath());

						// Checking whether the file is writable or not
						System.out.println("Is file writeable?: " + Obj.canWrite());

						// Checking whether the file is readable or not
						System.out.println("Is file readable " + Obj.canRead());

						// Getting the length of the file in bytes
						System.out.println("The size of the file in bytes is: " + Obj.length() + "\n");
					} else {
						System.out.println("The file does not exist.\n");
					}
				} catch (Exception e) {
					System.out.println("ERROR!!!\n");
				}

				// delete the file

				File Obj = new File("myfile.txt");
				if (Obj.delete()) {
					System.out.println("The deleted file is : " + Obj.getName());
				} else {
					System.out.println("Failed in deleting the file.\n");
				}
			
	}

}
