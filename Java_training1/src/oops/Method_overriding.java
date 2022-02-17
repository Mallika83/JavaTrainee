package oops;
class parent
{
	void show()
	{
		System.out.println("From parent class");
	}
	int calc(int a,int b)
	{
		return a+b;
	}
}
class child extends parent
{
	void show()
	{
		System.out.println("From child class");
	}
	int calc(int a,int b)
	{
		return a*b;
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c=new child();
c.show();
System.out.println(c.calc(78, 23));
	}

}
