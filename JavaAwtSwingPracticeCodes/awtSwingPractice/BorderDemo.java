import java.awt.*;
import java.awt.event.*;


class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

class BorderDemo extends Frame
{
	Button btnNorth,btnSouth,btnEast,btnWest;
	TextArea taCenter;

	BorderDemo()
	{
		setLayout(new BorderLayout());
		initializeGUI();
		handleEvent();
		setSize(500,500);
		setVisible(true);
	}
	private void initializeComponents()
	{
		btnNorth = new Button("North");
		btnSouth = new Button("South");
		btnEast = new Button("East");
		btnWest = new Button("West");
		taCenter = new TextArea("I love Java but that doesn't mean i hate JavaScript");
	}
	private void handleEvent()
	{
		this.addWindowListener(new MyWindowAdapter());
	}
	private void initializeGUI()
	{
		initializeComponents();
		add(btnNorth,BorderLayout.NORTH);
		add(btnSouth,BorderLayout.SOUTH);
		add(btnEast,BorderLayout.EAST);
		add(btnWest,BorderLayout.WEST);
		add(taCenter,BorderLayout.CENTER);
	}

	public static void main(String[] args) 
	{
		new BorderDemo();	
	}
}