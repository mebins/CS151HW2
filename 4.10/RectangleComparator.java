import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle2D.Double> {

	@Override
	public int compare(Double z, Double x) {
		if(z.x == x.x)
		{
			if(z.y == x.y)
			{
				if(z.width == x.width)
				{
					if(z.height == x.height)
					{
						return 0;
					}
						return (int) Math.signum(z.height - x.height);
				}
					return (int) Math.signum(z.width - x.width);
			}
			return (int) Math.signum(z.y-x.y);
		}
		// TODO Auto-generated method stub
		return (int) Math.signum(z.x- x.x);
	}

}
