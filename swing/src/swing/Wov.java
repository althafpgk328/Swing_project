package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wov {

	private JFrame frame;
	private JTextField textField;
	double num1,num2;
	double res1,res2;
	String ans1,ans2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wov window = new Wov();
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
	public Wov() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegreee = new JLabel("Degreee");
		lblDegreee.setBounds(34, 37, 46, 14);
		frame.getContentPane().add(lblDegreee);
		
		textField = new JTextField();
		textField.setBounds(161, 34, 214, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result=");
		lblResult.setBounds(34, 130, 46, 14);
		frame.getContentPane().add(lblResult);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(129, 130, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnToCelcius = new JButton("To celcius");
		btnToCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
			res1=num1-32*5/9;
			ans1=String.format("%.2f",res1);
			lblNewLabel.setText(ans1);
			}
		});
		btnToCelcius.setBounds(45, 198, 89, 23);
		frame.getContentPane().add(btnToCelcius);
		
		JButton btnToFahrenheit = new JButton("To fahrenheit");
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2=Double.parseDouble(textField.getText());
				res2=(num2*(9/5))+32;
				ans2=String.format("%.2f",res2);
				lblNewLabel.setText(ans2);
				
			}
		});
		btnToFahrenheit.setBounds(226, 198, 89, 23);
		frame.getContentPane().add(btnToFahrenheit);
	}
}
