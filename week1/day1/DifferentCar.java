package week1.day1;

import week1.day2.Car;

public class DifferentCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		/*int sub = obj.subTwoNumbers(10, 5);
		System.out.println(sub);
		float mul = obj.multiplyThreeNumbers(2.1F, 3.1F, 4.1F);
		System.out.println(mul);*/
		int div = obj.divTwoNumbers(10, 2);
		System.out.println(div);

	}

}
