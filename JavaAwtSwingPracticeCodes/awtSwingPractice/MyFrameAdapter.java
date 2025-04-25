import java.awt.Frame;
import java.awt.event.*;


class MyWindowAdapter extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}

class MyMouseListener implements MouseListener
{
    public void mousePressed(MouseEvent me)
    {
        // System.out.println("Mouse pressed at : [" + me.getXOnScreen() + ", " + me.getYOnScreen() + "]");
        System.out.println("Mouse pressed at : [" + me.getX() + ", " + me.getY() + "]");
    }

    public void mouseReleased(MouseEvent me)
    {
        // System.out.println("Mouse released at : [" + me.getXOnScreen() + ", " + me.getYOnScreen() + "]");
        System.out.println("Mouse released at : [" + me.getX() + ", " + me.getY() + "]");
    }
    public void mouseEntered(MouseEvent me)
    {
        // System.out.println("Mouse entered at : [" + me.getXOnScreen() + ", " + me.getYOnScreen() + "]");
        System.out.println("Mouse entered at : [" + me.getX() + ", " + me.getY() + "]");
    }
    public void mouseExited(MouseEvent me)
    {
        // System.out.println("Mouse exited at : [" + me.getXOnScreen() + ", " + me.getYOnScreen() + "]");
        System.out.println("Mouse exited at : [" + me.getX() + ", " + me.getY() + "]");
    }
    public void mouseClicked(MouseEvent me)
    {
        // System.out.println("Mouse clicked at : [" + me.getXOnScreen() + ", " + me.getYOnScreen() + "]");
        System.out.println("Mouse clicked at : [" + me.getX() +", " + me.getY() + "]");
    }
}

class MyFrame extends Frame
{
    MyFrame(String title)
    {
        super(title);
        setSize(500,500);
        setVisible(true);
        addWindowListener(new MyWindowAdapter());
        addMouseListener(new MyMouseListener());
    }
}
class MyFrameAdapter 
{
    public static void main(String args[]) 
	{
        MyFrame frame = new MyFrame("My first frame");
    }
}
