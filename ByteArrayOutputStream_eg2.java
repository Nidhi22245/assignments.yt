package javatuto;
import java.io.*;

public class ByteArrayOutputStream_eg2 {

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream input2  = new ByteArrayOutputStream();
		String str1 = "hello this is byte array output stream";
		byte buf[] = str1.getBytes();
		input2.write(buf);
		System.out.println(input2.toString());
		byte b[] = input2.toByteArray();
		for(int i = 0;i<b.length;i++)
		{
			System.out.println((char)b[i]);
		}
		input2.reset();
		for(int i = 0;i<3;i++)
		{
			input2.write('X');
			System.out.println(input2.toString());
		}
		
   
	}

}
