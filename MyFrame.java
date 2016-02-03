import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame(){
        super("Envelope Generator");

        MyPanel panel = new MyPanel();
        add(panel);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

}
