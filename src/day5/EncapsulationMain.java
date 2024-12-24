package day5;

public class EncapsulationMain {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		//sid - write
		//sid - read
		
		System.out.println(s1.getId());
		
		s1.setName("xyz");
		System.out.println(s1.getName());
		s1.setGender('m');
		System.out.println(s1.getGender());
		
		
		AccessModifiersDemo ac = new AccessModifiersDemo();
		System.out.println(ac.a);

	}

}
