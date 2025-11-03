package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MyFilePart2GUI
{

	private JFrame frame;
	private static final String FILE_PATH = "C:\\Users\\38128011\\git\\CS30P2\\Chapter11\\src\\Skillbuilders\\zzz.txt";
	private File textFile;

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
					MyFilePart2GUI window = new MyFilePart2GUI();
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
	public MyFilePart2GUI()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		textFile = new File(FILE_PATH);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea disp = new JTextArea();
		disp.setEditable(false);
		disp.setBounds(31, 40, 368, 68);
		panel.add(disp);
		
		JButton btn1 = new JButton("Keep file");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (textFile.exists())
				{
					disp.setText("zzz.txt already exists.");
				}
				else
				{
					try
					{
						if (textFile.createNewFile())
						{
							disp.setText("File named zzz.txt has been created");
						}
						else
						{
							disp.setText("The file could NOT be created");
						}
					}
					catch (IOException error)
					{
						System.err.println("IoException: " + error.getMessage());
						disp.setText("IOexception" + error.getMessage());
					}

				}
			}
		});
		btn1.setBounds(81, 162, 100, 35);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Delete file");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (textFile.delete())
				{
					disp.setText("File has been deleted.");
				}
			}
		});
		btn2.setBounds(241, 162, 100, 35);
		panel.add(btn2);
	}
}
