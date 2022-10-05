package week1.day2;

public class Car {
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.printCarName();
		int num = obj.getRegNumber();
		System.out.println(num);
		String colour = obj.getColour();
		System.out.println(colour);
		boolean puncture = obj.isCarPunctured();
		System.out.println(puncture);
		int sum = obj.addThreeNumbers(5, 10, 15);
		System.out.println(sum);
		int sub = obj.subTwoNumbers(10, 5);
		System.out.println(sub);
		float mul = obj.multiplyThreeNumbers(2.1F, 3.1F, 4.1F);
		System.out.println(mul);
		int div = obj.divTwoNumbers(11, 2);
		System.out.println(div);
	}

	public void printCarName() {
		System.out.println("Honda City");
	}
	public int getRegNumber() {
		int num = 1234;
		return num;
	}
	public String getColour() {
		String colour = "Grey";
		return colour;
	}
	public boolean isCarPunctured() {
		boolean puncture = false;
		return puncture;
	}
	public int addThreeNumbers(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		return sum;
	}
	private int subTwoNumbers(int num1, int num2) {
		int sub = num1-num2;
		return sub;
	}
	float multiplyThreeNumbers(float num1, float num2, float num3) {
		float mul = num1*num2*num3;
		return mul;
	}
	public int divTwoNumbers(int num1, int num2) {
		int div = num1/num2;
		return div;
	}
	}
