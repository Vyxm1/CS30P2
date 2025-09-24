package SkillBuilders;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;

public class Demo314 {

	private JFrame frame;
	private JTextField ln;
	private JTextField fn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo314 window = new Demo314();
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
	public Demo314() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		ImageIcon hs = new ImageIcon("../Chapter10/src/SkillBuilders/highschool.jpg");
		ImageIcon chhs = new ImageIcon("../Chapter10/src/SkillBuilders/chhslogo.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		ln = new JTextField();
		ln.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e)
			{
				if (ln.getText().equals("LastName"))
				{
					ln.setText(null);
				}
			}
		});
		ln.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if (ln.getText().equals("LastName"))
				{
					ln.setText(null);
				}
			}
		});
		ln.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				if (ln.getText().equals("LastName"))
				{
					ln.setText(null);
				}
			}
		});
		ln.setHorizontalAlignment(SwingConstants.CENTER);
		ln.setText("LastName");
		ln.setForeground(new Color(192, 192, 192));
		ln.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ln.setBounds(244, 28, 142, 70);
		panel.add(ln);
		ln.setColumns(10);
		
		fn = new JTextField();
		fn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				if (fn.getText().equals("FirstName"))
				{
					fn.setText(null);
				}
			}
		});
		fn.setForeground(new Color(192, 192, 192));
		fn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		fn.setHorizontalAlignment(SwingConstants.CENTER);
		fn.setText("FirstName");
		fn.setColumns(10);
		fn.setBounds(58, 28, 142, 70);
		panel.add(fn);
		
		JComboBox gradeBox = new JComboBox();
		gradeBox.setForeground(new Color(192, 192, 192));
		gradeBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gradeBox.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "10", "11", "12"}));
		gradeBox.setBounds(58, 119, 135, 44);
		panel.add(gradeBox);
		
		JComboBox schoolBox = new JComboBox();
		schoolBox.setForeground(new Color(192, 192, 192));
		schoolBox.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Crescent Heights", "Lester B. Pearson", "James Fowler", "Western Canada"}));
		schoolBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		schoolBox.setBounds(244, 119, 142, 44);
		panel.add(schoolBox);
		
		JTextArea disp = new JTextArea();
		disp.setBackground(Color.LIGHT_GRAY);
		disp.setBounds(58, 176, 328, 94);
		panel.add(disp);
		
		
		JLabel imgA = new JLabel("");
		imgA.setBounds(58, 307, 328, 233);
		panel.add(imgA);
		
		JButton submitbtn = new JButton("SUBMIT");
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String firstName = fn.getText();
				String lastName = ln.getText();
				String grade;
				String school;
				
				if (gradeBox.getSelectedItem().equals("12"))
				{
					grade = "12";
				}
				else if (gradeBox.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "10";
				}
				
				if (schoolBox.getSelectedItem().equals("Crescent Heights"))
				{
					school = "Crescent Heights";
					imgA.setIcon(chhs);
				}
				else if (schoolBox.getSelectedItem().equals("Lester B. Pearson"))
				{
					school = "Lester B. Pearson";
					imgA.setIcon(hs);
				}
				else if (schoolBox.getSelectedItem().equals("James Fowler"))
				{
					school = "James Fowler";
				}
				else
				{
					school = "Western Canada";
				}
				
				
				disp.setText(firstName + " " + lastName + " is in grade " + grade
						+ "\nThey attend " + schoolBox.getSelectedItem());
			}
		});
		submitbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		submitbtn.setBounds(461, 28, 113, 313);
		panel.add(submitbtn);
		
		

	}
}
