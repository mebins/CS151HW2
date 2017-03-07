import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class CarTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final MoveableShape shape = new CarShape(0, 0, CAR_WIDTH);
		final MoveableShape shape_2 = new CarShape(0,0,CAR_WIDTH);
		ArrayList<MoveableShape> moveables = new ArrayList<>();
		ShapeIcon icon = new ShapeIcon(shape,ICON_WIDTH,ICON_HEIGHT);
		ShapeIcon icon_2 = new ShapeIcon(shape_2,ICON_WIDTH,ICON_HEIGHT);
		moveables.add(shape);
		moveables.add(shape_2);
		ArrayList<JLabel> labels = new ArrayList<>();
		labels.add(new JLabel(icon));
		labels.add(new JLabel(icon_2));		
		for(JLabel e: labels)
		{
			frame.add(e);
		}
		frame.pack();
		Timer t = new Timer(100,new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						for(MoveableShape e : moveables)
						{
							e.translate(1, 0);
						}
						for(JLabel e: labels)
						{
							e.repaint();
						}
					}
				}
		);
		t.start();
	}

	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
