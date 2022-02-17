package Exception_Handling;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String str)
	{
	super(str);
	}
}

public class Custom_Exception_Ex {
static void validate(int age) throws InvalidAgeException
{
	if(age<18)
	{
		throw new InvalidAgeException("Not the right age to vote ");
	}
	else 
	{
		System.out.println("Time to vote");
	}
}
	public static void main(String[] args) {
		try
		{
			validate(17);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code ");

	}

}
