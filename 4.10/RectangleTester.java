import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collections;

public class RectangleTester {
	
	public static void main(String[] args)
	{
		ArrayList<Rectangle2D.Double> list = new ArrayList<>();
		list.add(new Rectangle2D.Double(0, 0, 0, 0));
		list.add(new Rectangle2D.Double(1, 0, 0, 0));
		list.add(new Rectangle2D.Double(1, 0, 2, 0));
		list.add(new Rectangle2D.Double(1, 0, 2, 4));
		list.add(new Rectangle2D.Double(0, 0, 0, 50));
		System.out.println(list);
		Collections.sort(list,new RectangleComparator());
		System.out.println(list);
	}

}
