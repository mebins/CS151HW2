import java.util.ArrayList;
import java.util.Collections;

public class CountryTester {
	
	public static void main(String[] args)
	{
		ArrayList<Country> list = new ArrayList<>();
		
		list.add(new Country("Canada",9984670));
		list.add(new Country("China",9572900));
		list.add(new Country("Sudan", 1861484));
		list.add(new Country("South Africa", 1219912));
		list.add(new Country("United Kingdom", 243610));
		list.add(new Country("United States of America", 9525067));

		System.out.println("Original List"+list );
		Collections.sort(list,Country.createComparatorByName(true));
		System.out.print("By Name Increasing" + list);
		System.out.println("");
		
		Collections.sort(list,Country.createComparatorByName(false));
		System.out.print("By Name Decreaseing" + list);
		System.out.println("");

		Collections.sort(list,Country.createComparatorByArea(true));
		System.out.print("By Area Increasing" + list);
		System.out.println("");
	
		Collections.sort(list,Country.createComparatorByArea(false));
		System.out.print("By Area Decreasing" + list);
		System.out.println("");
	}

}
