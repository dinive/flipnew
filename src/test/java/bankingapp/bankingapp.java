package bankingapp;

public class bankingapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}}
class bankaccount {
	
	int balance;
    int previoustransaction;
	String customername;
	String customerid;
	
	
	
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
		}
	
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}