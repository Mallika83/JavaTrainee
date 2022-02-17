package Exception_Handling;
import java.util.*;
public class Custom_Exception {
static void check_mark(int mark)
{
	if(mark<50)
	{
		throw new ArithmeticException("Sorry you need atleast 50 marks ");
	}
	else
	{
		System.out.println("Pass");
	}
}
	public static void main(String[] args) {
		int mark;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the mark");
		mark=s.nextInt();
		check_mark(mark);
	}

}
