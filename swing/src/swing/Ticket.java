package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 950, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblTicketBooking.setBounds(238, 27, 325, 51);
		frame.getContentPane().add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(73, 138, 73, 19);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(128, 135, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(73, 218, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBounds(184, 218, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(295, 218, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBounds(73, 244, 85, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(160, 244, 47, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(209, 244, 73, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(284, 244, 109, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"KERALA", "TAMILNADU", "KARNATAKA"}));
		comboBox.setBounds(34, 318, 95, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"KERALA", "TAMILNADU", "KARNATAKA"}));
		comboBox_1.setBounds(145, 318, 95, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox_2.setBounds(250, 318, 64, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTax.setBounds(65, 370, 64, 19);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubtotal.setBounds(65, 402, 71, 14);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotal.setBounds(65, 427, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 370, 106, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 400, 106, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(134, 431, 106, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				String from=(String) comboBox.getSelectedItem();
				textField_1.setText(from);
				String from1=(String) comboBox_1.getSelectedItem();
				textField_2.setText(from1);
				   Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_7.setText(tTime.format(timer.getTime()));
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_8.setText(tdate.format(timer.getTime()));
	                int num;
	                String s="";
	                num=1234;
	                s=s+num+1234;
	                textField_7.setText(s);
	                textField_10.setText("Any");
	                double t=0,tx=0;
	                String m="",tax="";
	                double su=Double.parseDouble((String)comboBox_2.getSelectedItem());
	             //   if(rdbtnSingleTicket)
	                
	                
	                
	                
				
			}
		});
		btnTotal.setBounds(40, 498, 73, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnReset.setBounds(128, 498, 73, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(209, 498, 73, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(384, 138, 480, 348);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName_1.setBounds(37, 38, 78, 31);
		panel.add(lblName_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(32, 115, 59, 15);
		panel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(33, 152, 46, 14);
		panel.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(33, 192, 46, 14);
		panel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(32, 228, 46, 14);
		panel.add(lblTime);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 45, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 113, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(120, 150, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(120, 192, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(120, 226, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(318, 110, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(318, 163, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(318, 226, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTicketNo.setBounds(318, 85, 86, 14);
		panel.add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrice.setBounds(317, 141, 87, 14);
		panel.add(lblPrice);
		
		JLabel lblRoot = new JLabel("Root");
		lblRoot.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRoot.setBounds(318, 201, 46, 14);
		panel.add(lblRoot);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
					textField.getText(),
					(String)comboBox.getSelectedItem(),
					textField_4.getText(),
					textField_5.getText(),
					textField_6.getText(),
					textField_7.getText(),
					textField_8.getText(),
					textField_9.getText(),
					textField_10.getText(),
					textField_11.getText(),
					
				});
				
				
				
			}
		});
		btnConfirm.setBounds(208, 284, 89, 23);
		panel.add(btnConfirm);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 168, 326, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 478, 338, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 292, 328, 2);
		frame.getContentPane().add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 540, 841, 91);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name","Booking No","From","To","No of Seats","Time","Date","AC/non AC","Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(28, 25, 803, 40);
		panel_1.add(table);
	}
}
