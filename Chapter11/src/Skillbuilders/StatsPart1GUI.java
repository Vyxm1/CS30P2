package Skillbuilders;

import java.awt.EventQueue;

import java.io.*;
import java.text.NumberFormat;
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
		resultArea.setBounds(10, 54, 532, 272);
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
				NumberFormat percentFormatter = NumberFormat.getPercentInstance();
				StringBuilder output = new StringBuilder();

				String stuName, score;
				double scoreValue;
				double lowScore = 100;
				double hiScore = 0;
				double avgScore;
				double totalScore = 0;
				int numScores = 0;

				try
				{
					in = new FileReader(dataFile);
					readFile = new BufferedReader(in);
					output.append("STUDENT SCORES: \n"
							+ "----------------------------\n");

					while ((stuName = readFile.readLine()) != null)
					{
						numScores++;
						score = readFile.readLine();
						scoreValue = Double.parseDouble(score);
						
						totalScore += scoreValue;
						output.append(stuName + " " + percentFormatter.format(scoreValue / 100) + "\n");
						
						if (scoreValue < lowScore)
						{
							lowScore = scoreValue;
						}

						if (scoreValue > hiScore)
						{
							hiScore = scoreValue;
						}
					}

					avgScore = totalScore / numScores;
					output.append("\nStatistics: \n"
							+ "----------------------------\n"
							+ "Lowest score: " + percentFormatter.format(lowScore / 100)
							+ "\nHighest Score: " + percentFormatter.format(hiScore / 100)
							+ "\nAverage Score: " + percentFormatter.format(avgScore / 100)
							+ "\nTotal Students: " + numScores);

					resultArea.setText(output.toString());

					readFile.close();
					in.close();
				}
				catch (FileNotFoundException err)
				{
					System.out.println("File could not be found!");
					System.err.println("FileNotFoundException: " + err.getMessage());
				}
				catch (IOException err)
				{
					System.out.println("Problem reading file!");
					System.err.println("IOexception: " + err.getMessage());
				}

			}
		});
		analyzebtn.setBounds(214, 337, 128, 40);
		panel.add(analyzebtn);
	}
}
