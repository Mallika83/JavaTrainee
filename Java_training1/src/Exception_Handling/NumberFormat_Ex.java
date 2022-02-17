package Exception_Handling;

public class NumberFormat_Ex {

	public static void main(String[] args) {
		try
		{
		int decimal_ex=Integer.parseInt("23.90");//throws numberformatexception as we cannot convert float to int
		int signedpositive=Integer.parseInt("+20");
		int signednegative=Integer.parseInt("-20");
		
		System.out.println("The decimal num is "+decimal_ex);
		System.out.println("The positive num is "+signedpositive);
		System.out.println("The negative num is "+signednegative);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code executed");
	}

}
