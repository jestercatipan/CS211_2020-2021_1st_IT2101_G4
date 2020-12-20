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


public class LaunchFrame extends JFrame {
	public LaunchFrame()  { 
		
		setTitle("Launch");
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblNewLabel = new JLabel("Multiplayer Launcher");
		lblNewLabel.setFont(new Font("Andre V", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		
		JButton launchClient = new JButton("Launch Client");
	
		launchClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MazeClient cl; 
				try {
					cl = new MazeClient("");
						cl.setVisible(true);
						cl.setSize(380,420);
						cl.setResizable(false);
					//	cl.setTitle("Client");
						cl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						cl.setLocationRelativeTo(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} } 
			});
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton launchServer = new JButton("Launch Server");
		launchServer.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent ae) {
				MazeServer serv;
					try {
		
						serv = new MazeServer();
						serv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						serv.setLocationRelativeTo(null);
						serv.setResizable(false);
						serv.setVisible(true);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}});
		
		panel.add(launchServer);
		panel.add(launchClient);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(107, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(125))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(106)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(115, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(65))
		);
		getContentPane().setLayout(groupLayout);
		//setResizable(false);
		setLocation(480,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setSize(450,250);
		setResizable(false);
		
	}
}
