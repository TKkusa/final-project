package final_project.windowbuilderdemo.option;

import javax.swing.*;

public class OptionSlide extends JFrame {
    public void optionPlay(){

        JFrame optionSlide = new JFrame("選項");
        //control the music volume
        ImageIcon imageIcon = new ImageIcon("windowbuilderdemo/bin/img/icon.jpg");


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
