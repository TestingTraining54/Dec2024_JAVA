package day4;

public class Student {
/*
 * Default - JVM 
 * Parameterized constructor
 * 
 */
	int id;
	String name;
	static String schoolName;
	char grade;
	char section;
	int age;
	//Constructor overloading
	
	public Student(int id,String name) {
		this.id = id;//23
		this.name=name;//sahasra
	}
	
	public Student(int id,String name,char grade) {
		this.id = id;//23
		this.name=name;//sahasra
	}

	public Student(String name, char grade, char section) {
		
		this.name = name;
		this.grade = grade;
		this.section = section;
	}
	
}
