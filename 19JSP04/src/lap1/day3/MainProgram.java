package lap1.day3;

import java.util.Scanner;

import lap1.day3.copy.Employee;
import lap1.day3.copy.Job;

public class MainProgram {

	public static void main(String[] args) {
		
		System.out.println("1. Create Employee");
		System.out.println("2. Show the existing employee");
		System.out.println("3. Exit");
		System.out.println("-------------------------------");
		Employee[] arrayEmployee = new Employee[1];
		int inputNumber = 0;
		do {
			Scanner input = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			System.out.println("plese input a number: ");
			inputNumber = input.nextInt();
			System.out.println("Number: "+inputNumber);
			Employee[] arrayEmploye;
			
			switch (inputNumber) {
			case 1:
				System.out.println("1. Create Employee");
				Job[] arrayJob = new Job[5];
				arrayJob[0] = new Job("HR");
				arrayJob[1] = new Job("BA");
				arrayJob[2] = new Job("Tester");
				arrayJob[3] = new Job("Developer");
				arrayJob[4] = new Job("CEO");
				System.out.println("Nhap bao nhieu nguoi: ");
				int n = input.nextInt();
				arrayEmployee = new Employee[n];
				for(int j =0;j < n; j++)
				{
					System.out.println("nhap id nhan vien thu "+(j+1) +":");
					int id = input.nextInt();
					System.out.println("nhap name nhan vien thu "+(j+1) +":");
					String name = sc.nextLine();
					System.out.println("nhap cong viec nhan vien thu"+(j+1) +":");
					int a = input.nextInt();
					Job jobName;
					switch (a) {
					case 1:
						jobName = arrayJob[0];
						break;
					case 2:
						jobName = arrayJob[1];
						break;
					case 3:
						jobName = arrayJob[2];
						break;
					case 4:
						jobName = arrayJob[3];
						break;
					default:
						jobName = arrayJob[4];
						break;
					}
					System.out.println("nhap salary nhan vien thu "+(j+1) +":");
					double salary = input.nextDouble();	
					arrayEmployee[j] = new Employee(id,name,salary,arrayJob[a-1]);
				}	
				break;
			case 2:
				System.out.println("2. Show the existing employee");
				System.out.printf("%-5s %-15s %-10s %-10s\n","id","name","jobName","salary");
				for(int k = 0; k <arrayEmployee.length-1; k++)
				{
				System.out.printf("%-5s %-15s %-10s %-10s\n",arrayEmployee[k].id,arrayEmployee[k].name,arrayEmployee[k].job.name,arrayEmployee[k].salary);
				}
				break;
			case 3:
				System.out.println("3. Exit");
				break;
			default:
				break;
			}
		}
		while(inputNumber != 3);
	}

}
