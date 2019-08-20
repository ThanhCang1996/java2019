package shape.lap2.day4;

import java.util.Scanner;

public class Triangle extends Shape{
	int base;
	int height;
	public Triangle() {
		
	}
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public void input()
	{
		super.input();
		Scanner input = new Scanner(System.in);
		System.out.println("base: ");
		base = input.nextInt();
		System.out.println("height:");
		height = input.nextInt();
	}
	
	@Override
	public double getArea() {
		return 0.5*base*height;
	}
}
