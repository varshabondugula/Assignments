
import java.util.Scanner;

public class decimalToBinary 
{
public static void main(String a[]) 
  {

	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int user_input=sc.nextInt();	
	String binary_value=Integer.toBinaryString(user_input);
	System.out.println(binary_value);
	
	sc.close();
	
 }	
}
