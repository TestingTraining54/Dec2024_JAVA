package day5;

public class ICICIBank implements RBI {

	public void depositMoney() {
		System.out.println("Deposit money in ICICI bank");//10000
	}

	@Override
	public void withdrawMoney() {
		System.out.println("WithDraw Money from ICICI Bank");//50000
		
	}

	
}
