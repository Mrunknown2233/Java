import java.awt.Frame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


class MyFrame extends Frame implements WindowListener
{
    MyFrame(String title)
    {
        super(title);
        setSize(500,500);
        setVisible(true);
        addWindowListener(this);
    }
    public void windowDeactivated(WindowEvent we)
    {
        System.out.println("Window Deactivated");
    }
    public void windowActivated(WindowEvent we)
    {
        System.out.println("Window Activated");
    }
    public void windowDeiconified(WindowEvent we)
    {
        System.out.println("Window Deiconified");
    }
    public void windowIconified(WindowEvent we)
    {
        System.out.println("Window Iconified");
    }
    public void windowOpened(WindowEvent we)
    {
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent we)
    {
        System.out.println("Window Closing");
    }
    public void windowClosed(WindowEvent we)
    {
        System.out.println("Window Closed");
    }

}
class FrameDemo 
{
    public static void main(String args[]) 
	{
        MyFrame frame = new MyFrame("My first Frame !");
    }
}
