package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MetricConversion {

	private JFrame frmMetricConversion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
					window.frmMetricConversion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMetricConversion = new JFrame();
		frmMetricConversion.setTitle("Metric Conversion");
		frmMetricConversion.setBounds(100, 100, 400, 260);
		frmMetricConversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmMetricConversion.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel ConversionLbl = new JLabel("Select a Conversion Type:");
		ConversionLbl.setBounds(50, 44, 150, 14);
		panel.add(ConversionLbl);
		
		JLabel formulaDisp = new JLabel("Conversion will show here");
		formulaDisp.setFont(new Font("Tahoma", Font.BOLD, 14));
		formulaDisp.setBounds(50, 135, 201, 57);
		panel.add(formulaDisp);
		
		JComboBox ConversionBox = new JComboBox();
		ConversionBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (ConversionBox.getSelectedItem().equals("Inches to Centimeters"))
				{
					formulaDisp.setText("1 inch = 2.54 centimeters");
				}
				else if (ConversionBox.getSelectedItem().equals("Feet to Meters"))
				{
					formulaDisp.setText("1 foot = 0.3048 meters");
				}
				else if (ConversionBox.getSelectedItem().equals("Gallons to Liters"))
				{
					formulaDisp.setText("1 gallon = 4.5461 liters");
				}
				else if (ConversionBox.getSelectedItem().equals("Pounds to Kilograms"))
				{
					formulaDisp.setText("1 pound = 0.4536 kilograms");
				}
				else
				{
					formulaDisp.setText("Conversion will show here");
				}
			}
		});
		
		ConversionBox.setModel(new DefaultComboBoxModel(new String[] {"(Select a type)", "Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
		ConversionBox.setBounds(50, 63, 201, 22);
		panel.add(ConversionBox);
	}
}
