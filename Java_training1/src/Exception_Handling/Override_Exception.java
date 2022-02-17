package Exception_Handling;

import java.io.IOException;

class parent_Ex
{
	void msg() throws IOException
	{
		System.out.println("Iam in parent class");
	}
}
public class Override_Exception extends parent_Ex {

	void msg() throws IOException{//child class cannot handle checked Exception if the parent class is not handling it.
		System.out.println("Iam in child class");
	}
	public static void main(String[] args) throws IOException {
		parent_Ex p=new Override_Exception();
		p.msg();

	}

}
