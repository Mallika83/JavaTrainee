package Multi_Threading;

public class sys_memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runtime r= Runtime.getRuntime();
System.out.println("Maximum memory avaliable in th system "+r.maxMemory());//Memory Available in the system
System.out.println("Total memory "+r.totalMemory());//Memory alloted for the program
System.out.println("Free Memory "+r.freeMemory() );//Memory that is unused by the program
System.out.println("Actual memory "+(r.maxMemory()-r.totalMemory()+r.freeMemory()));//this is the Actual memory
for(int i=0;i<1000;i++)
{
	new sys_memory();
	
}

System.out.println("After creating 1000 objects Free Memory "+r.freeMemory() );
System.gc();

System.out.println("After gc method Free Memory "+r.freeMemory() );
System.out.println("Actual memory "+(r.maxMemory()-r.totalMemory()+r.freeMemory()));
	}

}
