package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] txt = text.split(" ");
		
		System.out.println(txt.length);

		
		Set<String> obj = new LinkedHashSet<String>();
		
		for(String i : txt) {
			obj.add(i);
			}
		
		System.out.println(obj);

	}

}
