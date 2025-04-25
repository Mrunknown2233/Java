import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class MenuFrame extends Frame {
    MenuFrame() {
        super("Menubar example");
        setSize(500, 500);
        setVisible(true);

        MenuBar mbar = new MenuBar(); 
        setMenuBar(mbar);

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu sub = new Menu("Sub menu");

        mbar.add(fileMenu);
        mbar.add(editMenu);
        

        MenuItem exit = new MenuItem("Exit");
        MenuItem new1 = new MenuItem("New");
        MenuItem copy = new MenuItem("Copy");
        MenuItem cut = new MenuItem("Cut");
        MenuItem find = new MenuItem("Find");

        CheckboxMenuItem replace = new CheckboxMenuItem("Replace", true);

        fileMenu.add(new1);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.addSeparator(); 

        editMenu.add(sub); 
        sub.add(find);
        sub.add(replace);

        addWindowListener(new MyWindowAdapter());
    }

    public static void main(String[] args) {
        new MenuFrame();
    }
}
