import java.util.Scanner;

public class diffrenceInArray 
{
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Array Size");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("enter numbers");
		for(int i=0;i<array.length;i++)
		{
		array[i]=sc.nextInt();
		
		}
		int low=array[0];
		int high=array[0];
		
		for(int i=1; i<array.length;i++)
		{
			if(array[i]<low)
			  low=array[i];
		}
		for(int i=1; i<array.length;i++)
		{
			if(array[i]>high)
			  high=array[i];
		}
		int result=high-low;
		System.out.println(+result);
	}
	
}









