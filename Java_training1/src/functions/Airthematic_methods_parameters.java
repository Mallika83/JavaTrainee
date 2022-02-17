package functions;
import java.util.*;
public class Airthematic_methods_parameters {

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
	
	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n1,n2;

Airthematic_methods_parameters obj= new Airthematic_methods_parameters();

System.out.println("Enter A value");
n1=s.nextInt();

System.out.println("Enter B value");
n2=s.nextInt();

System.out.println("Addition of two numbers: \t" + obj.add(n1, n2));//passing the numbers to add method
System.out.println("Subtraction of two numbers : \t" + obj.sub(n1, n2));
System.out.println("Multiplication of two numbers : \t" + obj.mul(n1, n2));
System.out.println("Division of two numbers : \t" + obj.div(n1, n2));
System.out.println("Modulus of two numbers : \t" + obj.modulus(n1, n2));
	}

}
