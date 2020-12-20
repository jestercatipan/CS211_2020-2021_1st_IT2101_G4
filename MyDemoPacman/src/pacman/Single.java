package pacman;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Window;

import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Single extends JFrame {
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Single frame = new Single();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Single() throws Exception {
		
		//bgmusic
				File file = new File("C:\\Users\\Asus\\MyDemoPacman\\Sound\\splashBgSound.wav");
				Clip clip = AudioSystem.getClip();
				AudioInputStream bgsound = AudioSystem.getAudioInputStream(file);
				clip.open(bgsound);
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				//JOptionPane is optional, 
				//SwingUtilities.invokeLater(() -> { 
				//JOptionPane.showMessageDialog(null, "Welcome!");;
				
		setBackground(Color.BLACK);
		setTitle("Instruction Singleplayer");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 444);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 300, 341);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Single.class.getResource("/Screen2.gif")));
	
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Single.class.getResource("/arrow2.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainmenu scene1;
				try {
				//	scene1.main(null);;
					clip.stop();
					scene1 = new Mainmenu();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				dispose();
			
			}
		});
		btnNewButton.setBounds(21, 352, 85, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("");
		btnNext.setIcon(new ImageIcon(Single.class.getResource("/Arrow.png")));
		btnNext.setBorder(null);
		btnNext.setOpaque(false);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multi scene3;
				try {
					scene3 = new Multi();
					scene3.main(null);
					clip.stop();
					dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNext.setBounds(198, 352, 85, 40);
		contentPane.add(btnNext);
	}
}
