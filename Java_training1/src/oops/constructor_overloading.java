package oops;
import java.util.*;

class student
{
	int reg_no;
	String school_name,address,dept;
	student()
	{
		System.out.println("Default Constructor");
		System.out.println("--------------------------------------");
	}
	student(int reg_no,String school_name)
	{
		this.reg_no=reg_no;
		this.school_name=school_name;
	}
	student(int reg_no,String school_name,String address,String dept)
	{
		this.reg_no=reg_no;
		this.school_name=school_name;
		this.address=address;
		this.dept=dept;
	}
	void display()
	{
		System.out.println("School Name: \t" +school_name);
		System.out.println("Register number: \t" +reg_no);
		System.out.println("Address: \t" +address);
		System.out.println("Department: \t" +dept);
		System.out.println("--------------------------------------");
	}
}
public class constructor_overloading {

	public static void main(String[] args) {
		
student s1=new student();
student s2=new student(12345,"AGPS");
student s3=new student(12345,"AGPS","Sengkang","CSC");
s1.display();
s2.display();
s3.display();
	}

}
