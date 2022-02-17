package functions;
import java.util.*;
class another_class
{
	int add(int n1,int n2)
	{
		return n1+n2;
	}
	int sub(int n1,int n2)
	{
		return n1-n2;
	}
	int modulus(int n1,int n2)
	{
		return n1%n2;
	}
	float mul(float n1,float n2)
	{
		return n1*n2;
	}
	float div(float n1,float n2)
	{
		return n1/n2;
	}
	
}
public class inner_class_ex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1,n2;

		System.out.println("Enter a value");
		n1=s.nextInt();

		System.out.println("Enter B value");
		n2=s.nextInt();
		
		another_class obj=new another_class();
		
		another_class obj1=new another_class();
				another_class obj2=new another_class();

		System.out.println("Addition of two numbers: \t" + obj.add(n1, n2));
		System.out.println("Subtraction of two numbers : \t" + obj.sub(n1, n2));
		System.out.println("Multiplication of two numbers : \t" + obj1.mul(n1, n2));
		System.out.println("Division of two numbers : \t" + obj1.div(n1, n2));
		System.out.println("Modulus of two numbers : \t" + obj2.modulus(n1, n2));


	}

}
