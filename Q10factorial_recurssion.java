package javatuto;

public class Q10factorial_recurssion {
	
	public static void main(String[] args) {
        int num = 5;
        long sum = factorial(num);
        System.out.println("Factorial of " + num + " = " + sum);
    }
    public static long factorial(int num)
    {
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
}
