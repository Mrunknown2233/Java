import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class JButtonDemo extends JFrame implements ActionListener
{
	JTextField jtf;
	JButton jb;

	JButtonDemo()
	{
		setLayout(new FlowLayout());
		jtf = new JTextField(15);
		ImageIcon i1 = new ImageIcon("Images/gtaSan.jpg");
		jb = new JButton("I love Java",i1);
		jb.addActionListener(this);
		add(jb);

		ImageIcon i2 = new ImageIcon("Images/gtaVicecity.jpg");
		jb.setRolloverIcon(i2);
		add(jtf);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		jtf.setText(ae.getActionCommand());
		jb.setEnabled(false);
	}

	public static void main(String[] args) 
	{
		new JButtonDemo();	
	}
}