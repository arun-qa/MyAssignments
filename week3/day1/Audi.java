package week3.day1;

public class Audi extends Car {
	
	public void applyBrake()
	{
		System.out.println("ABS Brake Applied");
	}
	
	public void hybridFuel() 
	{
		System.out.println("hybridFuel Enabled");
	}
	
	public void brake()
	{
		System.out.println("This Keyword");
		this.applyBrake();
		System.out.println("Super Keyword");
		super.applyBrake();
	}

}
