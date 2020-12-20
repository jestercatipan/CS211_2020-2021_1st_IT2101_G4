package pacman;
//import sun.audio.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;


public class Main extends JFrame {
	private JPanel contentPane;
	private static JProgressBar progressBar;

	
	public static void main(String[]args) throws Exception {
		//bgmusic
				File file = new File("C:\\Users\\Asus\\MyDemoPacman\\Sound\\splashBgSound.wav");
				Clip clip = AudioSystem.getClip();
				AudioInputStream bgsound = AudioSystem.getAudioInputStream(file);
				clip.open(bgsound);
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				//JOptionPane is optional, 
				
					;
				
				int x;
					Main frame = new Main();
					frame.setVisible(true);
				try {
				for(x=0;x<=100;x++) {
					Main.progressBar.setValue(x);
					Thread.sleep(50);
					
					if(x==100) {
						frame.dispose();
						clip.stop();
						new Mainmenu();
					}
					
					}
				}
				catch (InterruptedException e) {
					e.printStackTrace();
			}
	}
	
	public Main() throws Exception {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/SplashBg.gif"));
		label.setIcon(icon);
		label.setBounds(0,-40,510,510);
		contentPane.add(label);
		
		
		progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setBorderPainted(false);
        progressBar.setBackground(Color.YELLOW);
        progressBar.setForeground(Color.BLACK);
		progressBar.setBounds(0, 430, 450, 20);
		contentPane.add(progressBar);
		
		
	}
}
