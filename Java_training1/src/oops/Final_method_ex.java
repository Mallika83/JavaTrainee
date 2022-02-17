package oops;
class parent_final
{
	final void show()
	{
		System.out.println("Parent class is called");
	}
}
final class child_final extends parent_final
{
	//void show() gives error when we try to override in the child class 
}
//class child2 extends child_final  this will create error as child_final is final class

	

public class Final_method_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
