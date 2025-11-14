package Skillbuilders;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.SwingConstants;

public class StudentData extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTextField studentName;
	private JTextField studentGrade;

	/**
	 * Create the panel.
	 */
	public StudentData()
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{480, 0};
		gridBagLayout.rowHeights = new int[]{64, 64, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		studentName = new JTextField();
		studentName.setText("Enter Student Name");
		studentName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (studentName.getText().equals("Enter Student Name"))
				{
					studentName.setText("");
					studentName.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (studentName.getText().isEmpty())
				{
					studentName.setText("Enter Student Name");
					studentName.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		studentName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_studentName = new GridBagConstraints();
		gbc_studentName.fill = GridBagConstraints.BOTH;
		gbc_studentName.insets = new Insets(0, 0, 5, 0);
		gbc_studentName.gridx = 0;
		gbc_studentName.gridy = 0;
		add(studentName, gbc_studentName);
		studentName.setColumns(10);
		
		studentGrade = new JTextField();
		studentGrade.setText("Enter Student Grade");
		studentGrade.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e)
			{
				if (studentGrade.getText().equals("Enter Student Grade"))
				{
					studentGrade.setText("");
					studentGrade.setForeground(Color.BLACK); // Restore default text color
				}
			}
			public void focusLost(FocusEvent e)
			{
				if (studentGrade.getText().isEmpty())
				{
					studentGrade.setText("Enter Student Grade");
					studentGrade.setForeground(Color.GRAY); // Set placeholder color
				}
			}
		});
		studentGrade.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_studentGrade = new GridBagConstraints();
		gbc_studentGrade.fill = GridBagConstraints.BOTH;
		gbc_studentGrade.gridx = 0;
		gbc_studentGrade.gridy = 1;
		add(studentGrade, gbc_studentGrade);
		studentGrade.setColumns(10);

	}

	public JTextField getStudentName() {
		return studentName;
	}
	public JTextField getStudentGrade() {
		return studentGrade;
	}
}
