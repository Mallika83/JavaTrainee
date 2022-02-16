package oops;
import java.util.*;
public class Corses_Arrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				int no_courses,i;
				System.out.println("Enter the Number of courses ");
		no_courses=s.nextInt();
		
		String[] courses_name=new String[no_courses];
		
		System.out.println("Enter course names");
		for(i=0;i<no_courses;i++)
		{
			courses_name[i]=s.next();
		}
		System.out.println("Registered courses are ");
		for(String name:courses_name)
			System.out.println(name);
		
	}

}
