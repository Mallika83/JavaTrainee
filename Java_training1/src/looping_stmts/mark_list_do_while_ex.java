package looping_stmts;

import java.util.Scanner;

public class mark_list_do_while_ex {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String student_name,student_dob,reg_no,grade=null,result=null;
		int mark1,mark2,mark3,total_marks,average,no_of_students,i=0;
		
		System.out.println("Enter no of students ");
		no_of_students=s.nextInt();
		
		do
		{
		System.out.println("Enter student name");
		student_name=s.next();
		
		System.out.println("Enter student DOB");
		student_dob=s.next();
		
		System.out.println("Enter student Register num");
				reg_no=s.next();
				System.out.println("Enter mark1 ");
				mark1=s.nextInt();
	
	System.out.println("Enter mark2 ");
	mark2=s.nextInt();
	System.out.println("Enter mark3 ");
	mark3=s.nextInt();
	total_marks=mark1+mark2+mark3;
	average=total_marks/3;
	System.out.println("========================================");
	System.out.println("Students Mark list");
	System.out.println("========================================");
	System.out.println("Student Name: "+student_name+ "\t"+"Student DOB: " +student_dob +"\t"+ "Student Register number: "+reg_no);
	
	if(mark1>=50 && mark2>=50 && mark3>=50 )
	{
		
		result="pass";
	}
	
	else
	{
		result="Fail";
	}
	
	if(average>=80)
	{
		grade="A";
		
	}
	else if(average>=70 & average<80)
	{
		grade="B";
	}
	else
	{
		grade="C";
	}
	System.out.println("Student's result is "+result);
	System.out.println("Totalmarks obtained is: "+total_marks +"\t");
	System.out.println("Average marks obtained: "+average);
	System.out.println("Student got grade "+ grade);
	i++;
	}while(i<no_of_students);

	}

}
