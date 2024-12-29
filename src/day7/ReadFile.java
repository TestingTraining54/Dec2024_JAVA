package day7;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
/*
 * Library 
 * IOException
 * FileNotFoundExc...
 * 
 */
	public static void main(String[] args) throws IOException  {
		//FileInputStream fis = new FileInputStream("sample.txt");
		FileReader fr = new FileReader(".\\src\\day7\\sample");
		//System.out.println(fr.read());
		
		int a;
		while((a=fr.read()) !=-1) {
			System.out.print((char)a);
		}
		
		fr.close();
		
		FileWriter fw = new FileWriter("./src/day7/sample1");
		fw.write("Java");
		fw.close();
		
		

	}

}
