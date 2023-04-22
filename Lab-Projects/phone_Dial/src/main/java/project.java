
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class project extends JFrame{
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
    frame.setSize(350, 300);
    frame.setTitle("Telephone Ruba Al Hilal");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    frame.setLayout(new BorderLayout());
    

    

JPanel panel = new JPanel(new GridLayout(4,5));
        
    for(int i=1; i<=9;i++){
        panel.add(new JButton(""+i));
    }
        
        panel.add(new JButton("*"));
        panel.add(new JButton("0"));
        panel.add(new JButton("#"));
        
        frame.add(panel, BorderLayout.CENTER);
        
        JPanel p = new JPanel(new FlowLayout());
        p.add(new JLabel("Number to dial:"));
        p.add(new JTextField(15));
        frame.add(p, BorderLayout.SOUTH);
        
        frame.setVisible(true);
}
}
