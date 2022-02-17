package oops;
import java.util.*;
 class Armstrong
{	
	static void check(int number)
	{
		int sum=0,r;
		int temp=number;
		
		if(number==0)
			System.out.println("The number is Armstrong number");
		while(number!=0)
		{
			r=number%10;
			sum =sum+(r*r*r);
			number=number/10;
		}
		if (temp==sum)
			System.out.println("The number is Armstrong number");
		else 
			System.out.println("The number is  not Armstrong number");
	}
	
		
}
public class Armstrong_ex_static {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=s.nextInt();
		Armstrong.check(number);
		
		
	}

}
