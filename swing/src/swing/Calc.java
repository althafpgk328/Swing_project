package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;

public class Calc {

	
	private JFrame frame;
	private JTextField textField;
    double num1,num2,result;
    String op,ans;
    double INDIA=100.00;
    double CANADA=200.00;
    double UAE=300.00;
    double IRAN=350.00;
    double IRAQ=150.00;
    double JAPAN=200.00;
    
    private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("file");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 342, 493);
				textField.setBounds(0,0,325,40);
				
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 636, 496);textField.setBounds(0,0,600,40);
				
				
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUni = new JMenuItem("Unitconversion");
		mntmUni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 958, 493);
				
			}
		});
		mnFile.add(mntmUni);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",
						JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 11, 548, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("<-");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(10, 64, 49, 55);
		frame.getContentPane().add(button);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b="";
			if(textField.getText().length()>0) {
				StringBuilder strB=new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				strB.toString();
				textField.setText(b);
			
				
		
			}
			}
		});
		btnCe.setBounds(69, 66, 55, 55);
		frame.getContentPane().add(btnCe);
		
		JButton button_2 = new JButton("C");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		button_2.setBounds(134, 66, 55, 55);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("+/-");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBounds(199, 66, 49, 55);
		frame.getContentPane().add(button_3);
		
		JButton btnSq = new JButton("Sq");
		btnSq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sqrt(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnSq.setBounds(258, 66, 55, 55);
		frame.getContentPane().add(btnSq);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				double res=Math.log(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
				
			}
		});
		btnL.setBounds(354, 66, 49, 55);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSin.setBounds(413, 66, 62, 55);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sinh(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnSinh.setBounds(485, 66, 57, 55);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMod.setBounds(552, 66, 57, 55);
		frame.getContentPane().add(btnMod);
		
		JButton button_9 = new JButton("7");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number6=textField.getText()+ button_9.getText();
				textField.setText(Number6);
			}
		});
		button_9.setBounds(22, 129, 49, 55);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("8");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number7=textField.getText()+ button_10.getText();
				textField.setText(Number7);
			}
		});
		button_10.setBounds(81, 132, 55, 44);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number8=textField.getText()+ button_11.getText();
				textField.setText(Number8);
			}
		});
		button_11.setBounds(146, 134, 55, 55);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			op="/";
			}
		});
		button_12.setBounds(205, 132, 49, 55);
		frame.getContentPane().add(button_12);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				result=(1/num1);
				textField.setText(String.valueOf(result));
				
			}
		});
		btnx.setBounds(264, 129, 49, 55);
		frame.getContentPane().add(btnx);
		
		JButton btnPi = new JButton("pi");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=(num1*3.14);
				textField.setText(String.valueOf(num1));
			}
		});
		btnPi.setBounds(344, 129, 59, 55);
		frame.getContentPane().add(btnPi);
		
		JButton btnCosh = new JButton("Cos");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.cos(num1);
	                textField.setText(String.valueOf(num1));
				
			}
		});
		btnCosh.setBounds(413, 129, 62, 55);
		frame.getContentPane().add(btnCosh);
		
		JButton btnCosh_1 = new JButton("Cosh");
		btnCosh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.cosh(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnCosh_1.setBounds(485, 129, 57, 55);
		frame.getContentPane().add(btnCosh_1);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				double res=Math.log((num1)/10);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnLnx.setBounds(552, 129, 57, 55);
		frame.getContentPane().add(btnLnx);
		
		JButton button_18 = new JButton("4");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number3=textField.getText()+ button_18.getText();
				textField.setText(Number3);
			}
		});
		button_18.setBounds(22, 198, 49, 55);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("5");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number4=textField.getText()+ button_19.getText();
				textField.setText(Number4);
			}
		});
		button_19.setBounds(81, 198, 55, 55);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("6");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number5=textField.getText()+ button_20.getText();
				textField.setText(Number5);
			}
		});
		button_20.setBounds(146, 200, 55, 55);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("*");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
			textField.setText("");
		op="*";
				
			}
		});
		button_21.setBounds(205, 198, 49, 55);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("%");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_22.setBounds(260, 195, 49, 55);
		frame.getContentPane().add(button_22);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.pow(num1,num2);
				textField.setText(String.valueOf(num1));
			}
		});
		btnXy.setBounds(344, 195, 59, 55);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.tan(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(413, 195, 62, 55);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.tanh(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnTanh.setBounds(485, 195, 57, 55);
		frame.getContentPane().add(btnTanh);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnC.setBounds(552, 198, 57, 55);
		frame.getContentPane().add(btnC);
		
		JButton button_27 = new JButton("1");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+ button_27.getText();
				textField.setText(Number);
			}
		});
		button_27.setBounds(22, 264, 49, 55);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("2");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number1=textField.getText()+ button_28.getText();
				textField.setText(Number1);
			}
		});
		button_28.setBounds(81, 264, 55, 55);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("3");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number2=textField.getText()+ button_29.getText();
				textField.setText(Number2);
			}
		});
		button_29.setBounds(144, 264, 57, 55);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("-");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			op="-";
			}
		});
		button_30.setBounds(205, 264, 49, 55);
		frame.getContentPane().add(button_30);
		
		JButton btnX_1 = new JButton("X^2");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.pow(num1,2);
				textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(344, 264, 59, 55);
		frame.getContentPane().add(btnX_1);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField.getText());
				result=((num1/num2)*100);
				textField.setText(String.valueOf(result));
				
			}
		});
		btnCbr.setBounds(413, 264, 62, 55);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRund.setBounds(485, 264, 57, 55);
		frame.getContentPane().add(btnRund);
		
		JButton btnpie = new JButton("2*pi");
		btnpie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					num1=Double.parseDouble(textField.getText());
					num1=(2*(num1*3.14));
					textField.setText(String.valueOf(num1));
			}
		});
		btnpie.setBounds(552, 264, 57, 55);
		frame.getContentPane().add(btnpie);
		
		JButton button_31 = new JButton("=");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				num2=Double.parseDouble(textField.getText());
				if(op=="-") {
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				num2=Double.parseDouble(textField.getText());
				if(op=="*") {
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				num2=Double.parseDouble(textField.getText());
				if(op=="/") {
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				num2=Double.parseDouble(textField.getText());
				if(op=="%") {
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				
				
				
				}
		});
		button_31.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_31.setBounds(260, 264, 49, 122);
		frame.getContentPane().add(button_31);
		
		JButton button_36 = new JButton("0");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number9=textField.getText()+ button_36.getText();
				textField.setText(Number9);
			}
		});
		button_36.setBounds(22, 331, 98, 55);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton(".");
		button_37.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_37.setBounds(146, 330, 55, 55);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("+");
		button_38.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			op="+";
			}
			
		});
		button_38.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_38.setBounds(205, 331, 49, 55);
		frame.getContentPane().add(button_38);
		
		JButton btnX = new JButton("X^3");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.pow(num1,3);
				textField.setText(String.valueOf(num1));
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(344, 330, 59, 55);
		frame.getContentPane().add(btnX);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnBin.setBounds(413, 330, 62, 55);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnHex.setBounds(485, 330, 57, 55);
		frame.getContentPane().add(btnHex);
		
		JButton btnOc = new JButton("Oc");
		btnOc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnOc.setBounds(552, 330, 57, 55);
		frame.getContentPane().add(btnOc);
		
		JPanel panel = new JPanel();
		panel.setBounds(635, 66, 269, 264);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(21, 11, 238, 39);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INDIA", "CANADA", "UAE", "IRAN", "IRAQ", "JAPAN"}));
		comboBox.setBounds(44, 61, 131, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(44, 92, 131, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(44, 151, 131, 20);
		panel.add(label);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			//private AbstractButton con;

			public void actionPerformed(ActionEvent arg0) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("INDIA"));
				{
					String c=String.format("Rs%.2f",bp*INDIA);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("CANADA"));
				{
					String c=String.format("Rs%.2f",bp*CANADA);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("UAE"));
				{
					String c=String.format("Rs%.2f",bp*UAE);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("IRAN"));
				{
					String c=String.format("Rs%.2f",bp*IRAN);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("IRAQ"));
				{
					String c=String.format("Rs%.2f",bp*IRAQ);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("JAPAN"));
				{
					String c=String.format("Rs%.2f",bp*JAPAN);
					label.setText(c);
				}
				
			}
		});
		btnConvert.setBounds(21, 202, 85, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				label.setText("");
			}
		});
		btnClear.setBounds(139, 202, 85, 23);
		panel.add(btnClear);
	}
}
