import java.util.ArrayList;

public interface Filter {
	boolean accept(String x);
	public static String[] filter(String[] a, Filter f){
		ArrayList<String> list = new ArrayList<>();
		for(String e : a)
		{
			if(f.accept(e))
			{
				list.add(e);
			}
		}
		
		return list.toArray(new String[0]);
	}
}
