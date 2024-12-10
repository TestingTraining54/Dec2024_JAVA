package day3;

public class MethodOverloading {
	
	public void sum(int a,int b) {
		System.out.println("Sum of 2 integers: " +a+b);
	}
		
	public void sum(int a,int b,int c) {
		System.out.println("Sum of 3 integers: " +a+b+c);
	}
	
	public void sum(float a,float b) {
		System.out.println("Sum of 2 float: " +a+b);
	}
	
	

	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.sum(23,2);
		m.sum(45.89f,5f);
		m.sum(23,56,7);
	}

}
