package week1.day2;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 2374616348734635L;
	boolean isPunctured = true;
	String bikeName = "Pulsar";
	double runningKM = 535445667;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler obj = new TwoWheeler();
		System.out.println("noOfWheels - "+obj.noOfWheels);
		System.out.println("noOfMirrors - "+obj.noOfMirrors);
		System.out.println("chasisNumber - "+obj.chassisNumber);
		System.out.println("isPunctured - "+obj.isPunctured);
		System.out.println("bikeName - "+obj.bikeName);
		System.out.println("runningKM - "+obj.runningKM);

	}

}
