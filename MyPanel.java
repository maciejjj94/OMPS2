import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {

    static JButton button;
    static JTextField parameterA;
    static JTextField parameterD;
    static JTextField parameterS;
    static JTextField parameterR;
    MainController ctrl;
    JLabel attack;
    JLabel decay;
    JLabel sustain;
    JLabel release;

    MyPanel(){

        setPreferredSize(new Dimension(300,100));
        setLayout(new GridLayout(3,4));

        ctrl = new MainController();

        attack = new JLabel("Attack [ms]");
        add(attack);
        decay = new JLabel("Decay [ms]");
        add(decay);
        sustain = new JLabel("Sustain [0-1]");
        add(sustain);
        release = new JLabel("Release [ms]");
        add(release);

        parameterA = new JTextField(Integer.toString(ctrl.env.getA()));
        parameterA.setPreferredSize(new Dimension(70,25));
        parameterA.setLocation(100,100);
        parameterA.addActionListener(ctrl);
        add(parameterA);


        parameterD = new JTextField(Integer.toString(ctrl.env.getD()));
        parameterD.setPreferredSize(new Dimension(70,25));
        parameterD.addActionListener(ctrl);
        add(parameterD);


        parameterS = new JTextField(Double.toString(ctrl.env.getS()));
        parameterS.setPreferredSize(new Dimension(70,25));
        parameterS.addActionListener(ctrl);
        add(parameterS);


        parameterR= new JTextField(Integer.toString(ctrl.env.getR()));
        parameterR.setPreferredSize(new Dimension(70,25));
        parameterR.addActionListener(ctrl);
        add(parameterR);


        button = new JButton("Play");
        button.addActionListener(ctrl);
        add(button);
        add(new JPanel());


    }
}
