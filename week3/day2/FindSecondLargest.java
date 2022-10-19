package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data = {"3","2","11","4","6","7","2","3","3","6","7"};
		
		Set<String> data1 = new TreeSet<String>();
		
		System.out.println(data1);
		
		for(int i=0; i<data.length; i++) 
		{
			
			data1.add(data[0]);
			
		}
		System.out.println(data1);
		
		
		
		
		
		
		
		/*List<String> obj = new ArrayList();
		
		Collections.addAll(obj,"3","2","9","4","6","7","2","3","3","6","7");
		
		System.out.println("Input string is:"+obj);
		
		Collections.sort(obj);
		
		System.out.println("After sorting:"+obj);
		
		Collections.reverse(obj);
		
		System.out.println("After reverse:"+obj);*/

	}

}
