import javax.swing.JFrame;



public class Sample extends JFrame {
    
public Sample(){
    setSize(300, 200);
    setTitle("Sample ");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    
public static void main(String[] args) {
Sample obj = new Sample ();
obj.setVisible(true);
}

}
