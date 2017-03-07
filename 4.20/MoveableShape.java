import java.awt.Graphics2D;

public interface MoveableShape {
	void draw(Graphics2D g2);
	void translate(int dx, int dy);
	int getX();
	void setX(int x);
}
