import java.awt.*;
import javax.swing.*;


class JComboBoxDemo extends JFrame
{
	JComboBox c1;
	Choice c;

	JComboBoxDemo()
	{
		setLayout(new FlowLayout());

		c1 = new JComboBox();
		c1.addItem("Hello");
		c1.addItem("World");
		c1.addItem("Bye");
		c1.addItem("Close");
		add(c1);

		c = new Choice();
		c.addItem("Hello");
		c.addItem("World");
		c.addItem("Bye");
		c.addItem("Close");
		add(c);

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) 
	{
		new JComboBoxDemo();	
	}
}