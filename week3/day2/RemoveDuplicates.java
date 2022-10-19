package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "PayPal India";
		
		char[] charArray = input.toCharArray();
		
		Set<Character> charSet = new HashSet<Character>();
		
		Set<Character> dupCharSet = new HashSet<Character>();
		
		System.out.println(charArray.length);
		
		for(int i=0; i<charArray.length;i++)
		{
			if(charSet.contains(charArray[i]))
			{
				dupCharSet.add(charArray[i]);
			}
			else {
				charSet.add(charArray[i]);
			}
				
			charSet.remove(' ');
		}
		
		System.out.println(dupCharSet);
		System.out.println(charSet);

	}

}
