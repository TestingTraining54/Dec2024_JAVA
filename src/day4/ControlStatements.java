package day4;

public class ControlStatements {

	public static void main(String[] args) {
		/*
		 * if
		 * if else
		 * if elseif else
		 * switch
		 * 
		 * 
		 */
		
		int age=16;
		if(age>18) {
			System.out.println("Allowed to vote");
		}
		else {
			System.out.println("Not allowed to vote");
		}
		
		System.out.println("Grading System:");
		/*
		 * marks>75 -- Distinction
		 * marks<=75 and marks>60 -- First class
		 * marks<=60 and marks>50 -- second class
		 * marks<=50 and marks>40 -- Third class
		 * 
		 * 
		 */
		int marks= 54;
		
		if(marks>75) {
			System.out.println("Distinction");
		}
		
		else if(marks<=75 && marks>60) {
			System.out.println("First class");
		}
		
		else if(marks<=60 && marks>50) {
			System.out.println("second class");
		}
		else if(marks<=50 && marks>40 ) {
			System.out.println("Third class");
		}
		else  {
			System.out.println("Failure");
		}
		
		int day=2;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
		
	}

}
