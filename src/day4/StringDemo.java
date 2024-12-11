package day4;

public class StringDemo {
/*
 * String objects are immutible
 * 2 ways
 * 1. Literal 
 * 2. New Keyword
 * 
 */
	public static void main(String[] args) {
		String st1 = "selenium";
		System.out.println(st1);
		
		st1=st1.concat(" with Java");
		System.out.println(st1);
		
		int a=10;
		int b=10;
		
		String sl1 = "Java";
		String sl2 = "python";
		String sl3 = "Java";
		
		
		String sn1 = new String("cofFee");
		String sn2 = new String("Tea");
		String sn3 = new String("Coffee");
		
		System.out.println(sl1.length());//4
		System.out.println(sn1.charAt(4));//e
		System.out.println(sn1.equals(sn3));//false
		System.out.println(sn1.equalsIgnoreCase(sn3));//true
		System.out.println(sn1.contains("z"));//false
		System.out.println(sn2.endsWith("zea"));//false
		System.out.println(sn1.startsWith("co"));//false
		System.out.println(sn1.replace("c","t"));
		
		String[] sArray=sn1.split("f");//co Fee
		for(int i=0;i<sArray.length;i++) {
			System.out.println(sArray[i]);
		}
		
		String s2 = "Java is PL";
		String[] s2Array=s2.split(" ");
		for(int i=0;i<s2Array.length;i++) {
			System.out.println(s2Array[i]);
		}
		
		
		//String s1 = "Selenium" 
		//Output:  muineleS
		
	}

}
