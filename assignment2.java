import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class calculatorFrame extends JFrame {
	
	//WINDOW SIZE
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	// Variables
	private JTextArea textArea;
	private JPanel clearButtonPanel;
	String firstNumString = "";
	String secondNumString = "";
	String lastCalc = "";
	double firstNum = 0;
	double secondNum = 0;
	double result = 0;
	String display = "";
	String lastDisplay = "";
	
	Boolean flag = false;
	Boolean decimalFlag = false;
	Boolean plusFlag = false;
	Boolean minusFlag = false;
	Boolean divideFlag = false;
	Boolean multiplyFlag = false;
	Boolean equalsFlag = false;
	Boolean operatorFlag = false;
	
	// Buttons
	private JPanel buttonPanel;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	private JButton zeroButton;
	private JButton plusButton;
	private JButton minusButton;
	private JButton multiplyButton;
	private JButton divideButton;
	private JButton decimalButton;
	private JButton equalsButton;
	
	//Clear buttons
	private JButton clearLastButton;
	private JButton clearAllButton;
	
	// Create calculator frame
	public calculatorFrame() {
		createTextArea();
		createButton();
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	//Create text area
	public void createTextArea() {
		final int FIELD_WIDTH = 5;
		textArea = new JTextArea(FIELD_WIDTH, 10);
		JScrollPane scrollPane = new JScrollPane(textArea); //Enable text area to be scrollable
		textArea.setText("");
		textArea.setEditable(false); //Prevents user from typing in the text area
	}
	
	//Create all the buttons
	public void createButton() {
		oneButton = new JButton ("1");
		twoButton = new JButton ("2");
		threeButton = new JButton ("3");
		fourButton = new JButton ("4");
		fiveButton = new JButton ("5");
		sixButton = new JButton ("6");
		sevenButton = new JButton ("7");
		eightButton = new JButton ("8");
		nineButton = new JButton ("9");
		zeroButton = new JButton ("0");
		plusButton = new JButton ("+");
		minusButton = new JButton ("-");
		multiplyButton = new JButton ("*");
		divideButton = new JButton ("/");
		decimalButton = new JButton (".");
		equalsButton = new JButton ("=");
		
		clearLastButton = new JButton("Clear Last");
		clearAllButton = new JButton("Clear All");
		
		//Listener for first button
		class oneListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
					if (flag == false){
						textArea.setText(display + "1");
						display = textArea.getText();
						firstNumString = "";
						firstNumString += "1";
					} else if (flag == true) {
						secondNumString = "";
						secondNumString += "1";
						textArea.setText(display + "1");
						display = textArea.getText();
					}
			}
		}
		//Listener for button 2
		class twoListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				if (flag == false){
					textArea.setText(display + "2");
					display = textArea.getText();
					firstNumString += "2";
				}
				else if (flag == true) {
					secondNumString += "2";
				}
			}
		}
		//Listener for button 3
		class threeListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "3");
				display = textArea.getText();
				firstNumString += "3";
				
				
				if (flag == true) {
					secondNumString = secondNumString + "3";
				}
			}
		}
		//Listener for button 4
		class fourListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "4");
				display = textArea.getText();
				firstNumString += "4";
				
				if (flag == true) {
					secondNumString = secondNumString + "4";
				}
			}
		}
		//Listener for button 5
		class fiveListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "5");
				display = textArea.getText();
				firstNumString += "5";
				
				if (flag == true) {
					secondNumString = secondNumString + "5";
				}
			}
		}
		//Listener for button 6
		class sixListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "6");
				display = textArea.getText();
				firstNumString += "6";

				if (flag == true) {
					secondNumString = secondNumString + "6";
				}
			}
		}
		class sevenListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "7");
				display = textArea.getText();
				firstNumString += "7";
				
				if (flag == true) {
					secondNumString = secondNumString + "7";
				}
			}
		}
		class eightListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "8");
				display = textArea.getText();
				firstNumString += "8";
				
				if (flag == true) {
					secondNumString = secondNumString + "8";
				}
			}
		}
		class nineListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "9");
				display = textArea.getText();
				firstNumString += "9";
				
				if (flag == true) {
					secondNumString = secondNumString + "9";
				}
			}
		}
		class zeroListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(display + "0");
				display = textArea.getText();
				firstNumString += "0";
				
				if(flag == true) {
					secondNumString = secondNumString + "0";
				}
			}
		}
		class decimalListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				if (decimalFlag == false) {
					textArea.setText(display + ".");
					display = textArea.getText();
					firstNumString += ".";
					decimalFlag = true;
					
					if(flag == true) {
						secondNumString = secondNumString + ".";
						decimalFlag = true;
					}
				} else{
					JOptionPane.showMessageDialog(null,"Only one decimal allowed");
				}
			}
		}
		class plusListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				
				//Check to see if equals button has been pressed.
				//If so, do the following.
				if (equalsFlag == true) {
					firstNum = result;
					textArea.setText(display + "+" + "\n");
					display = textArea.getText();
					
					plusFlag = true;
					flag = true;
					decimalFlag = false;
				} 
				//If plusFlag is false then...
					else if (plusFlag == false){
					firstNum = Double.parseDouble(firstNumString);
					textArea.setText(display + "+" + "\n");
					display = textArea.getText();
					
					plusFlag = true;
					flag = true;
					decimalFlag = false;
					operatorFlag = true;
				} else if(operatorFlag == true && plusFlag == true){
					firstNum = Double.parseDouble(firstNumString);
					secondNum = Double.parseDouble(secondNumString);
					
					result = firstNum + secondNum;

					textArea.setText(display + "+" + "\n" + result + "+" + "\n");
					display = textArea.getText();

					System.out.println(firstNumString + "-" + secondNumString);
					System.out.println(firstNum);
					System.out.println(result);
					
					//chained operations not working
					
				} else{
					textArea.setText(display + "Operator + has been ignored" + "\n");
					display = textArea.getText();
				}
				
				
				
			}
		}
		class minusListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				
				if (equalsFlag == true) {
					firstNum = result;
					textArea.setText(display + "-" + "\n");
					display = textArea.getText();
					
					minusFlag = true;
					flag = true;
					decimalFlag = false;
				} else if (minusFlag == false){
					firstNum = Double.parseDouble(firstNumString);
					textArea.setText(display + "-" + "\n");
					display = textArea.getText();
					
					minusFlag = true;
					flag = true;
					decimalFlag = false;
				} else {
					textArea.setText(display + "Operator - has been ignored" + "\n");
					display = textArea.getText();
				}
			}
		}
		class multiplyListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				
				if (equalsFlag == true) {
					firstNum = result;
					textArea.setText(display + "*" + "\n");
					display = textArea.getText();
					
					multiplyFlag = true;
					flag = true;
					decimalFlag = false;
				} else if (multiplyFlag == false){
					firstNum = Double.parseDouble(firstNumString);
					textArea.setText(display + "*" + "\n");
					display = textArea.getText();
					
					multiplyFlag = true;
					flag = true;
					decimalFlag = false;
				} else {
					textArea.setText(display + "Operator * has been ignored" + "\n");
					display = textArea.getText();
				}
			}
		}
		class divideListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				
				if (equalsFlag == true) {
					firstNum = result;
					textArea.setText(display + "/" + "\n");
					display = textArea.getText();
					
					divideFlag = true;
					flag = true;
					decimalFlag = false;
				} else if (divideFlag == false) {
					firstNum = Double.parseDouble(firstNumString);
					textArea.setText(display + "/" + "\n");
					display = textArea.getText();
					
					divideFlag = true;
					flag = true;
					decimalFlag = false;
				} else if(Double.parseDouble(secondNumString) == 0){
					System.out.println("divide by zero");
				} else {
					textArea.setText(display + "Operator / has been ignored" + "\n");
					display = textArea.getText();
				}
			}
		}
		class equalListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				if (equalsFlag == false){
					secondNum = Double.parseDouble(secondNumString);
	
					if (plusFlag == true){
						result = firstNum + secondNum;
						textArea.setText(display + "=" + "\n" + result);
						display = textArea.getText();
					} else if( minusFlag == true) {
						result = firstNum - secondNum;
						textArea.setText(display + "=" + "\n" + result);
						display = textArea.getText();
					} else if (multiplyFlag == true) {
						result = firstNum * secondNum;
						textArea.setText(display + "=" + "\n" + result);
						display = textArea.getText();
					} else if (divideFlag == true) {
						if(Double.parseDouble(secondNumString) == 0){
							System.out.println("Divide by zero");
						}else{
							result = firstNum / secondNum;
							textArea.setText(display + "=" + "\n" + result);
							display = textArea.getText();
						}
					}
					System.out.println(firstNum + "" + secondNum);
					firstNumString = "";
					secondNumString = "";
					flag = false;
					plusFlag = false;
					minusFlag = false;
					multiplyFlag = false;
					divideFlag = false;
					decimalFlag = false;
					equalsFlag = true;
				} else if (equalsFlag == true){
					secondNum = Double.parseDouble(secondNumString);
					
					if (plusFlag == true){
						result = firstNum + secondNum;
						textArea.setText(display + "=" + "\n" + result);
						display = textArea.getText();
					} else if( minusFlag == true) {
						result = firstNum - secondNum;
						textArea.setText(display + "=" + "\n" + result);
						display = textArea.getText();
					} else if (multiplyFlag == true) {
						result = firstNum * secondNum;
						textArea.setText(display + "=" + "\n" + result);
						display = textArea.getText();
					} else if (divideFlag == true) {
						result = firstNum / secondNum;
						textArea.setText(display + "=" + "\n" + result);
						display = textArea.getText();
					}
					firstNumString = "";
					secondNumString = "";
					flag = false;
					plusFlag = false;
					minusFlag = false;
					multiplyFlag = false;
					divideFlag = false;
					decimalFlag = false;
					equalsFlag = true;
				}
				
			}
		}
		
		class clearAllListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText("");
				display = textArea.getText();
				firstNumString = "";
				secondNumString = "";
				firstNum = 0;
				secondNum = 0;
				flag = false;
				equalsFlag = false;
				System.out.println(firstNum + " " + secondNum + "" + firstNumString + "" + secondNumString);
			}
		}
		class clearLastListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				textArea.setText(lastDisplay);
			}
		}
		
		ActionListener oneListener = new oneListener();
		ActionListener twoListener = new twoListener();
		ActionListener threeListener = new threeListener();
		ActionListener fourListener = new fourListener();
		ActionListener fiveListener = new fiveListener();
		ActionListener sixListener = new sixListener();
		ActionListener sevenListener = new sevenListener();
		ActionListener eightListener = new eightListener();
		ActionListener nineListener = new nineListener();
		ActionListener zeroListener = new zeroListener();
		ActionListener plusListener = new plusListener();
		ActionListener minusListener = new minusListener();
		ActionListener divideListener = new divideListener();
		ActionListener multiplyListener = new multiplyListener();
		ActionListener clearAllListener = new clearAllListener();
		ActionListener decimalListener = new decimalListener();
		ActionListener equalListener = new equalListener();
		ActionListener clearLastListener = new clearLastListener();
		
		oneButton.addActionListener(oneListener);
		twoButton.addActionListener(twoListener);
		threeButton.addActionListener(threeListener);
		fourButton.addActionListener(fourListener);
		fiveButton.addActionListener(fiveListener);
		sixButton.addActionListener(sixListener);
		sevenButton.addActionListener(sevenListener);
		eightButton.addActionListener(eightListener);
		nineButton.addActionListener(nineListener);
		zeroButton.addActionListener(zeroListener);
		plusButton.addActionListener(plusListener);
		minusButton.addActionListener(minusListener);
		divideButton.addActionListener(divideListener);
		multiplyButton.addActionListener(multiplyListener);
		clearAllButton.addActionListener(clearAllListener);
		decimalButton.addActionListener(decimalListener);
		equalsButton.addActionListener(equalListener);
		clearLastButton.addActionListener(clearLastListener);
		
	}
	
	public void createPanel() {
		
		JPanel buttonPanelContainer = new JPanel();
		buttonPanelContainer.setLayout(new BorderLayout());
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4));
		
		clearButtonPanel = new JPanel();
		clearButtonPanel.setLayout(new GridLayout(1,2));
	
		buttonPanel.add(sevenButton);
		buttonPanel.add(eightButton);
		buttonPanel.add(nineButton);
		buttonPanel.add(plusButton);
		buttonPanel.add(fourButton);
		buttonPanel.add(fiveButton);
		buttonPanel.add(sixButton);
		buttonPanel.add(minusButton);
		buttonPanel.add(oneButton);
		buttonPanel.add(twoButton);
		buttonPanel.add(threeButton);
		buttonPanel.add(multiplyButton);
		buttonPanel.add(zeroButton);
		buttonPanel.add(decimalButton);
		buttonPanel.add(equalsButton);
		buttonPanel.add(divideButton);
		
		clearButtonPanel.add(clearLastButton);
		clearButtonPanel.add(clearAllButton);
		
		buttonPanelContainer.add(clearButtonPanel, BorderLayout.NORTH);
		buttonPanelContainer.add(textArea, BorderLayout.CENTER);
		buttonPanelContainer.add(buttonPanel, BorderLayout.SOUTH);
		
		add(buttonPanelContainer);
	}
}
