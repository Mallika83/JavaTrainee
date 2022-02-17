package looping_stmts;
import java.util.*;
public class student_list_array_ex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		
		
		int no_of_students,i;
		char choice;
		
		do
		{
		System.out.println("Enter number of students");
		no_of_students=s.nextInt();
		
		int[] student_reg_no=new int[no_of_students];
		String[] student_name=new String[no_of_students];
		String[] dept=new String[no_of_students];
		String[] result=new String[no_of_students];
		
		for(i=0;i<no_of_students;i++)
		{
			System.out.println("Enter student name");
			student_name[i]=s.next();
			
			System.out.println("Enter student Register number");
			student_reg_no[i]=s.nextInt();
			
			System.out.println("Enter student department");
			dept[i]=s.next();
			
			System.out.println("Enter student Result");
			result[i]=s.next();
			
		}
		System.out.println("====================================");
		System.out.println("Student Details are as follows");
		System.out.println("====================================");
		
		for(String name:student_name)
		{
			System.out.print("Student Name: \t");
			System.out.println(name);
		}
		for(int reg_no:student_reg_no)
		{
			System.out.print("Student Reg no: \t");
			System.out.println(reg_no);
		}
		for(String deptname:dept)
		{
			System.out.print("Student Department name: \t");
			System.out.println(deptname);
		}

		for(String result_student:result)
		{
			System.out.print("Student Result: \t");
			System.out.println(result_student);
		}
		System.out.println("Do you want to continue?");
		choice=s.next().charAt(0);
		}while(choice!='N');
	}

}
