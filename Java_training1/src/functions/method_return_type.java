package functions;
import java.util.*;

public class method_return_type {

	int num1,num2;
	float n1,n2,result;
	Scanner s=new Scanner(System.in);
	
	int add() {
		System.out.println("Enter value for number1");
		num1=s.nextInt();
		System.out.println("Enter value for number2");
		num2=s.nextInt();
		return(num1+num2);
	}
	int sub()
	{
		System.out.println("Enter value for number1");
		num1=s.nextInt();
		System.out.println("Enter value for number2");
		num2=s.nextInt();
		return(num1-num2);
	}
	
	float mul()
	{
		System.out.println("Enter value for number1");
		n1=s.nextInt();
		System.out.println("Enter value for number2");
		n2=s.nextInt();
		return(n1*n2);
	}
	
	float div()
	{
		System.out.println("Enter value for number1");
		n1=s.nextInt();
		System.out.println("Enter value for number2");
		n2=s.nextInt();
		return(n1/n2);
	}
	
	int modulus()
	{
		System.out.println("Enter value for number1");
		num1=s.nextInt();
		System.out.println("Enter value for number2");
		num2=s.nextInt();
		return(num1%num2);
	}
	
	public static void main(String[] args) {
		method_return_type obj=new method_return_type();
		System.out.println("The addidtion of 2 numbers is " +obj.add());
		
		System.out.println("The subtraction of 2 numbers is " +obj.sub());
		
		
		System.out.println("The Multiplication of 2 numbers is " +obj.mul());
		
		System.out.println("The Division of 2 numbers is " +obj.div());
		
		int result=obj.modulus();
		
		System.out.println("The modulus of 2 numbers is  "+result);

	}

}
