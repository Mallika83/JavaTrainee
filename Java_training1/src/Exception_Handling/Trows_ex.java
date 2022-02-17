package Exception_Handling;

public class Trows_ex {
static void check_age(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("Access denied You must atleast 18 years old.");
	}
	else
	{
		System.out.println("Logged in successfully");
	}
}
	public static void main(String[] args) {
		check_age(17);

	}

}
