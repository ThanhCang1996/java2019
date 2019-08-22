package day4.atmInterface;

import java.util.Scanner;

public class Customer extends ATMImpl{
	private String accountCustomer;
	private String passwordCustomer;
	public String getAccountCustomer() {
		return accountCustomer;
	}
	public void setAccountCustomer(String accountCustomer) {
		this.accountCustomer = accountCustomer;
	}
	public String getPasswordCustomer() {
		return passwordCustomer;
	}
	public void setPasswordCustomer(String passwordCustomer) {
		this.passwordCustomer = passwordCustomer;
	}
	
	public Customer()
	{
		super();
	}
	public void input()
	{
		Scanner inputAccount = new Scanner(System.in);
		System.out.println("nhap ten dnag nhap:");
		String _account = inputAccount.nextLine();
		setAccountCustomer(_account);
		System.out.println("Nhap mat khau: ");
		Scanner inputPass = new Scanner(System.in);
		String _password = inputPass.nextLine();
		setPasswordCustomer(_password);
	}
}
