package day5;

public class Student {

	private int id=10;
	private String name;
	private char grade;
	private char section;
	private char gender;
	
	//restricted access
	
	public int getId() {//read
		return id;
	}
	
	
	public String getName() {//read
		return name;
	}
	
	public void setName(String name) {//write
		this.name=name;
	}
	
	public void setGender(char gender) throws Exception {//write
		if(gender=='m'||gender=='M'||gender=='f'||gender=='F') {
			this.gender=gender;
		}
		else {
			throw new Exception("Invalid Gender");
		}
	}


	public char getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	
}
