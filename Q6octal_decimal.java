package javatuto;
import java.lang.Math;

//Java program to convert octal
//to decimal number using custom code

public class Q6octal_decimal {

	public static void main(String[] args)
	{

		int a = 167;
		int result = 0;
        int copy_a = a;

		for (int i = 0; copy_a > 0; i++)
		{
			int temp = copy_a % 10;
			double p = Math.pow(8, i);
			result += (temp * p);
			copy_a = copy_a / 10;
		}

		System.out.print("Decimal of Octal Number (" + a+ ") : " + result);
	}
}


