import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxProgram extends JFrame {

	/*
	 JComboBox is a raw type. References to generic type JComboBox<E> should be parameterized
	 JComboBox<String> box; will get the job done
	 As of Java 7, generics were introduced into JComboBox component
	*/
	
	private JComboBox<String> box;
	private JLabel picture;
		
	private static String[] filename = {"b.png", "x.png"};
	
	// note that getClass is non static method, thats why we didn't declare a private static Icon
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
	
	
	JComboBoxProgram(){
		
		super("the title");
		setLayout(new FlowLayout());
		
		box = new JComboBox<String>(filename);
		
		box.addItemListener(
				// anonymous class that implements ItemListener.
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange()==ItemEvent.SELECTED)
							picture.setIcon(pics[box.getSelectedIndex()]);
					}
				}	
		);
		
		add(box);
		picture = new JLabel(pics[0]);
		add(picture);

	}
	
	public static void act() {
		
		JComboBoxProgram go = new JComboBoxProgram();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		go.setSize(300,200);
		go.setVisible(true);
		
	}
	
}	// Java (Beginner) Tutorials : 68, 69
