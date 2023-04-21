package javatuto;
import java.io.*;
import java.util.Arrays;


public class Q13Array_EqualOrNot {

	public static boolean equal(int arr1[], int arr2[])
	{
		int n = arr1.length;
		int m = arr2.length;
		
		if(n!=m)
			return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0;i<n ; i++)
			if(arr1[i] != arr2[i])
				return false;
		
		return true;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr1[] = {3,5,6,7,4,3};
         int arr2[] = {3,4,6,7,4,2};
         
         if(equal(arr1,arr2))
        	 System.out.println("yes");
         else
        	 System.out.println("no");
        	 
	}

}
