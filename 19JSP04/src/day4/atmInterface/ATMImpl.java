package day4.atmInterface;

import java.util.Scanner;

public class ATMImpl implements ATM {
	public double defaultMoney = 3000000;
	public final String defaultAccount = "thanhcang";
	public final String defaultPassword = "25031996";
	
	private int idATM;
	private String account;
	
	public ATMImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ATMImpl(int idATM, String account) {
		super();
		this.idATM = idATM;
		this.account = account;
	}

	public int getIdATM() {
		return idATM;
	}

	public void setIdATM(int idATM) {
		this.idATM = idATM;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Override
	public boolean withdraw(int idATM, double money) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("nhap so tien can rut: ");
		money = input.nextDouble();
		if(defaultMoney - money >= 50000)
			return true;
		else 
			return false;
	}

	@Override
	public boolean deposit(int idATM, double money) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("nhap so tien can rut: ");
		money = input.nextDouble();
		if(money / 100000 >=1)
			return true;
		else 
			return false;
	}

	@Override
	public double queryBlance(int idATM) {
		// TODO Auto-generated method stub
		return defaultMoney;
	}

	@Override
	public boolean login(String account, String password) {
		// TODO Auto-generated method stub
		if(account == defaultAccount && password == defaultPassword)
			return true;
		else
			return false;
	}

	@Override
	public boolean logout(String account) {
		// TODO Auto-generated method stub
		return true;
	}

}
