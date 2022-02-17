package looping_stmts;
import java.util.*;
public class array_2d_addition {

	public static void main(String[] args) {
		int i,j,r,c;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter no of rows for array1");
		r=s.nextInt();
		
		System.out.println("Enter no of columns for array1");
		c=s.nextInt();
		int table1[][]=new int[r][c];
		
		
		int table2[][]=new int[r][c];
		
		int result[][]=new int[r][c];
		
		for(i=0;i<r;i++)
		{
			System.out.println("Enter column values for table1");
			for(j=0;j<c;j++)
			{
				table1[i][j]=s.nextInt();
			}
		}
		

		for(i=0;i<r;i++)
		{
			System.out.println("Enter column values for table2");
			for(j=0;j<c;j++)
			{
				table2[i][j]=s.nextInt();
			}
		}
		
		for(i=0;i<r;i++)
		{
			
			for(j=0;j<c;j++)
			{
				result[i][j]=table1[i][j]+table2[i][j];
			}
		}
		System.out.println("New Result array is");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
