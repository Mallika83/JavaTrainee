package oops;

interface Testinterface1
{
	default void show()
	{
		System.out.println("Test Interface1");
	}
}
interface Testinterface2
{
	default void show()//Have same method as in Testinterface1
	{
		System.out.println("Test Interface2");
	}
	void display();
	
}


public class Default_method_ex implements Testinterface1,Testinterface2{

	public void show()//Default method show in both the interfaces overridden
	{
		Testinterface1.super.show();//calls testinterface1  show method
		
		Testinterface2.super.show();//calls testinterface2  show method
		
		System.out.println("From Test Class");
			
		
	}
	 void show(String name) {//this method show is method overloading
		System.out.println("From show method"+name);
	}
	public static void main(String[] args) {
		Default_method_ex d=new Default_method_ex();
		
		d.show();
		d.show("Java");//calls overloaded show method

	}
	public void display()
	{
		System.out.println("Display method ");
	}

}
