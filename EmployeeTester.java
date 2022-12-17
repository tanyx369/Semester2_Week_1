public class EmployeeTester
{
	
	public static void main(String[] args) {
		
		Manager m1 = new Manager("John" , 1232131 , "HR");
		Executive e1 = new Executive("Jack" , 123412 , "finance");
		System.out.println(e1);
		System.out.println(e1.myManager(m1));
		System.out.print(m1);
	}
    
}
