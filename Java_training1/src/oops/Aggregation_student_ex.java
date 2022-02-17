package oops;

class Address_student
{
	String school_name,dept,loc;
	Address_student(String school_name,String dept,String loc)
	{
		this.school_name=school_name;
		this.dept=dept;
		this.loc=loc;
		
	}
}
class Student_Agg
{
	String name;
	int reg_no;
	Address_student addr;
	
	Student_Agg(String name,int reg_no,Address_student addr)
	{
		this.name=name;
		this.reg_no=reg_no;
		this.addr=addr;
	}
	void display()
	{
		System.out.println("Name:\t"+name);
		System.out.println("Reg number \t"+reg_no);
		System.out.println("Adress \t"+"School name: "+addr.school_name+"Department : "+addr.dept+"Location: "+addr.loc);
	}
}
public class Aggregation_student_ex {

	public static void main(String[] args) {
		Address_student a1=new Address_student("AGPS","Singapore","Sengkang");
		Address_student a2=new Address_student("Fernvale school","Singapore","Fernvale");
		Address_student a3=new Address_student("Springdale","Singapore","Anchorvale");
		
		Student_Agg s1=new Student_Agg("Mallika",567,a1);
		Student_Agg s2=new Student_Agg("Mani",123,a2);
		Student_Agg s3=new Student_Agg("Babu",456,a3);
		
		s1.display();
		s2.display();
		s3.display();

	}

}
