package oops;

import java.util.Scanner;
class student_v2
{
	int reg_no,mark1,mark2,mark3,total,avg;
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
	void total_avg()
	{
		total=mark1+mark2+mark3;
		avg=total/3;
	}
}
class calculate_result1 extends student_v2
{		
	String result;
	
	void calculate()
	{
		
		if(mark1>=50 && mark2>=50 && mark3>=50)
		{
			result="Pass";
		}
		else
		{
			result="Fail";
		}
		System.out.println("Total marks obtained in calculte_class \t" +total);
		System.out.println("Average obtained calculte_class \t" +avg);
		System.out.println("Result calculte_class \t" +result);	
		
}
}
class grade_calculate extends student_v2
{
	char grade;
	void grade()
	{
		
		if(avg>=80)
			grade='A';
			else if(avg>=70 && avg<80)
				grade='B';
			else if(avg>=50 && avg<70)
				grade='C';
			else
				grade='D';
	}
	void report()
	{
		System.out.println("====================================");
		System.out.println("Student Details are as follows");
		System.out.println("====================================");
		System.out.print("Student Reg no: \t");
		System.out.println(reg_no);
		System.out.println("Total marks obtained \t" +total);
		System.out.println("Average obtained \t" +avg);
		System.out.println("Grade \t" +grade);
	}
}
public class Hirarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade_calculate g=new grade_calculate ();
		calculate_result1 res=new calculate_result1();
		g.getdata();
		g.total_avg();
		g.grade();
		g.report();
		
		res.getdata();
		res.total_avg();
		res.calculate();
			
	}

}
