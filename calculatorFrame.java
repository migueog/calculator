import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculatorFrame extends JFrame implements ActionListener {
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
	public double tempResult = 0;
	public String completeTextArea[];

	boolean flag = false;
	boolean plusFlag = false;
	boolean minusFlag = false;
	boolean multiplyFlag = false;
	boolean divideFlag = false;
	boolean decimalFlag = false;
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
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		decimal = new JButton(".");
		equals = new JButton("=");

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
		clearAll = new JButton("Clear All");
		clearLast = new JButton("Clear Last");
		clearAll.addActionListener(this);
		clearLast.addActionListener(this);
		clearButtonPanel = new JPanel(new GridLayout(1,2));
		clearButtonPanel.add(clearLast);
		clearButtonPanel.add(clearAll);
		content.add(clearButtonPanel,BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e) {

		//One button
		if(e.getSource() == one) {
			if (flag == false) {
				System.out.println(firstNumString);
				firstNumString += "1";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true) {
				secondNumString += "1";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Two button
		else if(e.getSource() == two) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "2";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "2";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Three button
		else if(e.getSource() == three) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "3";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "3";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Four button
		else if(e.getSource() == four) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "4";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "4";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Five Button
		else if(e.getSource() == five) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "5";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "5";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Six button
		else if(e.getSource() == six) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "6";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "6";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Seven button
		else if(e.getSource() == seven) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "7";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "7";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Eight button
		else if(e.getSource() == eight) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "8";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "8";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Nine button
		else if(e.getSource() == nine) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "9";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			}else if(flag == true) {
				secondNumString += "9";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//Zero button
		else if(e.getSource() == zero) {
			if(flag == false) {
				System.out.println(firstNumString);
				firstNumString += "0";
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true) {
				secondNumString += "0";
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			}
		}

		//DECIMAL
		else if(e.getSource() == decimal) {
			if(flag == false && decimalFlag == false) {
				System.out.println("Decimal");
				firstNumString += ".";
				decimalFlag = true;
				System.out.println(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else if(flag == true && decimalFlag == false) {
				secondNumString += ".";
				decimalFlag = true;
				duplicateOperatorFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand());
			} else {
				textArea.setText(textArea.getText() + "\n" +"Error. A decimal point has already been used." + "\n");
			}
		}

		//ADDITION
		else if(e.getSource() == plus) {
			System.out.println("FirstNum=" + firstNumString + "\n" + "SecondNum=" + secondNumString);

			if(duplicateOperatorFlag == true) {
				textArea.setText(textArea.getText() + "\n" + "Operator + has been ignored" + "\n");
			} else if(flag ==  true && duplicateOperatorFlag == false && plusFlag == true) {
				System.out.println("derp");
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum += secondNum;
				secondNumString = "";
				textArea.setText(textArea.getText() + "+" + "\n");
			} else if(flag == true && minusFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum -= secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				minusFlag = false;
				plusFlag = true;
				textArea.setText(textArea.getText() + "+" + "\n");
			} else if(flag == true && multiplyFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum *= secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				multiplyFlag = false;
				plusFlag = true;
				textArea.setText(textArea.getText() + "+" + "\n");
			} else if(flag == true && divideFlag == true) {
				if(Double.parseDouble(secondNumString) == 0) {
					textArea.setText(textArea.getText() + "\n" + "Cannot divide by Zero. Please perform a new calculation" + "\n");
				} else {
					firstNum = Double.parseDouble(firstNumString);
					secondNum = Double.parseDouble(secondNumString);
					firstNum /= secondNum;
					firstNumString = String.valueOf(firstNum);
					secondNumString = "";
					System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

					divideFlag = false;
					plusFlag = true;
					textArea.setText(textArea.getText() + "+" + "\n");
				}
			}
			else {
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				plusFlag = true;
				decimalFlag = false;
				duplicateOperatorFlag = true;
			}
		}

		//SUBTRACTION
		else if(e.getSource() == minus) {
			if(duplicateOperatorFlag == true) {
				textArea.setText(textArea.getText() + "\n" + "Operator - has been ignored" + "\n");
			} else if(flag ==  true && duplicateOperatorFlag == false && minusFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum -= secondNum;

				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);
				textArea.setText(textArea.getText() + "-" + "\n");
			} else if(flag == true && plusFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum += secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				plusFlag = false;
				minusFlag = true;
				textArea.setText(textArea.getText() + "-" + "\n");
			} else if(flag == true && multiplyFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum *= secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				multiplyFlag = false;
				minusFlag = true;
				textArea.setText(textArea.getText() + "-" + "\n");
			} else if(flag == true && divideFlag == true) {
				if(Double.parseDouble(secondNumString) == 0) {
					textArea.setText(textArea.getText() + "\n" + "Cannot divide by Zero. Please perform a new calculation" + "\n");
				} else {
					firstNum = Double.parseDouble(firstNumString);
					secondNum = Double.parseDouble(secondNumString);
					firstNum /= secondNum;
					firstNumString = String.valueOf(firstNum);
					secondNumString = "";
					System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

					divideFlag = false;
					minusFlag = true;
					textArea.setText(textArea.getText() + "-" + "\n");
				}
			}
			else {
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				minusFlag = true;
				decimalFlag = false;
				duplicateOperatorFlag = true;
			}
		}

		//MULTIPLICATION
		else if(e.getSource() == multiply) {
			System.out.println("FirstNum=" + firstNumString + "\n" + "SecondNum=" + secondNumString);

			if(duplicateOperatorFlag == true) {
				textArea.setText(textArea.getText() + "\n" + "Operator * has been ignored" + "\n");
			} else if(flag ==  true && duplicateOperatorFlag == false && multiplyFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum *= secondNum;
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				textArea.setText(textArea.getText() + "*" + "\n");
			} else if(flag == true && minusFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum -= secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				minusFlag = false;
				multiplyFlag = true;
				textArea.setText(textArea.getText() + "*" + "\n");
			} else if(flag == true && plusFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum += secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				plusFlag = false;
				multiplyFlag = true;
				textArea.setText(textArea.getText() + "*" + "\n");
			} else if(flag == true && divideFlag == true) {
				if(Double.parseDouble(secondNumString) == 0){
					textArea.setText(textArea.getText() + "\n" + "Cannot divide by Zero. Please perform a new calculation" + "\n");
				} else {
					firstNum = Double.parseDouble(firstNumString);
					secondNum = Double.parseDouble(secondNumString);
					firstNum /= secondNum;
					firstNumString = String.valueOf(firstNum);
					secondNumString = "";
					System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

					divideFlag = false;
					multiplyFlag = true;
					textArea.setText(textArea.getText() + "*" + "\n");
				}
			}
			else {
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				multiplyFlag = true;
				decimalFlag = flag;
				duplicateOperatorFlag = true;
			}
		}

		//DIVISION
		else if(e.getSource() == divide) {
			System.out.println("FirstNum=" + firstNumString + "\n" + "SecondNum=" + secondNumString);
			if(duplicateOperatorFlag == true) {
				textArea.setText(textArea.getText() + "\n" + "Operator / has been ignored" + "\n");
			}
			else if(flag ==  true && duplicateOperatorFlag == false && divideFlag == true) {
				if(Double.parseDouble(secondNumString) == 0) {
					textArea.setText(textArea.getText() + "\n" + "Cannot divide by Zero. Please perform a new calculation" + "\n");
				} else {
					firstNum = Double.parseDouble(firstNumString);
					secondNum = Double.parseDouble(secondNumString);
					firstNum /= secondNum;
					secondNumString = "";
					System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

					textArea.setText(textArea.getText() + "/" + "\n");
				}
			} else if(flag == true && minusFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum -= secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				minusFlag = false;
				divideFlag = true;
				textArea.setText(textArea.getText() + "/" + "\n");
			} else if(flag == true && multiplyFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum *= secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				multiplyFlag = false;
				divideFlag = true;
				textArea.setText(textArea.getText() + "/" + "\n");
			} else if(flag == true && plusFlag == true) {
				firstNum = Double.parseDouble(firstNumString);
				secondNum = Double.parseDouble(secondNumString);
				firstNum += secondNum;
				firstNumString = String.valueOf(firstNum);
				secondNumString = "";
				System.out.println("FirstNum=" + firstNum + "\n" + "SecondNum=" + secondNum);

				plusFlag = false;
				divideFlag = true;
				textArea.setText(textArea.getText() + "/" + "\n");
			}
			else {
				firstNum = Double.parseDouble(firstNumString);
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n");
				flag = true;
				divideFlag = true;
				decimalFlag = false;
				duplicateOperatorFlag = true;
			}
		}

		//EQUALS
		else if(e.getSource() == equals) {
			System.out.println("FirstNum=" + firstNumString + "\n" + "SecondNum=" + secondNumString);
			if(plusFlag == true) {
				secondNum = Double.parseDouble(secondNumString);
				result = firstNum + secondNum;
				plusFlag = false;
				decimalFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
			}
			else if(minusFlag == true) {
				secondNum = Double.parseDouble(secondNumString);
				result = firstNum - secondNum;
				minusFlag = false;
				decimalFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
			}
			else if(multiplyFlag == true) {
				secondNum = Double.parseDouble(secondNumString);
				result = firstNum * secondNum;
				multiplyFlag = false;
				decimalFlag = false;
				textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
			}
			else if (divideFlag == true) {
				if(Double.parseDouble(secondNumString) == 0) {
					textArea.setText(textArea.getText() + "\n" + "Cannot divide by Zero. Please perform a new calculation" + "\n");
				} else {
					secondNum = Double.parseDouble(secondNumString);
					result = firstNum / secondNum;
					divideFlag = false;
					decimalFlag = false;
					textArea.setText(textArea.getText() + e.getActionCommand() + "\n" + result + "\n");
				}
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
			decimalFlag = false;
		}

		//Clear All
		else if(e.getSource() == clearAll) {
			firstNumString = "";
			secondNumString = "";
			firstNum = 0;
			secondNum = 0;
			flag = false;
			plusFlag = false;
			minusFlag = false;
			divideFlag = false;
			multiplyFlag = false;
			decimalFlag = false;
			duplicateOperatorFlag = false;
			textArea.setText("");
		}

		//Clear Last
		else if(e.getSource() == clearLast) {
			String textAreaLength = textArea.getText();
			String lastChar = textArea.getText().substring(textArea.getText().length() - 1);
			//System.out.println(lastChar);
			System.out.println("Flag is = " + flag);
			if (flag == false) {
				if (lastChar.equals("+")) {
					plusFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				} else if(lastChar.equals("-")) {
					minusFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				} else if(lastChar.equals("/")) {
					divideFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				} else if(lastChar.equals("*")) {
					multiplyFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				}
				else {
					firstNumString = firstNumString.substring(0, firstNumString.length() - 1);
					//System.out.println(firstNumString);
					//System.out.println(lastChar);
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				}
			} else if(flag == true) {
				if(secondNumString.length() > 0) {
					secondNumString = secondNumString.substring(0, secondNumString.length() - 1);
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				} else if (lastChar.equals("+")) {
					plusFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				} else if(lastChar.equals("-")) {
					minusFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				} else if(lastChar.equals("/")) {
					divideFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				} else if(lastChar.equals("*")) {
					multiplyFlag = false;
					duplicateOperatorFlag = false;
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				}
				else {
					flag = false;
					firstNumString = firstNumString.replace("\n", "");
					textArea.setText(textAreaLength.substring(0, textAreaLength.length() - 1));
				}
			}
		}
	}
}
