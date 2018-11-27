
public class SavingsAccount extends BankAccount
{
	
	public SavingsAccount(double min,double aRate)
	{
		
		minBalance = min;
		
		rate = aRate;
		
	}
	
	public void addIntrest()
	{
		
		balance = balance + (minBalance * rate);
		minBalance = balance;
		
	}
	
	public void withdraw(double aAmount)
	{
		
		balance = balance - aAmount;
		
	}
	
	public String toString()
	{
		
		return 
		
	}
	
	private double minBalance;
	
	private double rate;
	
}
