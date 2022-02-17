package looping_stmts;
import java.util.*;
public class array_concat {

	public static void main(String[] args) {
		int no_elements,i;
Scanner s= new Scanner(System.in);
System.out.println("Enter the no of elements in the array");
no_elements=s.nextInt();
String[] input_array1=new String[no_elements];
String[] input_array2=new String[no_elements];
String[] Result_array=new String[no_elements];

for(i=0;i<no_elements;i++)
{
	input_array1[i]=s.next();
}
for(i=0;i<no_elements;i++)
{
	input_array2[i]=s.next();
}
for(i=0;i<no_elements;i++)
{
	Result_array[i]=input_array1[i]+input_array2[i];
}
System.out.println("Result array after concat");
for (String element:Result_array)
{
	System.out.println(element +"\t");
}
	}

}
