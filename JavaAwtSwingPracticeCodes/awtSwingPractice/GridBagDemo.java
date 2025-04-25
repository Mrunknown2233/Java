import java.awt.*;
import java.awt.event.*;


class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

class GridBagDemo extends Frame
{
	GridBagDemo()
	{
		setLayout(new GridBagLayout());
		handleEvents();
		initializeGUI();
		setSize(500,500);
		setVisible(true);
	}
	private void handleEvents()
	{
		this.addWindowListener(new MyWindowAdapter());
	}

	private void initializeGUI()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;

		gbc.gridx = 0;
		gbc.gridy = 0;
		add(new Button("Button 1"),gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		add(new Button("Button 2"),gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		add(new Button("Button 3"),gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		add(new Button("Button 4"),gbc);

		gbc.gridheight = 1;

		gbc.gridx = 1;
		gbc.gridy = 2;
		add(new Button("Button 5"),gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		add(new Button("Button 6"),gbc);
	}

	public static void main(String[] args) 
	{
		new GridBagDemo();	
	}
}