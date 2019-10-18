import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MultiSelectionJList extends JFrame {
	
	private JList<String> leftList;
	private JList<String> rightList;
	private JButton moveButton;
	private static String[] foods = {"bacon", "wings", "ham", "beef", "morebacon"};
	
	MultiSelectionJList(){
			
			super("the title");
			setLayout(new FlowLayout());
			
			leftList = new JList<String>(foods);
			leftList.setVisibleRowCount(3);
			leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			add(new JScrollPane(leftList));
			
			moveButton = new JButton("Move -->");
			moveButton.addActionListener(
					
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							/* 
							 deprecated: getselectedvalues
							 check https://stackoverflow.com/questions/7461940/java-deprecated-method-what-to-do
							 rightList.setListData((String[]) leftList.getSelectedValuesList().toArray());
							 well it didn't work ...
							 */
							
							/* 
							  my awesome HABDA
							  https://www.java-samples.com/showtutorial.php?tutorialid=219
							  https://www.techiedelight.com/convert-char-array-string-java/
							*/
							
							String[] selectedFoods = leftList.getSelectedValuesList().toString().split(", "); /* toString converts the list to: [0, 1, 2 ...] */
							
							// remove the first [
							char[] tar2e3 = new char[20];
							selectedFoods[0].getChars(1, selectedFoods[0].length(), tar2e3, 0);
							selectedFoods[0]=new String(tar2e3);
							
							// remove the last ]
							char[] tar2e3Agmad = new char[20];
							selectedFoods[selectedFoods.length-1].getChars(0, selectedFoods[selectedFoods.length-1].length()-1, tar2e3Agmad, 0);
							selectedFoods[selectedFoods.length-1]=new String(tar2e3Agmad);
							
							//JOptionPane.showMessageDialog(null, selectedFoods, "title", JOptionPane.PLAIN_MESSAGE); debugging purpose
							
							rightList.setListData(selectedFoods);
						}
					}
					
			);
			add(moveButton);
			
			rightList = new JList<String>();
			rightList.setVisibleRowCount(3);
			rightList.setFixedCellWidth(100);
			rightList.setFixedCellHeight(15);
			rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			add(new JScrollPane(rightList));
			
		}
		
		public static void act() {
			
			MultiSelectionJList go = new MultiSelectionJList();
			go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// looks better
			go.setSize(400,150);
			go.setVisible(true);
			
		}
	
}	// Java (Beginner) Tutorials : 72, 73