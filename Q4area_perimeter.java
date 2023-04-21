package javatuto;
//Area and perimeter of rectangle and box using super an this keyword
import java.util.Scanner;

public class Q4area_perimeter 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side of Square: ");
			float side = sc.nextFloat();
		System.out.println("Enter lenght of reactangle: ");
			float l = sc.nextFloat();
		System.out.println("Enter breadth of reactangle: ");
			float b = sc.nextFloat();
		sc.close();
		
		Box bx = new Box(side);
		
		Rectangle rect = new Rectangle(l,b);
		} 
}

class Shape{
	float area;
	float perimeter;
	void box(float side)
	{
		area= side*side;
		perimeter = 4*side;
	}
	void reactangle(float l, float b)
	{
		area= (l*b);
		perimeter = 2*(l+b);
	}
}


class Rectangle extends Shape{
	float l;
	float b;
	Rectangle(float l, float b)
	{
		this.l = l;
		this.b = b;
		super.reactangle(this.l,this.b);
		System.out.println("Area of Rectangle :"+super.area);
		System.out.println("Perimeter of Rectangle :"+super.perimeter);
    }
}


class Box extends Shape{
	float side;
	Box(float side)
	{
		this.side = side;
		super.box(this.side);
		System.out.println("Area of square :"+super.area);
		System.out.println("Perimeter of Square :"+super.perimeter);
	}

}


	
	    
	 


