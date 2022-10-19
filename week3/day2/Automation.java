package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation obj = new Automation();
		obj.Selenium();
		obj.java();
		obj.javascript();
		obj.ruby();
		
		MultipleLanguage obj1 = new MultipleLanguage();
		obj1.python();
		
		}

	public void Selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("I am learning selenium");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		
		System.out.println("I am learning Java");
		
	}

	public void javascript() {
		// TODO Auto-generated method stub
		
		System.out.println("I am learning Javascript");
		
	}

	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("I am learning Ruby");
	}

}
