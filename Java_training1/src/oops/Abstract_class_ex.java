package oops;

abstract class bank
{
	abstract int rate_calculation();
	void show()
	{
		System.out.println("This is Non-abstract Method ");
	}
	bank()
	{
		System.out.println("Constructor for Abstract method");
	}
}
class HDFC extends bank
{
	HDFC()
	{
		System.out.println("HDFC constructor");
	}
	int rate_calculation()
	{
		return 12;
	}
}
class DBS extends bank
{
	int rate_calculation()
	{
		return 10;
	}
}
abstract class SBI extends bank //abstract child clss
{ 
	abstract  int rate(); //abstract method

	
}
public class Abstract_class_ex {
public static void main(String[] args)
{
	DBS dbs=new DBS();
	HDFC hdfc=new HDFC();
	//SBI sbi=new SBI();
	
	System.out.println("The interest rate in HDFC is : "+hdfc.rate_calculation());
	System.out.println("The interest rate in DBS is : "+dbs.rate_calculation());
	//System.out.println("The interest rate in SBI is : "+sbi.rate_calculation());
	dbs.show();
	
}
}
