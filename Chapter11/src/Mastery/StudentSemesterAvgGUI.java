package Mastery;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.border.LineBorder;

public class StudentSemesterAvgGUI {

	private JFrame frmSemesterAverageCalculator;
	private JTextField nameInput;
	private JTextField yearInput;
	private JTextField semNumInput;
	private JTextField grade1Input;
	private JTextField grade2Input;
	private JTextField grade3Input;
	private JTextField grade4Input;
	private static final String FILE_NAME = "Grades.txt";
	private File dataFile = new File(FILE_NAME);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAvgGUI window = new StudentSemesterAvgGUI();
					window.frmSemesterAverageCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentSemesterAvgGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		DecimalFormat decimalFormatter = new DecimalFormat("0.#");


		frmSemesterAverageCalculator = new JFrame();
		frmSemesterAverageCalculator.setTitle("Student Grade Application");
		frmSemesterAverageCalculator.setBounds(100, 100, 640, 480);
		frmSemesterAverageCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frmSemesterAverageCalculator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel nameLbl = new JLabel("Student Name: ");
		nameLbl.setFont(new Font("Verdana", Font.PLAIN, 20));
		nameLbl.setBounds(0, 0, 171, 25);
		panel.add(nameLbl);

		JLabel yearLbl = new JLabel("Grade Level:");
		yearLbl.setFont(new Font("Verdana", Font.PLAIN, 20));
		yearLbl.setBounds(0, 25, 249, 25);
		panel.add(yearLbl);

		JLabel semesterNumLbl = new JLabel("Semester Number:");
		semesterNumLbl.setFont(new Font("Verdana", Font.PLAIN, 20));
		semesterNumLbl.setBounds(0, 50, 232, 25);
		panel.add(semesterNumLbl);

		JLabel gradeLbl = new JLabel("Grade 1:");
		gradeLbl.setFont(new Font("Verdana", Font.PLAIN, 20));
		gradeLbl.setBounds(0, 76, 232, 25);
		panel.add(gradeLbl);

		JLabel gradeLbl_2 = new JLabel("Grade 2:");
		gradeLbl_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		gradeLbl_2.setBounds(0, 102, 232, 25);
		panel.add(gradeLbl_2);

		JLabel gradeLbl_3 = new JLabel("Grade 3:");
		gradeLbl_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		gradeLbl_3.setBounds(0, 127, 232, 25);
		panel.add(gradeLbl_3);

		JLabel gradeLbl_4 = new JLabel("Grade 4:");
		gradeLbl_4.setFont(new Font("Verdana", Font.PLAIN, 20));
		gradeLbl_4.setBounds(0, 154, 232, 25);
		panel.add(gradeLbl_4);

		nameInput = new JTextField();
		nameInput.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (nameInput.getText().equals("Enter Student Name here"))
				{
					nameInput.setText("");
					nameInput.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (nameInput.getText().isEmpty())
				{
					nameInput.setText("Enter Student Name here");
					nameInput.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		nameInput.setForeground(Color.GRAY);
		nameInput.setText("Enter Student Name here");
		nameInput.setBounds(276, 4, 348, 25);
		panel.add(nameInput);
		nameInput.setColumns(10);

		yearInput = new JTextField();
		yearInput.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (yearInput.getText().equals("Enter Student's Grade here"))
				{
					yearInput.setText("");
					yearInput.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (yearInput.getText().isEmpty())
				{
					yearInput.setText("Enter Student's Grade here");
					yearInput.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		yearInput.setForeground(Color.GRAY);
		yearInput.setText("Enter Student's Grade here");
		yearInput.setColumns(10);
		yearInput.setBounds(276, 29, 348, 25);
		panel.add(yearInput);

		semNumInput = new JTextField();
		semNumInput.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (semNumInput.getText().equals("Enter the Semester Number here"))
				{
					semNumInput.setText("");
					semNumInput.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (semNumInput.getText().isEmpty())
				{
					semNumInput.setText("Enter the Semester Number here");
					semNumInput.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		semNumInput.setForeground(Color.GRAY);
		semNumInput.setText("Enter the Semester Number here");
		semNumInput.setColumns(10);
		semNumInput.setBounds(276, 54, 348, 25);
		panel.add(semNumInput);

		grade1Input = new JTextField();
		grade1Input.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (grade1Input.getText().equals("Enter First Grade"))
				{
					grade1Input.setText("");
					grade1Input.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (grade1Input.getText().isEmpty())
				{
					grade1Input.setText("Enter First Grade");
					grade1Input.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		grade1Input.setForeground(Color.GRAY);
		grade1Input.setText("Enter First Grade");
		grade1Input.setColumns(10);
		grade1Input.setBounds(276, 80, 348, 25);
		panel.add(grade1Input);

		grade2Input = new JTextField();
		grade2Input.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (grade2Input.getText().equals("Enter Second Grade"))
				{
					grade2Input.setText("");
					grade2Input.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (grade2Input.getText().isEmpty())
				{
					grade2Input.setText("Enter Second Grade");
					grade2Input.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		grade2Input.setForeground(Color.GRAY);
		grade2Input.setText("Enter Second Grade");
		grade2Input.setColumns(10);
		grade2Input.setBounds(276, 106, 348, 25);
		panel.add(grade2Input);

		grade3Input = new JTextField();
		grade3Input.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (grade3Input.getText().equals("Enter Third Grade"))
				{
					grade3Input.setText("");
					grade3Input.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (grade3Input.getText().isEmpty())
				{
					grade3Input.setText("Enter Third Grade");
					grade3Input.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		grade3Input.setForeground(Color.GRAY);
		grade3Input.setText("Enter Third Grade");
		grade3Input.setColumns(10);
		grade3Input.setBounds(276, 131, 348, 25);
		panel.add(grade3Input);

		grade4Input = new JTextField();
		grade4Input.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (grade4Input.getText().equals("Enter Fourth Grade"))
				{
					grade4Input.setText("");
					grade4Input.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (grade4Input.getText().isEmpty())
				{
					grade4Input.setText("Enter Fourth Grade");
					grade4Input.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		grade4Input.setForeground(Color.GRAY);
		grade4Input.setText("Enter Fourth Grade");
		grade4Input.setColumns(10);
		grade4Input.setBounds(276, 158, 348, 25);
		panel.add(grade4Input);

		JTextArea disp = new JTextArea();
		disp.setEditable(false);
		disp.setBounds(0, 214, 624, 172);
		panel.add(disp);

		JLabel avgLbl = new JLabel("Average:");
		avgLbl.setFont(new Font("Verdana", Font.PLAIN, 20));
		avgLbl.setBounds(0, 184, 98, 25);
		panel.add(avgLbl);

		JLabel avgDisp = new JLabel("");
		avgDisp.setBorder(new LineBorder(new Color(0, 0, 0)));
		avgDisp.setFont(new Font("Verdana", Font.PLAIN, 20));
		avgDisp.setBounds(276, 187, 348, 25);
		panel.add(avgDisp);

		JButton btnSave = new JButton("Save to File");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String studentName = nameInput.getText().trim();
				String gradeLevel = yearInput.getText().trim();
				String semesterNum = semNumInput.getText().trim();
				String numGrade1 = grade1Input.getText().trim();
				String numGrade2 = grade2Input.getText().trim();
				String numGrade3 = grade3Input.getText().trim();
				String numGrade4 = grade4Input.getText().trim();

				if (studentName.isEmpty() || studentName.equals("Enter Student Name here")
						|| gradeLevel.isEmpty() || gradeLevel.equals("Enter Student's Grad here")
						|| semesterNum.isEmpty() || semesterNum.equals("Enter the Semester Number here")
						|| numGrade1.isEmpty() || numGrade1.equals("Enter First Grade")
						|| numGrade2.isEmpty() || numGrade2.equals("Enter Second Grade")
						|| numGrade3.isEmpty() || numGrade3.equals("Enter Third Grade")
						|| numGrade4.isEmpty() || numGrade4.equals("Enter Fourth Grade"))
				{
					JOptionPane.showMessageDialog(null, "1 or More Fields are Empty, Please enter a value",
							"Input Error", JOptionPane.WARNING_MESSAGE);
				}

				double AvgGrade = ((Double.parseDouble(numGrade1)) + (Double.parseDouble(numGrade2)) + (Double.parseDouble(numGrade3)) + (Double.parseDouble(numGrade4))) / 4;
				avgDisp.setText(decimalFormatter.format(AvgGrade) + "%");

				try
				{
					StringBuilder studentData = new StringBuilder();
					FileWriter out = new FileWriter(dataFile);
					BufferedWriter writeFile = new BufferedWriter(out);

					double grade1 = Double.parseDouble(numGrade1);
					double grade2 = Double.parseDouble(numGrade2);
					double grade3 = Double.parseDouble(numGrade3);
					double grade4 = Double.parseDouble(numGrade4);


					studentData.append("Name: ").append(studentName).append("Grade Level: ").append(gradeLevel).append("Semester: ").append(semesterNum);
					studentData.append("Grades: ").append(grade1).append(grade2).append(grade3).append(grade4);


					writeFile.write(studentData.toString());
					writeFile.newLine();



					writeFile.close();
					out.close();

				}
				catch (IOException err)
				{
					JOptionPane.showMessageDialog(null, "File could not be created\n" + err.getMessage(),
							"File Error", JOptionPane.ERROR_MESSAGE);
				}
				catch (NumberFormatException err)
				{
					JOptionPane.showMessageDialog(null, "Please Enter valid numbers for the Grades!",
							"Input Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnSave.setFont(new Font("Verdana", Font.BOLD, 14));
		btnSave.setBounds(120, 397, 189, 33);
		panel.add(btnSave);

		JButton btnViewFileContents = new JButton("View File Contents");
		btnViewFileContents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{


			}
		});
		btnViewFileContents.setFont(new Font("Verdana", Font.BOLD, 14));
		btnViewFileContents.setBounds(323, 397, 189, 33);
		panel.add(btnViewFileContents);

	}
}
