package day7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * Exception: stops the normal flow of execution
		 * 
		 * try: risky code
		 * catch: handling part
		 * throws
		 * throw - throw your own exception
		 * finally-
		 * 
		 */
		try {
		System.out.println("Open Connection");
		FileReader fr = new FileReader(".\\src\\day7\\sample");
		
		}
		catch(FileNotFoundException e) {
			System.out.println("Please verify as the file is not present: " + e);
			
		}
		
		finally {
			System.out.println("Close the connection");
		}
	
		
		
		

	}

}
