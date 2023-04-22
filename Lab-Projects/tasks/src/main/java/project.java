
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class project extends JFrame{
    
    public project(){

        setTitle("JMenuBar");
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        
        JMenuItem fileClose = new JMenuItem("Close");
        JMenuItem fileOpen  = new JMenuItem("Open");
        
        fileClose.setToolTipText("Exit application");
        
        
        fileClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
}
        });
        
        menubar.add(file);
        menubar.add(edit);
        
        setJMenuBar(menubar);
        file.add(fileClose);
        edit.add(fileOpen);
        setVisible(true);
        setSize(320,260);
        setLocationRelativeTo(null);
}
   public static void main(String[] args) {
        project men = new project();
        men.setVisible(true);
} 
}
