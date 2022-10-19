package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Axis Bank Deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank Axis = new AxisBank();
		Axis.deposit();
		Axis.saving();
		Axis.fixed();
		

	}

}
