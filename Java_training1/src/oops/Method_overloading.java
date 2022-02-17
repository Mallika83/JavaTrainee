package oops;

class demo
{
	
	int add(int a1,int a2,int a3)
	{
		return a1*a2*a3;
	}
	double add(double a1,double a2)
	{
		return a1*a2;
	}
}
public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo d=new demo();
System.out.println("Addition is "+d.add(145,89));
System.out.println("Multiplication is "+d.add(145,89,84));
System.out.println("float addition is "+d.add(145.89,78.23));
	}

}
