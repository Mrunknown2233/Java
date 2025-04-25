import java.awt.*;
import java.awt.event.*;


class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}



public class FlowDemo extends Frame
{
	Checkbox chk1,chk2,chk3;
	Checkbox rbMale,rbFemale;
	CheckboxGroup gender;

	FlowDemo()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,40,100));
		initializeGUI();
		handleEvent();
		setSize(500,500);
		setVisible(true);
	}

	private void initializeComponents()
	{
		chk1 = new Checkbox("Check Box 1");
		chk2 = new Checkbox("Check Box 2");
		chk3 = new Checkbox("Check Box 3");

		gender = new CheckboxGroup();
		rbMale = new Checkbox("Male",false,gender);
		rbFemale = new Checkbox("Female",false,gender);

	}

	private void handleEvent()
	{
		this.addWindowListener(new MyWindowAdapter());
	}

	private void initializeGUI()
	{
		initializeComponents();
		add(chk1);
		add(chk2);
		add(chk3);

		add(rbMale);
		add(rbFemale);
	}

	public static void main(String[] args) 
	{
		new FlowDemo();	
	}
}