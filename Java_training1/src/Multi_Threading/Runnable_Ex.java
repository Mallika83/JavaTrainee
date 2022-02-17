package Multi_Threading;
import java.util.*;
public class Runnable_Ex implements Runnable{
	public void run()
	{
		int i,n;
		System.out.println("Enter the n value ");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Thread is running");
		for(i=0;i<n;i++)
			System.out.println(i*i);
	}

	public static void main(String[] args) {
		Runnable_Ex r=new Runnable_Ex();//Runnable interface doesn't have start() method.
		Thread t=new Thread(r,"My new Thread");//so we need to create object for Thread class and pass the object of runnable interface to the thread
		System.out.println("Name of the thread is "+t.getName());
		t.start();

	}

}
