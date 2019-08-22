package day4.atmInterface;

public class MainATM {
	public static void main( String [] args)
	{
		Customer no1 = new Customer();
		no1.input();
		if(no1.login(no1.getAccountCustomer(), no1.getPasswordCustomer()))
		{
			System.out.println("dang nhap thanh cong");
		}
		else
		{
			System.out.println("dang nhap that bai");
		}
	}

}
