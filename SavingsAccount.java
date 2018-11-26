
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
	
	public String toString()
	{
		
		
		
	}
	
	private double minBalance = 2000;
	
	private double rate = 4;
	
}
