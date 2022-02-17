package looping_stmts;

public class switch_case_ex {

	public switch_case_ex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
int basic_salary,hra;
basic_salary=4500;
switch (basic_salary)
{
case 1500:
	hra=basic_salary*20/100;
	System.out.println("basic salary  " +basic_salary +  "   HRA  " +hra);
	break;
case 2500:
	hra=basic_salary*25/100;
	System.out.println("basic salary  " +basic_salary +  "   HRA  " +hra);
	break;
case 3500:
	hra=basic_salary*28/100;
	System.out.println("basic salary  " +basic_salary +  "   HRA  " +hra);
	break;
	default:
		hra=basic_salary*10/100;
		System.out.println("basic salary  " +basic_salary +  "   HRA  " +hra);
		
		
	
}
	}

}
