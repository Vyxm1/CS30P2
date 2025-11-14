package Skillbuilders;

import java.awt.EventQueue;

import java.io.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;

public class StatsPart2GUI
{

	private JFrame frame;
	private File dataFile;
	StudentData inputDialog = new StudentData();


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
		panel.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel titlelbl = new JLabel("Student Test Scores");
		titlelbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		titlelbl.setForeground(new Color(255, 255, 255));
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

		JTextArea resultArea = new JTextArea();
		resultArea.setFont(new Font("Arial", Font.PLAIN, 13));
		resultArea.setRows(15);
		resultArea.setColumns(40);
		resultArea.setEditable(false);
		resultArea.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		resultArea.setBackground(new Color(240, 240, 240));
		resultArea.setBounds(285, 54, 257, 272);
		panel.add(resultArea);

		JButton createBtn = new JButton("Create Data File");
		createBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String fileName = inputFileName.getText().trim();
				String numGradeText = inputNumGrades.getText().trim();
				
				if (fileName.isEmpty() || fileName.equals("EnterFileNametobecreated:") || numGradeText.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please Enter both file name and number of students. ",
							"Input Error", JOptionPane.WARNING_MESSAGE);
				}
				
				try
				{
					int numStu = Integer.parseInt(numGradeText);
					
					StringBuilder studentData = new StringBuilder();
					
					dataFile = new File(fileName);
					FileWriter out = new FileWriter(dataFile);
					BufferedWriter writeFile = new BufferedWriter(out);
					
					for (int i = 0; i < numStu; i++)
					{
						int result = JOptionPane.showConfirmDialog(null, inputDialog,
								"Enter Data for Student " + (i + 1), JOptionPane.OK_CANCEL_OPTION);
						if (result != JOptionPane.OK_OPTION)
						{
							break;
						}
						
						String stuName = inputDialog.getStudentName().getText().trim();
						String stuGrade = inputDialog.getStudentGrade().getText().trim();
						
						if (stuName.isEmpty() || stuGrade.isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Please Enter both name and Score",
									"Input Error", JOptionPane.WARNING_MESSAGE);
							
							i--;
							continue;
						}
						try
						{
							Double.parseDouble(stuGrade);
						}
						catch (NumberFormatException err)
						{
							JOptionPane.showMessageDialog(null, "Please Enter valid number for the score " + (i + 1),
									"Input Error", JOptionPane.WARNING_MESSAGE);
							
							i--;
							continue;
						}
						studentData.append(stuName).append(": ").append(stuGrade).append("\n");
						
						
						writeFile.write(stuName);
						writeFile.newLine();
						writeFile.write(stuGrade);
						writeFile.newLine();
						
					}
					
					writeFile.close();
					out.close();
					
					resultArea.setText("Data written to file: " + fileName + "\n");
					resultArea.append("STUDENTS ENTERED: \n\n");
					resultArea.append(studentData.toString());
					resultArea.append("\nFile Created successfully");
				}
				catch (IOException err)
				{
					JOptionPane.showMessageDialog(null, "File could not be created\n" + err.getMessage(),
							"File Error", JOptionPane.ERROR_MESSAGE);
				}
				catch (NumberFormatException err)
				{
					JOptionPane.showMessageDialog(null, "Please Enter valid number for the students ",
							"Input Error", JOptionPane.ERROR_MESSAGE);
				}
				
				

			}
		});
		createBtn.setBounds(80, 155, 128, 40);
		panel.add(createBtn);
	}
}
