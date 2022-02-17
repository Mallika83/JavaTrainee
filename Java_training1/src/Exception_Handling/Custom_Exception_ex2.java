package Exception_Handling;
import java.util.*;
class NameNotFoundException extends Exception
{
	NameNotFoundException(String str)
	{
		super(str);
	}
}
public class Custom_Exception_ex2 {
static void check_name(String name) throws NameNotFoundException
{
	if(name.equals("Mallika"))
			{
		System.out.println("Access allowed");
	}
	else
	{
		throw new NameNotFoundException("Access Denied");
	}
}
	public static void main(String[] args) throws NameNotFoundException {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=s.next();
		try
		{
		check_name(name);
		}
		catch(NameNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
