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

        Menubar mbar = new Menubar();
        setMenuBar(mbar);

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu sub = new Menu("Sub menu");

        mbar.add(fileMenu);
        mbar.add(editMenu);
        mbar.add(sub);

        MenuItem exit = new MenuItem("exit");
        MenuItem dash = new MenuItem("-"); // Not actually used in the correct way
        MenuItem new1 = new MenuItem("new");
        MenuItem copy = new MenuItem("copy");
        MenuItem cut = new MenuItem("cut");
        MenuItem find = new MenuItem("find");

        CheckboxMenuItem replace = new CheckboxMenuItem("replace", true);

        fileMenu.add(new1);
        fileMenu.addSeparator(); // Correct usage
        fileMenu.add(exit);

        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.addSeparator(); // Correct usage

        editMenu.add(sub);
        sub.add(find);
        sub.add(replace);

        addWindowListener(new MyWindowAdapter());
    }

    public static void main(String[] args) {
        new MenuFrame();
    }
}
