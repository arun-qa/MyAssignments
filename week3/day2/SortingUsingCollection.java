package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> obj = new ArrayList<String>();
		
		Collections.addAll(obj,"HCL","Wipro","Aspire Systems","CTS");
		
		obj.set(1,"Flatirons");
		
		System.out.println("Input string is:"+obj);
		
		System.out.println("Length of an array is:"+obj.size());
		
		Collections.sort(obj);
		
		System.out.println("After sorting:"+obj);
		
		Collections.reverse(obj);
		
		System.out.println("After reverse:"+obj);
		
		

	}

}
