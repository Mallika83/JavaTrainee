package looping_stmts;

public class if_elseif_else_ex {

	public if_elseif_else_ex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int basic_salary,hra;
		basic_salary=2500;
		if(basic_salary>1000 && basic_salary<2000)
		{
			hra=basic_salary*20/100;
System.out.println("basic salary" +basic_salary +      "    HRA" +hra);
			
			
			
		}
		else if(basic_salary>2000 && basic_salary<3000)
		{
			hra=basic_salary*25/100;
			System.out.println("basic salary  " +basic_salary +  "   HRA  " +hra);
			
		}
		else if(basic_salary>=3000)
		{
			hra=basic_salary*28/100;
			System.out.println("basic salary  " +basic_salary +  "    HRA  " +hra);
		}
		else
		{
			hra=basic_salary*10/100;
			System.out.println("basic salary  " +basic_salary +  "    HRA  " +hra);
		}
	}

}
