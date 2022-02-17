package oops;
import java.util.Scanner;
class emp_class
{
	String emp_name;
	int emp_id;
	String company_name;
	String dept;
	String city;
	
	Scanner s=new Scanner(System.in);
	
	void get_data()
	{
		System.out.println("Enter the Employee name");
		emp_name=s.next();
		System.out.println("Enter the Employee Id");
		emp_id=s.nextInt();
		System.out.println("Enter the Company_name");
		company_name=s.next();
		System.out.println("Enter Department");
		dept=s.next();
		System.out.println("Enter the City");
		city=s.next();
	}
	
}
class display_class1 extends emp_class
{
	void display()
	{
		System.out.println("Employee name : \t"+emp_name);
		System.out.println("Employee ID : \t"+emp_id);
		System.out.println("Company name : \t"+company_name);
		System.out.println("Department : \t"+dept);
		System.out.println("City : \t"+city);
	}
}
public class Employee_single_inheritance {

	public static void main(String[] args) {
		
display_class1 d=new display_class1();
d.get_data();
d.display();
	}

}
