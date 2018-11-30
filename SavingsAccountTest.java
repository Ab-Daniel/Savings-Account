
public class SavingsAccountTest 
{
	
	public static void main(String[] args) 
	{
		
		SavingsAccount account = new SavingsAccount(2000, 4.0);
		
		System.out.println("Initial Account:");
		System.out.println(account.toString());
		
		account.withdrawButBetter(500);
		System.out.println("Withdraw: $500");
		System.out.println(account.toString());
		
		account.deposit(4000);
		System.out.println("Deposit: $4000");
		System.out.println(account.toString());
		
		account.addIntrest();
		System.out.println("Add Interest:");
		System.out.println(account.toString());
		
		account.withdrawButBetter(3000);
		System.out.println("Withdraw: $3000");
		System.out.println(account.toString());
		
	}
	
}
