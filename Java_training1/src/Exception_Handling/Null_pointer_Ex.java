package Exception_Handling;

public class Null_pointer_Ex {

	public static void main(String[] args) {
		try
		{
		String str=null;
		int str_len=str.length();//unable to calculate the length of null object so nullpointerexception is thrown
		System.out.println("The length of the string is "+str_len);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code is executed ");
	}

}
