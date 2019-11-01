package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bmiconverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmiconverter window = new Bmiconverter();
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
	public Bmiconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(112, 11, 294, 93);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(110, 115, 296, 224);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height(m)");
		lblHeight.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblHeight.setBounds(38, 64, 74, 14);
		panel_1.add(lblHeight);
		
		JLabel lblWeightkg = new JLabel("Weight(kg)");
		lblWeightkg.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblWeightkg.setBounds(40, 103, 72, 14);
		panel_1.add(lblWeightkg);
		
		textField = new JTextField();
		textField.setBounds(165, 61, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(165, 100, 86, 20);
		panel_1.add(textField_1);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBmi.setBounds(56, 140, 46, 14);
		panel_1.add(lblBmi);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			private double num1;
			private double num2;

			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				double res =(num1/num2/num2)*1000;
				
			}
		});
		btnNewButton.setBounds(10, 168, 102, 23);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setBounds(152, 168, 62, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(224, 168, 62, 23);
		panel_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(112, 350, 296, 166);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton1 = new JButton(new ImageIcon("C://Users/FACE-1/Downloads/bmi chart.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(90, 56, 89, 23);
		panel_2.add(btnNewButton_1);
	}
}
