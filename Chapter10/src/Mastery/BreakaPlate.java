package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import SkillBuilders.Roll;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.GridLayout;
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

	private JFrame frame;

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
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreakaPlate()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		/* Create a label that shows the start of the game */
		JLabel plates = new JLabel("");
		plates.setBounds(81, 33, 275, 76);
		plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates.gif")));
		panel.add(plates);

		JLabel prizeWon = new JLabel("");
		prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/placeholder.gif")));
		prizeWon.setBounds(161, 189, 111, 111);
		panel.add(prizeWon);
		
		/* Create a Play button */
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			/**
			 * Handle the button click
			 * pre: none
			 * post: The appropriate image and message are displayed.
			 */
			public void actionPerformed(ActionEvent e)
			{

				String prize;
				final String FIRST_PRIZE = "Win";
				final String CONSOLATION_PRIZE = "Lose";

				int toss;
				int successes = 0;
				Random r = new Random();

				/* play game */
				for (int i = 0; i < 3; i++)
				{ //player gets three tries
					toss = r.nextInt(2);
					if (toss == 1)
					{
						successes += 1; //1 is a successful toss
					}
				}

				/* award prize */
				if (successes == 3)
				{
					prize = FIRST_PRIZE;
				}
				else
				{
					prize = (CONSOLATION_PRIZE);
				}

				if (play.getText() == "Play")
				{
					if (prize.equals(FIRST_PRIZE))
					{
						plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates_all_broken.gif")));
						prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("sticker.gif")));
					}
					else if (prize.equals(CONSOLATION_PRIZE))
					{
						plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates_two_broken.gif")));
						prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("tiger_plush.gif")));
					}

					play.setText("Play Again");
				}
				else if (play.getText() == "Play Again")
				{
					plates.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/plates.gif")));
					prizeWon.setIcon(new ImageIcon(BreakaPlate.class.getResource("/Mastery/BreakaPlateImages/placeholder.gif")));
					play.setText("Play");

				}
			}
		});
		play.setBounds(171, 155, 89, 23);
		panel.add(play);
		
		

	}
}
