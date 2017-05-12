//Kota Naga Tejaswi LNU
//Professor Kamram Z. Khan
//CS2336
//Sem 1 Project: Calculator

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Component;

public class Main extends JFrame implements ActionListener {
	
	static boolean visibility = true;
	static StringSelection s;
	static boolean isAbout = false;
	//operations
	static double fn, sn;
	static JPanel numOpsPnl;
	static JButton equal;
	static JButton plus;
	static JButton minus;
	static JButton recip;
	static JButton multiply;
	static JButton percent;
	static JButton divide;
	static JButton sqrt;
	static JButton plusMinus;
	static JButton point;
	//numbers
	static JButton zero;
	static JButton one;
	static JButton two;
	static JButton three;
	static JButton four;
	static JButton five;
	static JButton six;
	static JButton seven;
	static JButton eight;
	static JButton nine;
	//blanks buttons
	static JButton blnk1;
	static JButton blnk2;
	static JButton blnk3;
	static JButton blnk4;
	static JButton blnk5;
	//clear and backspace
	static JButton backSpace;
	static JButton clearE;
	static JButton clear;
	
	static JPanel randomPnl;
	//hex
	static JButton f;
	static JButton e;
	static JButton d;
	static JButton c;
	static JButton b;
	static JButton a;
	//blank buttons
	static JButton bl1;
	static JButton bl2;
	static JButton bl3; 	   
	static JButton bl4;
	static JButton bl6;
	static JButton bl5;
	static JButton bl7;
	static JButton bl8;
	static JButton bl9;
	static JButton bl10;
	static JTextField textField;
	static JButton mod;
	static JButton quot;
	//operations
	static boolean add;
	static boolean subtract;
	static boolean multiplied;
	static boolean divided;
	static double result;
	static boolean moded;
	static boolean quoted;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JMenu mnView;
	private JMenu mnEdit;
	private JMenu mnHelp;
	private JMenuItem mnViewItem;
	private JMenuItem mnEditItem;
	private JMenuItem mnHelpItem;
	private JMenuItem mnHelpCalculatorItem;
	private JRadioButton rdbtnDec;
	private JRadioButton rdbtnOct;
	private JRadioButton rdbtnBin;
	private JRadioButton rdbtnQword;
	private JRadioButton rdbtnDword;
	private JRadioButton rdbtnWord;
	private JRadioButton radioButton_6;
	private JRadioButton rdbtnByte;
	static Clipboard cb;
			
	
	public Main() {
		getContentPane().setBackground(new Color(240, 248, 255));
		add = false;
		subtract = false;
		multiplied = false;
		divided = false;
		JPanel bitsPnl = new JPanel();
		bitsPnl.setBackground(new Color(240, 248, 255));
		//operations
		JPanel numOpsPnl = new JPanel();
		numOpsPnl.setBackground(new Color(240, 248, 255));
		equal = new JButton("=");
		equal.addActionListener(this);
		plus = new JButton("+");
		plus.addActionListener(this);
		minus = new JButton("-");
		minus.addActionListener(this);
		recip = new JButton("1/x");
		recip.addActionListener(this);
		multiply = new JButton("*");
		multiply.addActionListener(this);
		percent = new JButton("%");
		percent.addActionListener(this);
		divide = new JButton("/");
		divide.addActionListener(this);
		sqrt = new JButton("\u221A");
		sqrt.addActionListener(this);
		plusMinus = new JButton("\u00B1");
		plusMinus.addActionListener(this);
	    point = new JButton(".");
	    point.addActionListener(this);
		//numbers
		zero = new JButton("0");
		zero.setBackground(new Color(255, 255, 255));
		zero.addActionListener(this);
		one = new JButton("1");
		one.setBackground(new Color(255, 255, 255));
		one.addActionListener(this);
		two = new JButton("2");
		two.setBackground(new Color(255, 255, 255));
		two.addActionListener(this);
		three = new JButton("3");
		three.setBackground(new Color(255, 255, 255));
		three.addActionListener(this);
		four = new JButton("4");
		four.setBackground(new Color(255, 255, 255));
		four.addActionListener(this);
		five = new JButton("5");
		five.setBackground(new Color(255, 255, 255));
		five.addActionListener(this);
		six = new JButton("6");
		six.setBackground(new Color(255, 255, 255));
		six.addActionListener(this);
		seven = new JButton("7");
		seven.setBackground(new Color(255, 255, 255));
		seven.addActionListener(this);
		eight = new JButton("8");
		eight.setBackground(new Color(255, 255, 255));
		eight.addActionListener(this);
		nine = new JButton("9");
		nine.setBackground(new Color(255, 255, 255));
		nine.addActionListener(this);
		//blanks buttons
		blnk1 = new JButton("");
		blnk1.setEnabled(false);
		blnk2 = new JButton("");
		blnk2.setEnabled(false);
		blnk3 = new JButton("");
		blnk3.setEnabled(false);
		blnk4 = new JButton("");
		blnk4.setEnabled(false);
		blnk5 = new JButton("");
		blnk5.setEnabled(false);
		//clear and backspace
		backSpace = new JButton("\u2190");
		backSpace.addActionListener(this);
		clearE = new JButton("CE");
		clearE.addActionListener(this);
		clearE.setFont(new Font("Tahoma", Font.PLAIN, 9));
		clear = new JButton("C");
		clear.addActionListener(this);
		//randompnl
		randomPnl = new JPanel();
		randomPnl.setBackground(new Color(240, 248, 255));
		//hex
		f = new JButton("F");
		f.addActionListener(this);
		f.setEnabled(false);
		e = new JButton("E");
		e.addActionListener(this);
		e.setEnabled(false);
		d = new JButton("D");
		d.addActionListener(this);
		d.setEnabled(false);
		c = new JButton("C");
		c.addActionListener(this);
		c.setEnabled(false);
		b = new JButton("B");
		b.addActionListener(this);
		b.setEnabled(false);
		a = new JButton("A");
		a.addActionListener(this);
		a.setEnabled(false);
		//blank buttons
		bl1 = new JButton("");
		bl1.setEnabled(false);
		bl2 = new JButton("");
		bl2.setEnabled(false);
		bl3 = new JButton(""); 	 
		bl3.setEnabled(false);
		bl4 = new JButton("");
		bl4.setEnabled(false);
		bl6 = new JButton("");
		bl6.setEnabled(false);
		bl5 = new JButton("");
		bl5.setEnabled(false);
		bl7 = new JButton("");
		bl7.setEnabled(false);
		bl8 = new JButton("");
		bl8.setEnabled(false);
		bl9 = new JButton("");
		bl9.setEnabled(false);
		bl10 = new JButton("");
		bl10.setEnabled(false);
		//quot and mod
		quot = new JButton("Quot");
		quot.setFont(new Font("Tahoma", Font.PLAIN, 8));
		quot.addActionListener(this);
		mod = new JButton("Mod");
		mod.setFont(new Font("Tahoma", Font.PLAIN, 8));
		mod.addActionListener(this);
		//textfield
		textField = new JTextField();
		textField.setBackground(new Color(245, 255, 250));
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setColumns(10);
		textField.setAlignmentX(Component.RIGHT_ALIGNMENT);
			
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(bitsPnl, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(randomPnl, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(numOpsPnl, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(bitsPnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(randomPnl, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(numOpsPnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(153))
		);
		//bits
		JLabel label = new JLabel("0000");
		JLabel label_1 = new JLabel("0000");
		JLabel label_2 = new JLabel("0000");
		JLabel label_3 = new JLabel("0000");
		JLabel label_4 = new JLabel("0000");
		JLabel label_5 = new JLabel("0000");
		JLabel label_6 = new JLabel("0000");
		JLabel label_7 = new JLabel("0000");
		JLabel label_8 = new JLabel("0000");
		JLabel label_9 = new JLabel("0000");
		JLabel label_10 = new JLabel("0000");
		JLabel label_11 = new JLabel("0000");
		JLabel label_12 = new JLabel("0000");
		JLabel label_13 = new JLabel("0000");
		JLabel label_14 = new JLabel("0000");
		JLabel label_15 = new JLabel("0000");
		label_16 = new JLabel("63");
		label_17 = new JLabel("31");
		label_18 = new JLabel("47");
		label_19 = new JLabel("15");
		label_20 = new JLabel("32");
		label_21 = new JLabel("0");
		
		GroupLayout gl_bitsPnl = new GroupLayout(bitsPnl);
		gl_bitsPnl.setHorizontalGroup(
			gl_bitsPnl.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bitsPnl.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bitsPnl.createSequentialGroup()
							.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
							.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(41)
							.addGroup(gl_bitsPnl.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(34))
						.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_16))
					.addGap(3)
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(73)
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bitsPnl.createSequentialGroup()
							.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
								.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(42)
							.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(55)
							.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
								.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
						.addGroup(gl_bitsPnl.createSequentialGroup()
							.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_bitsPnl.createParallelGroup(Alignment.LEADING)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_21, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(27))
		);
		gl_bitsPnl.setVerticalGroup(
			gl_bitsPnl.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bitsPnl.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(label_12)
						.addComponent(label_1)
						.addComponent(label_3)
						.addComponent(label_2)
						.addComponent(label_14)
						.addComponent(label_8)
						.addComponent(label_10))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_16)
						.addComponent(label_20)
						.addComponent(label_18))
					.addGap(16)
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(label_7)
						.addComponent(label_6)
						.addComponent(label_5)
						.addComponent(label_15)
						.addComponent(label_9)
						.addComponent(label_13)
						.addComponent(label_11))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_bitsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_17)
						.addComponent(label_21)
						.addComponent(label_19))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		bitsPnl.setLayout(gl_bitsPnl);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hex");
		rdbtnDec = new JRadioButton("Dec");
		rdbtnOct = new JRadioButton("Oct");
		rdbtnBin = new JRadioButton("Bin");
		rdbtnQword = new JRadioButton("Qword");
		rdbtnDword = new JRadioButton("Dword");
		rdbtnWord = new JRadioButton("Word");
		radioButton_6 = new JRadioButton("New radio button");
		rdbtnByte = new JRadioButton("Byte");
		
		GroupLayout gl_randomPnl = new GroupLayout(randomPnl);
		gl_randomPnl.setHorizontalGroup(
			gl_randomPnl.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_randomPnl.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_randomPnl.createSequentialGroup()
							.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_randomPnl.createParallelGroup(Alignment.TRAILING)
									.addComponent(rdbtnNewRadioButton_1)
									.addComponent(rdbtnOct))
								.addComponent(rdbtnBin)
								.addComponent(rdbtnQword)
								.addComponent(rdbtnDec)
								.addComponent(rdbtnByte)
								.addComponent(rdbtnDword)
								.addComponent(rdbtnWord))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_randomPnl.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_randomPnl.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
									.addGroup(gl_randomPnl.createParallelGroup(Alignment.TRAILING)
										.addComponent(bl4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
										.addComponent(bl6, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
										.addComponent(bl8, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
										.addComponent(bl10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
										.addComponent(quot, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_randomPnl.createSequentialGroup()
											.addComponent(mod, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(a, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_randomPnl.createSequentialGroup()
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
												.addComponent(bl9, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(bl7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
												.addComponent(c, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(b, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_randomPnl.createSequentialGroup()
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
												.addComponent(bl5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(bl3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
												.addComponent(e, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
												.addComponent(d, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_randomPnl.createSequentialGroup()
									.addComponent(bl2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bl1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(f, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))))
						.addComponent(radioButton_6))
					.addContainerGap())
		);
		gl_randomPnl.setVerticalGroup(
			gl_randomPnl.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_randomPnl.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_randomPnl.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_randomPnl.createSequentialGroup()
							.addGroup(gl_randomPnl.createParallelGroup(Alignment.BASELINE)
								.addComponent(mod, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(quot, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(a, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnNewRadioButton_1))
							.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_randomPnl.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnNewRadioButton)
										.addGroup(gl_randomPnl.createSequentialGroup()
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
												.addComponent(b)
												.addComponent(bl9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addComponent(bl10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_randomPnl.createSequentialGroup()
													.addComponent(bl8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(bl6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_randomPnl.createSequentialGroup()
													.addComponent(bl7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(bl5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_randomPnl.createSequentialGroup()
													.addComponent(c)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(d)))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_randomPnl.createSequentialGroup()
											.addComponent(e)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(f))
										.addGroup(gl_randomPnl.createSequentialGroup()
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
												.addComponent(bl4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
												.addComponent(bl3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_randomPnl.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_randomPnl.createParallelGroup(Alignment.LEADING)
														.addComponent(bl1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
														.addComponent(bl2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_randomPnl.createSequentialGroup()
													.addGap(25)
													.addComponent(rdbtnByte)))))
									.addGap(11))
								.addGroup(gl_randomPnl.createSequentialGroup()
									.addGap(28)
									.addComponent(rdbtnOct)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnBin)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnQword)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnDword)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnWord)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radioButton_6))
						.addGroup(gl_randomPnl.createSequentialGroup()
							.addComponent(rdbtnDec)
							.addGap(194))))
		);
		randomPnl.setLayout(gl_randomPnl);
		
		GroupLayout gl_numOpsPnl = new GroupLayout(numOpsPnl);
		gl_numOpsPnl.setHorizontalGroup(
			gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_numOpsPnl.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(zero, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_numOpsPnl.createSequentialGroup()
							.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
								.addComponent(blnk5, 0, 0, Short.MAX_VALUE)
								.addComponent(seven, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
								.addComponent(four, 0, 0, Short.MAX_VALUE)
								.addComponent(one, 0, 0, Short.MAX_VALUE)
								.addComponent(backSpace, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
								.addComponent(five, 0, 0, Short.MAX_VALUE)
								.addComponent(two, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
								.addComponent(eight, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addComponent(blnk4, 0, 0, Short.MAX_VALUE)
								.addComponent(clearE, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
						.addComponent(blnk3, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(clear, 0, 0, Short.MAX_VALUE)
							.addComponent(nine, 0, 0, Short.MAX_VALUE)
							.addComponent(six, 0, 0, Short.MAX_VALUE)
							.addComponent(three, 0, 0, Short.MAX_VALUE)
							.addComponent(point, GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
						.addComponent(blnk2, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(plusMinus, 0, 0, Short.MAX_VALUE)
							.addComponent(divide, 0, 0, Short.MAX_VALUE)
							.addComponent(multiply, 0, 0, Short.MAX_VALUE)
							.addComponent(minus, 0, 0, Short.MAX_VALUE)
							.addComponent(plus, GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
						.addComponent(blnk1, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.LEADING, false)
							.addComponent(sqrt, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
							.addComponent(percent, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
							.addComponent(recip, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
							.addComponent(equal, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_numOpsPnl.setVerticalGroup(
			gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_numOpsPnl.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(blnk1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(blnk2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(blnk3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(blnk4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(blnk5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(sqrt)
						.addComponent(plusMinus)
						.addComponent(clear)
						.addComponent(backSpace)
						.addComponent(clearE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(percent)
						.addComponent(divide)
						.addComponent(nine)
						.addComponent(seven)
						.addComponent(eight))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.BASELINE)
						.addComponent(recip)
						.addComponent(multiply)
						.addComponent(six)
						.addComponent(five)
						.addComponent(four))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.TRAILING)
						.addComponent(equal, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_numOpsPnl.createSequentialGroup()
							.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.BASELINE)
								.addComponent(minus)
								.addComponent(three)
								.addComponent(two, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(one))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_numOpsPnl.createParallelGroup(Alignment.BASELINE)
								.addComponent(plus)
								.addComponent(point)
								.addComponent(zero))))
					.addContainerGap())
		);
		numOpsPnl.setLayout(gl_numOpsPnl);
		
		
		getContentPane().setLayout(groupLayout);
		
		
				//menu
				JMenuBar menuBar = new JMenuBar();
				setJMenuBar(menuBar);
				
				mnView = new JMenu("View");
				menuBar.add(mnView);
			
				mnViewItem = new JMenuItem("Hide/Show");
				mnView.add(mnViewItem);

				mnEdit = new JMenu("Edit");
				menuBar.add(mnEdit);
			
				mnEditItem = new JMenuItem("Copy");
				mnEdit.add(mnEditItem);
			
				mnHelp = new JMenu("Help");
				menuBar.add(mnHelp);
			
				mnHelpItem = new JMenuItem("View Help");
				mnHelp.add(mnHelpItem);
				
				mnHelpCalculatorItem = new JMenuItem("About Calculator");
				mnHelp.add(mnHelpCalculatorItem);
		
	}

	//action performed
	@Override
	public void actionPerformed(ActionEvent e) {
		//numbers
		if(e.getSource() == zero){
			textField.setText(textField.getText() + "0");
		}
		if(e.getSource() == one){
			textField.setText(textField.getText() + "1");
		}
		if(e.getSource() == two){
			textField.setText(textField.getText() + "2");
		}
		if(e.getSource() == three){
			textField.setText(textField.getText() + "3");
		}
		if(e.getSource() == four){
			textField.setText(textField.getText() + "4");
		}
		if(e.getSource() == five){
			textField.setText(textField.getText() + "5");
		}
		if(e.getSource() == six){
			textField.setText(textField.getText() + "6");
		}
		if(e.getSource() == seven){
			textField.setText(textField.getText() + "7");
		}
		if(e.getSource() == eight){
			textField.setText(textField.getText() + "8");
		}
		if(e.getSource() == nine){
			textField.setText(textField.getText() + "9");
		}
		if(e.getSource() == point){
			textField.setText(textField.getText() + ".");
		}
		//addition
		if(e.getSource() == plus){
			fn = Double.parseDouble(textField.getText());
			textField.setText("");
			subtract = false;
			multiplied = false;
			divided = false;
			add = true;
			moded = false;
			quoted = false;
		}
		//subtraction
		if(e.getSource() == minus){
			fn = Double.parseDouble(textField.getText());
			textField.setText("");
			add = false;
			multiplied = false;
			divided = false;
			subtract = true;	
			moded = false;
			quoted = false;
		}
		//multiplthication
		if(e.getSource() == multiply){
			fn = Double.parseDouble(textField.getText());
			textField.setText("");
			add = false;
			subtract = false;
			divided = false;
			multiplied = true;	
			moded = false;
			quoted = false;
		}
		//division
		if(e.getSource() == divide){
			fn = Double.parseDouble(textField.getText());
			textField.setText("");
			add = false;
			subtract = false;
			multiplied = false;
			divided = true;	
			moded = false;
			quoted = false;
		}
		//mod
		if(e.getSource() == mod){
			fn = Double.parseDouble(textField.getText());
			textField.setText("");
			add = false;
			subtract = false;
			multiplied = false;
			divided = true;	
			moded = true;
			quoted = false;
		}
		//quot
		if(e.getSource() == quot){
			fn = Double.parseDouble(textField.getText());
			textField.setText("");
			add = false;
			subtract = false;
			multiplied = false;
			divided = true;	
			moded = false;
			quoted = false;
		}
		//negate
		if(e.getSource() == plusMinus){
			fn = Double.parseDouble(textField.getText());
			result = fn * -1;
			textField.setText(""+result);
		}
		//1/x
		if(e.getSource() == recip){
			fn = Double.parseDouble(textField.getText());
			result = 1/fn;
			textField.setText(""+result);
		}
		//square root
		if(e.getSource() == sqrt){
			fn = Double.parseDouble(textField.getText());
			result = Math.sqrt(fn);
			textField.setText(""+result);
		}
		//equal
		if(e.getSource() == equal){
			
			sn = Double.parseDouble(textField.getText());
			//addition
			if(add){
				result = fn + sn;
				textField.setText("" + result);
				
			}
			//subtractions
			if(subtract){
				result = fn - sn;
				textField.setText("" + result);
			}
			//multiply
			if(multiplied){
				result = fn * sn;
				textField.setText("" + result);
			}
			//divide
			if(divided){
				result = fn / sn;
				textField.setText("" + result);
			}
			//mod
			if(moded){
				result = fn % sn;
				textField.setText(""+result);
			}
			//quotient
			if(quoted){
				result = fn / sn;
				textField.setText("" + result);
			}
		}
		//clear
		if(e.getSource() == clear){
			fn = 0;
			sn = 0;
			result = 0;
			textField.setText("");
		}
		//clear
		if(e.getSource() == clearE){
			fn = 0;
			sn = 0;
			result = 0;
			textField.setText("");
		}
	}

	//main method
	public static void main(String[] args){
		JFrame jf = new Main();
		jf.setTitle("Calculator");
		jf.setSize(607, 533);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//while(true){
		//	if(visibility)
		//		jf.setVisible(true);
		//	else
		//		jf.setVisible(false);
		//}
	}
}

