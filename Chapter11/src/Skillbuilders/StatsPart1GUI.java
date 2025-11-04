package Skillbuilders;

import java.awt.EventQueue;

import java.io.*; 
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatsPart1GUI
{

	private JFrame frame;
	private static final String FILE_PATH = "..\\Chapter11\\src\\Skillbuilders\\test1.dat";
	private File dataFile;


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
					StatsPart1GUI window = new StatsPart1GUI();
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
	public StatsPart1GUI()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setRows(15);
		resultArea.setColumns(40);
		resultArea.setEditable(false);
		resultArea.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		resultArea.setBackground(new Color(240, 240, 240));
		resultArea.setBounds(10, 54, 532, 162);
		panel.add(resultArea);
		
		JLabel titlelbl = new JLabel("Student Test Scores");
		titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
		titlelbl.setBounds(175, 20, 186, 23);
		panel.add(titlelbl);
		
		JButton analyzebtn = new JButton("Analyze Scores");
		analyzebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				resultArea.setText(null);
				
				dataFile = new File(FILE_PATH);
				
				FileReader in;
				BufferedReader readFile;
				
				String stuName, score;
				double scoreValue;
				double lowScore = 100;
				double hiScore = 0;
				double avgScore;
				double totalScore = 0;
				int numScores;
				
				try
				{
					in = new FileReader(dataFile);
					readFile = new BufferedReader(in);
					
				}
				catch (FileNotFoundException err)
				{
					
				}
				
			}
		});
		analyzebtn.setBounds(199, 229, 128, 40);
		panel.add(analyzebtn);
	}
}
