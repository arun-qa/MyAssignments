package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("******Car******");
		Car objCar = new Car();
		objCar.applyBrake();
		objCar.soundHorn();
		objCar.openSunroof();
		objCar.turnOnAC();
		
		System.out.println("******BMW******");
		BMW objBMW = new  BMW();
		objBMW.applyBrake();
		objBMW.openSunroof();
		objBMW.soundHorn();
		objBMW.turnOnAC();
		objBMW.autoPark();
		
		System.out.println("*******Audi******");
		Audi objAudi = new Audi();
		objAudi.applyBrake();
		objAudi.brake();
		objAudi.openSunroof();
		objAudi.soundHorn();
		objAudi.turnOnAC();
		objAudi.hybridFuel();
		
		System.out.println("*******Auto******");
		Auto objAuto = new Auto();
		objAuto.applyBrake();
		objAuto.soundHorn();
		objAuto.handStarter();
		
		System.out.println("*******Bajaj******");
		Bajaj objBajaj = new Bajaj();
		objBajaj.applyBrake();
		objBajaj.soundHorn();
		objBajaj.handStarter();
		objBajaj.electronicMeter();
		
		
		
		

	}

}
