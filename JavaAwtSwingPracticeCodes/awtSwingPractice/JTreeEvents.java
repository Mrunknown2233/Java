import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;


class JTreeEvents extends JFrame implements MouseListener
{
	JTree tree;
	JTextField jtf;


	JTreeEvents()
	{
		setLayout(new BorderLayout());

		DefaultMutableTreeNode  top = new DefaultMutableTreeNode("options");

		DefaultMutableTreeNode  a = new DefaultMutableTreeNode("A");
		top.add(a);

		DefaultMutableTreeNode  a1 = new DefaultMutableTreeNode("A1");
		a.add(a1);

		DefaultMutableTreeNode  b = new DefaultMutableTreeNode("options");
		top.add(b);

		DefaultMutableTreeNode  b1 = new DefaultMutableTreeNode("B1");
		b.add(b1);

		DefaultMutableTreeNode  b2 = new DefaultMutableTreeNode("B2");
		b.add(b2);

		DefaultMutableTreeNode  b3 = new DefaultMutableTreeNode("B3");
		b1.add(b3);


		tree = new JTree(top);

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;


		JScrollPane jsp = new JScrollPane(tree,v,h);

		add(jsp,BorderLayout.CENTER);

		jtf = new JTextField(" ",20);

		add(jtf,BorderLayout.SOUTH);

		tree.addMouseListener(this);

		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void mouseClicked(MouseEvent me)
	{
		TreePath tp = tree.getPathForLocation(me.getX(),me.getY());
		if(tp!=null)
				jtf.setText(tp.toString());
		else
			jtf.setText("");
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}

	public static void main(String[] args) 
	{
		new JTreeEvents();	
	}
}