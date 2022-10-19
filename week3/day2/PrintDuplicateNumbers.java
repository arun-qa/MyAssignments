package week3.day2;

import java.util.Arrays;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {4,3,6,8,2,9,1,2,4,7,8};
		
		Arrays.sort(data);
		for(int i=0; i<data.length; i++)
		{
			for(int j=i+1; j<=data.length-1; j++)
			{
				if(data[i]==data[j])
				{
					System.out.println(data[i]);
				}
			}
		}


	}

}
