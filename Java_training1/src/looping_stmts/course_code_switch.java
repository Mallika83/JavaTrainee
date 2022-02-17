package looping_stmts;
import java.util.*;
public class course_code_switch {

	public course_code_switch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int course_code;
		String course_name =null;
		System.out.println("Please enter a course code");
		course_code=s.nextInt();
		switch (course_code)
		{
		case 101:
			course_name="CSE";
			System.out.println("The chosen course name is "+course_name);
			break;
		case 102:
			course_name="EEE";
			System.out.println("The chosen course name is "+course_name);
			break;
		case 103:
			course_name="Mechanical";
			System.out.println("The chosen course name is "+course_name);
			break;
		case 104:
			course_name="Civil";
			System.out.println("The chosen course name is "+course_name);
			break;
		default:
			System.out.println("Invalid course code");
					
		}
	}

}
