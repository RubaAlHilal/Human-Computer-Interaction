import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Submenu extends JFrame{
    
    
    public Submenu()
{
    setTitle("Submenu");
    JMenuBar menubar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    
    JMenuItem a = new JMenuItem("a");
    JMenuItem b = new JMenuItem("b");;
    JMenuItem fileClose = new JMenuItem("Close");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("paste");
    JMenuItem cut = new JMenuItem("cut");
    
    
    fileClose.setToolTipText("Exit application");
    fileClose.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
          System.exit(0);
}});
/* A Print Code */
    a.setToolTipText("Print a");
    a.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.out.println("A");
}
});
    b.setToolTipText("Print b");
    b.addActionListener(new ActionListener() {
        
    public void actionPerformed(ActionEvent event) {
        System.out.println("B");
}
});
    
    file.add(a);
    file.add(b);
    file.addSeparator();
    file.add(fileClose);
    menubar.add(file);
    
    menubar.add(edit);
    edit.add(copy);
    edit.add(paste);
    edit.addSeparator();
    edit.add(cut);
    
    setJMenuBar(menubar);
    setSize(360, 250);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
}
    
    public static void main(String[] args) {
    Submenu men = new Submenu();
    men.setVisible(true);
}
}


