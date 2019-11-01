package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class calculatorr {

private JFrame frame;
private JTextField textField;
double num1;
double num2;double result;
String op;
String ans;


public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
calculator window = new calculator();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
 * @return 
 * @wbp.parser.entryPoint
*/
public void Calculatorr() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(Color.GRAY);
frame.getContentPane().setForeground(Color.RED);
frame.setBounds(100, 100, 470, 500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

textField = new JTextField();
textField.setBounds(62, 46, 265, 39);
frame.getContentPane().add(textField);
textField.setColumns(10);

JButton btnNewButton = new JButton("1");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField.getText()+btnNewButton.getText();
textField.setText(Number);
}
});
btnNewButton.setFont(new Font("Century", Font.BOLD, 14));
btnNewButton.setForeground(Color.BLUE);
btnNewButton.setBounds(63, 129, 64, 36);
frame.getContentPane().add(btnNewButton);

JButton button = new JButton("2");
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number1=textField.getText()+button.getText();
textField.setText(Number1);
}
});
button.setFont(new Font("Century", Font.BOLD, 14));
button.setForeground(Color.BLUE);
button.setBounds(137, 129, 57, 36);
frame.getContentPane().add(button);

JButton button_1 = new JButton("3");
button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number2=textField.getText()+button_1.getText();
textField.setText(Number2);
}
});
button_1.setFont(new Font("Century", Font.BOLD, 14));
button_1.setForeground(Color.BLUE);
button_1.setBounds(204, 129, 61, 36);
frame.getContentPane().add(button_1);

JButton button_2 = new JButton("+");
button_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField.getText());
textField.setText("");	
op="+";
}
});
button_2.setFont(new Font("Century", Font.BOLD, 14));
button_2.setForeground(Color.BLUE);
button_2.setBounds(275, 129, 52, 36);
frame.getContentPane().add(button_2);

JButton button_3 = new JButton("4");
button_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number2=textField.getText()+button_3.getText();
textField.setText(Number2);
}
});
button_3.setFont(new Font("Century", Font.BOLD, 14));
button_3.setForeground(Color.BLUE);
button_3.setBounds(62, 175, 64, 39);
frame.getContentPane().add(button_3);

JButton button_4 = new JButton("5");
button_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number4=textField.getText()+button_4.getText();
textField.setText(Number4);

}
});
button_4.setFont(new Font("Century", Font.BOLD, 14));
button_4.setForeground(Color.BLUE);
button_4.setBounds(137, 175, 57, 39);
frame.getContentPane().add(button_4);

JButton button_5 = new JButton("6");
button_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number5=textField.getText()+button_5.getText();
textField.setText(Number5);
}
});
button_5.setFont(new Font("Century", Font.BOLD, 14));
button_5.setForeground(Color.BLUE);
button_5.setBounds(204, 175, 61, 39);
frame.getContentPane().add(button_5);

JButton button_6 = new JButton("    -");
button_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField.getText());
textField.setText("");	
op="-";
}
});
button_6.setFont(new Font("Century", Font.BOLD, 14));
button_6.setForeground(Color.BLUE);
button_6.setBounds(275, 176, 52, 39);
frame.getContentPane().add(button_6);

JButton button_7 = new JButton("7");
button_7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number6=textField.getText()+button_7.getText();
textField.setText(Number6);
}
});
button_7.setFont(new Font("Century", Font.BOLD, 14));
button_7.setForeground(Color.BLUE);
button_7.setBounds(62, 225, 64, 39);
frame.getContentPane().add(button_7);

JButton button_8 = new JButton("8");
button_8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number7=textField.getText()+button_8.getText();
textField.setText(Number7);
}
});
button_8.setFont(new Font("Century", Font.BOLD, 14));
button_8.setForeground(Color.BLUE);
button_8.setBounds(137, 225, 57, 39);
frame.getContentPane().add(button_8);

JButton button_9 = new JButton("9");
button_9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number8=textField.getText()+button_9.getText();
textField.setText(Number8);
}
});
button_9.setFont(new Font("Century", Font.BOLD, 14));
button_9.setForeground(Color.BLUE);
button_9.setBounds(204, 225, 61, 39);
frame.getContentPane().add(button_9);

JButton button_10 = new JButton("*");
button_10.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField.getText());
textField.setText("");	
op="*";
}
});
button_10.setFont(new Font("Century", Font.BOLD, 14));
button_10.setForeground(Color.BLUE);
button_10.setBounds(275, 226, 52, 39);
frame.getContentPane().add(button_10);

JButton button_11 = new JButton("0");
button_11.setFont(new Font("Century", Font.BOLD, 14));
button_11.setForeground(Color.BLUE);
button_11.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number9=textField.getText()+button_11.getText();
textField.setText(Number9);
}
});
button_11.setBounds(62, 275, 64, 41);
frame.getContentPane().add(button_11);

JButton button_12 = new JButton(".");
button_12.setFont(new Font("Century", Font.BOLD, 14));
button_12.setForeground(Color.BLUE);
button_12.setBounds(137, 275, 57, 41);
frame.getContentPane().add(button_12);

JButton button_13 = new JButton("=");
button_13.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String ans;
num2=Double.parseDouble(textField.getText());
if(op=="+") {
result=num1+num2;
ans=String.format("%.2f",result);
textField.setText(ans);

}

num2=Double.parseDouble(textField.getText());
if(op=="-") {
result=num1-num2;
ans=String.format("%.2f",result);
textField.setText(ans);

}

num2=Double.parseDouble(textField.getText());
if(op=="*") {
result=num1*num2;
ans=String.format("%.2f",result);
textField.setText(ans);

}
num2=Double.parseDouble(textField.getText());
if(op=="/") {
result=num1/num2;
ans=String.format("%.2f",result);
textField.setText(ans);

}
num2=Double.parseDouble(textField.getText());
if(op=="%") {
result=num1%num2;
ans=String.format("%.2f",result);
textField.setText(ans);

}
}
});
button_13.setFont(new Font("Century", Font.BOLD, 14));
button_13.setForeground(Color.BLUE);
button_13.setBounds(204, 275, 61, 39);
frame.getContentPane().add(button_13);

JButton button_14 = new JButton("/");
button_14.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField.getText());
textField.setText("");	
op="/";
}
});
button_14.setFont(new Font("Century", Font.BOLD, 14));
button_14.setForeground(Color.BLUE);
button_14.setBounds(275, 276, 52, 39);
frame.getContentPane().add(button_14);

JButton btnNewButton_1 = new JButton("C");
btnNewButton_1.setFont(new Font("Century", Font.BOLD, 14));
btnNewButton_1.setForeground(Color.BLUE);
btnNewButton_1.setBounds(62, 327, 64, 39);
frame.getContentPane().add(btnNewButton_1);

JButton btnB = new JButton("B");
btnB.setFont(new Font("Century", Font.BOLD, 14));
btnB.setForeground(Color.BLUE);
btnB.setBounds(137, 327, 57, 39);
frame.getContentPane().add(btnB);

JButton button_15 = new JButton("%");
button_15.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField.getText());
textField.setText("");	
op="%";
}
});
button_15.setFont(new Font("Century", Font.BOLD, 14));
button_15.setForeground(Color.BLUE);
button_15.setBounds(204, 325, 61, 36);
frame.getContentPane().add(button_15);
}

}
