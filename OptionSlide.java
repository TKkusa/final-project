package final_project;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class OptionSlide extends JFrame {

    JSlider slider;
    JLabel label;
    public static String strCommand = "";
    public static String str = "";


    public void optionPlay(){
        //add a option to control the volume
        JFrame optionSlide = new JFrame("選項");
        //control the music volume
        ImageIcon imageIcon = new ImageIcon(Menu1.appIcon);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        optionSlide.setIconImage(imageIcon.getImage());
        optionSlide.setResizable(false);
        optionSlide.setLocationRelativeTo(null);
        optionSlide.add(panel);
        optionSlide.setBounds(600,200,400,400);
        optionSlide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        optionSlide.setVisible(true);

    }


}
