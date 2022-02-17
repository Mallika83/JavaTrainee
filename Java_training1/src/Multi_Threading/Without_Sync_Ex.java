package Multi_Threading;

class Table
{
	 synchronized void PrintTable(int n)
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+n*i);
		}
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.PrintTable(10);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.PrintTable(20);
	}
}
public class Without_Sync_Ex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Table obj=new Table();
MyThread1 t1=new MyThread1(obj);
MyThread1 t3=new MyThread1(obj);
MyThread2 t2=new MyThread2(obj);
t1.start();t3.start();
t2.start();
	}

}
