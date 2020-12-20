package pacman;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AboutGame extends JFrame {
	
	public AboutGame() throws Exception {
		
		//bgmusic
		File file = new File("C:\\Users\\Asus\\MyDemoPacman\\Sound\\splashBgSound.wav");
		Clip clip = AudioSystem.getClip();
		AudioInputStream bgsound = AudioSystem.getAudioInputStream(file);
		clip.open(bgsound);
		clip.loop(Clip.LOOP_CONTINUOUSLY);

		
		setTitle("About Game");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel pacmanTitle = new JLabel("About Pacman");
		pacmanTitle.setFont(new Font("Archangelsk", Font.PLAIN, 30));
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(new EmptyBorder(10, 0, 0, 0));
		mainPanel.add(titlePanel);
		titlePanel.add(pacmanTitle);
		mainPanel.setBorder(new EmptyBorder(0,0,0,0));
		
		JPanel textPanel = new JPanel();
		textPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("<html><body><center><br>In 1980 the Japanese arcade game manufacturer Namco Limited <br>"
				+ " introduced the world to Pac-Man. The lead designer was <br> Iwatani Tohru,"
				+ " who intended to create a game that did not <br> emphasize violence. <br> <br> In Japanese slang, paku paku describes"
				+ " the snapping of a mouth <br> open and shut, and thus the central character, resembling a small <br> pizza with a slice cut "
				+ "out for the mouth, was given the <br> name Pac-Man. "
				+ " <br> <br> Pac-Man quickly became an international sensation, with more <br> than 100,000 consoles sold in the United States "
				+ "alone, easily <br> making it the most successful arcade game in history.</body></html>");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Mainmenu load = new Mainmenu();
					dispose();
					clip.stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		//hover backButton
		backButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	backButton.setBackground(Color.orange); }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	backButton.setBackground(new Color(255,235,98)); } });
		
		backButton.setFont(new Font("Andre V", Font.PLAIN, 12));
		backButton.setBackground(new Color(255, 235, 98));
		GroupLayout gl_textPanel = new GroupLayout(textPanel);
		gl_textPanel.setHorizontalGroup(
			gl_textPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_textPanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addContainerGap())
				.addGroup(gl_textPanel.createSequentialGroup()
					.addGap(26)
					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(285, Short.MAX_VALUE))
		);
		gl_textPanel.setVerticalGroup(
			gl_textPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_textPanel.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(backButton)
					.addGap(34))
		);
		titlePanel.setBackground(new Color(0,0,0,0));
		mainPanel.setBackground(new Color(0,0,0,0));
		textPanel.setBackground(new Color(0,0,0,0));
		textPanel.setOpaque(true);
		textPanel.setLayout(gl_textPanel);
		setSize(380,420);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\Asus\\MyDemoPacman\\Image\\bgg.gif"));
		setContentPane(label);
		getContentPane().setLayout(new FlowLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		getContentPane().add(textPanel, BorderLayout.CENTER);
	}
}
