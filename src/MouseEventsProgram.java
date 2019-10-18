import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MouseEventsProgram extends JFrame {
	
	private JPanel mousePanel;
	private JLabel statusBar;
	
	MouseEventsProgram(){
		
		super("title");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);

	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{

		// MouseListener methods:
		public void mouseClicked(MouseEvent event) {
			statusBar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
		}
		
		public void mousePressed(MouseEvent event) {
			statusBar.setText("You pressed down the mouse");
		}
		
		public void mouseReleased(MouseEvent event) {
			statusBar.setText("You released the button");
		}
		
		public void mouseEntered(MouseEvent event) {
			statusBar.setText("You entered the area");
			mousePanel.setBackground(Color.RED);
		}
		
		public void mouseExited(MouseEvent event) {
			statusBar.setText("You have left the area");
			mousePanel.setBackground(Color.WHITE);
		}
		
		// MouseMotionListener methods:
		public void mouseDragged(MouseEvent event) {
			statusBar.setText("You are dragging the mouse");
		}

		public void mouseMoved(MouseEvent event) {
			statusBar.setText("You are moving the mouse");
		}
		
	}

	public static void act() {
		
		MouseEventsProgram go = new MouseEventsProgram();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		go.setSize(300,200);
		go.setVisible(true);
		
	}

}	// Java (Beginner) Tutorials : 74, 75, 76