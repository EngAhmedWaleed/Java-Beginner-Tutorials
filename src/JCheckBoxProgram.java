import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class JCheckBoxProgram extends JFrame {

	private JTextField tf;
	private JCheckBox boldBox;
	private JCheckBox italicBox;

	JCheckBoxProgram() {

		super("the title");
		setLayout(new FlowLayout());

		tf = new JTextField("This is a sentence", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);

		boldBox = new JCheckBox("bold");
		italicBox = new JCheckBox("italic");

		add(boldBox);
		add(italicBox);

		// typing these three lines out of the constructor is catastrophic
		HandlerClass handler = new HandlerClass();
		boldBox.addItemListener(handler);
		italicBox.addItemListener(handler);

	}

	private class HandlerClass implements ItemListener {

		public void itemStateChanged(ItemEvent event) {

			Font font = null;

			if (boldBox.isSelected() && italicBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			else if (boldBox.isSelected())
				font = new Font("Serif", Font.BOLD, 14);
			else if (italicBox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else
				font = new Font("Serif", Font.PLAIN, 14);

			tf.setFont(font);

		}

	}

	public static void act() {

		JCheckBoxProgram go = new JCheckBoxProgram();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// looks better with 280
		go.setSize(280, 200);
		go.setVisible(true);

	}

} // Java (Beginner) Tutorials : 64, 65