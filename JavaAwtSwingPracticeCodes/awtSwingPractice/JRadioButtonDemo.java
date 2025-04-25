import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioButtonDemo extends JFrame implements ActionListener
{
	JTextField jtf;

	JRadioButtonDemo()
	{
		setLayout(new FlowLayout());

		JRadioButton b1 = new JRadioButton("A");
		b1.addActionListener(this);
		add(b1);

		JRadioButton b2 = new JRadioButton("B");
		b2.addActionListener(this);
		add(b2);

		JRadioButton b3 = new JRadioButton("C");
		b3.addActionListener(this);
		add(b3);

		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);

		jtf = new JTextField(5); 
		add(jtf);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		jtf.setText(ae.getActionCommand()); 
	}

	public static void main(String[] args) 
	{
		new JRadioButtonDemo(); 
	}
}
