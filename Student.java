public class Student extends Person
{
	String major;
	
	public Student(String name , int year , String major) {
		super(name, year);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	
	@Override
	public String toString() {
		String detail = "Major studied: " + getMajor();
		return super.toString() + "\n" +  detail;
	}
	
	
    
}
