
// 1 mile per hour is 1.609 kilometers per hour
 package javatuto;

public class SpeedConverter {

	public static void main(String[] args) {
		
		long miles = toMilesPerHour(75.114d);
		System.out.println(miles);
		toMilesPerHour(1.5);
		printConversion(10.25);
		printConversion(1.5);

	}
	
	public static long toMilesPerHour(double kilometersPerHour)
	{
		if(kilometersPerHour<0d)
			{return -1;}
		return Math.round(kilometersPerHour / 1.609);
		
	}
	
	public static void printConversion(double kilometersPerHour)
	{
		
		if(kilometersPerHour<0) { System.out.println("Invalid Value"); }
		else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
		System.out.println(kilometersPerHour+"km/h = "+milesPerHour+"mi/h"); 
		}
	}
	

}
