package day2;

public class Operators {
	/*
	 * Unary Operators: 1 operand
	 * 	>Pre/post increment/decrement
	 * Binary OPerator: 2 operands
	 * 	>Relational: <,<=,>,>=,==,!= -- boolean
	 * 	>Logical: &&,||,!
	 * 		&& - 
	 * F - F - F
	 * F - T -> F	
	 * T - T > T		 
	 * T - F > F
	 * 			
	 * 		
	 * 	>Assignmenet: =
	 * 	>Arithmetic : +/-/%/
	 * Ternary Operator: 3 operands
	 * 	> ?true:false
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		System.out.println(a/b);//quotient
		System.out.println(a%b);//remainder
		
		System.out.println(a==b);//false - boolean
		
		int c=3;
		
		System.out.println(a<b && a<c);//false and false - false
		System.out.println(b<a || b<c);//T || F -- True
		System.out.println(!(a>b));//false
		
		//find the smallest number from a,b,c
		System.out.println((a<b && a<c)?"a is smallest":(b<c?"b is smallest":"c is smallest"));

	}

}
