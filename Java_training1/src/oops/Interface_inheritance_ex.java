package oops;
interface printer
{
	void print();
}
interface scanner extends printer
{
	void scan();
}
class interface_demo implements scanner
{
	public void print()
	{
		System.out.println("Printing...");
	}
	
	public void scan()
	{
		System.out.println("Scanning...");
	}
}
public class Interface_inheritance_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
interface_demo demo=new interface_demo();
demo.print();
demo.scan();
	}

}
