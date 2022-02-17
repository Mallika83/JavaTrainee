package functions;
import java.util.*;
public class emp_dat_ex {

	int emp_id,age;// instance variables declared outside of all methods
	String emp_name;
	float basic_salary,hra,tax,total_deductions,cpf,total_earnings,gross_salary;
	
	Scanner s= new Scanner(System.in);
	
	void getdata()
	{
		System.out.println("Enter Employee name");
		emp_name=s.next();
		
		System.out.println("Enter employee ID");
		emp_id=s.nextInt();
		

		System.out.println("Enter employee AGE");
		age=s.nextInt();
		

		System.out.println("Enter employee salary");
		basic_salary=s.nextFloat();
	}
	
	void calculate()
	{
		if(basic_salary>2000 && basic_salary<3000)
		{
			hra=basic_salary*15/100;
			tax=basic_salary*10/100;
			cpf=basic_salary*14/100;
			
		}
		else if(basic_salary>3000 && basic_salary<4000)
		{
			hra=basic_salary*20/100;
			tax=basic_salary*12/100;
			cpf=basic_salary*16/100;
		}
		else if(basic_salary>4000)
		{
			hra=basic_salary*22/100;
			tax=basic_salary*8/100;
			cpf=basic_salary*23/100;
		}
		else {
			hra=basic_salary*10/100;
			tax=basic_salary*8/100;
			cpf=basic_salary*10/100;
		}

	total_earnings=basic_salary+hra;
	total_deductions=tax+cpf;
	gross_salary=total_earnings-total_deductions;
	}
	
	void printall() //method declaration
	{
		//method definition
		System.out.println("------------------------------------------------");
		System.out.println("Employee Pay Slip");
		System.out.println("------------------------------------------------");
		System.out.println("Employee Name: "+emp_name +"\t");
		System.out.println("Employee ID: "+emp_id);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee total deductions: "+total_deductions);
		System.out.println("Employee total earnings: "+total_earnings);
		System.out.println("Employee Gross pay: "+gross_salary);
	}
	public static void main(String[] args) {
		int i;
emp_dat_ex obj=new emp_dat_ex();
for(i=0;i<3;i++)
{
obj.getdata();// method call
obj.calculate();
obj.printall();
}
	}

}
