package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> obj = new ArrayList();
		obj.add(23);
		obj.add(54);
		obj.add(67);
		obj.add(66);
		obj.add(42);
		
		System.out.println(obj);
		
		for(Integer i:obj)
		{
			if(i%2!=0)
				System.out.println(i);
		}
		
		
		

	}

}
