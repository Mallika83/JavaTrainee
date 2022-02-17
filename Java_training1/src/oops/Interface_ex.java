package oops;
interface BAnk_interface
{
	long Acc_no=87543L;//public static final
	int rate_calculate();//public abstract
	
}
class bank_implement implements BAnk_interface
{
	public  int rate_calculate()
	{
		return 12;
	}
}

public class Interface_ex {

	public static void main(String[] args) {
		bank_implement b=new bank_implement();
		System.out.println("The interest rate is "+b.rate_calculate());
		
		//BAnk_interface.Acc_no=8420L; gives you an error cannot do this 
		
		System.out.println("The Account number is "+BAnk_interface.Acc_no);// Acc_no is static by default so it is accessed in static way
		
Interface_ex interface_ex = new Interface_ex();
		//Interfacename.variablename is accessed this way,cannot edit Acc_no variable because it is final
		interface_ex.call();
		
		
	}
	void call()
	{
		System.out.println("Calling");
		
			
		}
	

}
