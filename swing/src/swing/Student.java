package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Student {

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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
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
	public Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1217, 887);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(26, 46, 538, 454);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblStudentid.setBounds(25, 40, 108, 36);
		panel.add(lblStudentid);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFirstname.setBounds(25, 82, 108, 36);
		panel.add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSurname.setBounds(25, 114, 108, 36);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCourseCode.setBounds(25, 149, 108, 36);
		panel.add(lblCourseCode);
		
		textField = new JTextField();
		textField.setBounds(139, 46, 108, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 87, 108, 27);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 123, 108, 27);
		panel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"me203", "me205", "me206", "me207", "me208"}));
		comboBox.setBounds(139, 158, 104, 20);
		panel.add(comboBox);
		
		JLabel lblCourseCode_1 = new JLabel("Total Score");
		lblCourseCode_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCourseCode_1.setBounds(25, 248, 108, 36);
		panel.add(lblCourseCode_1);
		
		JLabel lblAverage = new JLabel("Average\r\n");
		lblAverage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAverage.setBounds(25, 291, 108, 36);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking\r\n");
		lblRanking.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRanking.setBounds(25, 327, 108, 36);
		panel.add(lblRanking);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 257, 108, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(139, 300, 108, 27);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(139, 336, 108, 27);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	               if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }  
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(407, 46, 108, 27);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
			}}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(407, 88, 108, 27);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(407, 136, 108, 27);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(407, 188, 108, 27);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(407, 233, 108, 27);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(407, 284, 108, 27);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(407, 333, 108, 27);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
	                }
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(407, 377, 108, 27);
		panel.add(textField_13);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMaths.setBounds(289, 40, 108, 36);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnglish.setBounds(289, 82, 108, 36);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBiology.setBounds(289, 129, 108, 36);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblComputer.setBounds(289, 179, 108, 36);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblChemistry.setBounds(289, 226, 108, 36);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPhysics.setBounds(289, 275, 108, 36);
		panel.add(lblPhysics);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTamil.setBounds(289, 324, 108, 36);
		panel.add(lblTamil);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMalayalam.setBounds(289, 371, 108, 36);
		panel.add(lblMalayalam);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(138, 43, 226));
		panel_1.setBounds(614, 38, 564, 462);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(178, 34, 34));
		panel_4.setBounds(10, 11, 544, 418);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(24, 22, 498, 385);
		panel_4.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnClear.setForeground(new Color(128, 0, 128));
		btnClear.setBackground(new Color(138, 43, 226));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClear.setBounds(237, 428, 89, 23);
		panel_1.add(btnClear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(221, 160, 221));
		panel_2.setBounds(26, 511, 1165, 166);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"student_ID","Coursename", "Maths","English", "Biology", "Computer","Chemistry", "Physics", "Tamil", "Malayalam","Total Score", "Average","Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 1145, 64);
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 717, 1165, 109);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
					textField.getText(),
					(String)comboBox.getSelectedItem(),
					textField_6.getText(),
					textField_7.getText(),
					textField_8.getText(),
					textField_9.getText(),
					textField_10.getText(),
					textField_11.getText(),
					textField_12.getText(),
					textField_13.getText(),
					textField_3.getText(),
					textField_4.getText(),
					textField_5.getText(),
				});
				double a[]=new double[20];
				a[0]=Double.parseDouble(textField_6.getText());
				a[1]=Double.parseDouble(textField_7.getText());
				a[2]=Double.parseDouble(textField_8.getText());
				a[3]=Double.parseDouble(textField_9.getText());
				a[4]=Double.parseDouble(textField_10.getText());
				a[5]=Double.parseDouble(textField_11.getText());
				a[6]=Double.parseDouble(textField_12.getText());
				a[7]=Double.parseDouble(textField_13.getText());
				a[8]=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7])/8;
				a[9]=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]);
				String avg=String.format("%.2f", a[8]);
				textField_4.setText(avg);
				String total=String.format("%.2f", a[9]);
				textField_3.setText(total);
				if(a[9]>700 ) {
					textField_5.setText("1");
				}
				if(a[9]>600 && a[9]<700) {
					textField_5.setText("2");
				}
				if(a[9]>500 && a[9]<600) {
					textField_5.setText("3");}
				}
				
		});
			
		
		btnAddReport.setBounds(233, 32, 89, 23);
		panel_3.add(btnAddReport);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int i=table.getSelectedRow();
				if(i >=0) {
					model.removeRow(i);
				}
			}
		});
		btnDelete.setBounds(399, 32, 89, 23);
		panel_3.add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student record\n"
						+"Student name:\t\t"+textField.getText()+" "+textField_2.getText()
						+"\n============================================================"
						+"\nMaths:\t\t"+textField_6.getText()
						+"\nEnglish:\t\t"+textField_7.getText()
						+"\nBiology:\t\t"+textField_8.getText()
						+"\nComputer:\t\t"+textField_9.getText()
						+"\nChemistry:\t\t"+textField_10.getText()
						+"\nPhysics:\t\t"+textField_11.getText()
						+"\nTamil:\t\t"+textField_12.getText()
						+"\nMalayalam:\t\t"+textField_13.getText()
						+"\n============================================================"
						+"\nTotal Score:\t\t"+textField_3.getText()
						+"\nAverage:\t\t"+textField_4.getText()
						+"\nRanking:\t\t"+textField_5.getText()
						
						);
			}
		});
		btnShowReport.setBounds(528, 32, 112, 23);
		panel_3.add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",
						JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(731, 32, 89, 23);
		panel_3.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				

			}
		});
		btnReset.setBounds(906, 32, 89, 23);
		panel_3.add(btnReset);
	}
}
