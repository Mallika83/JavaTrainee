package functions;
import java.util.*;
public class student_marklist_methods {

	String Student_name;
	int reg_no,mark1,mark2,mark3,total,average;
	String result,grade;
	Scanner s=new Scanner(System.in);
	
	void input_data()
	{
		System.out.println("Enter student name ");
		Student_name=s.next();
		
		System.out.println("Enter student Register number ");
		reg_no=s.nextInt();
		
		System.out.println("Enter mark1 ");
		mark1=s.nextInt();
		
		System.out.println("Enter mark2 ");
		mark2=s.nextInt();
		
		System.out.println("Enter mark3 ");
		mark3=s.nextInt();
		
	}
	void calculate_result()
	{
		total=mark1+mark2+mark3;
		average=total/3;
		if(mark1>=50 && mark2>=50 && mark3>=50)
		{
			result="Pass";
		}
		else 
			result="Fail";
		
		if(average>=80)
			grade="A";
		
		else if(average>=70 && average<80)
			grade="B";
		
		else if(average>=60 && average<70)
			grade="C";
		
		else
			grade="D";
	}
	
	void view_result()
	{
		System.out.println("=======================================");
		System.out.println("Student Mark List");
		System.out.println("=======================================");
		System.out.println("Student Name : \t"+Student_name);
		System.out.println("Student Register number : \t"+reg_no);
		System.out.println("Student total marks obtained : \t"+total);
		System.out.println("Student Result : \t"+result);
		System.out.println("Student Grade : \t"+grade);
		
	}
	public static void main(String[] args) {
		char choice;
		Scanner s=new Scanner(System.in);
        student_marklist_methods obj=new student_marklist_methods();
do {
	obj.input_data();
	obj.calculate_result();
	obj.view_result();
	
	System.out.println("Do you want to continue?");
	choice=s.next().charAt(0);
}while(choice!='N');



	}

}
