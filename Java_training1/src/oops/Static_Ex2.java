package oops;

public class Static_Ex2 {

	static int a=10;
	int b=30;
	public static void main(String[] args) {
		
		Static_Ex2 obj= new Static_Ex2();
		
System.out.println("The value of a is accessed in static way "+Static_Ex2.a);
System.out.println("The value of b is accessed using object "+obj.b);


	}

}
