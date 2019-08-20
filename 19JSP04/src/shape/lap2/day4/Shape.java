package shape.lap2.day4;

import java.util.Scanner;

public class Shape {
	private String color;
	public Shape() {
		
	}
	public Shape(String color) {
		this.color = color;
	}
	public double getArea() {
		return 0;
	}
	
	public void input()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("color:");
		this.color = input.nextLine();
	}
	@Override 
	public String toString() {
		return "Color: "+color + "\n" +"getArea: "+getArea();
	}
}
