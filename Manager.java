public class Manager extends Employee
{
    String department;
    
    public Manager(String name, double salary , String dep) {
    	super(name , salary);
    	this.department = dep;
    }
    
    public String show_department() {
    	return department;
    }
    
    
    public String getName() {
    	return super.getName();
    }
    
    /*
  
    public void setName(String name) {
    	super.setName(name);
    }
    
    
    public double getSalary() {
    	return super.getSalary();
    }
    
    
    public void setSalary(double salary) {
    	super.setSalary(salary);
    }
    */
    
    public String toString() {
    	return super.toString() + "\n" + "Department: " + show_department();
    }
}
