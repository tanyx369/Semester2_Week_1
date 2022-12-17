import java.util.*;

public class PersonTester
{
	Student s1;
	Lecturer l1;

	
	public void Ask() {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter student name: ");
		String name = scan.nextLine();
		System.out.println("Enter student birth year: ");
		int year = scan2.nextInt();
		System.out.println("Enter student major: ");
		String major = scan.nextLine();
		s1 = new Student(name , year , major);
		
		System.out.println("Enter lecturer name: ");
		String name2 = scan.nextLine();
		System.out.println("Enter lecturer birth year: ");
		int year2 = scan2.nextInt();
		System.out.println("Enter lecturer salary: ");
		double salary2 = scan.nextDouble();
		l1 = new Lecturer(name2 , year2, salary2);
	}
    
	public void printDetail() {
		s1.introduce();
		System.out.println(s1);
		l1.introduce();
		System.out.println(l1);
	}
	
	public static void main(String[] args) {
		PersonTester test = new PersonTester();
		test.Ask();
		test.printDetail();
	}
}
