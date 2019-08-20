package day4.atmInterface;

public class ATMImpl implements ATM {
	final double defaultMoney = 3000000;
	private int idATM;
	private int account;
	private int money;
	
	public ATMImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ATMImpl(int idATM, int account, int money) {
		super();
		this.idATM = idATM;
		this.account = account;
		this.money = money;
	}


	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

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
	public boolean withdraw(int idATM, double money) {
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
