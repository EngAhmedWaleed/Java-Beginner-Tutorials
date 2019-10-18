import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class EventHandling extends JFrame {
	
		private JTextField item1 ;
		private JTextField item2 ;
		private JTextField item3 ;
		
		private JPasswordField password ;
		
		public EventHandling() {
			
			super("The title");
			setLayout(new FlowLayout());
			
			item1 = new JTextField(10);
			add(item1);
			
			item2 = new JTextField("enter text here");
			add(item2);
			
			item3 = new JTextField("uneditable", 20);
			item3.setEditable(false);
			add(item3);
			
			password = new JPasswordField("mypass");
			add(password);
			
			Thehandler handler = new Thehandler() ;
			
			item1.addActionListener(handler);
			item2.addActionListener(handler);
			item3.addActionListener(handler);
			password.addActionListener(handler);
			
		}
	
		private class Thehandler implements ActionListener {
			
				public void actionPerformed(ActionEvent event) {
					
							String s = "";
							
							// switch statements don't not work for objects
							
								   if (event.getSource() == item1) {
										 			s = String.format("field 1: %s", event.getActionCommand());
							} else if (event.getSource() == item2) {
													s = String.format("field 2: %s", event.getActionCommand());
							} else if (event.getSource() == item3) {
													s = String.format("field 3: %s", event.getActionCommand());
							} else if (event.getSource() == password) {
													s = String.format("password : %s", event.getActionCommand());
							}
									 
							JOptionPane.showMessageDialog(null, s);
	
				}
			
		}
		
		public static void act() {
			
			EventHandling bucky = new EventHandling();
			bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			bucky.setSize(350,100);
			bucky.setVisible(true);
			
		}
	
}	// Java (Beginner) Tutorials : 52, 53, 54