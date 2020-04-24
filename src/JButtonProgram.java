import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class JButtonProgram extends JFrame {

	private JButton reg;
	private JButton custom;

	JButtonProgram() {

		super("The title");
		setLayout(new FlowLayout());

		reg = new JButton("reg Button");
		add(reg);

		// 40 x 40 pngs -> put them in bin folder not src (it won't work at least for
		// me)
		System.out.println(getClass().getResource("b.png"));
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon x = new ImageIcon(getClass().getResource("x.png"));

		custom = new JButton("Custom", b);
		custom.setRolloverIcon(x);
		add(custom);

		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);

	}

	private class HandlerClass implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}

	}

	public static void act() {

		JButtonProgram go = new JButtonProgram();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		go.setSize(300, 200);
		go.setVisible(true);

	}

} // Java (Beginner) Tutorials : 62, 63