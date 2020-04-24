import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class AdapterClass extends JFrame {

	private String details;
	private JLabel statusBar;

	AdapterClass() {

		super("the title");

		statusBar = new JLabel("this is default");
		add(statusBar, BorderLayout.SOUTH);

		addMouseListener(new MouseClass());

	}

	private class MouseClass extends MouseAdapter {

		public void mouseClicked(MouseEvent event) {
			details = String.format("You click %d ", event.getClickCount());

			if (event.isMetaDown())
				details += "with right mouse button";
			else if (event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";

			statusBar.setText(details);
		}

	}

	public static void act() {

		AdapterClass go = new AdapterClass();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		go.setSize(300, 200);
		go.setVisible(true);

	}

} // Java (Beginner) Tutorials : 77