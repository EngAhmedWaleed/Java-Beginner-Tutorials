import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class JRadioButtonProgram extends JFrame {

	private JTextField tf;
	private Font plainF;
	private Font boldF;
	private Font ItalicF;
	private Font boldItalicF;

	private JRadioButton plainRB;
	private JRadioButton boldRB;
	private JRadioButton ItalicRB;
	private JRadioButton boldItalicRB;
	private ButtonGroup group;

	JRadioButtonProgram() {

		super("the title");
		setLayout(new FlowLayout());

		tf = new JTextField("I'm awesome and hot", 25);
		add(tf);

		plainRB = new JRadioButton("plain", true);
		boldRB = new JRadioButton("bold", false);
		ItalicRB = new JRadioButton("italic", false);
		boldItalicRB = new JRadioButton("bold and italic", false);

		add(plainRB);
		add(boldRB);
		add(ItalicRB);
		add(boldItalicRB);

		group = new ButtonGroup();
		group.add(plainRB);
		group.add(boldRB);
		group.add(ItalicRB);
		group.add(boldItalicRB);

		plainF = new Font("Serif", Font.PLAIN, 14);
		boldF = new Font("Serif", Font.BOLD, 14);
		ItalicF = new Font("Serif", Font.ITALIC, 14);
		boldItalicF = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(plainF);

		// wait for event to happen, pass in font object to constructor
		plainRB.addItemListener(new HandlerClass(plainF));
		boldRB.addItemListener(new HandlerClass(boldF));
		ItalicRB.addItemListener(new HandlerClass(ItalicF));
		boldItalicRB.addItemListener(new HandlerClass(boldItalicF));

	}

	private class HandlerClass implements ItemListener {

		private Font font;

		// the font object get variable font
		public HandlerClass(Font f) {
			this.font = f;
		}

		// sets the font to the font object that was passed in
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
		}

	}

	public static void act() {

		JRadioButtonProgram go = new JRadioButtonProgram();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		go.setSize(300, 200);
		go.setVisible(true);

	}

} // Java (Beginner) Tutorials : 66, 67