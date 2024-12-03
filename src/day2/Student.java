package day2;

public class Student {

	int id;
	String name;
	static String schoolName;
	char grade;
	char section;
	int age;
	
	public void attendSession() {
		int x=50;
		System.out.println("Student attends session" + x);
		System.out.println(id);
	}
	
	public void submitProject() {
		System.out.println("Student submits project" );
		System.out.println(name);
		System.out.println(schoolName);
	}
	
	public static void getSchoolName() {
		System.out.println("School Name: " + schoolName);
		//System.out.println(grade);
	}
}
