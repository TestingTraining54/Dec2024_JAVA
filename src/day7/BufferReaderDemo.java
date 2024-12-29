package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader(".\\src\\day7\\sample2");
	System.out.println("file read");
	BufferedReader br = new BufferedReader(fr);
	//System.out.println(br.readLine());
	
	String a=null;
	
	while((a=br.readLine())!=null) {
		System.out.println(a);
	}
}
}
