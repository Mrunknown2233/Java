import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}


class SampleFrame extends Frame
{
    SampleFrame(String title)
    {
        super(title);
        addWindowListener(new MyWindowAdapter());
    }
}

class FileDialogDemo
{
    public static void main(String[] args) 
    {
        Frame f = new SampleFrame("File Dialog");
        f.setVisible(true);
        f.setSize(500,500);
        FileDialog fd = new FileDialog(f,"File Dialog",FileDialog.SAVE);
        fd.setVisible(true);
        if(fd.getDirectory()!=null || fd.getFile()!= null)
            System.out.println(fd.getDirectory() + fd.getFile());
    }
}