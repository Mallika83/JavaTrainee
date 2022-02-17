package oops;
import java.util.*;
class Fibonacci
{
	static void fib(int number)
	{
		int count=number-2;
		int sum=0,n1=0,n2=1;
		
System.out.println("The fibonacci series is : ");
System.out.print(n1+" "+n2+" ");

while(count>0)
{
if(count>=1)
{
	sum=n1+n2;
	
	n1=n2;
	n2=sum;
	count=count-1;
	System.out.print(sum +" ");
	
}
	}
}
}
public class Fibonacci_series_ex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=s.nextInt();
		
		Fibonacci.fib(number);
		
		}
}
	


