package lap1.day3;

public class Employee {
	int id;
	String name;
	double salary;
	int age;
	boolean married;
	Job job;
	public Employee() {
		
	}
	public Employee( int id, String name, double salary, Job jobName)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		job = jobName;
	}
}
