package Multi_Threading;

public class Thread_Demo extends Thread {

	public void run()//Method inside Thread class is overidden
	{
		int i;
		System.out.println("Thread is running");
		for(i=0;i<20;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread_Demo t=new Thread_Demo();
		t.start();//invokes the run method on Thread Object
	}

}
