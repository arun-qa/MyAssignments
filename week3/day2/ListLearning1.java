package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListLearning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> obj = new ArrayList();
		obj.add("Arun");
		obj.add("Deepa");
		obj.add("Maria");
		obj.add("Deepa");
		obj.add("Sharmila");
		obj.add("Muthu");
		obj.add("Chinrasu");
		
		System.out.println(obj);
		
		for(String Check:obj)
		{
			if(Check.startsWith("M")) {
				System.out.println(Check);
			}
		}
	}

}
