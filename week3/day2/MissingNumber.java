package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {2,4,7,1,8,3,6,3};
		
		
		Set<Integer> obj = new HashSet<Integer>();
		
		
		for(Integer series:data)
			obj.add(series);
		//Make sure the set is in the ascending order
		System.out.println("Input Number is " +obj);
		//Iterate from the starting number and verify the next number is + 1
		int i=1;	
			for(Integer number:obj)	
			{
			if(number!=i) {
			System.out.println("Missing Number is " +i);
			break;
			}		
			i=i+1;
			}
	}




	}


