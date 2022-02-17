package oops;

import java.util.Scanner;

class emp_hirarchy
{
	int emp_id;
	String emp_name,dept;
	float basic_salary,hra,tax,cpf,total_earnings,total_deductions,gross_pay;
	Scanner s=new Scanner(System.in) ;
	
	void getdata()
	{
	System.out.println("Enter the employee name");
	emp_name=s.next();
	System.out.println("Enter the employee id");
	emp_id=s.nextInt();
	System.out.println("Enter the  Department");
	dept=s.next();
	System.out.println("Enter the basic salary");
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
	else 
	{
		hra=basic_salary*10/100;
		tax=basic_salary*8/100;
		cpf=basic_salary*13/100;
	}
}
}
class total_earnings extends emp_hirarchy
{
	void earnings()
	{
		total_earnings=basic_salary+hra;
		total_deductions=tax+cpf;
		gross_pay=total_earnings-total_deductions;
		System.out.println("Employee total deductions: "+total_deductions);
		System.out.println("Employee total earnings: "+total_earnings);
		System.out.println("Employee Gross pay: "+gross_pay);
	}
}
class total_gross extends emp_hirarchy
{
	void display()
	{
		System.out.println("------------------------------------------------");
		System.out.println("Employee Pay Slip");
		System.out.println("------------------------------------------------");
		System.out.println("Employee Name: "+emp_name +"\t");
		System.out.println("Employee ID: "+emp_id);
	}
}

public class emp_hirarchial {

	public static void main(String[] args) {
		//emp_hirarchy t= new emp_hirarchy();
		total_earnings e=new total_earnings();
		total_gross g=new total_gross();
		
		//t.getdata();
		//t.calculate();
	
	g.getdata();
	g.calculate();
	g.display();
	
//	e.getdata();
//	e.calculate();
	e.earnings();
	
		
		
		
	}

}
