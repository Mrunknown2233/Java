import java.awt.*;
import javax.swing.*;

class  JTabbedPaneDemo extends JFrame
{
	JTabbedPaneDemo()
	{
		JTabbedPane jtp = new JTabbedPane(JTabbedPane.TOP);

		jtp.addTab("Cities",new CitiesPanel());
		jtp.addTab("Colors",new ColorsPanel());
		jtp.addTab("Flavours",new FlavoursPanel());


		add(jtp);

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new JTabbedPaneDemo();	
	}
}

class CitiesPanel extends JPanel
{
	CitiesPanel()
	{
		add(new JButton("New York"));
		add(new JButton("London"));
		add(new JButton("Hong Kong"));
		add(new JButton("Tokyo"));
	}
}


class ColorsPanel extends JPanel
{
	ColorsPanel()
	{
		add(new JCheckBox("Red"));
		add(new JCheckBox("Green"));
		add(new JCheckBox("Blue"));
		add(new JCheckBox("Pink"));
	}
}


class FlavoursPanel extends JPanel
{
	FlavoursPanel()
	{
		JComboBox jcb = new JComboBox();
		jcb.addItem("Vanila");
		jcb.addItem("Chocolate");
		jcb.addItem("Strabberry");
		add(jcb);
	}
}
