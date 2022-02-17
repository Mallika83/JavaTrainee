package Multi_Threading;

public class Sleep_Ex extends Thread{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Name :" +Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority() +" i value :" + i);
			//	System.out.println();
				//System.out.println("Priority of the current thread is "+Thread.currentThread().getPriority());
				if(Thread.currentThread().isDaemon())
				{
					System.out.println("Daemon Thread");
					
				}
				else
				{
					System.out.println("User Thread");
				}
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		
		Sleep_Ex s=new Sleep_Ex();
		Sleep_Ex s1=new Sleep_Ex();
		Sleep_Ex s2=new Sleep_Ex();
		
		s.setPriority(1);
		s1.setPriority(5);
		s2.setPriority(8);
		
		//s.setDaemon(false);
	//	s1.setDaemon(false);
	//	s2.setDaemon(true);
		
		
		s.setName("First Thread");
		s1.setName("Second Thread");
		s2.setName("Third Thread");
		
		/*System.out.println("The name of the thread is "+s.getName());
		System.out.println("The name of the thread is "+s1.getName());
		System.out.println("The name of the thread is "+s2.getName());
		
		System.out.println("The Priority of the thread1 is "+s.getPriority());
		System.out.println("The Priority of the thread2 is "+s1.getPriority());
		System.out.println("The Priority of the thread3 is "+s2.getPriority());*/
		
		s2.start();
		
		s.start();s1.start();
/*try
{
	s.join();//will wait for thread1 to complete and then only thread2 starts
}catch(Exception e)
{
	System.out.println(e);
}
		
		try
		{
			s1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		
		
	}
	
	

}
