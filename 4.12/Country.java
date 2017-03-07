import java.util.Comparator;

public class Country {
	double area;
	String name;
	
	public Country(String name, double area)
	{
		this.name = name;
		this.area = area;
	}
	
	public static Comparator<Country> createComparatorByName(final boolean increasing)
	{
		return new Comparator<Country>(){ public int compare(Country x, Country y) {
			if(increasing)
			{
				return x.name.compareTo(y.name);
			}
			else
			{
				return y.name.compareTo(x.name);
			}
		}};
	}
	
	public static Comparator<Country> createComparatorByArea(final boolean increasing)
	{
		return new Comparator<Country>(){ public int compare(Country x, Country y)
			{
				if(increasing)
				{
					return (int) (x.area - y.area);
				}
				else
				{
					return (int) (y.area - x.area);
				}
			}
		};
	}
	
	public String toString()
	{
		return name + " - " + area;
	}

}
