import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JButton;

public class car extends JFrame{
    public car (){
        setSize(500,500);
        setTitle("Center on screen");
        Toolkit t = getToolkit();
        Dimension x = t.getScreenSize();
        setLocation(x.width/2-getWidth()/2,x.height/2-getHeight()/2);
        JPanel y = new JPanel();
        getContentPane().add(y);
        y.setLayout(null);
        y.setToolTipText("This is a fast car");
        JButton z = new JButton("click");
        z.setBounds(100,60,100,30);
        y.add(z);
        z.setToolTipText("This is a buttonr");
        z.setBackground(Color.red);
    }
    
    public static void main(String[]args){
        car Ruba = new car();
        Ruba.setVisible(true);
    }
}
