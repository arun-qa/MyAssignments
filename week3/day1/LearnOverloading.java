package week3.day1;

public class LearnOverloading {
	
	public static void  main(String[] args)
	{
		
		LearnOverloading Overload = new LearnOverloading();
		Overload.add(2,3);
		Overload.add(3, 5, 6);
		Overload.add(9);
		Overload.add(1.1F, 2.2F);
		Overload.add(3.1F, 11);
		}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void add(int a) 
	{
		System.out.println(a);
	}
	public void add(float a,float b)
	{
		System.out.println(a+b);
	}
	public void add(float a,int b)
	{
		System.out.println(a+b);
	}

}

