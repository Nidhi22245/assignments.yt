/*Equal Sum Checker
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.



EXAMPLES OF INPUT/OUTPUT:

hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1

hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2

hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0*/
package javatuto;

public class EqualSumChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));

	}

	public static boolean hasEqualSum(int a,int b,int c)
	{
		
		if (c == a+b)
		{
			return true;
		}
		return false;
	}
}
