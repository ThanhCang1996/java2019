package information;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainProgram {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CustomerDaoImpl CDI = new CustomerDaoImpl();
		Customers customer ;
		int chon;
		do {
			showMenu();
			System.out.print("Chon chuc nang: ");
			Scanner input = new Scanner(System.in);
			chon = input.nextInt();
			switch (chon) {
			case 1:
				customer = new Customers("Nguyen Cang",23,"Quang nam",2000);
				CDI.addCustomer(customer);
				break;
			case 2:
				for(Customers ctms : CDI.showCustomers())
		        {
		      	  System.out.println("--------------------");
			          System.out.println("Id:" + ctms.getId());
			          System.out.println("name:" + ctms.getName());
			          System.out.println("age:" + ctms.getAge());
			          System.out.println("address: "+ctms.getAddress());
			          System.out.println("salary: "+ctms.getSalary());
		        }
			case 3:
				customer = new Customers(1,"Nguyen Cang",23,"Quang nam",2000);
				CDI.updateCustomer(customer);
				break;
			
			case 4 :
				customer = new Customers(1,"Nguyen Cang",23,"Quang nam",2000);
				CDI.delCustomers(customer);
				break;
			case 5:
				Customers findCustomer = new Customers("Nguyen Cang",23,"Quang nam",2000);
				for(Customers ctms : CDI.findCustomers(findCustomer))
		        {
		      	  System.out.println("--------------------");
			          System.out.println("Id:" + ctms.getId());
			          System.out.println("name:" + ctms.getName());
			          System.out.println("age:" + ctms.getAge());
			          System.out.println("address: "+ctms.getAddress());
			          System.out.println("salary: "+ctms.getSalary());
		        }
				break;
			case 6: 
				break;
			}
		}	
		while(chon != 6);
	}
	
	private static void showMenu() {
		System.out.println("--------List Menu-----------");
		System.out.println("1. Inser customer");
		System.out.println("2. Show list customer");
		System.out.println("3. Update information customer");
		System.out.println("4. Delete customer");
		System.out.println("5. Search customer");
		System.out.println("6. Exit");
		System.out.println("======================");
	}
	/*private static void input()
	{
		Scanner inputName = new Scanner(System.in);
		System.out.println("nhap ten:");
		String name = inputName.nextLine();
		customer.setName(name);
		Scanner inputAge = new Scanner(System.in);
		System.out.println("nhap tuoi:");
		Integer age = inputAge.nextInt();
		customer.setAge(age);
		Scanner inputAdd = new Scanner(System.in);
		System.out.println("nhap dia chi:");
		String add = inputName.nextLine();
		customer.setName(add);
		Scanner inputSalary = new Scanner(System.in);
		System.out.println("nhap luong:");
		double salary = inputSalary.nextDouble();
		customer.setSalary(salary);
	}*/
}
