package Exception_Handling;

public class Exception_Demo1 {

	public static void main(String[] args) {
		try
		{
		int salary=12000;
		int hra;
		System.out.println("The salary is "+salary);
		hra=salary*15/0;
		System.out.println("The HRA is "+hra );
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("Rest of the code will be executed ");
	}

}
