package day3;

public class LoopsDemo {
	

	public static void main(String[] args) {
		System.out.println("for");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
		}
		
		System.out.println("While");
		int i=21;
		while(i<=20) {
			System.out.println(i);
			i=i+5;
		}
		
		System.out.println("do While");
		int j=21;
		do {
			System.out.println(j);//21
			j=j+10;//31
		}while(j<=20);
	}

}
