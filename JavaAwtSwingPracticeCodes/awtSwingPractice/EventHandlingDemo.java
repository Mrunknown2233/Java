import java.awt.*;
import java.awt.event.*;


class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

class EventHandlingDemo extends Frame implements ItemListener,ActionListener,TextListener
{
	TextField txtName,txtPassword;
	Choice choiceQualification;
	List listHobbies;
	Checkbox chkShowPassword;
	Label lblHobbies;
	Button btnClear,btnSubmit;

	EventHandlingDemo()
	{
		setLayout(new GridLayout(6,2,5,10));
		initializeComponents();
		initializeGUI();
		handleEvents();
		setSize(500,500);
		setVisible(true);
	}

	private void initializeComponents()
	{
		txtName = new TextField(15);
		txtPassword = new TextField(15);
		txtPassword.setEchoChar('*');
		chkShowPassword = new Checkbox("Show Password");

		choiceQualification = new Choice();
		choiceQualification.add("BTech");
		choiceQualification.add("MTech");
		choiceQualification.add("MBA");
		choiceQualification.add("MTech");
		choiceQualification.add("Graphics Designer");
		choiceQualification.add("BFA");
		
		listHobbies = new List(5,true);
		listHobbies.add("Cricket");
		listHobbies.add("Football");
		listHobbies.add("Codding");
		listHobbies.add("Sleeping");
		listHobbies.add("Judo");

		btnClear = new Button("Clear");
		btnSubmit = new Button("Submit");

		lblHobbies = new Label(" ");
	}

	private void handleEvents()
	{
		this.addWindowListener(new MyWindowAdapter());
		chkShowPassword.addItemListener(this);
		listHobbies.addItemListener(this);
		btnClear.addActionListener(this);
		btnSubmit.addActionListener(this);
		txtPassword.addTextListener(this);
	}

	public void textValueChanged(TextEvent te)
	{
		if(te.getSource() == txtPassword)
		{
			handlePasswordChange();
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btnClear)
			handleClear();
		else if(ae.getSource() == btnSubmit)
			handleSubmit();
	}

	private void initializeGUI()
	{
		add(new Label("Name: "));
		add(txtName);
		add(new Label("Password: "));
		add(txtPassword);
		add(lblHobbies);
		add(chkShowPassword);
		add(new Label("Hobbies: "));
		add(listHobbies);
		add(btnClear);
		add(btnSubmit);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource() == chkShowPassword)
			handleShowPasswordToggle();
		else if(ie.getSource() == listHobbies)
			handleHobbySelection();
	}


	private void handlePasswordChange()
	{
		String password = txtPassword.getText();

		if(password.length()<8)
			txtPassword.setForeground(Color.RED);
		else
			txtPassword.setForeground(new Color(0,255,0));
	}

	private void handleShowPasswordToggle()
	{
		if(chkShowPassword.getState())
			txtPassword.setEchoChar((char)0);
		else
			txtPassword.setEchoChar('*');
	}

	private void handleHobbySelection()
	{
		lblHobbies.setText(getSelectedHobbies());
	}

	private String getSelectedHobbies() throws StringIndexOutOfBoundsException
	{
		int [] indexes = listHobbies.getSelectedIndexes();

		StringBuffer hobbies = new StringBuffer();

		for(int i=0; i<indexes.length; i++)
		{
			hobbies.append(listHobbies.getItem(indexes[i]));
			hobbies.append(", ");
		}

		return hobbies.substring(0,hobbies.length()-2);
	}

	private void handleClear()
	{
		txtName.setText(" ");
		txtPassword.setText(" ");
		chkShowPassword.setState(false);
		lblHobbies.setText("");
		choiceQualification.select(0);

		int [] indexes = listHobbies.getSelectedIndexes();

		for(int i=0; i<indexes.length; i++)
			listHobbies.deselect(indexes[i]);
	}

	private void handleSubmit()
	{
		StringBuffer output = new StringBuffer();

		output.append("Name : " + txtName.getText() + "\n");
		output.append("Password : " + txtPassword.getText() + "\n");
		output.append("Hobbies : " + getSelectedHobbies());
		System.out.println(output.toString());
	}

	public static void main(String[] args) 
	{
		new EventHandlingDemo();	
	}
}