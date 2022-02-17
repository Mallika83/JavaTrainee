package oops;
class maths
{
	int calc(int a,int b,int c)
	{
		return a*b*c;
	}
	double calc(double a,double b,double c)//Method overloading.different return type,different singnatures but same method name.
	{
		return ((a*b)/c);
	}
	int calc(int a,int b)
	{
		return a-b;
	}
}
public class overloading_ex {

	public static void main(String[] args) {
		
maths m=new maths();
System.out.println("Multiplication "+m.calc(23,89,65));
System.out.println("Double  "+m.calc(23.90,8.34,6.23));
System.out.println("Subtraction "+m.calc(23,89));
	}

}
