import java.awt.*;
import java.awt.event.*;


class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}


public  class GridDemo extends Frame
{
	Button b[];
	GridDemo()
	{
		setLayout(new GridLayout(10,8,5,5));
		initializeGUI();
		handleEvents();
		setSize(500,500);
		setVisible(true);
	}
	private	 void initializeComponents()
	{
		b = new Button[80];
		for(int i = 0; i<80; i++)
			b[i] = new Button("Button " + (i+1));
	}
	private void handleEvents()
	{
		this.addWindowListener(new MyWindowAdapter());
	}
	private void initializeGUI()
	{
		initializeComponents();
		for(int i = 0; i<80; i++)
			add(b[i]);

	}
	public static void main(String[] args) 
	{
		new GridDemo();	
	}
}
