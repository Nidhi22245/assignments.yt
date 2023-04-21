/*Area Calculator
Write a method named area with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value please check the tips below.

Examples of input/output:

area(5.0); should return 78.53975

area(-1);  should return -1 since the parameter is negative

area(5.0, 4.0); should return 20.0 (5 * 4 = 20)

area(-1.0, 4.0);  should return -1 since first the parameter is negative*/
package javatuto;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(5.0)); //should return 78.53975

		System.out.println(area(-1)); // should return -1 since the parameter is negative

		System.out.println(area(5.0, 4.0)); //should return 20.0 (5 * 4 = 20)

		System.out.println(area(-1.0, 4.0)); // should return -1 since first the parameter is negative

	}
	
   public static double area(double radius)
   {
	   if(radius<0)
	   {
		   return -1.0;
	   }
	   double sum = Math.PI*radius*radius;
	   return sum;
   }
	
   
   public static double area(double x,double y)
   {
	   if(x<0|| y<0)
	   {
		   return -1.0;
	   }
	   double sum = x*y;
	   return sum;
   }
}
