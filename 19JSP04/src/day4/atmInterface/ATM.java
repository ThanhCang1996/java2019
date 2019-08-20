package day4.atmInterface;

public interface ATM {
	boolean withdraw(int a,double b);
	boolean deposit(int a, double b);
	double queryBlance(int a);
	boolean login(String a, String b);
	boolean logout(String a);
}
