package oops;
import java.util.*;

	class Employee
	{
		String emp_name;
		int emp_id;
		String company_name;
		String dept;
		String city;
		
		Scanner s=new Scanner(System.in);
		Employee()
		{
			
		}
		Employee(String company_name,String dept,String city)
		{
			this.company_name=company_name;
			this.dept=dept;
			this.city=city;
		}
		void get_data()
		{
			System.out.println("Enter the Employee name");
			emp_name=s.next();
			System.out.println("Enter the Employee Id");
			emp_id=s.nextInt();
		}
		void display()
		{
			System.out.println("Employee name : \t"+emp_name);
			System.out.println("Employee ID : \t"+emp_id);
			System.out.println("Company name : \t"+company_name);
			System.out.println("Department : \t"+dept);
			System.out.println("City : \t"+city);
		}
	}

	public class employee_data {

		public static void main(String[] args) {
			char choice;
			Scanner s=new Scanner(System.in);
			do
			{
				Employee e=new Employee("Microsoft","Csc","Singapore");
				e.get_data();
				e.display();
				System.out.println("Do you want to continue?");
				choice=s.next().charAt(0);
				
			}while(choice!='N');
			
			
		}	

		}
