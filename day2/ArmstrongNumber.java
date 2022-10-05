package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		
		int c=0;
		
		int temp=n;
		while(n>0) 
		{
			int a=n%10;
			n=n/10;
			c= c+(a*a*a);
			}
		if(temp==c)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");

	}

}
