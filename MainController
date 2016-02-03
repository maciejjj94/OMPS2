import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;

public class MainController implements ActionListener {

    Sample gen;
    Envelope env = new Envelope(500, 250, 0.5, 250);

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == MyPanel.parameterA) {
            env.changeA(Integer.valueOf(((JTextField) e.getSource()).getText()));
        }
        else if(source == MyPanel.parameterD) {
            env.changeD(Integer.valueOf(((JTextField) e.getSource()).getText()));
        }
        else if(source == MyPanel.parameterS) {
            env.changeS(Double.valueOf(((JTextField) e.getSource()).getText()));
        }
        else if(source == MyPanel.parameterR) {
            env.changeR(Integer.valueOf(((JTextField) e.getSource()).getText()));
        }
        else if (source == MyPanel.button)
        {
            gen = new Sample();
            try {
                gen.generateSound(env);
            }
            catch (LineUnavailableException e1) {
                e1.printStackTrace();
            }

        }


    }


}
