package org.bank;

public class BankInfo extends AxisBank{
	public void saving() {
		System.out.println("Saving: 5 lacks");		
	}
	public void fixed() {
		System.out.println("Fixed: 25 lacks");		
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.deposite();
		b.fixed();
		b.saving();
	}

}
