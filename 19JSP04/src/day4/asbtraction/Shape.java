package day4.asbtraction;

import java.util.Scanner;

public abstract class Shape {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Color:");
		String _color = input.nextLine();
		setColor(_color);
	}
	@Override
	public String toString() {
		return "Color: "+getColor() + "\n" +"getArea: "+getArea();
	}
}
