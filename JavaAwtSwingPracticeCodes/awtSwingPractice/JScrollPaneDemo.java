import java.awt.*;
import javax.swing.*;


class JScrollPaneDemo extends JFrame
{
	JScrollPaneDemo()
	{
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(10,8));

		int b = 0;
		for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<8; j++)
			{
				jp.add(new JButton("Button" + b));
				++b;
			}

		}

		int v = JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;

		JScrollPane jsp = new JScrollPane(jp,v,h);

		add(jsp);

		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) 
	{
		new JScrollPaneDemo();	
	}
}


