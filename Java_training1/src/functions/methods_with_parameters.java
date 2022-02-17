package functions;
import java.util.*;
public class methods_with_parameters {

	int add(int n1,int n2)
	{
		return(n1+n2);
	}
	public static void main(String[] args) {
		
		int a,b;
		Scanner s= new Scanner(System.in);
		methods_with_parameters obj= new methods_with_parameters();
		
		System.out.println("Enter value of a number");
		a=s.nextInt();
		
		System.out.println("Enter value of a number");
	    b=s.nextInt();
	    
	    System.out.println(obj.add(a, b));
	    System.out.println(obj.add(45,78));
	    
		
		
	}

}
