package looping_stmts;
import java.util.*;
public class printing_odd_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_value,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input value ");
		input_value=s.nextInt();
		
		System.out.println("Odd numbers ");
		for(i=0;i<input_value;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
				
		}

	}

}
