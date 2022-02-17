package Exception_Handling;

public class Multiple_Catch_Ex {

	public static void main(String[] args) {
		int[] arr=new int[5];
		String str=null;
		
		try
		{
			//arr[7]=78; throws ArrayIndexOutOfboundsException
			arr[3]=43/0; //throws ArithmeticException
			
		}
      catch(ArithmeticException e)
		{
	       System.out.println(e);
	       System.out.println("Iam in catch blk1" );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			System.out.println(str.length());//throws NullPointerException
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Iam in catch blk" );
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		System.out.println("Restof the code is executed" );
	}

}
