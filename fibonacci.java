
public class fibonacci {
	public static void main(String a[])
	{
		int x=0;
		int y=1;
		for(int i=1;i<=100;i++)
		{
			
			int z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
		
	}

}
