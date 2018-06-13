import java.util.Scanner;
public class stringFunctions {
	

		public static void main(String[] s) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value: ");
			String value=sc.nextLine();
			System.out.println("enter the index value: ");
			int i = sc.nextInt();
		    String S = new String(value);
			System.out.println("character at i: "+S.charAt(i));
			System.out.println("concatination: "+S.concat("varsha"));
			System.out.println("UpperCase is : "+S.toUpperCase());
			System.out.println("trim value is: "+S.trim());
			System.out.println("codepoint : " +S.codePointAt(i));
			System.out.println("legth of the value is: "+S.length());
			System.out.println("prefix: "+S.startsWith("v"));
			
			sc.close();
			
		}
	}

