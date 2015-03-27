import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class calculatorFrame extends JFrame implements ActionListener {

	/* TO DO
	 * 
	 * - Chained operations
	 * - Error handling for
	 * 		- Successive operators
	 * 		- Division by 0
	 * 		- Multiply decimal points
	 * - Add decimal button functionality
	 * - Clear Last button
	 */
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	private JPanel buttonPanel, clearButtonPanel;
	private JButton clearLast, clearAll;
	private JButton one, two, three, four, five, six,
					seven, eight, nine, zero, decimal, 
					plus, minus, multiply, divide, equals;
	private JTextArea textArea;
	public double firstNum = 0;
	public String firstNumString = "";
	public double secondNum = 0;
	public String secondNumString = "";
	public double result = 0;
	
	//BOOLEANS
	boolean flag = false;
	boolean plusFlag = false;
	boolean minusFlag = false;
	boolean multiplyFlag = false;
	boolean divideFlag = false;
	boolean duplicateOperatorFlag = false;
	
	public calculatorFrame() {
		init();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	public void init() {
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		textArea = new JTextArea();
		content.add(textArea, BorderLayout.CENTER);
		buttonPanel = new JPanel (new GridLayout(4,4));
		
		//Create new JButtons
		one = new JButton ("1");
		two = new JButton ("2");
		three = new JButton ("3");
		four = new JButton ("4");
		five = new JButton ("5");
		six = new JButton ("6");
		seven = new JButton ("7");
		eight = new JButton ("8");
		nine = new JButton ("9");
		zero = new JButton ("0");
		plus = new JButton ("+");
		minus = new JButton ("-");
		multiply = new JButton ("*");
		divide = new JButton ("/");
		decimal = new JButton (".");
		equals = new JButton ("=");
		
		//Listeners for buttons
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		decimal.addActionListener(this);
		equals.addActionListener(this);
		
		//Adding buttons to buttonPanel
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(nine);
		buttonPanel.add(plus);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(six);
		buttonPanel.add(minus);
		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(three);
		buttonPanel.add(multiply);
		buttonPanel.add(zero);
		buttonPanel.add(decimal);
		buttonPanel.add(equals);
		buttonPanel.add(divide);
		content.add(buttonPanel, BorderLayout.SOUTH);
		
		//Adding Clear buttons
		clearAll = new JButton ("Clear All");
		clearLast = new JButton ("Clear Last");
		clearAll.addActionListener(this);
		clearLast.addActionListener(this);
		clearButtonPanel = new JPanel(new GridLayout(1,2));
		clearButtonPanel.add(clearLast);
		clearButtonPanel.add(clearAll);
		content.add(clearButtonPanel,BorderLayout.NORTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//One button
		if(e.getSource() == one){
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "1";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "1";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Two button
		else if(e.getSource() == two){
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "2";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "2";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		} 
		
		//Three button
		else if(e.getSource() == three){
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "3";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "3";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Four button
		else if(e.getSource() == four) {
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "4";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "4";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Five Button
		else if(e.getSource() == five) {
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "5";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "5";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Six button
		else if (e.getSource() == six) {
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "6";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "6";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Seven button
		else if (e.getSource() == seven) {
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "7";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "7";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Eight button
		else if (e.getSource() == eight) {
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "8";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "8";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Nine button
		else if (e.getSource() == nine) {
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "9";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "9";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//Zero button
		else if (e.getSource() == zero){
			if (flag == false){
				System.out.println(firstNumString);
				firstNumString += "0";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true){
				secondNumString += "0";
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}
		
		//ADDITION
		else if (e.getSource() == plus){
			if(duplicateOperatorFlag == true){
				textArea.setText(textArea.getText() + "\n" + "Operator + has been ignored" + "\n");
			}else{
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				plusFlag = true;
				duplicateOperatorFlag = true;
			}
		}
		
		//SUBTRACTION
		else if(e.getSource() == minus){
			if(duplicateOperatorFlag == true){
				textArea.setText(textArea.getText() + "\n" + "Operator - has been ignored" + "\n");
			}else{
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				minusFlag = true;
				duplicateOperatorFlag = true;
			}
		}
		
		//MULTIPLICATION
		else if(e.getSource() == multiply){
			if(duplicateOperatorFlag == true){
				textArea.setText(textArea.getText() + "\n" + "Operator * has been ignored" + "\n");
			}else{
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				minusFlag = true;
				duplicateOperatorFlag = true;
			}
		}
		
		//DIVISION
		else if(e.getSource() == divide){
			if(duplicateOperatorFlag == true){
				textArea.setText(textArea.getText() + "\n" + "Operator / has been ignored" + "\n");
			}else{
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				divideFlag = true;
				duplicateOperatorFlag = true;
			}
		}
		
		//EQUALS
		else if(e.getSource() == equals){
			if (plusFlag == true) {
				secondNum = Double.parseDouble(secondNumString);
				result = firstNum + secondNum;
				plusFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
			}
			
			else if (minusFlag == true) {
				secondNum = Double.parseDouble(secondNumString);
				result = firstNum - secondNum;
				minusFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
			}
			
			else if (multiplyFlag == true) {
				secondNum = Double.parseDouble(secondNumString);
				result = firstNum * secondNum;
				multiplyFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
			}
			
			else if (divideFlag == true) {
				secondNum = Double.parseDouble(secondNumString);
				result = firstNum / secondNum;
				divideFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
			}
			
			firstNumString = "";
			secondNumString = "";
			firstNum = 0;
			secondNum = 0;
			flag = false;
			plusFlag = false;
			minusFlag = false;
			divideFlag = false;
			multiplyFlag = false;
			duplicateOperatorFlag = false;
		}
		
		//Clear All
		else if(e.getSource() == clearAll){
			firstNumString = "";
			secondNumString = "";
			firstNum = 0;
			secondNum = 0;
			flag = false;
			plusFlag = false;
			minusFlag = false;
			divideFlag = false;
			multiplyFlag = false;
			duplicateOperatorFlag = false;
			textArea.setText("");
		}
	}
}

