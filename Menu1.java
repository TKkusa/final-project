package final_project;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//my_token: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 ignore this
public class Menu1 extends JFrame {
    public boolean shouldPlay = true;
    private static final String playMusic = "windowbuilderdemo/Flowers – Sakura Girl (No Copyright Music).wav";
    private static final String gifImage = "windowbuilderdemo/sakuratree.gif";
    public static final String appIcon = "windowbuilderdemo/bin/img/icon.jpg";
    SoundPlay soundPlay = new SoundPlay();
    JFrame frame1 = new JFrame("五子棋");
    JLabel label = new JLabel("五子棋小遊戲");
    JPanel panel = new JPanel();
    JButton start = new JButton("Start");
//    JButton option = new JButton("Option");
    JButton exit = new JButton("EXIT");
    public void menuStart() {
        //set gif background
        ImageIcon img = new ImageIcon(gifImage);
        JLabel background = new JLabel("", img,JLabel.CENTER);
        background.setBounds(0,0,400,400);
        //other button event
//        option.addActionListener(e -> {
////            frame1.setVisible(false);
//            OptionSlide optionSlide = new OptionSlide();
//            optionSlide.optionPlay();
//        });
        exit.addActionListener(e -> System.exit(0));
        //add icon image
        Image icon = Toolkit.getDefaultToolkit().getImage(appIcon);
        Dimension size = start.getPreferredSize();
//        Dimension size_Option = option.getPreferredSize();
        //design label
        label.setFont(new Font("courier",Font.PLAIN,30));
        label.setBounds(100,50,200,100);
        //design button
        start.setBounds(136,200,100,size.height);
//        option.setBounds(136,200,100,size_Option.height);
        exit.setBounds(136,250,100,size.height);
        //design panel
        panel.setLayout(null);
//        panel.add(label);
//        panel.add(start);
//        panel.add(option);
//        panel.add(exit);
//        panel.setBackground(Color.LIGHT_GRAY);
//        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        playMusic1(playMusic); //menu bgm
        //design frame
        frame1.getContentPane().add(label);
        frame1.getContentPane().add(start);
//        frame1.getContentPane().add(option);
        frame1.getContentPane().add(exit);
        frame1.getContentPane().add(background);
//        frame1.add(panel);
//        frame1.add(background);
        frame1.setIconImage(icon);//set app icon
        frame1.setBounds(600,200,400,400);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }

    public void playMusic1(String musicLocation){

        try {
            File musicPath = new File(musicLocation);
            if (musicPath.exists())
            {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();

                clip.open(audioInputStream);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                //event control stop the music
                start.addActionListener(e -> {
                    frame1.setVisible(false);
                    clip.stop();
                    final1 frame = new final1();
                    frame.setVisible(true);

                });
            }
            else
            {
                System.out.println("Can't find this song");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
