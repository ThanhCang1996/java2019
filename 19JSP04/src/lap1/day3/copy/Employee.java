package lap1.day3.copy;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public int age;
	boolean married;
	public Job job;
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
