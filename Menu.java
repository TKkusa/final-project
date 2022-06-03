package final_project.windowbuilderdemo;

import final_project.final1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Objects;

public class Menu extends JFrame {

    public void menuStart(){
        //init
        JFrame frame1 = new JFrame("五子棋");
        JLabel label = new JLabel("五子棋小遊戲");
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton option = new JButton("Option");
        JButton exit = new JButton("EXIT");

        start.addActionListener(e -> {
            frame1.setVisible(false);
            final1 frame = new final1();
            frame.setVisible(true);
        });
        exit.addActionListener(e -> System.exit(0));
        //add icon image
        ImageIcon imageIcon = new ImageIcon("https://github.com/TKkusa/final-project/blob/64a2f4b6c54504fe1c21878548c3d6dc7d164991/windowbuilderdemo/src/img/icon.jpg");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\testing\\windowbuilderdemo\\src\\img\\icon.jpg");
        Dimension size = start.getPreferredSize();
        //design label
        label.setFont(new Font("courier",Font.PLAIN,30));
        label.setBounds(40,100,200,100);
        //design button
        start.setBounds(160,200,size.width,size.height);
        option.setBounds(160,250,size.width,size.height);
        exit.setBounds(160,300,size.width,size.height);
        //design panel
        panel.setLayout(null);
        panel.add(label);
        panel.add(start);
        panel.add(option);
        panel.add(exit);
        //set gif image(null)
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //design frame
        frame1.getContentPane().add(label);
        frame1.add(panel);
        frame1.setIconImage(icon);
//        frame1.setIconImage(imageIcon.getImage());//set app icon
        frame1.setSize(400, 400);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}
