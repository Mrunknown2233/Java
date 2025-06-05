import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class PlaceHolder extends JFrame implements FocusListener, ActionListener
{
    JTextField jtfName,jtfPassword;
    JButton submitButton;
    JLabel name,password;


    PlaceHolder()
    {
        setLayout(new GridLayout(3,2));
        initUi();
        setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addingEventsListeners();
    }

    private void initUi()
    {                
        name = new JLabel("Name: ");
        add(name);
        jtfName = new JTextField("Enter your name");
        add(jtfName);

        password = new JLabel("Password : ");
        add(password);
        jtfPassword = new JTextField("Enter your password");
        add(jtfPassword);
        submitButton = new JButton("Submit");
        add(submitButton);
    }

    private void addingEventsListeners()
    {
        jtfName.addFocusListener(this);
        jtfPassword.addFocusListener(this);
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submitButton)
        {
            if((jtfName.getText().isEmpty())||(jtfName.getText().isEmpty())||(jtfName.getText().equals("Enter your name"))||(jtfPassword.getText().equals("Enter your password")))
            {
                System.out.println("Something is missing"); 
            }
            else
            {
                System.out.println("Name: " + jtfName.getText());
                System.out.println("Password: " + jtfPassword.getText());
            }
        }
    }

    public void focusGained(FocusEvent e)
    {
        if(e.getSource()==jtfName)
        {
            if(jtfName.getText().isEmpty()||(jtfName.getText().equals("Enter your name")))
                jtfName.setText("");
            
        }
        if(e.getSource()==jtfPassword)
        {
            if(jtfPassword.getText().isEmpty()||(jtfPassword.getText().equals("Enter your password")))
                jtfPassword.setText("");
        }
    }
    public void focusLost(FocusEvent e)
    {
        if(e.getSource()==jtfPassword)
        {
             if(jtfPassword.getText().isEmpty())
                jtfPassword.setText("Enter your password");
        }
        if(e.getSource()==jtfName)
        {
            if(jtfName.getText().isEmpty())
                jtfName.setText("Enter your name");
        }
        
    }

    public static void main(String args[])
    {
        new PlaceHolder();
    }
}