package oops;
interface Animal_I
{
	void sound();
	
	default void color()//dont override in implementation class to avoid Ambiguity
	{
		System.out.println("Color of Animal");
	}
	static int size(int n) //dont override in implementation class to avoid Ambiguity
	{
		return n*2;
	}
}
class Animal_class implements Animal_I
{
	@Override
	public void sound() 
	{
	
	System.out.println("Bark");
    }
	
	 int size(int num)//not a good practice
	{
		return num*num;
	}
	
}
public class Interface_misc {

	public static void main(String[] args) {
		
		Animal_class animal=new Animal_class();
		animal.sound();
		
		System.out.println("The size method in Animal class"+animal.size(10));//calls size method in animal class
		
		
		System.out.println("The size method in Animal_interface "+Animal_I.size(10));//calls static size method in Animal_I interface
		
		animal.color();//this will call color method in Animal_I interface
		
		color();//this will call color method in Interface_misc class

	}
	static void color()// static method name same as interface
	{
	System.out.println("Color of Dog");
	}

}
