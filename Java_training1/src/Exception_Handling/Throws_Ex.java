package Exception_Handling;

import java.io.IOException;

public class Throws_Ex {
void display() throws IOException//throws Checked exception 
{
	System.out.println("The operation is interruputed ");
}
	public static void main(String[] args) throws IOException {//have to inform that this method throws IOException
		//JVM will take  care of the exception
		//try catch blocks for unchecked Exception
		// TODO Auto-generated method stub
Throws_Ex obj=new Throws_Ex();
obj.display();
System.out.println("Normal operation ");
	}

}
