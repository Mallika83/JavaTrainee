package oops;
class Student_123
{
	private String name;
	private int id;
	private String dept;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDept(String depy)
	{
		this.dept=dept;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return this.name;
	}
	public String getDept()
	{
		return this.dept;
	}
	public int getId()
	{
		return this.id;
	}
	
}
public class Student_Pojo {

	public static void main(String[] args) {
		Student_123 s=new Student_123();
		s.setName("Mallika");
		s.setDept("IT");
		s.setId(900);
		
		System.out.println("Name "+s.getName());
		System.out.println("Department "+s.getDept());
		System.out.println("ID "+s.getId());
		
				

	}

}
