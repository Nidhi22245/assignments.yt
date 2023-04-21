package javatuto;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q15CommonArray {
	
	private static void FindCommonElement(String[]arr1 , String[]arr2)
	{
		Set<String> set = new HashSet<>();
		for(int i = 0; i <arr1.length ; i++)
		{
			for(int j = 0; j <arr1.length ; j++)
			{
				if(arr1[i] == arr2[i])
				{
					set.add(arr1[i]);
					break;
				}
			}
		}
		
		for(String i : set)
		{
			System.out.println(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"Naina","Joseph","Alex","Alan"};
		String[] arr2 = {"Naina","John","Alexander","Ayan"};
		
		System.out.println("Array 1:"+ Arrays.toString(arr1));
		System.out.println("Array 2:"+ Arrays.toString(arr2));
		System.out.println("Array Common Elemnts >>:");
		FindCommonElement(arr1,arr2);

	}

}
