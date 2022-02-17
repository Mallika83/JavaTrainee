package oops;

class bank_eg {

	String ifsc,address,bank_name;
	int zipcode;
	
	bank_eg()
	{
		System.out.println("Default Constructor");
	}
	bank_eg(String ifsc,String address,int zipcode,String bank_name)
	{
		this.ifsc=ifsc;
		this.address=address;
		this.zipcode=zipcode;
		this.bank_name=bank_name;
	}
	
	void display()
	{
		System.out.println("Bank name"+bank_name);
		System.out.println("Address"+address);
		System.out.println("IFSC code"+ifsc);
		System.out.println("Zip code"+zipcode);
	}
}
public class bank_example {

	public static void main(String[] args) {
		bank_eg b=new bank_eg();
		bank_eg b1=new bank_eg("8976","chennai",345,"hdfc");
		b1.display();
	}

}
