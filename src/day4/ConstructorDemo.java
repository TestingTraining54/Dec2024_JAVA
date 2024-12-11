package day4;

public class ConstructorDemo {

	public static void main(String[] args) {
		Student s1 = new Student(23,"sahasra");
		
		System.out.println(s1.id);//0
		System.out.println(s1.name);
		

		Student s2=new Student(24,"abc",'I');
		System.out.println(s2.id);//0
		System.out.println(s2.name);
		System.out.println(s2.grade);


		Student s3=new Student("rahul",'I','A');
		System.out.println(s3.name);//0
		System.out.println(s3.grade);
		System.out.println(s3.section);
	}

}
