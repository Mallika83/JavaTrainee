package Exception_Handling;

public class Finally_ex {

	public static void main(String[] args) {
		try
		{
		int a=5,b=0;
		b=a/b;
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Iam in Arithmetic catch blk1");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Iam in default catch blk");
		}*/
		finally//This block always run irrespective of the catch blk
		{
			System.out.println("Iam in finally block");
		}
		

	}

}
