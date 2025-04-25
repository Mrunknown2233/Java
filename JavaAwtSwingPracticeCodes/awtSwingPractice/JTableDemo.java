import java.awt.*;
import javax.swing.*;


class JTableDemo extends JFrame
{
	JTableDemo()
	{
		final String[] colHeads = {"Subjects","Hours","Proffessor"};

		final Object[][] data = {{"C",45,"HT"},
								 {"UI/UZ",50,"Rohit"},
								 {"RDBMS",40,"HT"},
								 {"Testing",40,"Sahil"},
								 {"Java","Infinity","HT"}};

		JTable table = new JTable(data,colHeads);
		table.setGridColor(Color.red);
		table.setSelectionBackground(Color.blue);
		table.setForeground(Color.green);
		table.setBackground(Color.black);
		table.setForeground(Color.white);


		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

		JScrollPane jsp = new JScrollPane(table,v,h);

		add(jsp,BorderLayout.CENTER);

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new JTableDemo();	
	}
}