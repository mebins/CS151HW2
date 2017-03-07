import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class AnimationTester {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
	
		final MoveableShape shape = new CarShape(0,0, CAR_WIDTH);
		
		ShapeIcon icon = new ShapeIcon(shape, ICON_WIDTH,ICON_HEIGHT);
		final JLabel label = new JLabel(icon);
		frame.setLayout(new FlowLayout());
		frame.add(label);	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		final int DELAY = 100;
		Timer t = new Timer(DELAY, new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				shape.translate(4, 0);
				if(shape.getX() > frame.getWidth())
				{
					shape.setX(-CAR_WIDTH);
				}
				label.repaint();
			}
		});
		t.start();
	}
	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
