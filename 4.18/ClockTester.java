import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class ClockTester {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockTester tester = new ClockTester();
		JLabel clock = new JLabel(tester.new ClockIcon(50));
		Timer t = new Timer(1000, new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						clock.repaint();
					}
				}
		);
		t.start();
		frame.add(clock);
		frame.pack();
	
	}
	
	public class ClockIcon implements Icon
	{
		int radius;
		GregorianCalendar time = new GregorianCalendar();
		public ClockIcon(int radius)
		{
			this.radius = radius;
			this.time = time;
		}

		@Override
		public int getIconHeight() {
			// TODO Auto-generated method stub
			return radius*2;
		}

		@Override
		public int getIconWidth() {
			// TODO Auto-generated method stub
			return radius*2;
		}
		public void updateTime()
		{
			time = new GregorianCalendar();
		}
		@Override
		public void paintIcon(Component c, Graphics g, int x, int y) {
			updateTime();
			Graphics2D g2 = (Graphics2D) g;
			double rotateMinute = (2*Math.PI*time.get(GregorianCalendar.MINUTE)/60) - Math.PI/2;
			double rotateHour = (2*Math.PI*time.get(GregorianCalendar.HOUR)/12) - Math.PI/2;
			double rotateSecond = (2*Math.PI*time.get(GregorianCalendar.SECOND)/60) - Math.PI/2;
			System.out.println( time.get(GregorianCalendar.HOUR) + ":" + time.get(GregorianCalendar.MINUTE) + ":" + time.get(GregorianCalendar.SECOND));
			g2.drawOval(x, y, radius*2, radius*2);
			g2.drawLine(x+radius, y+radius, (int)((y+radius)+Math.cos(rotateMinute)*radius), (int)((y+radius)+Math.sin(rotateMinute)*radius));
			g2.drawLine(x+radius, y+radius, (int)((y+radius)+Math.cos(rotateHour)*radius/2), (int)((y+radius)+Math.sin(rotateHour)*radius/2));
			g2.drawLine(x+radius, y+radius, (int)((y+radius)+Math.cos(rotateSecond)*radius/4), (int)((y+radius)+Math.sin(rotateSecond)*radius/4));
		}
		
	}
}
