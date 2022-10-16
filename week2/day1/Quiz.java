package week2.day1;

public class Quiz {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=242;
		int temp =n;
		int r;
		int sum=0;
		
		while(n>0) {
			
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Palindrom Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		
		/*int range=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		
		System.out.println(firstNum);
		System.out.println(secNum);

		
		for (int i = 1; i < range; i++) 
		{
			sum = firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);

			
		}*/
		
		/*int rem =152;
		int b;
		int c=0;
		int temp = rem;
		
		while(rem>0)
		{
			
			b=rem%10;
			c = c+(b*b*b);
			rem=rem/10;

			}
		System.out.println(c);*/

		
		
		
		
		/*int n=13;
		boolean isprime = true;
		
		for(int i=2; i<n-1; i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime");
				isprime = false;
				break;
			}
		}
		if(isprime)
		{
		System.out.println("Prime");	
		}*/
		
	
		
}
}
