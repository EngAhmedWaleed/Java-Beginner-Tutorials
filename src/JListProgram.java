import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class JListProgram  extends JFrame {

	private JList<String> list;
	private static String[] colornames = {"black", "blue", "red", "white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
	JListProgram(){
			
			super("the title");
			setLayout(new FlowLayout());
			
			list = new JList<String>(colornames);
			list.setVisibleRowCount(4);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			add(new JScrollPane(list));
			
			list.addListSelectionListener(
					
					new ListSelectionListener() {
						
						public void valueChanged(ListSelectionEvent event) {
							getContentPane().setBackground(colors[list.getSelectedIndex()]);
						}
						
					}
					
			);
			
		}
		
		public static void act() {
			
			JListProgram go = new JListProgram();
			go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			go.setSize(300,200);
			go.setVisible(true);
			
		}
	
}	// Java (Beginner) Tutorials : 70, 71