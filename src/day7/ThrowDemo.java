package day7;

public class ThrowDemo {

	static void validateAge(int age) throws Exception {
		if(age>18) {
			System.out.println("Allowed to vote");
		}
		else {
			throw new Exception("age should be greater than 18");
		}
	}
	
	
	public static void main(String[] args) {
		try {
		validateAge(12);
		}
		catch (Exception e) {
			System.out.println("Not allowed to vote");
		}

	}

}
