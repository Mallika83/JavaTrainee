package looping_stmts;

import java.util.Scanner;

public class two_dimensional_array_ex {
public static void main(String[] args)
{
	int r,c,i,j;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter no of rows");
	r=s.nextInt();
	
	System.out.println("Enter no of columns");
	c=s.nextInt();
	int table[][]=new int[r][c];
	
	for(i=0;i<r;i++)
	{
		System.out.println("Enter row values");
		for(j=0;j<c;j++)
		{
			table[i][j]=s.nextInt();
		}
	}
	
	System.out.println("array values");
	for(i=0;i<r;i++)
	{
		
		for(j=0;j<c;j++)
		{
			System.out.print(table[i][j] +"\t");
		}
		System.out.println();
	}
	
	System.out.println("array value "+table[2][2]);
	table[1][0]=89;
	System.out.println("New array values");
	for(i=0;i<r;i++)
	{
		
		for(j=0;j<c;j++)
		{
			System.out.print(table[i][j] +"\t");
		}
		System.out.println();
	}
	
	
}
}
