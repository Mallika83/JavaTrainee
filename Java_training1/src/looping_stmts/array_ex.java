package looping_stmts;
import java.util.*;
public class array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no_of_employees,i;

Scanner s=new Scanner(System.in);
System.out.println("Enter no of employees");
no_of_employees=s.nextInt();
int[] emp_id=new int[no_of_employees];
String[] emp_name=new String[no_of_employees];
String[] emp_dept=new String[no_of_employees];
System.out.println("Enter the employee details");
for(i=0;i<no_of_employees;i++)
{
	System.out.println("Enter the Employee name");
	emp_name[i]=s.next();
	
	System.out.println("Enter the Employee department");
	emp_dept[i]=s.next();
	
	System.out.println("Enter the Employee ID");
	emp_id[i]=s.nextInt();

	
}
System.out.println("Employees name");

for(String name:emp_name)
{
	System.out.println(name);
}
System.out.println("Employees Dept");
for(String dept:emp_dept)
{
	System.out.println(dept);
}
System.out.println("Employees ID");

for(int id:emp_id)
{
	System.out.println(id);
}
	}

}
