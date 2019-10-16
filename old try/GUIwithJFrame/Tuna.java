package GUIwithJFrame;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tuna extends JFrame {
	
	private static final long serialVersionUID = 1L;										// I don't know what is this.
	
		private JLabel item1;
		
		public Tuna() {
				
				super("The title bar");
				setLayout(new FlowLayout());
			
				item1 = new JLabel("This is a sentence.");
				item1.setToolTipText("This is gona show up on hover ... ");			// is not working properly.

				add(item1);

		}
	
}
