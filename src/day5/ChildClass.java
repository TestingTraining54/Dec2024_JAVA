package day5;

public class ChildClass extends AbstractClassDemo {

	@Override
	public void m1() {
		System.out.println("Implementing m1 inside a child class");		
	}
	
	//Method Override
	public void m2() {
		System.out.println("Inside Child m2 implementation");
	}

}
