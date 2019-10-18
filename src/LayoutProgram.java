import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class LayoutProgram extends JFrame {
	
	private JButton leftButton;
	private JButton centerButton;
	private JButton rightButton;
	
	private FlowLayout layout;
	private Container container;
	
	LayoutProgram(){
		
		super("the title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		leftButton = new JButton("left");
		add(leftButton);
		leftButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
		);
		
		centerButton = new JButton("center");
		add(centerButton);
		centerButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
		);
		
		rightButton = new JButton("right");
		add(rightButton);
		rightButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
		);
		
	}

	public static void act() {
		
		LayoutProgram go = new LayoutProgram();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		go.setSize(300,200);
		go.setVisible(true);
		
	}
	
}	// Java (Beginner) Tutorials : 83