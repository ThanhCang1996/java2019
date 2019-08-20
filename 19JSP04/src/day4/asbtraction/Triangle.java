package day4.asbtraction;

import java.util.Scanner;

public class Triangle extends Shape{
	int base;
	int height;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Triangle() {
		
	}
	public Triangle(String color, int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public void input()
	{
		super.input();
		Scanner input = new Scanner(System.in);
		System.out.println("base: ");
		int _base = input.nextInt();
		setBase(_base);
		System.out.println("height:");
		int _height = input.nextInt();
		setHeight(_height);
	}
	
	public double getArea() {
		return 0.5*getBase()*getHeight();
	}
}
