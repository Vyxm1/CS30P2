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
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;

public class StatsPart2GUI
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
					StatsPart2GUI window = new StatsPart2GUI();
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
	public StatsPart2GUI()
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

		JLabel titlelbl = new JLabel("Student Test Scores");
		titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
		titlelbl.setBounds(175, 20, 186, 23);
		panel.add(titlelbl);
		
		JTextArea inputFileName = new JTextArea();
		inputFileName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (inputFileName.getText().equals("Enter File Name to be created:"))
				{
					inputFileName.setText("");
					inputFileName.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (inputFileName.getText().isEmpty())
				{
					inputFileName.setText("Enter File Name to be created:");
					inputFileName.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		inputFileName.setFont(new Font("Arial", Font.PLAIN, 13));
		inputFileName.setText("Enter File Name to be created:");
		inputFileName.setBorder(new LineBorder(new Color(0, 0, 0)));
		inputFileName.setBackground(new Color(240, 240, 240));
		inputFileName.setBounds(23, 54, 252, 22);
		inputFileName.setForeground(Color.GRAY);
		panel.add(inputFileName);

		
		JTextArea inputNumGrades = new JTextArea();
		inputNumGrades.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (inputNumGrades.getText().equals("Enter number of student grades:"))
				{
					inputNumGrades.setText("");
					inputNumGrades.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (inputNumGrades.getText().isEmpty())
				{
					inputNumGrades.setText("Enter number of student grades:");
					inputNumGrades.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		inputNumGrades.setText("Enter number of student grades:");
		inputNumGrades.setFont(new Font("Arial", Font.PLAIN, 13));
		inputNumGrades.setBorder(new LineBorder(new Color(0, 0, 0)));
		inputNumGrades.setBackground(UIManager.getColor("Button.background"));
		inputNumGrades.setBounds(23, 87, 252, 22);
		inputNumGrades.setForeground(Color.GRAY);
		panel.add(inputNumGrades);
		
		
		JTextArea inputGrades = new JTextArea();
		inputGrades.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (inputGrades.getText().equals("Enter Grades Here:"))
				{
					inputGrades.setText("");
					inputGrades.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (inputGrades.getText().isEmpty())
				{
					inputGrades.setText("Enter Grades Here:");
					inputGrades.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		inputGrades.setFont(new Font("Arial", Font.PLAIN, 13));
		inputGrades.setText("Enter Grades Here:");
		inputGrades.setBorder(new LineBorder(new Color(0, 0, 0)));
		inputGrades.setColumns(40);
		inputGrades.setRows(15);
		inputGrades.setBackground(new Color(240, 240, 240));
		inputGrades.setBounds(23, 118, 252, 208);
		inputGrades.setForeground(Color.GRAY);
		panel.add(inputGrades);

		JTextArea resultArea = new JTextArea();
		resultArea.setFont(new Font("Arial", Font.PLAIN, 13));
		resultArea.setRows(15);
		resultArea.setColumns(40);
		resultArea.setEditable(false);
		resultArea.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		resultArea.setBackground(new Color(240, 240, 240));
		resultArea.setBounds(285, 54, 257, 272);
		panel.add(resultArea);

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
						score = readFile.readLine();
						numScores++;

						scoreValue = Double.parseDouble(score);
						output.append(stuName + " " + percentFormatter.format(scoreValue / 100) + "\n");
						totalScore += scoreValue;

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
