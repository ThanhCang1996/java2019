package day4.atmInterface;

public class ATMImpl implements ATM {
	private int idATM;
	private int account;
	
	public int getIdATM() {
		return idATM;
	}

	public void setIdATM(int idATM) {
		this.idATM = idATM;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Override
	public boolean withdraw(int a, double b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deposit(int a, double b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double queryBlance(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String a, String b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String a) {
		// TODO Auto-generated method stub
		return false;
	}

}
