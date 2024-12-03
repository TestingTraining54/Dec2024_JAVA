package day2;

public class MainClass {

	public static void main(String[] args) {
		//className ref = new className();
		Student s1 = new Student();
		s1.id=123;
		s1.name="Rahul";
		s1.age=5;
		Student.schoolName = "Testing";
		System.out.println("Student 1 Details:");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(Student.schoolName);
		s1.attendSession();
		s1.submitProject();
		Student.getSchoolName();//static method
		
		Student s2 = new Student();
		s2.id=78;
		s2.name="Hari";
		s2.age=50;
		
		System.out.println("Student 2 Details:");
		System.out.println(s2.id);
		System.out.println(s2.name);
		s2.attendSession();
		s2.submitProject();
		System.out.println(Student.schoolName);
		

	}

}
