package oops;

import java.util.Scanner;

class student_v1
{
	int reg_no,mark1,mark2,mark3;
	String dept;
	
	
	Scanner s= new Scanner(System.in);
	
	void getdata()
	{
		System.out.println("Enter Reg number");
		reg_no=s.nextInt();
		System.out.println("Enter Mark1");
		mark1=s.nextInt();
		System.out.println("Enter Mark2");
		mark2=s.nextInt();
		System.out.println("Enter Mark3");
		mark3=s.nextInt();
	}
}
class calculate_result extends student_v1
{

	int total,avg;
	char grade;
	String result;
	void calculate()
	{
		total=mark1+mark2+mark3;
		avg=total/3;
		if(mark1>=50 && mark2>=50 && mark3>=50)
			result="Pass";
		else
			result="Fail";
		
		if(avg>=80)
		grade='A';
		else if(avg>=70 && avg<80)
			grade='B';
		else if(avg>=50 && avg<70)
			grade='C';
		else
			grade='D';
		
}
}
	class display_class extends calculate_result
	{
		void report()
		{
			System.out.println("====================================");
			System.out.println("Student Details are as follows");
			System.out.println("====================================");
			System.out.print("Student Reg no: \t");
			System.out.println(reg_no);
			System.out.println("Total marks obtained \t" +total);
			System.out.println("Average obtained \t" +avg);
			System.out.println("Result  \t" +result);
			System.out.println("Grade \t" +grade);
		}
			
	}
public class multiple_inheritance 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
display_class d=new display_class();
d.getdata();
d.calculate();
d.report();
	}

}
