
public class prime {

	 public static void main (String[] args)
	   {		
	       int i =0;
	       int j =0;
	       String  primeNumbers = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int num=0; 	  
	          for(j =i; j>=1; j--)
		  {
	             if(i%j==0)
		     {
	 		num = num + 1;
		     }
		  }
		  if (num ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
}
