package bankingapp;

import java.util.Scanner;

public class bankingapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      bankaccount obj=new bankaccount("dinive","1234");
      obj.showmenu();
	}}
class bankaccount {
	
	int balance;
    int previoustransaction;
	String customername;
	String customerid;
	
	bankaccount(String cname,String cid)
	{
		customername = cname;
		customerid = cid;
	}
	
	
	 void deposit(int amount) {
		if(amount !=0) {
			balance=balance +amount;
			previoustransaction= amount;
		}
	}
	
	void withdraw(int amount) {
		
		if(amount !=0)
		{
			balance=balance -amount;
			previoustransaction =-amount;
		}
	}
	
	void getprevioustransaction()
	{
		if(previoustransaction >0)
		{
			System.out.println("Deposited: "+previoustransaction);
		}
		else if(previoustransaction<0)
		{
		 System.out.println("withdrawn"+Math.abs(previoustransaction));
		 }
		
		else{
			System.out.println("no transation occured");
		}}
	
		void showmenu()
		
		{
			char option='\0';
			Scanner scanner=new Scanner(System.in);
			System.out.println("Welcome"+customername);
			System.out.println("Your id"+customerid);
			System.out.println("\n");
			System.out.println("A.checkbalance");
			System.out.println("B.deposit");
			System.out.println("C.withdraw");
			System.out.println("D.getprevioustransaction");
			System.out.println("E.exit");
			
			do
			{
				
			System.out.println(".........................");
			System.out.println("enter an option");
			System.out.println("..........................");
			option=scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{			
			
			case 'A':
			System.out.println("...............");
			System.out.println("Balance="+balance);
			System.out.println("...............");
			System.out.println("\n");
			break;
			
			case 'B':
				System.out.println("...............");
				System.out.println("Enter an amt to deposit");
				System.out.println("...............");
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			
			case 'C':
				System.out.println("...............");
				System.out.println("Enter an amt to withdraw");
				System.out.println("...............");
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("...............");
				getprevioustransaction();
				System.out.println("...............");
				System.out.println("/n");
				break;
				
			case 'E':
				System.out.println("...............");
				break;	
						
				default:
					System.out.println("invalid option,Please enter again");
					break;
			}
			}
			while(option !='E');
			System.out.println("thanks for using us");
		}
			
					
			
			
			
			}
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
