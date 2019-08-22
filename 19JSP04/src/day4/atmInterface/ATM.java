package day4.atmInterface;

public interface ATM {
	boolean withdraw(int idATM,double money);
	boolean deposit(int idATM, double moyney);
	double queryBlance(int idATM);
	boolean login(String idATM, String password);
	boolean logout(String idATM);
}
