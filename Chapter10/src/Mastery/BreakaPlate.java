package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

/*

Program: BreakaPlate.java          Last Date of this Revision: Oct. 1, 2025

Purpose: Modify the BreakAPlate application to display a picture of the prize won rather than text naming the prize.

Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

public class BreakaPlate
{

	private JFrame frmBreak;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					BreakaPlate window = new BreakaPlate();
					window.frmBreak.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor for BreakaPlate.
	 * Calls initialize() to set up the GUI.
	 */
	public BreakaPlate()
	{
		initialize();
	}

	/**
	 * Set up the contents of the frame:
	 * - Create the panel
	 * - Add images and labels
	 * - Add the Play button with game logic
	 */
	private void initialize()
	{
		// Create and configure the JFrame
		frmBreak = new JFrame();
		frmBreak.setTitle("BreakAPlate");
		frmBreak.setBounds(100, 100, 469, 364);
		frmBreak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the main panel with white background
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frmBreak.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null); // using absolute positioning

		/* Label to display the plates image */
		JLabel plates = new JLabel("");
		plates.setBounds(81, 33, 275, 76);
		// Start with all plates unbroken
		plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates.gif")));
		panel.add(plates);

		/* Label to display the prize image */
		JLabel prizeWon = new JLabel("");
		// Start with a placeholder prize image
		prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/placeholder.gif")));
		prizeWon.setBounds(161, 189, 111, 111);
		panel.add(prizeWon);

		/* Create a Play button */
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			/**
			 * Handles the "Play" button click:
			 * - Simulates 3 tosses (each has a 50% chance of success)
			 * - If all 3 succeed → win plush tiger
			 * - Otherwise → win sticker
			 * - Updates images and button text accordingly
			 */
			public void actionPerformed(ActionEvent e)
			{

				String prize;
				final String FIRST_PRIZE = "Win"; // Tiger plush
				final String CONSOLATION_PRIZE = "Lose"; // Sticker

				int toss;
				int successes = 0;
				Random r = new Random();

				// Simulate 3 tosses
				for (int i = 0; i < 3; i++) 
				{
					toss = r.nextInt(2); // random 0 or 1
					if (toss == 1)
					{
						successes += 1; // Count a successful toss
					}
				}

				// Determine prize based on results
				if (successes == 3)
				{
					prize = FIRST_PRIZE;
				}
				else
				{
					prize = (CONSOLATION_PRIZE);
				}

				// If currently showing "Play"
				if (play.getText().equals("Play"))
				{
					// Update plates & prize images based on result
					if (prize.equals(FIRST_PRIZE))
					{
						plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates_all_broken.gif")));
						prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/tiger_plush.gif")));
					}
					else if (prize.equals(CONSOLATION_PRIZE))
					{
						plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates_two_broken.gif")));
						prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/sticker.gif")));
					}

					// Change button text for replay
					play.setText("Play Again");
				}
				// If player clicks "Play Again"
				else if (play.getText().equals("Play Again"))
				{
					// Reset images to starting state
					plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates.gif")));
					prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/placeholder.gif")));
					play.setText("Play");

				}
			}
		});

		// Position and add the button to the panel
		play.setBounds(161, 140, 111, 38);
		panel.add(play);

	}
}
