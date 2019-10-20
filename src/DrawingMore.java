import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class DrawingMore extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.blue);
		g.drawLine(10, 25, 200, 45);
		
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 100, 30);
		
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160, 100, 50, true);
		
	}
	
	public static void act() {
		
		JFrame f = new JFrame("the title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawingMore d = new DrawingMore();
		d.setBackground(Color.WHITE);
		f.add(d);
		
		f.setSize(500,270);
		f.setVisible(true);
		
	}
	
}	// Java (Beginner) Tutorials : 86