//Build a basic calculator using Java SwingUI framework

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorGUI {
 private JFrame frame;
 private JTextField num1Field;
 private JTextField num2Field;
 private JButton addButton;
 private JLabel resultLabel;
 public CalculatorGUI(){
 frame = new JFrame("Calculator");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLO
SE);
 frame.setSize(300, 200);
 frame.setLayout(new GridLayout(4, 2));
 num1Field = new JTextField();
 num2Field = new JTextField();
 addButton = new JButton("Add");
 addButton.addActionListener(new
AddButtonListener());
 resultLabel = new JLabel("Result: ");
 frame.add(new JLabel("First Number: "));
 frame.add(num1Field);
 frame.add(new JLabel("Second Number: "));
 frame.add(num2Field);
 frame.add(addButton);
frame.add(resultLabel);
 frame.setVisible(true);
 }
 private class AddButtonListener implements
ActionListener {
 @Override
 public void actionPerformed(ActionEvent
e) {
 double num1 =
Double.parseDouble(num1Field.getText());
 double num2 =
Double.parseDouble(num2Field.getText());
 double sum = num1 + num2;
 resultLabel.setText("Result: " +
sum);
 }
 }
 public static void main(String[] args) {
 new CalculatorGUI();
 }
}
