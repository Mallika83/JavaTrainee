package oops;

class Employee123
{
	 private int emp_id;
	 private String name;
	 
	 public void setEmp_id(int emp_id)
	 {
		 this.emp_id=emp_id;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public int getEmp_id()
	 {
		 return this.emp_id;
	 }
	 public String getName()
	 {
		 return this.name;
	 }
}
public class Emp_bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee123 e=new Employee123();
e.setEmp_id(100);
e.setName("Mallika");
System.out.println("ID: "+e.getEmp_id());
System.out.println("Name "+e.getName());

	}

}
