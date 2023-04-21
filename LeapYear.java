/*Leap Year Calculator
Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false*/
package javatuto;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(-160));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2000));

	}
	
	public static boolean isLeapYear(int year)
	{
		if(1<=year&&year<=9999)
		{
			if(((year % 4 == 0) && (year % 100 != 0)) ||( year % 400 == 0))
			{
				return true;
			}
			return false;
		}
		else { return false; }
	}

}
