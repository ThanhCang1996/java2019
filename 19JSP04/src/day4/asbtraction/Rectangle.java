package day4.asbtraction;

import java.util.Scanner;

public class Rectangle extends Shape{
	int lenght;
	int width;
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle() {
		
	}
	public Rectangle(String color,int lenght, int width) {
		super();
		this.width = width;
		this.lenght = lenght;
		// TODO Auto-generated constructor stub
	}
	public void input()
	{
		super.input();
		Scanner input = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		int _lenght = input.nextInt();
		setLenght(_lenght);
		System.out.println("Nhap chieu rong:");
		int _width = input.nextInt();
		setWidth(_width);
	}
	
	public double getArea()
	{
		return getLenght()*getWidth();
	}

}
