package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12; int sum=0; int a;
		
		while(n>0)
		{
			a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
		

	}

}
