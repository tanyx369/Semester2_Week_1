public class Executive extends Manager
{

	public Executive(String name, double salary, String dep) {
		super(name, salary, dep);
	}
	
	public String myManager(Manager manager) {
		return "Manager is " + manager.getName();
	}
	
	
	public String toString() {
		return super.toString() ;
	}
	
	
    
}
