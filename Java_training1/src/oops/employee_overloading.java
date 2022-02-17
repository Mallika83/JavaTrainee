package oops;
class Employee1
{
	String emp_name,address,company_name,city,dept;
	int emp_id,salary;
	Employee1()
	{
		System.out.println("Default Constructor");
		System.out.println("---------------------------------------");
	}
	Employee1(String address,String city)
	{
		this.address=address;
		this.city=city;
		
	}
	Employee1(String address,String city,String emp_name,String dept,int salary,int emp_id)
	{
		this.address=address;
		this.city=city;
		this.emp_name=emp_name;
		this.dept=dept;
		this.salary=salary;
		this.emp_id=emp_id;
		
	}
	void display()
	{
		System.out.println("Employee name: \t"+emp_name);
		System.out.println("Employee ID: \t"+emp_id);
		System.out.println("Address: \t"+address);
		System.out.println("City: \t"+city);
		System.out.println("Department: \t"+dept);
		System.out.println("Salary: \t"+salary);
		System.out.println("---------------------------------------");
	}
}
public class employee_overloading {

	public static void main(String[] args) {
		
Employee1 e= new Employee1();
Employee1 e1=new Employee1("Sengkang","Singapore");
Employee1 e2=new Employee1("Sengkang","Singapore","Mallika","IT",2000,100);
e.display();
e1.display();
e2.display();

	}

}
