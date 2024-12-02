package day1;

public class DataTypeConversion {
/*Type Casting
 * B1 : 3l
 * B2 : 5l container:  2l water
 * 
 * Task 1: B1>B2: possible
 * Task 2 : B2> B1: chances of data loss :confirmation
 * 
 */
	public static void main(String[] args) {
		int i1=129;//bigger content
		byte b1=(byte) i1;//small container - int>byte
		System.out.println(i1);
		System.out.println(b1);

		
		byte b2 = 67;
		int i2 = b2;
		System.out.println(b2);
		System.out.println(i2);
		
		float f1 = 45.78f;
		byte b3 = (byte) f1;
		
		System.out.println(f1);//45.78
		System.out.println(b3);//45
		
		int i3  =78;
		double d1 = i3;
		System.out.println(d1);//78.0
		
		char c1 = '@';
		int i4 = c1;
		System.out.println(c1);
		System.out.println(i4);
		
		int i5 = 90;
		char c2 = (char) i5;
		System.out.println(c2);
		
		String s1 = "78";
		int i6 = Integer.parseInt(s1);
		float f6 = Float.parseFloat(s1);
		
		System.out.println(s1+3);//783
		System.out.println(i6+3);//81
		
		
		int i7 = 90;
		String s2 = Integer.toString(i7);
		String s3=Double.toString(78.98);
		System.out.println(i7+1);
		System.out.println(s2+1);
		System.out.println(s3);
		
	}

}
