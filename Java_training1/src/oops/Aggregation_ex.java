package oops;

class Address
{
	String city,state,country;
	
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Emp
{
	String emp_name;
	int emp_id;
	Address address;//creating Has-A relationship
	Emp(String emp_name,int emp_id,Address address)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.address=address;
	}
	void display()
	{
		System.out.println("Employee name: \t"+emp_name);
		System.out.println("Employee ID: \t"+emp_id);
		System.out.println("Address:city \t"+address.city+ "\t" +"State "+address.state +"\t"+"Country "+address.country);
	}
	
}
public class Aggregation_ex {

	public static void main(String[] args) {
		Address a1=new Address("CBE","TN","India");
		Address a2=new Address("Chennai","TN","India");
		Address a3=new Address("Tiruchy","TN","India");
		Emp e1=new Emp("Varun",678,a1);
		Emp e2=new Emp("Arun",600,a2);
		Emp e3=new Emp("Tharun",610,a3);
		e1.display();
		e2.display();
		e3.display();
	}

}
