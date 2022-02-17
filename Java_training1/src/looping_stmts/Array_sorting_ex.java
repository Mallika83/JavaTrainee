package looping_stmts;
import java.util.*;
public class Array_sorting_ex {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int length,i,j,temp;
		String temp_string;
				System.out.println("enter the number of elements in array");
				length=s.nextInt();
				
				int array[]=new int[length];
				
				String array_string[]=new String[length];
				String array_sorted[]=new String[length];
				System.out.println("enter the elements i the array");
				
				for(i=0;i<length;i++)
				{
					array[i]=s.nextInt();
					
					
				}
				
				for(i=0;i<length;i++)
				{
					for(j=i+1;j<length;j++)
					{
						if(array[i]>array[j])
						{
							temp=array[j];
							array[j]=array[i];
							array[i]=temp;
							
						}
	
					}
				}
				System.out.println("The sorted Array is");
				for(int element:array)
				{
					System.out.println(element);
				}
				System.out.println("enter the elements i the array");
				for(i=0;i<length;i++)
				{
     
					array_string[i]=s.next();
					
				}
				for(i=0;i<length-1;i++)
				{
					for(j=i+1;j<length;j++)
					{
						int compare= array_string[i].compareTo(array_string[j]);
						if(compare>0)
						{
							temp_string=array_string[j];
							array_string[j]=array_string[i];
							array_string[i]=temp_string;
							
						}
	
					}
				}
				System.out.println("the sorted array is");
				
				//Arrays.sort(array_string);
				
				for(String element:array_string)
				{
					System.out.println(element);
				}
				
	}

}
