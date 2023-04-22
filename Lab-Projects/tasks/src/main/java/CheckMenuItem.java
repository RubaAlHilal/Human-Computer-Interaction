import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBoxMenuItem; //to work in this code 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.EtchedBorder;

public class CheckMenuItem extends JFrame{
    
    private JLabel statusbar; //اللي يطلع تحت اذا سويت check 
    private JLabel A;
    
    public CheckMenuItem() {
        setTitle("CheckBoxMenuItem");
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu view = new JMenu("View");
        
        JCheckBoxMenuItem x = new JCheckBoxMenuItem("Ruba");
        x.setState(true);
        
       
        
        JCheckBoxMenuItem sbar = new JCheckBoxMenuItem("Show StatuBar");
        sbar.setState(true);
        sbar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
            if (statusbar.isVisible()) {
                statusbar.setVisible(false);
            }else
{
statusbar.setVisible(true);
}
}
});
        
        x.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
            if (A.isVisible()) {
                A.setVisible(false);
            }else
{
            A.setVisible(true);
}
}
});
        
view.add(sbar);
file.add(x);

menubar.add(file);
menubar.add(view);
setJMenuBar(menubar);

A = new JLabel("Ruba Al-Hilal");

statusbar = new JLabel("Statusbar");
statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
add(statusbar, BorderLayout.SOUTH);

A.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
add(A, BorderLayout.SOUTH);


setSize(360, 250);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new CheckMenuItem();
}
}
