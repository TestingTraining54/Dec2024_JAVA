package day5;

public class MainClass {

	public static void main(String[] args) {
		ICICIBank icici=new ICICIBank();
		icici.depositMoney();
		icici.withdrawMoney();

		//RBI rbi = new RBI();//Object cannot be created for an interface
	
		RBI rbi = new HDFCBank();
		rbi.depositMoney();
		rbi.withdrawMoney();
	
		/*
		 * WebDriver -- Interface - rules 
		 * 
		 * ChromeDriver class - implements WebDriver - 
		 * XYZ browser  - implement all the methods WebDriver
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * driver = new FirefoxDriver();
		 * driver = new EdgeDriver();
		 * 
		 * driver.get("")
		 */
	
	}

}
