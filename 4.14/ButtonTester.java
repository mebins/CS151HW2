import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonTester {
	private class CircleIcon implements Icon
	{
		int radius;
		Color color;
		public CircleIcon(int radius, Color color)
		{
			this.radius = radius;
			this.color = color;
		}

		@Override
		public int getIconHeight() {
			return radius*2;
		}

		@Override
		public int getIconWidth() {
			return radius*2;
		}

		@Override
		public void paintIcon(Component c, Graphics g, int x, int y) {
			Graphics2D g2 = (Graphics2D) g;
			Ellipse2D.Double body = new Ellipse2D.Double(x, y, x+radius*2,y+radius*2);
			g2.setColor(color);
			g2.fill(body);
		}
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton greenButton = new JButton("Green");
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");
		JLabel colorLabel = new JLabel();
		ButtonTester tester = new ButtonTester();
		colorLabel.setIcon(tester.new CircleIcon(6,Color.red));
		greenButton.addActionListener(e -> colorLabel.setIcon(tester.new CircleIcon(6,Color.GREEN)));
		redButton.addActionListener(e -> colorLabel.setIcon(tester.new CircleIcon(6,Color.RED)));
		blueButton.addActionListener(e -> colorLabel.setIcon(tester.new CircleIcon(6,Color.BLUE)));
		frame.add(greenButton);
		frame.add(redButton);
		frame.add(blueButton);
		frame.add(colorLabel);
		frame.pack();
	}	
}
