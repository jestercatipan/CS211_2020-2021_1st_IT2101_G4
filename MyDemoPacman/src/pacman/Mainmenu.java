package pacman;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Mainmenu extends JFrame {
//public class Mainmenu  {
	public Mainmenu() throws Exception { 		
		
			//bgmusic
    		File file = new File("C:\\Users\\Asus\\MyDemoPacman\\Sound\\pacmanBG.wav");
    		Clip clip = AudioSystem.getClip();
    		AudioInputStream bgsound = AudioSystem.getAudioInputStream(file);
    		clip.open(bgsound);
    		clip.loop(Clip.LOOP_CONTINUOUSLY);;
    		
		 	JButton tutorialMode = new JButton("Tutorial");
		 	tutorialMode.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		 	JButton exitGame = new JButton("Exit Game");
		 	exitGame.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		 	JButton about = new JButton("About Game");
		 	about.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			
			//buttons
			JPanel buttonsPanel = new JPanel();
			buttonsPanel.setBorder(new EmptyBorder(10,0,50,10));
			buttonsPanel.setOpaque(false);
			buttonsPanel.setBackground(new Color(0,0,0,123));
			tutorialMode.setAlignmentX(Component.RIGHT_ALIGNMENT);
			exitGame.setAlignmentX(Component.CENTER_ALIGNMENT);
			about.setAlignmentX(Component.LEFT_ALIGNMENT);
	
			//button size
			Insets insets = new Insets(10,10,10,5);
			tutorialMode.setMargin(new Insets(10, 10, 10, 8));
			exitGame.setMargin(insets);
			Insets aboutInsets = new Insets(10,10,10,5);
			about.setMargin(aboutInsets);
			
			JButton singlePlayerMode = new JButton("SinglePlayer");
			singlePlayerMode.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			singlePlayerMode.setAlignmentX(Component.LEFT_ALIGNMENT);
			singlePlayerMode.setMargin(new Insets(10, 10, 10, 5));
			
			//calling singlePlayerMode
			singlePlayerMode.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent ae) {
					Pacman pacmanLoad = new Pacman();
					pacmanLoad.setVisible(true);
					pacmanLoad.setSize(380,420);
					pacmanLoad.setResizable(false);
					pacmanLoad.setTitle("Pacman");
					pacmanLoad.setDefaultCloseOperation(EXIT_ON_CLOSE);
					pacmanLoad.setLocationRelativeTo(null);
					dispose();
					clip.stop();
				}
			 });
				
				
			//aboutGame
			about.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent ae) {
					AboutGame abt;
					try {
						abt = new AboutGame();
						abt.setVisible(true);
						dispose();
						clip.stop();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					
				}
			});
			
			//tutorial button
			tutorialMode.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent ae) {
					Single instruct;
					try {
						instruct = new Single(); 
						instruct.setVisible(true);
						dispose();
						clip.stop();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					
				}
			});
			
			//exitbutton
			exitGame.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					dispose();
					clip.stop();
				}
			});
			
			//buttoncolor and display
			Color color = new Color(255,235,98);
			singlePlayerMode.setBackground(color);
			singlePlayerMode.setBorder(new RoundedBorder(12));
			tutorialMode.setBackground(color);
			tutorialMode.setBorder(new RoundedBorder(12));
			exitGame.setBackground(color);
			exitGame.setBorder(new RoundedBorder(12));
			about.setBackground(color);
			about.setBorder(new RoundedBorder(12));
			
			//hover buttons singlePlayerMode
			singlePlayerMode.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	singlePlayerMode.setBackground(Color.orange); }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	singlePlayerMode.setBackground(new Color(255,235,98)); } });
			//hover buttons tutorialMode
			tutorialMode.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	tutorialMode.setBackground(Color.orange); }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	tutorialMode.setBackground(new Color(255,235,98)); } });
			//hover buttons exitGame
			exitGame.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	exitGame.setBackground(Color.orange); }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	exitGame.setBackground(new Color(255,235,98)); } });
			//hover buttons about
			about.addMouseListener(new java.awt.event.MouseAdapter() {
			    public void mouseEntered(java.awt.event.MouseEvent evt) {
			    	about.setBackground(Color.orange); }
			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	about.setBackground(new Color(255,235,98)); } });
			
			
			//bg
			setTitle("Main Menu");
			//setLayout(new BorderLayout());
			JLabel label = new JLabel(new ImageIcon("C:\\Users\\Asus\\MyDemoPacman\\Image\\bg_0.gif"));
			setContentPane(label);
			getContentPane().setLayout(new FlowLayout());
			setResizable(false);
			setLocation(480,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setSize(350,380);
			getContentPane().add(buttonsPanel, BorderLayout.CENTER);
			
		 	//text
		 	JLabel pacmanText = new JLabel("Pacman Main Menu");
		 	pacmanText.setHorizontalAlignment(SwingConstants.LEFT);
		 	
		
		 	pacmanText.setFont(new Font("Archangelsk", Font.PLAIN, 32));
		 	pacmanText.setForeground(Color.yellow);
		 	pacmanText.setOpaque(true);
		 	pacmanText.setBackground(new Color(0,0,0,190));
			GroupLayout gl_buttonsPanel = new GroupLayout(buttonsPanel);
			gl_buttonsPanel.setHorizontalGroup(
				gl_buttonsPanel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_buttonsPanel.createSequentialGroup()
						.addGap(123)
						.addComponent(pacmanText)
						.addContainerGap(126, Short.MAX_VALUE))
					.addGroup(gl_buttonsPanel.createSequentialGroup()
						.addContainerGap(321, Short.MAX_VALUE)
						.addGroup(gl_buttonsPanel.createParallelGroup(Alignment.TRAILING)
							.addComponent(exitGame)
							.addComponent(about))
						.addGap(101))
					.addGroup(Alignment.LEADING, gl_buttonsPanel.createSequentialGroup()
						.addGap(116)
						.addGroup(gl_buttonsPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(tutorialMode, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addComponent(singlePlayerMode))
						.addContainerGap(306, Short.MAX_VALUE))
			);
			gl_buttonsPanel.setVerticalGroup(
				gl_buttonsPanel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_buttonsPanel.createSequentialGroup()
						.addComponent(pacmanText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(singlePlayerMode)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tutorialMode)
						.addGap(86)
						.addComponent(exitGame)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(about, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGap(118))
			);
			buttonsPanel.setLayout(gl_buttonsPanel);
	}
	
    public static void main (String[] args) throws Exception {
    	new Mainmenu();
    }
}
	