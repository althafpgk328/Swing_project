package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HWConverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;double result,result1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HWConverter window = new HWConverter();
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
	public HWConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(365, 157, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(365, 209, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			private String op;

			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				result=num1/3.371;
				result1=num2/2.215;
				String ans=String.format("%.2f",result);
				String ans1=String.format("%.2f",result1);
			
				label.setText(ans);
				label_1.setText(ans1);
			}
		});
		btnNewButton.setBounds(150, 246, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);
			}
		});
		btnCancel.setBounds(314, 246, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(218, 154, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 203, 123, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setBounds(128, 157, 46, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(128, 206, 46, 14);
		lblWeight.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(lblWeight);
		
		JLabel lblUsMeasurement = new JLabel("US Measurement");
		lblUsMeasurement.setBounds(218, 117, 123, 26);
		lblUsMeasurement.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(lblUsMeasurement);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(365, 123, 46, 14);
		lblMetric.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(72, 79, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(128, 79, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(365, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
