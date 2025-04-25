import java.awt.*;
import javax.swing.*;


class JTextFieldDemo extends JFrame
{
	JTextField jtf;
	TextField  t;

	JTextFieldDemo()
	{
		setLayout(new FlowLayout());

		jtf = new JTextField("This is Swing TextField",15);
		t = new TextField("This is AWT TextField",15);

		add(jtf);
		add(t);

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new JTextFieldDemo();	
	}
}