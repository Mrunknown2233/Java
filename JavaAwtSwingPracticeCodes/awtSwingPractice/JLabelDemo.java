import java.awt.*;
import javax.swing.*;

class JLabelDemo extends JFrame
{
	JLabelDemo()
	{
		super("Label Demo");
		setLayout(new FlowLayout());
		ImageIcon il = new ImageIcon("Images/gtaSan.jpg");
		JLabel jl = new JLabel("Grand Theft Auto San Andreas",il,JLabel.RIGHT);
		add(jl);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new JLabelDemo();	
	}
}