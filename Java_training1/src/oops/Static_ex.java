package oops;
import java.util.*;

class Leap_year
{
	static int year=2025;
	Scanner s=new Scanner(System.in);
	
	static void year()
	{
		
		if(year%4==0)
			System.out.println("The given year is leap year");
		else
			System.out.println("The given year is not a leap year");
	}
	
}
public class Static_ex {

	public static void main(String[] args) {
		Leap_year.year();
		Leap_year.year=2020;
		Leap_year.year();

	}

}
