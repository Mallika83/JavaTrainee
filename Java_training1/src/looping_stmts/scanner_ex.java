package looping_stmts;
import java.util.*;
public class scanner_ex {

	public scanner_ex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String emp_name,doj;
		int emp_id;
		float basic_salary,hra,tax,cpf,total_earnings,total_deductions,gross_pay;
		System.out.println("Enter the employee name");
		
		emp_name=s.next();
		System.out.println("Enter the employee id");
		emp_id=s.nextInt();
		
		System.out.println("Enter the Date of joining");
		doj=s.next();
		
		System.out.println("Enter the basic salary");
		basic_salary=s.nextFloat();
		
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
total_earnings=basic_salary+hra;
total_deductions=tax+cpf;
gross_pay=total_earnings-total_deductions;
System.out.println("------------------------------------------------");
System.out.println("Employee Pay Slip");
System.out.println("------------------------------------------------");
System.out.println("Employee Name: "+emp_name +"\t");
System.out.println("Employee ID: "+emp_id);
System.out.println("Employee Name: "+emp_name);
System.out.println("Employee total deductions: "+total_deductions);
System.out.println("Employee total earnings: "+total_earnings);
System.out.println("Employee Gross pay: "+gross_pay);
	}

}
