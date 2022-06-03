package final_project.windowbuilderdemo.menu;

import final_project.final1;
import final_project.windowbuilderdemo.option.OptionSlide;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
//my_token: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 ignore this
public class Menu extends JFrame {
    private static final String gifImage = "windowbuilderdemo/sakuratree.gif";
    public void menuStart() {
        //init

        JFrame frame1 = new JFrame("五子棋");
        JLabel label = new JLabel("五子棋小遊戲");
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton option = new JButton("Option");
        JButton exit = new JButton("EXIT");
        //set gif background
        ImageIcon img = new ImageIcon(gifImage);
        JLabel background = new JLabel("", img,JLabel.CENTER);
        background.setBounds(0,0,400,400);
        start.addActionListener(e -> {
            frame1.setVisible(false);
            final1 frame = new final1();
            frame.setVisible(true);
        });
        option.addActionListener(e -> {
            frame1.setVisible(false);
            OptionSlide optionSlide = new OptionSlide();
            optionSlide.optionPlay();
        });
        exit.addActionListener(e -> System.exit(0));
        //add icon image
        Image icon = Toolkit.getDefaultToolkit().getImage("windowbuilderdemo/bin/img/icon.jpg");
        Dimension size = start.getPreferredSize();
        Dimension size_Option = option.getPreferredSize();
        //design label
        label.setFont(new Font("courier",Font.PLAIN,30));
        label.setBounds(100,50,200,100);
        //design button
        start.setBounds(160,200,100,size.height);
        option.setBounds(160,250,100,size_Option.height);
        exit.setBounds(160,300,100,size.height);
        //design panel
        panel.setLayout(null);
        panel.add(label);
        panel.add(start);
        panel.add(option);
        panel.add(exit);

        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //design frame
        frame1.getContentPane().add(label);
        frame1.getContentPane().add(start);
        frame1.getContentPane().add(option);
        frame1.getContentPane().add(exit);
//        frame1.add(panel);
        frame1.getContentPane().add(background);
//        frame1.add(background);
        frame1.setIconImage(icon);//set app icon
        frame1.setBounds(600,200,400,400);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }

}
