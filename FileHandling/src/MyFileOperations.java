import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class MyFileOperations {

	public static void main(String[] args) {
		String data="This is bufferedoutput stream";
		try
		{  
		//create file output stream
		FileOutputStream file=new FileOutputStream("reema3.txt");
		//Data Output stream
		DataOutputStream data3= new DataOutputStream(file);  

		//ByteArrayOutputStream  File
		ByteArrayOutputStream bout=new ByteArrayOutputStream();  
		     file.write(10);
		     bout.write(65);    
		     bout.writeTo(file);    
		     bout.writeTo(file);
		     file.flush();
		       

		//Buffered Output Stream
		BufferedOutputStream output=new BufferedOutputStream(file);

		byte[]array= data.getBytes();
		//Write data to output stream
		output.write(array);

		file.close();
		System.out.println("successfull output stream");

		//File Output stream filter
		File data5 = new File("reema3.txt");  
		       FileOutputStream file7 = new FileOutputStream(data5);  
		 FilterOutputStream filter = new FilterOutputStream(file7);  
		       String s="Welcome to Filter Output Stream.";      
		       byte b[]=s.getBytes();      
		       filter.write(b);    
		       filter.flush();  
		       filter.close();  
		       file.close();  
		       System.out.println("Successfully entered");  
		}
		catch(Exception e)
		{
		  e.getStackTrace();
		}


	}

}
