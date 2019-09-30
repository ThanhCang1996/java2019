package exception.lap1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String[] kitu = new String[5];
		String line = null;
		try {
			File file = new File("D://text.txt");
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			while((line = bf.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch (FileNotFoundException ex) {
			// TODO: handle exception
			System.out.println("Unable to open file" );
		}
		
	}

}
