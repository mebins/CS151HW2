import java.util.ArrayList;
import java.util.Comparator;

public class MaximumTester {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello World");
		list.add("Write a Test Program Called Maximum Tester");
		list.add("I am a Spartan");
		String s = Maximum.maximum(list, new Comparator<String>(){public int compare(String x, String y){return -x.compareTo(y);}});

		System.out.println(s);
	}
}
