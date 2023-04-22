import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

    public class SimpleToolbar extends JFrame{
        public SimpleToolbar() {
            setTitle("SimpleToolbar");
                JMenuBar menubar = new JMenuBar();
                JMenu file = new JMenu("File");
            menubar.add(file);
            setJMenuBar(menubar);
                JToolBar toolbar = new JToolBar();
                JButton exit = new JButton("Exit");
            toolbar.add(exit);
            exit.addActionListener(new ActionListener() {
            
    public void actionPerformed(ActionEvent event) {
        System.exit(0);
}
});
            
        add(toolbar, BorderLayout.NORTH);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
}
        
    public static void main(String[] args) {
        new SimpleToolbar();
}
}
