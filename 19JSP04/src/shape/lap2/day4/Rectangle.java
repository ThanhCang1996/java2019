package shape.lap2.day4;

import java.util.Scanner;

public class Rectangle extends Shape{
	int lenght;
	int width;
	public Rectangle() {
		
	}
	public Rectangle(String color,int lenght, int width) {
		super(color);
		this.width = width;
		this.lenght = lenght;
		// TODO Auto-generated constructor stub
	}
	public void input()
	{
		super.input();
		Scanner input = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		lenght = input.nextInt();
		System.out.println("Nhap chieu rong:");
		width = input.nextInt();
	}
	@Override
	public double getArea()
	{
		return width*lenght;
	}

}
