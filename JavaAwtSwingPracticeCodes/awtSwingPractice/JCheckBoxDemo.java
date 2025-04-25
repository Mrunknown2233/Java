import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JCheckBoxDemo extends JFrame implements ItemListener
{
	JTextField jtf;
	JCheckBoxDemo()
	{
		setLayout(new FlowLayout());
		ImageIcon normal = new ImageIcon("Images/minecraft1.jpg");
		ImageIcon rollover = new ImageIcon("Images/minecraft2.jpg");
		ImageIcon selected = new ImageIcon("Images/minecraft3.jpg");


		JCheckBox cb = new JCheckBox("C",normal);
		cb.addItemListener(this);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		add(cb);


		cb = new JCheckBox("C++",normal);
		cb.addItemListener(this);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		add(cb);


		cb = new JCheckBox("Java",normal);
		cb.addItemListener(this);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		add(cb);

		jtf = new JTextField(15);
		add(jtf);

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox cb = (JCheckBox) ie.getSource();


		if(cb.isSelected())
			jtf.setText(jtf.getText() + " " + cb.getText());
	}

	public static void main(String[] args) 
	{
		new JCheckBoxDemo();	
	}
}