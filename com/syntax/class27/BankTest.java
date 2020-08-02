package com.syntax.class27;

public class BankTest {

	public static void main(String[] args) {

		System.out.println("------PNC BANK-------------------");

		Bank pnc = new PNC();
		pnc.deposit();
		pnc.trust();
		pnc.withdraw();

		Mortgage p1 = new PNC();
		p1.givesMortgage();

		Investments p = new PNC();
		p.doInvestments();

		Trustable t = new PNC();
		t.trust();

		System.out.println("---------BOA BANK-----------------");

		Bank boa = new BOA();
		boa.deposit();
		boa.trust();
		boa.withdraw();

		Trustable b = new BOA();
		b.trust();

	}

}
