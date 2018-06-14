package varsha;
import java.util.Scanner;
import java.lang.*;
public class autoLoanServices 
{
	private int creditScore; 
	protected int seedAmount,salary,loanAmount,installmentMonths;
	protected double intrestRate;
	
	String userName;
	boolean issueLoan;
	public static void main(String s[])
	{
	
		 autoLoanServices als=new autoLoanServices();
		 als.issueAutoLoan();
		
		 autoLoanServices als1=  new economy();
		 ((economy) als1).loanDetails();
		
		/* economy eco= (economy) new autoLoanServices();
		 eco.loanDetails();
		 
		 
		 premium pre= (premium) new autoLoanServices();
		 pre.loanDetails();*/
	
		 
	}
	
	
	private void creditHistoryCheck()
	{  
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
	     userName =sc.nextLine();
	     
	    System.out.println("enter creditScore");
		Scanner sc1=new Scanner(System.in);
		creditScore =sc1.nextInt();
		
		if(creditScore>=400)
		{
			System.out.println("you entered your credit score as "+ creditScore );
			 issueLoan= true;
			
		}
		else
		{
			System.out.println("as your credit score is "+ creditScore + "we cannot finance you, Sorry");
			 issueLoan= false;
		}
	}
	
	
	public void issueAutoLoan()
	{
		
		creditHistoryCheck();
		    System.out.println("enter Down Payment");
	     	Scanner sc2=new Scanner(System.in);
			seedAmount =sc2.nextInt();
			
			System.out.println("enter salary Payment");
	     	Scanner sc3=new Scanner(System.in);
			salary =sc3.nextInt();
			
	while(issueLoan)
	{
		
		if(seedAmount>=1500 && salary>=3000)
		{
			loanAmount=20000;
			System.out.println("loan amount=20000");
			break;
		}
		else if(seedAmount>1000 && salary<=3000)
		{
			loanAmount=15000;
			System.out.println("loan amount=15000");	
			break;
		}
		else if(seedAmount>500 && salary>=2500)
		{
			loanAmount=12000;
			System.out.println("loan amount=15000");	
			break;
		}
		else
		{
			loanAmount=10000;
			System.out.println("loan amount=10000");	
			break;
		}
		
	}
		
	}
	
	
	

}
