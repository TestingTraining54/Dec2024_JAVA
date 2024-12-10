package day3;

public class BreakAndContinue {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==5) {
				//break;//exit out of the loop
				
				continue;//skip of iteration
			}
			System.out.println(i);//0 1 2 3 4 6 7 8 9
			
		}
		
		System.out.println("Exit out of the loop");
///10 value
	}

}
