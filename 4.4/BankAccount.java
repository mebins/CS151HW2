
public class BankAccount implements Comparable<BankAccount> {

	double amount;
	String name;

	public BankAccount(String name, double amount)
	{
		this.amount = amount;
		this.name = name;
	}
	
	public int compareTo(BankAccount other) {
		if(this.amount == other.amount)
		{
			return this.name.compareTo(other.name);
		}
		else
		{
			return (int) Math.signum(this.amount - other.amount);
		}
	}
	
	public String toString()
	{
		
		return name + " - " + amount;
	}

}
