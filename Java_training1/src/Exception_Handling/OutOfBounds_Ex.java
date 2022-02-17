package Exception_Handling;

public class OutOfBounds_Ex {

	public static void main(String[] args) {
		
int[] arr=new int[10];
String str="hello";

int i;

try
{
for(i=0;i<=10;i++)
{
	arr[i]=5;
}
System.out.println("The elments in the array ");

for(int element:arr)
	
	System.out.println(element);
	}
	catch(ArrayIndexOutOfBoundsException e)
{//will catch Arrayindexoutofbounds exception  
		
	System.out.println(e);
	System.out.println("Rest of the code");//after catching the exception this line will execute
	try {
		System.out.println("The character in 6th position is "+str.charAt(6));//trying to access char at position 6
	}
	catch(StringIndexOutOfBoundsException e1)// catch StringIndexoutofboundsException
	
	{
		System.out.println(e1);
	}
}
System.out.println("Rest of the code");//after catching the exception this line will execute

	}
}
