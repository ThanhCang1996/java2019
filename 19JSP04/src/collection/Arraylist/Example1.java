package collection.Arraylist;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
	public static void main ( String [] args)
	{
		//KHAI BAO LIST
		ArrayList<String> arrayist = new ArrayList<String>();
		//ADD LIST
		arrayist.add("Java");
		arrayist.add("PHP");
		arrayist.add("PYTHON");
		arrayist.add("C++");
		//DUYET SU DUNG for each
		System.out.println();
		for(String monhoc : arrayist)
			System.out.print(monhoc +",");
			
		//
			
	}
}
