import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JFrameIntro extends JFrame {

	private JLabel item1;

	JFrameIntro() {

		super("The title bar");
		setLayout(new FlowLayout());

		item1 = new JLabel("This is a sentence.");
		item1.setToolTipText("This is gona show up on hover ... "); // it delay a bit, but it is working fine

		add(item1);

	}

	public static void act() {

		JFrameIntro bucky = new JFrameIntro();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bucky.setSize(275, 180);
		bucky.setVisible(true);

	}

} // Java (Beginner) Tutorials : 51