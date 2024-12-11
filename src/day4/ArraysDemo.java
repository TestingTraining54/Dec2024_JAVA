package day4;

public class ArraysDemo {

	public static void main(String[] args) {
		//multiple values of same data type
		/*size is mandatory
		 * index starts from zero
		 * duplicate values are allowed
		 * default value gets assigned if user does not provide the value
		 * 
		 */
		
		int[] id = new int[5];
		id[0] = 10;
		id[1] = 30;
		id[3] = 45;
		id[4] = 10;
		
		//System.out.println(id[2]);
		
		for(int i=0;i<id.length;i++) {
			System.out.println(id[i]);
		}
		
		String[]  st1 = {"abc","xyz","pqr"};
		for(int i=0;i<st1.length;i++) {
			System.out.println(st1[i]);
		}
		
	
 
	}

}
