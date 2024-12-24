package day4;

import day5.AccessModifiersDemo;

public class ConstructorDemo extends AccessModifiersDemo {

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
		
		AccessModifiersDemo ac = new AccessModifiersDemo();
		//System.out.println(ac.a);
		
		System.out.println(ac.b);
		ConstructorDemo co = new ConstructorDemo();
		System.out.println(co.s1);
	}

}
