package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang. Math;

public class Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the application.
	 */
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon die1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.jpeg");
		ImageIcon die2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.jpeg");
		ImageIcon die3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.jpeg");
		ImageIcon die4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.jpeg");
		ImageIcon die5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.jpeg");
		ImageIcon die6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.jpeg");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel dieFace1 = new JLabel("");
		dieFace1.setIcon(new ImageIcon(Roll.class.getResource("/SkillBuilders/die3.jpeg")));
		dieFace1.setBounds(50, 36, 131, 131);
		panel.add(dieFace1);
		
		JLabel dieFace2 = new JLabel("");
		dieFace2.setIcon(new ImageIcon(Roll.class.getResource("/SkillBuilders/die3.jpeg")));
		dieFace2.setBounds(246, 36, 131, 131);
		panel.add(dieFace2);
		
		JButton btnNewButton = new JButton("Roll Die");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(169, 206, 89, 23);
		panel.add(btnNewButton);
	}
}
