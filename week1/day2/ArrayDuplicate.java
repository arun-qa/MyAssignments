package week1.day2;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,1,4,5,7,8,9,7,4};
		
		System.out.println("Input array is "+ Arrays.toString(a));
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]==a[j])
				System.out.println(a[i]);
			}
		}

	}

}
