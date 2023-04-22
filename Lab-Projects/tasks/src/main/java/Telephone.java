
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;







public class Telephone  extends JFrame{

    
    public Telephone(){
    setSize(300, 200);
    setTitle("Telephone Ruba Al-Hilal  ");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}
    
    public static void main(String[] args) {
        JFrame tele = new JFrame();
        tele.setVisible(true);
        tele.setLayout(new BorderLayout());
        
  JPanel panel = new JPanel(new GridLayout(6,5));
        
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        
        panel.add(new JButton("*"));
        panel.add(new JButton("0"));
        panel.add(new JButton("#"));
        
        tele.add(panel, BorderLayout.CENTER);
        
        JPanel p = new JPanel(new FlowLayout());
        p.add(new JLabel("Number to dial: "));
        p.add(new JTextField(20));
        panel.add(p, BorderLayout.SOUTH);
        
        panel.setVisible(true);
        
        
        
}      

}