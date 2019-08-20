package lap1.day3.copy;

import java.util.Scanner;

public class MainProgram {
	static Employee[] arrayEmployee ;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Create Employee");
		System.out.println("2. Show the existing employee");
		System.out.println("3. Exit");
		System.out.println("-------------------------------");
		int inputNumber = 0;
		do {	
			System.out.println("plese input a number: ");
			inputNumber = input.nextInt();
			System.out.println("Number: "+inputNumber);
			switch (inputNumber) {
			case 1:
				addEmployees();
				break;
			case 2:
				showEmployee();
				break;
			default:
				break;
			}
		}
		while(inputNumber != 3);
		System.out.println("3. Exit");
	}
	private static void addEmployees() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many employees you want to add?");
		int n = input.nextInt();
		arrayEmployee = new Employee[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("plese input employee["+(i+1)+"] :");
			System.out.print("ID: ");
			int id = input.nextInt();
			Scanner inputName = new Scanner(System.in);
			System.out.print("Name: ");
			String name = inputName.nextLine();
			Scanner inputJobName = new Scanner(System.in);
			System.out.print("Job name: ");
			String jobName = inputJobName.nextLine(); 
			Job job = new Job(jobName);
			System.out.println("Salary: ");
			double salary = input.nextDouble();	
			Employee Employees = new Employee(id,name,salary,job);
			arrayEmployee[i] = Employees;
		}	
	}
	private static void showEmployee() {
		System.out.println("2. Show the existing employee");
		System.out.printf("%-5s %-15s %-10s %-10s\n","id","name","jobName","salary");
		for(int i = 0; i < arrayEmployee.length; i++)
		{
		System.out.printf("%-5s %-15s %-10s %-10s\n",arrayEmployee[i].id,arrayEmployee[i].name,arrayEmployee[i].job.name,arrayEmployee[i].salary);
		//System.out.println(arrayEmployee[i].name);
		}
	}
}
