package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SemesterAvg {

	private JFrame frmSemesterAverageCalculator;
	private JTextField firstTextField;
	private JTextField secondTextField;
	private JTextField thirdTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		DecimalFormat df = new DecimalFormat("0.#");
		frmSemesterAverageCalculator = new JFrame();
		frmSemesterAverageCalculator.setTitle("Semester Average Calculator");
		frmSemesterAverageCalculator.setBounds(100, 100, 640, 480);
		frmSemesterAverageCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmSemesterAverageCalculator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel firstGradeLabel = new JLabel("Enter the first grade:");
		firstGradeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		firstGradeLabel.setBounds(60, 60, 220, 25);
		panel.add(firstGradeLabel);
		
		JLabel secondGradeLabel = new JLabel("Enter the second grade:");
		secondGradeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		secondGradeLabel.setBounds(60, 120, 249, 25);
		panel.add(secondGradeLabel);
		
		JLabel thirdGradeLabel = new JLabel("Enter the third grade:");
		thirdGradeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		thirdGradeLabel.setBounds(60, 180, 232, 25);
		panel.add(thirdGradeLabel);
		
		firstTextField = new JTextField();
		firstTextField.setForeground(new Color(0, 0, 0));
		firstTextField.setText("Type here");
		firstTextField.setBounds(356, 64, 220, 25);
		panel.add(firstTextField);
		firstTextField.setColumns(10);
		
		secondTextField = new JTextField();
		secondTextField.setForeground(new Color(0, 0, 0));
		secondTextField.setText("Type here");
		secondTextField.setColumns(10);
		secondTextField.setBounds(356, 126, 220, 25);
		panel.add(secondTextField);
		
		thirdTextField = new JTextField();
		thirdTextField.setText("Type here");
		thirdTextField.setColumns(10);
		thirdTextField.setBounds(356, 186, 220, 25);
		panel.add(thirdTextField);
		
		JTextArea disp = new JTextArea();
		disp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		disp.setText("Press \"Average\" button to calculate");
		disp.setBackground(new Color(240, 240, 240));
		disp.setBounds(276, 334, 222, 22);
		panel.add(disp);
		
		JButton btnAvg = new JButton("Average");
		btnAvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				double AvgGrade = ((Double.parseDouble(firstTextField.getText())) + (Double.parseDouble(secondTextField.getText())) + (Double.parseDouble(thirdTextField.getText()))) / 3;
				
				disp.setText((df.format(AvgGrade)));
			}
		});
		btnAvg.setFont(new Font("Verdana", Font.BOLD, 20));
		btnAvg.setBounds(81, 311, 157, 57);
		panel.add(btnAvg);
		

	}
	
}
