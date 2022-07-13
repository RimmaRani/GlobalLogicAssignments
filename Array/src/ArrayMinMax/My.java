package ArrayMinMax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class My {
    public static void main(String[] args) throws IOException {
    	String obj  = "abcdef";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 0, 3);
        int i;
        try
        {
    while((i = input2.read()) != -1)
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
    }
    	}
    }

