package javatuto;
import java.util.Scanner;

public class Q5binary_to_octal {
	public static void main(String... d) 
	{
		oct_bin obj = new oct_bin();
		obj.getVal();
		obj.convert();
	}

}

class oct_bin
{
	
	int num;
	void getVal() 
	{
	System.out.println("Binary to Octal");
	Scanner scan = new Scanner(System.in);
	System.out.println("\nEnter the number :");
	num = Integer.parseInt(scan.nextLine(), 2);
   }

	void convert() 
	{
	String octal = Integer.toOctalString(num);
	System.out.println("Octal Value is : " + octal);
	}
}

