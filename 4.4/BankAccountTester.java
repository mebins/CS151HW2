import java.util.ArrayList;
import java.util.Collections;

public class BankAccountTester {

	public static void main(String[] args)
	{
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(new BankAccount("Mebin Skaria", 20000));
		list.add(new BankAccount("Michael Jaradah", 4000));
		list.add(new BankAccount("Maximillian Raasch", 5249));
		list.add(new BankAccount("Weston Pedigo", 20000));
		list.add(new BankAccount("Julian Nakanishi", 0));
		list.add(new BankAccount("Andy Ho", 0.5));
		list.add(new BankAccount("Luke Bryan", -0.5));
		list.add(new BankAccount("Sam Hunt", -20000));
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
