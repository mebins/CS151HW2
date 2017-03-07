import java.util.ArrayList;
import java.util.Arrays;

public class FilterTester implements Filter {
	
	public FilterTester()
	{	
	}

	public boolean accept(String x) {
		if(x.length() <= 3)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList("since","the","method","static","you","can't","call","hi","two","one","so"));
		String empty[] = {};
		System.out.print(list + ": ");
		String output[] = Filter.filter(list.toArray(new String[0]), new FilterTester());
		for(int i = 0; i < output.length;i++)
		{
			System.out.print(output[i]);
			if(i != output.length-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("Empty Array: ");
		output = Filter.filter(empty, new FilterTester());
		for(int i = 0; i < output.length;i++)
		{
			System.out.print(output[i]);
			if(i != output.length-1)
			{
				System.out.print(", ");
			}
		}
		
	}	
	

}
