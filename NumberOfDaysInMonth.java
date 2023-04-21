/*
Number Of Days In Month
Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false. 

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:

isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)

isLeapYear(1600); → should return true since 1600 is a leap year

isLeapYear(2017); → should return false since 2017 is not a leap year

isLeapYear(2000); → should return true because 2000 is a leap year 

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method.
 You can use that solution if you wish.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​

If parameter year is < 1 or > 9999 then return -1.

This method needs to 

You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:

getDaysInMonth(1, 2020); → should return 31 since January has 31 days.

getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.

getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.

getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.*/
package javatuto;

public class NumberOfDaysInMonth {
	public static int check;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));
//		System.out.println(isLeapYear(2018));

	}
	 public static boolean isLeapYear(int year)
	 {
		 if(year>=1 && year<=9999)
		 {
			if((year%4 == 0) && (year%100!=0) || (year%400 == 0)) 
			{
				check = 1;
				return true;
			}
		 }
		 check = 0;
		 return false;
	 }
	 
	 public static int getDaysInMonth(int month, int year) 
	 {
		if(month< 1 || month> 12) 
			return -1;
		if(year< 1 || year > 9999)
			return -1;

        isLeapYear(year);
          if( month == 2)
          {
        	  if(check==1)
        	     return 29;
        	  else 
        		  return 28;
          }
          else if(month == 1 || month ==3 || month ==5 || month ==7 ||month ==8||month ==10||month ==12)
          {
        	  return 31;
          }
          else return 30;
		
	 }

}
