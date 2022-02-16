package oops;

interface Courses
{
	int course_fee();
	default void method1()
	{
		System.out.println("Iam from default method");
	}
	static void method2()
	{
		System.out.println("Iam from static method");
	}
}
class B_Tech implements Courses
{
	String course_name="B_Tech";
	int Id=100;
	public int course_fee()
	{
		return 50000;
	}
}

class M_Tech implements Courses
{
	String course_name="M_Tech";
	int Id=200;
	public int course_fee()
	{
		return 75000;
	}
}
class MBBS implements Courses
{
	String course_name="Medical";
	int Id=300;
	public int course_fee()
	{
		return 90000;
	}
	
}
public class Courese_EX {

	public static void main(String[] args) {
		B_Tech BE=new B_Tech();
		M_Tech ME=new M_Tech();
		MBBS Medical=new MBBS();
		System.out.println("=================================");
		System.out.println("Avaliable Courses");
		System.out.println("=================================");
		System.out.println("Course Name: "+BE.course_name);
		System.out.println("Course ID: "+BE.Id);
		System.out.println("Course Fee: "+BE.course_fee());
		BE.method1();
		Courses.method2();
		System.out.println("-----------------------------------");
		System.out.println("Course Name: "+ME.course_name);
		System.out.println("Course ID: "+ME.Id);
		System.out.println("Course Fee: "+ME.course_fee());
		ME.method1();
		Courses.method2();
		System.out.println("-----------------------------------");
		System.out.println("Course Name: "+Medical.course_name);
		System.out.println("Course ID: "+Medical.Id);
		System.out.println("Course Fee: "+Medical.course_fee());
		Medical.method1();
		Courses.method2();


	}

}
