public class Lecturer extends Person
{
    double salary ;
    
    public Lecturer(String name , int year , double salary) {
    	super(name,year);
    	this.salary = salary;
    }
    
    public double getSalary() {
    	return salary;
    }
    
    
    @Override
    public String toString() {
    	return super.toString() + "\n"  + "Salary: " + getSalary();
    }
    
    
    

}
