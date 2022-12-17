public class Person
{
	String name;
	
	int year_of_birth;
	
	public Person() {
		
	}
	
	public Person(String name , int year) {
		this.name = name;
		this.year_of_birth = year;
	}
	
	public String introduce() {
		return "Name: " + name;
	}
	
	public int getYear() {
		return year_of_birth;
	}
	
	public String toString() {
		
		String Detail = introduce() + "\n" + "Year of birth: " + getYear();
		return Detail;
		
	}
	
	
    
}
