package windowbuilderdemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Frame extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void judge_the_result(int x,int y) {
		
	}
	int step=0; // count the steps
	int chess[][] = new int[14][14];
	int sum=0; // count if one line goes to 5
	
	/**
	 * Create the frame.
	 */
	public Frame() {
		// initialize the board
		// 0~13 are the borderlines
		for(int i=0;i<14;i++) {
			for(int j=0;j<14;j++) {
				chess[i][j]=0;
			}
		}
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
	
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 545); 
		getContentPane().setLayout(null);
		
		JButton btnNewButton1_1 = new JButton("");
		btnNewButton1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][1]==0) { // only can click once
					step+=1; 
					if(step%2==0) {
						chess[1][1]=2; // white 
						btnNewButton1_1.setBackground(Color.white);
					}
					else {
						chess[1][1]=1; // black
						btnNewButton1_1.setBackground(Color.black);
					}
					judge_the_result(1,1);
				}
			}
		});
		btnNewButton1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_1.setBounds(6, 6, 40, 40);
		getContentPane().add(btnNewButton1_1);
		
		JButton btnNewButton1_2 = new JButton("");
		btnNewButton1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][2]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][2]=2;  
						btnNewButton1_2.setBackground(Color.white);
					}
					else {
						chess[1][2]=1; 
						btnNewButton1_2.setBackground(Color.black);
					}
					judge_the_result(1,2);
				}
			}
		});
		btnNewButton1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_2.setBounds(46, 6, 40, 40);
		getContentPane().add(btnNewButton1_2);
		
		JButton btnNewButton1_3 = new JButton("");
		btnNewButton1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][3]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][3]=2;  
						btnNewButton1_3.setBackground(Color.white);					
					}
					else {
						chess[1][3]=1; 
						btnNewButton1_3.setBackground(Color.black);
					}
					judge_the_result(1,3);
				}
			}
		});
		btnNewButton1_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_3.setBounds(86, 6, 40, 40);
		getContentPane().add(btnNewButton1_3);
		
		JButton btnNewButton1_4 = new JButton("");
		btnNewButton1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][4]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][4]=2;  
						btnNewButton1_4.setBackground(Color.white);						
					}
					else {
						chess[1][4]=1; 
						btnNewButton1_4.setBackground(Color.black);
					}
					judge_the_result(1,4);
				}
			}
		});
		btnNewButton1_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_4.setBounds(126, 6, 40, 40);
		getContentPane().add(btnNewButton1_4);
		
		JButton btnNewButton1_5 = new JButton("");
		btnNewButton1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][5]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][5]=2; 
						btnNewButton1_5.setBackground(Color.white);
					}
					else {
						chess[1][5]=1; 
						btnNewButton1_5.setBackground(Color.black);						
					}
					judge_the_result(1,5);
				}
			}
		});
		btnNewButton1_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_5.setBounds(166, 6, 40, 40);
		getContentPane().add(btnNewButton1_5);
		
		JButton btnNewButton1_6 = new JButton("");
		btnNewButton1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][6]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][6]=2;  
						btnNewButton1_6.setBackground(Color.white);
					}
					else {
						chess[1][6]=1; 
						btnNewButton1_6.setBackground(Color.black);
					}
					judge_the_result(1,6);
				}
			}
		});
		btnNewButton1_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_6.setBounds(206, 6, 40, 40);
		getContentPane().add(btnNewButton1_6);
		
		JButton btnNewButton1_7 = new JButton("");
		btnNewButton1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][7]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][7]=2;  
						btnNewButton1_7.setBackground(Color.white);
					}
					else {
						chess[1][7]=1; 
						btnNewButton1_7.setBackground(Color.black);
					}
					judge_the_result(1,7);
				}
			}
		});
		btnNewButton1_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_7.setBounds(246, 6, 40, 40);
		getContentPane().add(btnNewButton1_7);
		
		JButton btnNewButton1_8 = new JButton("");
		btnNewButton1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][8]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][8]=2;  
						btnNewButton1_8.setBackground(Color.white);
					}
					else {
						chess[1][8]=1; 
						btnNewButton1_8.setBackground(Color.black);
					}
					judge_the_result(1,8);
				}
			}
		});
		btnNewButton1_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_8.setBounds(286, 6, 40, 40);
		getContentPane().add(btnNewButton1_8);
		
		JButton btnNewButton1_9 = new JButton("");
		btnNewButton1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][9]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][9]=2;  
						btnNewButton1_9.setBackground(Color.white);
					}
					else {
						chess[1][9]=1; 
						btnNewButton1_9.setBackground(Color.black);
					}
					judge_the_result(1,3);
				}
			}
		});
		btnNewButton1_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_9.setBounds(326, 6, 40, 40);
		getContentPane().add(btnNewButton1_9);
		
		JButton btnNewButton1_10 = new JButton("");
		btnNewButton1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][10]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][10]=2;  
						btnNewButton1_10.setBackground(Color.white);
					}
					else {
						chess[1][10]=1; 
						btnNewButton1_10.setBackground(Color.black);
					}
					judge_the_result(1,10);
				}
			}
		});
		btnNewButton1_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_10.setBounds(366, 6, 40, 40);
		getContentPane().add(btnNewButton1_10);
		
		JButton btnNewButton2_1 = new JButton("");
		btnNewButton2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][1]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][1]=2;  
						btnNewButton2_1.setBackground(Color.white);
					}
					else {
						chess[2][1]=1; 
						btnNewButton2_1.setBackground(Color.black);
					}
					judge_the_result(2,1);
				}
			}
		});
		btnNewButton2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_1.setBounds(6, 46, 40, 40);
		getContentPane().add(btnNewButton2_1);
		
		JButton btnNewButton2_2 = new JButton("");
		btnNewButton2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][2]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][2]=2;  
						btnNewButton2_2.setBackground(Color.white);
					}
					else {
						chess[2][2]=1; 
						btnNewButton2_2.setBackground(Color.black);
					}
					judge_the_result(2,2);
				}
			}
		});
		btnNewButton2_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_2.setBounds(46, 46, 40, 40);
		getContentPane().add(btnNewButton2_2);
		
		JButton btnNewButton2_3 = new JButton("");
		btnNewButton2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][3]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][3]=2;  
						btnNewButton2_3.setBackground(Color.white);
					}
					else {
						chess[2][3]=1; 
						btnNewButton2_3.setBackground(Color.black);
					}
					judge_the_result(2,3);
				}
			}
		});
		btnNewButton2_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_3.setBounds(86, 46, 40, 40);
		getContentPane().add(btnNewButton2_3);
		
		JButton btnNewButton2_4 = new JButton("");
		btnNewButton2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][4]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][4]=2;  
						btnNewButton2_4.setBackground(Color.white);
					}
					else {
						chess[2][4]=1; 
						btnNewButton2_4.setBackground(Color.black);
					}
					judge_the_result(2,4);
				}
			}
		});
		btnNewButton2_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_4.setBounds(126, 46, 40, 40);
		getContentPane().add(btnNewButton2_4);
		
		JButton btnNewButton2_5 = new JButton("");
		btnNewButton2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][5]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][5]=2;  
						btnNewButton2_5.setBackground(Color.white);
					}
					else {
						chess[2][5]=1; 
						btnNewButton2_5.setBackground(Color.black);
					}
					judge_the_result(2,5);
				}
			}
		});
		btnNewButton2_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_5.setBounds(166, 46, 40, 40);
		getContentPane().add(btnNewButton2_5);
		
		JButton btnNewButton2_6 = new JButton("");
		btnNewButton2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][6]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][6]=2;  
						btnNewButton2_6.setBackground(Color.white);
					}
					else {
						chess[2][6]=1; 
						btnNewButton2_6.setBackground(Color.black);
					}
					judge_the_result(2,6);
				}
			}
		});
		btnNewButton2_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_6.setBounds(206, 46, 40, 40);
		getContentPane().add(btnNewButton2_6);
		
		JButton btnNewButton2_7 = new JButton("");
		btnNewButton2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][7]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][7]=2;  
						btnNewButton2_7.setBackground(Color.white);
					}
					else {
						chess[2][7]=1; 
						btnNewButton2_7.setBackground(Color.black);
					}
					judge_the_result(2,7);
				}
			}
		});
		btnNewButton2_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_7.setBounds(246, 46, 40, 40);
		getContentPane().add(btnNewButton2_7);
		
		JButton btnNewButton2_8 = new JButton("");
		btnNewButton2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][8]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][8]=2;  
						btnNewButton2_8.setBackground(Color.white);
					}
					else {
						chess[2][8]=1; 
						btnNewButton2_8.setBackground(Color.black);
					}
					judge_the_result(2,8);
				}
			}
		});
		btnNewButton2_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_8.setBounds(286, 46, 40, 40);
		getContentPane().add(btnNewButton2_8);
		
		JButton btnNewButton2_9 = new JButton("");
		btnNewButton2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][9]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][9]=2;  
						btnNewButton2_9.setBackground(Color.white);
					}
					else {
						chess[2][9]=1; 
						btnNewButton2_9.setBackground(Color.black);
					}
					judge_the_result(2,9);
				}
			}
		});
		btnNewButton2_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_9.setBounds(326, 46, 40, 40);
		getContentPane().add(btnNewButton2_9);
		
		JButton btnNewButton2_10 = new JButton("");
		btnNewButton2_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][10]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][10]=2;  
						btnNewButton2_10.setBackground(Color.white);
					}
					else {
						chess[2][10]=1; 
						btnNewButton2_10.setBackground(Color.black);
					}
					judge_the_result(2,10);
				}
			}
		});
		btnNewButton2_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_10.setBounds(366, 46, 40, 40);
		getContentPane().add(btnNewButton2_10);
		
		JButton btnNewButton3_1 = new JButton("");
		btnNewButton3_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_1.setBounds(6, 86, 40, 40);
		getContentPane().add(btnNewButton3_1);
		
		JButton btnNewButton3_2 = new JButton("");
		btnNewButton3_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_2.setBounds(46, 86, 40, 40);
		getContentPane().add(btnNewButton3_2);
		
		JButton btnNewButton3_3 = new JButton("");
		btnNewButton3_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_3.setBounds(86, 86, 40, 40);
		getContentPane().add(btnNewButton3_3);
		
		JButton btnNewButton3_4 = new JButton("");
		btnNewButton3_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_4.setBounds(126, 86, 40, 40);
		getContentPane().add(btnNewButton3_4);
		
		JButton btnNewButton3_5 = new JButton("");
		btnNewButton3_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_5.setBounds(166, 86, 40, 40);
		getContentPane().add(btnNewButton3_5);
		
		JButton btnNewButton3_6 = new JButton("");
		btnNewButton3_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_6.setBounds(206, 86, 40, 40);
		getContentPane().add(btnNewButton3_6);
		
		JButton btnNewButton3_7 = new JButton("");
		btnNewButton3_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_7.setBounds(246, 86, 40, 40);
		getContentPane().add(btnNewButton3_7);
		
		JButton btnNewButton3_8 = new JButton("");
		btnNewButton3_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_8.setBounds(286, 86, 40, 40);
		getContentPane().add(btnNewButton3_8);
		
		JButton btnNewButton3_9 = new JButton("");
		btnNewButton3_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_9.setBounds(326, 86, 40, 40);
		getContentPane().add(btnNewButton3_9);
		
		JButton btnNewButton3_10 = new JButton("");
		btnNewButton3_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_10.setBounds(366, 86, 40, 40);
		getContentPane().add(btnNewButton3_10);
		
		JButton btnNewButton4_1 = new JButton("");
		btnNewButton4_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_1.setBounds(6, 126, 40, 40);
		getContentPane().add(btnNewButton4_1);
		
		JButton btnNewButton4_2 = new JButton("");
		btnNewButton4_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_2.setBounds(46, 126, 40, 40);
		getContentPane().add(btnNewButton4_2);
		
		JButton btnNewButton4_3 = new JButton("");
		btnNewButton4_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_3.setBounds(86, 126, 40, 40);
		getContentPane().add(btnNewButton4_3);
		
		JButton btnNewButton4_4 = new JButton("");
		btnNewButton4_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_4.setBounds(126, 126, 40, 40);
		getContentPane().add(btnNewButton4_4);
		
		JButton btnNewButton4_5 = new JButton("");
		btnNewButton4_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_5.setBounds(166, 126, 40, 40);
		getContentPane().add(btnNewButton4_5);
		
		JButton btnNewButton4_6 = new JButton("");
		btnNewButton4_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_6.setBounds(206, 126, 40, 40);
		getContentPane().add(btnNewButton4_6);
		
		JButton btnNewButton4_7 = new JButton("");
		btnNewButton4_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_7.setBounds(246, 126, 40, 40);
		getContentPane().add(btnNewButton4_7);
		
		JButton btnNewButton4_8 = new JButton("");
		btnNewButton4_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_8.setBounds(286, 126, 40, 40);
		getContentPane().add(btnNewButton4_8);
		
		JButton btnNewButton4_9 = new JButton("");
		btnNewButton4_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_9.setBounds(326, 126, 40, 40);
		getContentPane().add(btnNewButton4_9);
		
		JButton btnNewButton4_10 = new JButton("");
		btnNewButton4_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_10.setBounds(366, 126, 40, 40);
		getContentPane().add(btnNewButton4_10);
		
		JButton btnNewButton5_1 = new JButton("");
		btnNewButton5_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_1.setBounds(6, 166, 40, 40);
		getContentPane().add(btnNewButton5_1);
		
		JButton btnNewButton5_2 = new JButton("");
		btnNewButton5_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_2.setBounds(46, 166, 40, 40);
		getContentPane().add(btnNewButton5_2);
		
		JButton btnNewButton5_3 = new JButton("");
		btnNewButton5_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_3.setBounds(86, 166, 40, 40);
		getContentPane().add(btnNewButton5_3);
		
		JButton btnNewButton5_4 = new JButton("");
		btnNewButton5_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_4.setBounds(126, 166, 40, 40);
		getContentPane().add(btnNewButton5_4);
		
		JButton btnNewButton5_5 = new JButton("");
		btnNewButton5_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_5.setBounds(166, 166, 40, 40);
		getContentPane().add(btnNewButton5_5);
		
		JButton btnNewButton5_6 = new JButton("");
		btnNewButton5_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_6.setBounds(206, 166, 40, 40);
		getContentPane().add(btnNewButton5_6);
		
		JButton btnNewButton5_7 = new JButton("");
		btnNewButton5_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_7.setBounds(246, 166, 40, 40);
		getContentPane().add(btnNewButton5_7);
		
		JButton btnNewButton5_8 = new JButton("");
		btnNewButton5_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_8.setBounds(286, 166, 40, 40);
		getContentPane().add(btnNewButton5_8);
		
		JButton btnNewButton5_9 = new JButton("");
		btnNewButton5_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_9.setBounds(326, 166, 40, 40);
		getContentPane().add(btnNewButton5_9);
		
		JButton btnNewButton5_10 = new JButton("");
		btnNewButton5_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_10.setBounds(366, 166, 40, 40);
		getContentPane().add(btnNewButton5_10);
		
		JButton btnNewButton6_1 = new JButton("");
		btnNewButton6_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_1.setBounds(6, 206, 40, 40);
		getContentPane().add(btnNewButton6_1);
		
		JButton btnNewButton6_2 = new JButton("");
		btnNewButton6_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_2.setBounds(46, 206, 40, 40);
		getContentPane().add(btnNewButton6_2);
		
		JButton btnNewButton6_3 = new JButton("");
		btnNewButton6_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_3.setBounds(86, 206, 40, 40);
		getContentPane().add(btnNewButton6_3);
		
		JButton btnNewButton6_4 = new JButton("");
		btnNewButton6_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_4.setBounds(126, 206, 40, 40);
		getContentPane().add(btnNewButton6_4);
		
		JButton btnNewButton6_5 = new JButton("");
		btnNewButton6_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_5.setBounds(166, 206, 40, 40);
		getContentPane().add(btnNewButton6_5);
		
		JButton btnNewButton6_6 = new JButton("");
		btnNewButton6_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_6.setBounds(206, 206, 40, 40);
		getContentPane().add(btnNewButton6_6);
		
		JButton btnNewButton6_7 = new JButton("");
		btnNewButton6_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_7.setBounds(246, 206, 40, 40);
		getContentPane().add(btnNewButton6_7);
		
		JButton btnNewButton6_8 = new JButton("");
		btnNewButton6_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_8.setBounds(286, 206, 40, 40);
		getContentPane().add(btnNewButton6_8);
		
		JButton btnNewButton6_9 = new JButton("");
		btnNewButton6_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_9.setBounds(326, 206, 40, 40);
		getContentPane().add(btnNewButton6_9);
		
		JButton btnNewButton6_10 = new JButton("");
		btnNewButton6_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_10.setBounds(366, 206, 40, 40);
		getContentPane().add(btnNewButton6_10);
		
		JButton btnNewButton7_1 = new JButton("");
		btnNewButton7_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_1.setBounds(6, 246, 40, 40);
		getContentPane().add(btnNewButton7_1);
		
		JButton btnNewButton7_2 = new JButton("");
		btnNewButton7_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_2.setBounds(46, 246, 40, 40);
		getContentPane().add(btnNewButton7_2);
		
		JButton btnNewButton7_3 = new JButton("");
		btnNewButton7_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_3.setBounds(86, 246, 40, 40);
		getContentPane().add(btnNewButton7_3);
		
		JButton btnNewButton7_4 = new JButton("");
		btnNewButton7_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_4.setBounds(126, 246, 40, 40);
		getContentPane().add(btnNewButton7_4);
		
		JButton btnNewButton7_5 = new JButton("");
		btnNewButton7_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_5.setBounds(166, 246, 40, 40);
		getContentPane().add(btnNewButton7_5);
		
		JButton btnNewButton7_6 = new JButton("");
		btnNewButton7_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_6.setBounds(206, 246, 40, 40);
		getContentPane().add(btnNewButton7_6);
		
		JButton btnNewButton7_7 = new JButton("");
		btnNewButton7_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_7.setBounds(246, 246, 40, 40);
		getContentPane().add(btnNewButton7_7);
		
		JButton btnNewButton7_8 = new JButton("");
		btnNewButton7_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_8.setBounds(286, 246, 40, 40);
		getContentPane().add(btnNewButton7_8);
		
		JButton btnNewButton7_9 = new JButton("");
		btnNewButton7_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_9.setBounds(326, 246, 40, 40);
		getContentPane().add(btnNewButton7_9);
		
		JButton btnNewButton7_10 = new JButton("");
		btnNewButton7_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_10.setBounds(366, 246, 40, 40);
		getContentPane().add(btnNewButton7_10);
		
		JButton btnNewButton8_1 = new JButton("");
		btnNewButton8_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_1.setBounds(6, 286, 40, 40);
		getContentPane().add(btnNewButton8_1);
		
		JButton btnNewButton8_2 = new JButton("");
		btnNewButton8_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_2.setBounds(46, 286, 40, 40);
		getContentPane().add(btnNewButton8_2);
		
		JButton btnNewButton8_3 = new JButton("");
		btnNewButton8_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_3.setBounds(86, 286, 40, 40);
		getContentPane().add(btnNewButton8_3);
		
		JButton btnNewButton8_4 = new JButton("");
		btnNewButton8_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_4.setBounds(126, 286, 40, 40);
		getContentPane().add(btnNewButton8_4);
		
		JButton btnNewButton8_5 = new JButton("");
		btnNewButton8_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_5.setBounds(166, 286, 40, 40);
		getContentPane().add(btnNewButton8_5);
		
		JButton btnNewButton8_6 = new JButton("");
		btnNewButton8_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_6.setBounds(206, 286, 40, 40);
		getContentPane().add(btnNewButton8_6);
		
		JButton btnNewButton8_7 = new JButton("");
		btnNewButton8_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_7.setBounds(246, 286, 40, 40);
		getContentPane().add(btnNewButton8_7);
		
		JButton btnNewButton8_8 = new JButton("");
		btnNewButton8_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_8.setBounds(286, 286, 40, 40);
		getContentPane().add(btnNewButton8_8);
		
		JButton btnNewButton8_9 = new JButton("");
		btnNewButton8_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_9.setBounds(326, 286, 40, 40);
		getContentPane().add(btnNewButton8_9);
		
		JButton btnNewButton8_10 = new JButton("");
		btnNewButton8_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_10.setBounds(366, 286, 40, 40);
		getContentPane().add(btnNewButton8_10);
		
		JButton btnNewButton9_1 = new JButton("");
		btnNewButton9_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_1.setBounds(6, 326, 40, 40);
		getContentPane().add(btnNewButton9_1);
		
		JButton btnNewButton9_2 = new JButton("");
		btnNewButton9_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_2.setBounds(46, 326, 40, 40);
		getContentPane().add(btnNewButton9_2);
		
		JButton btnNewButton9_3 = new JButton("");
		btnNewButton9_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_3.setBounds(86, 326, 40, 40);
		getContentPane().add(btnNewButton9_3);
		
		JButton btnNewButton9_4 = new JButton("");
		btnNewButton9_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_4.setBounds(126, 326, 40, 40);
		getContentPane().add(btnNewButton9_4);
		
		JButton btnNewButton9_5 = new JButton("");
		btnNewButton9_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_5.setBounds(166, 326, 40, 40);
		getContentPane().add(btnNewButton9_5);
		
		JButton btnNewButton9_6 = new JButton("");
		btnNewButton9_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_6.setBounds(206, 326, 40, 40);
		getContentPane().add(btnNewButton9_6);
		
		JButton btnNewButton9_7 = new JButton("");
		btnNewButton9_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_7.setBounds(246, 326, 40, 40);
		getContentPane().add(btnNewButton9_7);
		
		JButton btnNewButton9_8 = new JButton("");
		btnNewButton9_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_8.setBounds(286, 326, 40, 40);
		getContentPane().add(btnNewButton9_8);
		
		JButton btnNewButton9_9 = new JButton("");
		btnNewButton9_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_9.setBounds(326, 326, 40, 40);
		getContentPane().add(btnNewButton9_9);
		
		JButton btnNewButton9_10 = new JButton("");
		btnNewButton9_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_10.setBounds(366, 326, 40, 40);
		getContentPane().add(btnNewButton9_10);
		
		JButton btnNewButton10_1 = new JButton("");
		btnNewButton10_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_1.setBounds(6, 366, 40, 40);
		getContentPane().add(btnNewButton10_1);
		
		JButton btnNewButton10_2 = new JButton("");
		btnNewButton10_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_2.setBounds(46, 366, 40, 40);
		getContentPane().add(btnNewButton10_2);
		
		JButton btnNewButton10_3 = new JButton("");
		btnNewButton10_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_3.setBounds(86, 366, 40, 40);
		getContentPane().add(btnNewButton10_3);
		
		JButton btnNewButton10_4 = new JButton("");
		btnNewButton10_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_4.setBounds(126, 366, 40, 40);
		getContentPane().add(btnNewButton10_4);
		
		JButton btnNewButton10_5 = new JButton("");
		btnNewButton10_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_5.setBounds(166, 366, 40, 40);
		getContentPane().add(btnNewButton10_5);
		
		JButton btnNewButton10_6 = new JButton("");
		btnNewButton10_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_6.setBounds(206, 366, 40, 40);
		getContentPane().add(btnNewButton10_6);
		
		JButton btnNewButton10_7 = new JButton("");
		btnNewButton10_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_7.setBounds(246, 366, 40, 40);
		getContentPane().add(btnNewButton10_7);
		
		JButton btnNewButton10_8 = new JButton("");
		btnNewButton10_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_8.setBounds(286, 366, 40, 40);
		getContentPane().add(btnNewButton10_8);
		
		JButton btnNewButton10_9 = new JButton("");
		btnNewButton10_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_9.setBounds(326, 366, 40, 40);
		getContentPane().add(btnNewButton10_9);
		
		JButton btnNewButton10_10 = new JButton("");
		btnNewButton10_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_10.setBounds(366, 366, 40, 40);
		getContentPane().add(btnNewButton10_10);
		
		JButton btnNewButton1_11 = new JButton("");
		btnNewButton1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][11]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][11]=2;  
						btnNewButton1_11.setBackground(Color.white);
					}
					else {
						chess[1][11]=1; 
						btnNewButton1_11.setBackground(Color.black);
					}
					judge_the_result(1,11);
				}
			}
		});
		btnNewButton1_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_11.setBounds(406, 6, 40, 40);
		getContentPane().add(btnNewButton1_11);
		
		JButton btnNewButton1_12 = new JButton("");
		btnNewButton1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[1][12]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[1][12]=2;  
						btnNewButton1_12.setBackground(Color.white);
					}
					else {
						chess[1][12]=1; 
						btnNewButton1_12.setBackground(Color.black);
					}
					judge_the_result(1,12);
				}
			}
		});
		btnNewButton1_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton1_12.setBounds(446, 6, 40, 40);
		getContentPane().add(btnNewButton1_12);
		
		JButton btnNewButton2_11 = new JButton("");
		btnNewButton2_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][11]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][11]=2;  
						btnNewButton2_11.setBackground(Color.white);
					}
					else {
						chess[2][11]=1; 
						btnNewButton2_11.setBackground(Color.black);
					}
					judge_the_result(2,11);
				}
			}
		});
		btnNewButton2_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_11.setBounds(406, 46, 40, 40);
		getContentPane().add(btnNewButton2_11);
		
		JButton btnNewButton2_12 = new JButton("");
		btnNewButton2_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chess[2][12]==0) { 
					step+=1; 
					if(step%2==0) {
						chess[2][12]=2;  
						btnNewButton2_12.setBackground(Color.white);
					}
					else {
						chess[2][12]=1; 
						btnNewButton2_12.setBackground(Color.black);
					}
					judge_the_result(2,12);
				}
			}
		});
		btnNewButton2_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton2_12.setBounds(446, 46, 40, 40);
		getContentPane().add(btnNewButton2_12);
		
		JButton btnNewButton3_11 = new JButton("");
		btnNewButton3_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_11.setBounds(406, 86, 40, 40);
		getContentPane().add(btnNewButton3_11);
		
		JButton btnNewButton3_12 = new JButton("");
		btnNewButton3_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton3_12.setBounds(446, 86, 40, 40);
		getContentPane().add(btnNewButton3_12);
		
		JButton btnNewButton4_11 = new JButton("");
		btnNewButton4_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_11.setBounds(406, 126, 40, 40);
		getContentPane().add(btnNewButton4_11);
		
		JButton btnNewButton4_12 = new JButton("");
		btnNewButton4_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton4_12.setBounds(446, 126, 40, 40);
		getContentPane().add(btnNewButton4_12);
		
		JButton btnNewButton5_11 = new JButton("");
		btnNewButton5_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_11.setBounds(406, 166, 40, 40);
		getContentPane().add(btnNewButton5_11);
		
		JButton btnNewButton5_12 = new JButton("");
		btnNewButton5_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton5_12.setBounds(446, 166, 40, 40);
		getContentPane().add(btnNewButton5_12);
		
		JButton btnNewButton6_11 = new JButton("");
		btnNewButton6_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_11.setBounds(406, 206, 40, 40);
		getContentPane().add(btnNewButton6_11);
		
		JButton btnNewButton6_12 = new JButton("");
		btnNewButton6_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton6_12.setBounds(446, 206, 40, 40);
		getContentPane().add(btnNewButton6_12);
		
		JButton btnNewButton7_11 = new JButton("");
		btnNewButton7_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_11.setBounds(406, 246, 40, 40);
		getContentPane().add(btnNewButton7_11);
		
		JButton btnNewButton7_12 = new JButton("");
		btnNewButton7_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton7_12.setBounds(446, 246, 40, 40);
		getContentPane().add(btnNewButton7_12);
		
		JButton btnNewButton8_11 = new JButton("");
		btnNewButton8_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_11.setBounds(406, 286, 40, 40);
		getContentPane().add(btnNewButton8_11);
		
		JButton btnNewButton8_12 = new JButton("");
		btnNewButton8_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton8_12.setBounds(446, 286, 40, 40);
		getContentPane().add(btnNewButton8_12);
		
		JButton btnNewButton9_11 = new JButton("");
		btnNewButton9_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_11.setBounds(406, 326, 40, 40);
		getContentPane().add(btnNewButton9_11);
		
		JButton btnNewButton9_12 = new JButton("");
		btnNewButton9_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton9_12.setBounds(446, 326, 40, 40);
		getContentPane().add(btnNewButton9_12);
		
		JButton btnNewButton10_11 = new JButton("");
		btnNewButton10_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_11.setBounds(406, 366, 40, 40);
		getContentPane().add(btnNewButton10_11);
		
		JButton btnNewButton10_12 = new JButton("");
		btnNewButton10_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton10_12.setBounds(446, 366, 40, 40);
		getContentPane().add(btnNewButton10_12);
		
		JButton btnNewButton11_1 = new JButton("");
		btnNewButton11_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_1.setBounds(6, 406, 40, 40);
		getContentPane().add(btnNewButton11_1);
		
		JButton btnNewButton11_2 = new JButton("");
		btnNewButton11_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_2.setBounds(46, 406, 40, 40);
		getContentPane().add(btnNewButton11_2);
		
		JButton btnNewButton11_3 = new JButton("");
		btnNewButton11_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_3.setBounds(86, 406, 40, 40);
		getContentPane().add(btnNewButton11_3);
		
		JButton btnNewButton11_4 = new JButton("");
		btnNewButton11_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_4.setBounds(126, 406, 40, 40);
		getContentPane().add(btnNewButton11_4);
		
		JButton btnNewButton11_5 = new JButton("");
		btnNewButton11_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_5.setBounds(166, 406, 40, 40);
		getContentPane().add(btnNewButton11_5);
		
		JButton btnNewButton11_6 = new JButton("");
		btnNewButton11_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_6.setBounds(206, 406, 40, 40);
		getContentPane().add(btnNewButton11_6);
		
		JButton btnNewButton11_7 = new JButton("");
		btnNewButton11_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_7.setBounds(246, 406, 40, 40);
		getContentPane().add(btnNewButton11_7);
		
		JButton btnNewButton11_8 = new JButton("");
		btnNewButton11_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_8.setBounds(286, 406, 40, 40);
		getContentPane().add(btnNewButton11_8);
		
		JButton btnNewButton11_9 = new JButton("");
		btnNewButton11_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_9.setBounds(326, 406, 40, 40);
		getContentPane().add(btnNewButton11_9);
		
		JButton btnNewButton11_10 = new JButton("");
		btnNewButton11_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_10.setBounds(366, 406, 40, 40);
		getContentPane().add(btnNewButton11_10);
		
		JButton btnNewButton12_1 = new JButton("");
		btnNewButton12_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_1.setBounds(6, 446, 40, 40);
		getContentPane().add(btnNewButton12_1);
		
		JButton btnNewButton12_2 = new JButton("");
		btnNewButton12_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_2.setBounds(46, 446, 40, 40);
		getContentPane().add(btnNewButton12_2);
		
		JButton btnNewButton12_3 = new JButton("");
		btnNewButton12_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_3.setBounds(86, 446, 40, 40);
		getContentPane().add(btnNewButton12_3);
		
		JButton btnNewButton12_4 = new JButton("");
		btnNewButton12_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_4.setBounds(126, 446, 40, 40);
		getContentPane().add(btnNewButton12_4);
		
		JButton btnNewButton12_5 = new JButton("");
		btnNewButton12_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_5.setBounds(166, 446, 40, 40);
		getContentPane().add(btnNewButton12_5);
		
		JButton btnNewButton12_6 = new JButton("");
		btnNewButton12_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_6.setBounds(206, 446, 40, 40);
		getContentPane().add(btnNewButton12_6);
		
		JButton btnNewButton12_7 = new JButton("");
		btnNewButton12_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_7.setBounds(246, 446, 40, 40);
		getContentPane().add(btnNewButton12_7);
		
		JButton btnNewButton12_8 = new JButton("");
		btnNewButton12_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_8.setBounds(286, 446, 40, 40);
		getContentPane().add(btnNewButton12_8);
		
		JButton btnNewButton12_9 = new JButton("");
		btnNewButton12_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_9.setBounds(326, 446, 40, 40);
		getContentPane().add(btnNewButton12_9);
		
		JButton btnNewButton12_10 = new JButton("");
		btnNewButton12_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_10.setBounds(366, 446, 40, 40);
		getContentPane().add(btnNewButton12_10);
		
		JButton btnNewButton11_11 = new JButton("");
		btnNewButton11_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_11.setBounds(406, 406, 40, 40);
		getContentPane().add(btnNewButton11_11);
		
		JButton btnNewButton11_12 = new JButton("");
		btnNewButton11_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton11_12.setBounds(446, 406, 40, 40);
		getContentPane().add(btnNewButton11_12);
		
		JButton btnNewButton12_11 = new JButton("");
		btnNewButton12_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_11.setBounds(406, 446, 40, 40);
		getContentPane().add(btnNewButton12_11);
		
		JButton btnNewButton12_12 = new JButton("");
		btnNewButton12_12.setBackground(Color.LIGHT_GRAY);
		btnNewButton12_12.setBounds(446, 446, 40, 40);
		getContentPane().add(btnNewButton12_12);
	}
}

