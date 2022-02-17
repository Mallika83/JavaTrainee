package Multi_Threading;
import java.util.*;
class task1 extends Thread
{
	public void run()
	{
		int i,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the n value for Thread1 ");
		n=s.nextInt();
		for(i=0;i<n;i++)
			System.out.println("Thread 1 "+i*i*i);
	}
}
class task2 extends Thread
{
	public void run()
	{
		int i,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the n value for Thread2 ");
		n=s.nextInt();
		for(i=0;i<n;i++)
			if(i%2==0)
			{
			System.out.println("Thread 2 "+i);
			}
	}
}
class task3 extends Thread
{
	public void run()
	{
		int i,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the n value for Thread3 ");
		n=s.nextInt();
		for(i=0;i<n;i++)
			if(i%2!=0)
			{
			System.out.println("Thread 3 "+i);
			}
	}
}
public class Multi_Thread_Ex {

	public static void main(String[] args)  {
		task1 t1=new task1();
		task2 t2=new task2();
		task3 t3=new task3();
		System.out.println("The sate of thread1 before calling start method "+t1.getState());
		t1.start(); 
		System.out.println("The sate of thread1 After calling start method "+t1.getState());
		System.out.println("The sate of thread2 before calling start method "+t2.getState());
		t2.start(); 
	
		t3.start();
		

	}

}
