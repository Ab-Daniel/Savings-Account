
public class SavingsAccount extends BankAccount
{
	
	public SavingsAccount(double min,double aRate)
	{
		
		minBalance = min;
		
		rate = aRate;
		
		balance = minBalance;
		
	}
	
	public void addIntrest()
	{
		
		balance = balance + (minBalance * (rate/100));
		minBalance = balance;
	}
	
	public void withdrawButBetter(double aAmount)
	{
		
		minBalance = balance - aAmount;
		balance = balance - aAmount;
		
	}
	
	public String toString()
	{
		
		return "Balance: " + String.format("$%1.2f", balance) + "  Rate: " + String.format("%1.2f", rate) + "  Minimum Balance: " + String.format("$%1.2f", minBalance);
		
	}
	
	private double minBalance;
	
	private double rate;
	
}
