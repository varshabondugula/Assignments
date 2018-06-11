import java.util.Scanner;

public class mathFunctions {

	public static void main(String r[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first numbers");
		double a=sc.nextDouble();
		int ia=(int)a;
		
		
		System.out.println("enter second numbers");
		double b=sc.nextDouble();
		int ib=(int)b;
		
		System.out.println("enter a negitive numbers");
		double c=sc.nextDouble();
		
    System.out.println("power of first& second number  "+Math.pow(a,b));
    System.out.println("sum of first& second number  "+Math.addExact(ia,ib));
    System.out.println("diffrence between first& second number  "+Math.subtractExact(ia,ib));
    System.out.println("multiply value  "+Math.multiplyExact(ia,ib));
    System.out.println("maximum of first& second number  "+Math.max(a,b));
    System.out.println("minimum of first& second number  "+Math.min(a,b));
    System.out.println("absolute value of first number  "+Math.abs(c));
    System.out.println("incemnet of first number  "+Math.incrementExact(ia));
    System.out.println("decrement of firstnumber  "+Math.decrementExact(ia));
    System.out.println("sqareroot of first number  "+Math.sqrt(a));

sc.close();
		
	}
	
	
}
