import java.util.Scanner;
public class palindrom {
	
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String user_input=sc.nextLine();
	String trim_user_input=user_input.replaceAll("\\s","");
		//String trim_user_input=user_input.trim();
		
	
		String reverse_of_input= new StringBuffer(trim_user_input).reverse().toString();
		
		if(trim_user_input.equals(reverse_of_input))
		{
			System.out.println(user_input+" "+"is palindrome");
			
		}
		else
		{
			System.out.println(user_input+" "+"is not palindrome");
		}
		
		sc.close();
	}

}
