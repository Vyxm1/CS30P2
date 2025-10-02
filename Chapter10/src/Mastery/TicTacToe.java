package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe
{

	private JFrame frmTictactoe;

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
					TicTacToe window = new TicTacToe();
					window.frmTictactoe.setVisible(true);
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
	public TicTacToe()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmTictactoe = new JFrame();
		frmTictactoe.setTitle("TicTacToeGUI");
		frmTictactoe.setBounds(100, 100, 450, 300);
		frmTictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmTictactoe.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel disp = new JLabel("It is X's turn!");
		disp.setBounds(32, 224, 208, 26);
		panel.add(disp);
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		btn1.setBounds(32, 11, 125, 60);
		panel.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setBounds(165, 11, 125, 60);
		panel.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setBounds(295, 11, 125, 60);
		panel.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setBounds(32, 82, 125, 60);
		panel.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setBounds(165, 82, 125, 60);
		panel.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setBounds(295, 82, 125, 60);
		panel.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setBounds(32, 153, 125, 60);
		panel.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setBounds(165, 153, 125, 60);
		panel.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setBounds(295, 153, 125, 60);
		panel.add(btn9);
		
	}
}
