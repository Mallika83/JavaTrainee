package Exception_Handling;

public class Finalize_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Finalize_Ex obj=new Finalize_Ex();
System.out.println("The hash code of the object is "+obj.hashCode());

obj=null;
System.gc();

System.out.println("Garbage Collection done ");
//obj.finalize();// We are calling finalize method on the obj object explicitly.
//so when executing finalize method if there are any run-time exceptions it will throw the exception and program terminates abnormal  
//if we dont call finalize explitictly and gc calls finalize method runtime exceptions is ignored
	}
	protected void finalize()
	{
		System.out.println("Iam in Finalize blk ");
		System.out.println(10/0);//thro Arithematic Exception
	}

}
