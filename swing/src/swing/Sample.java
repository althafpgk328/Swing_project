package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Sample {

	private JFrame frame;
	private JTextField txtUserId;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("login page");
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setFont(new Font("Serif", Font.BOLD, 14));
		frame.setBounds(100, 100, 686, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(new ImageIcon("C://Users/FACE-1/Downloads/sponge.jpg"));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("AngsanaUPC", Font.BOLD, 22));
		btnNewButton.setBounds(201, 31, 213, 180);
		frame.getContentPane().add(btnNewButton);
		
		txtUserId = new JTextField();
		txtUserId.setText("user id");
		txtUserId.setBounds(167, 234, 86, 20);
		frame.getContentPane().add(txtUserId);
		txtUserId.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("password");
		txtPassword.setBounds(167, 285, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblLogin = new JLabel("login ");
		lblLogin.setFont(new Font("Rockwell Condensed", Font.BOLD, 40));
		lblLogin.setForeground(Color.YELLOW);
		lblLogin.setBounds(36, 119, 111, 48);
		frame.getContentPane().add(lblLogin);
		
		JButton btnSignIn = new JButton("sign in");
		btnSignIn.setForeground(Color.RED);
		btnSignIn.setBounds(71, 415, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignUp = new JButton("sign up");
		btnSignUp.setFont(new Font("Footlight MT Light", Font.BOLD | Font.ITALIC, 11));
		btnSignUp.setBounds(209, 416, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		JLabel lblNewLabel = new JLabel("User Id");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(48, 237, 56, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(48, 287, 99, 14);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxForgotPassword = new JCheckBox("Forgot Password");
		chckbxForgotPassword.setBounds(134, 326, 175, 23);
		frame.getContentPane().add(chckbxForgotPassword);
	}
}
