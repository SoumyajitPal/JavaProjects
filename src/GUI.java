import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.text.BadLocationException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;


public class GUI extends JFrame {
	
	private JButton Zero;
	private JButton One;
	private JButton Two;
	private JButton Three;
	private JButton Four;
	private JButton Five;
	private JButton Six;
	private JButton Seven;
	private JButton Eight;
	private JButton Nine;
	private JButton PlusMinus;
	private JButton Decimal;
	private JButton Plus;
	private JButton Minus;
	private JButton Multiply;
	private JButton Divide;
	private JButton BackSpace;
	private JButton Clear;
	private JButton ClearAll;
	private JButton SquareRoot;
	private JButton Reciprocal;
	private JButton Percentage;
	private JButton Equals;
	
	private JTextField Display;
	private JTextArea History;
	private JTextArea Calculations;
	private JTextArea PastCalculations;
	
	private JMenuBar Menu;
	
	private JMenu File;
	private JMenu Help;
	
	private JPanel Panel;
	private JPanel ControlPanel;
	private JPanel CalculationsPanel;
	//private JPanel Panel3;
	//private JPanel Panel4;
	//private JPanel Panel5;
	
	private GridLayout Buttons;
	
	private JPanel WholePanel;
	private JPanel RightPanel;
	
	private JScrollPane Left;
	private JScrollPane RightAbove;
	private JScrollPane RightBottom;
	
	public GUI(){
		
		super("Java Swing Calculator");
		ImageIcon i = new ImageIcon("C:\\Users\\admin\\Documents\\Eclipse\\basicCalculator\\src\\images (2).jpg");
		setIconImage(i.getImage());
		
		ActionHandler PressEnter = new ActionHandler();
		KeyBoardHandler KeyEvent = new KeyBoardHandler();
		
		Zero = new JButton("0");
		One = new JButton("1");
		Two  = new JButton("2");
		Three  = new JButton("3");
		Four  = new JButton("4");
		Five  = new JButton("5");
		Six  = new JButton("6");
		Seven  = new JButton("7");
		Eight  = new JButton("8");
		Nine  = new JButton("9");
		BackSpace  = new JButton("BackSpace");
		PlusMinus  = new JButton("+/-");
		Decimal  = new JButton(".");
		Clear  = new JButton("C");
		ClearAll  = new JButton("CE");
		Plus  = new JButton("+");
		Minus  = new JButton("-");
		Multiply  = new JButton("*");
		Divide  = new JButton("/");
		Equals  = new JButton("=");
		SquareRoot  = new JButton("sqrt");
		Reciprocal  = new JButton("1/x");
		Percentage  = new JButton("%");
		
		Zero.setForeground(Color.blue);
		One.setForeground(Color.blue);
		Two.setForeground(Color.blue);
		Three.setForeground(Color.blue);
		Four.setForeground(Color.blue);
		Five.setForeground(Color.blue);
		Six.setForeground(Color.blue);
		Seven.setForeground(Color.blue);
		Eight.setForeground(Color.blue);
		Nine.setForeground(Color.blue);
		BackSpace.setForeground(Color.red);
		Clear.setForeground(Color.red);
		ClearAll.setForeground(Color.red);
		
		
		BackSpace.addActionListener(PressEnter);
		Clear.addActionListener(PressEnter);
		ClearAll.addActionListener(PressEnter);
		Zero.addActionListener(PressEnter);
		One.addActionListener(PressEnter);
		Two.addActionListener(PressEnter);
		Three.addActionListener(PressEnter);
		Four.addActionListener(PressEnter);
		Five.addActionListener(PressEnter);
		Six.addActionListener(PressEnter);
		Seven.addActionListener(PressEnter);
		Eight.addActionListener(PressEnter);
		Nine.addActionListener(PressEnter);
		Decimal.addActionListener(PressEnter);
		Equals.addActionListener(PressEnter);
		SquareRoot.addActionListener(PressEnter);
		Reciprocal.addActionListener(PressEnter);
		Percentage.addActionListener(PressEnter);
		Plus.addActionListener(PressEnter);
		Minus.addActionListener(PressEnter);
		Multiply.addActionListener(PressEnter);
		Divide.addActionListener(PressEnter);
		PlusMinus.addActionListener(PressEnter);
		
		
		Font f = new Font("Courier New", Font.BOLD, 35);
		
		
		Menu = new JMenuBar();
		File = new JMenu("File");
		Help = new JMenu("Help");
		
		Menu.add(File);
		Menu.add(Help);
		Menu.setSize(100, 30);
		
		Display = new JTextField(25);
		Display.setFont(f);
		Display.addActionListener(PressEnter);
		Display.addKeyListener(KeyEvent);
		//Display.setText(" ");
		
		
		
		Border blackLine = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.blue, Color.gray);
		
		History = new JTextArea(40,20);
		History.setBorder(blackLine);
		History.setEditable(false);
		
		History.setLineWrap(true);
		History.setWrapStyleWord(true);
		
		Calculations = new JTextArea(4,4);
		Calculations.append("0");
		Calculations.setBorder(blackLine);
		Calculations.setEditable(false);
		
		Calculations.setWrapStyleWord(true);
		Calculations.setWrapStyleWord(true);
		
		PastCalculations = new JTextArea(36, 16);
		//PastCalculations.append("0");
		PastCalculations.setBorder(blackLine);
		PastCalculations.setEditable(false);
		
		PastCalculations.setWrapStyleWord(true);
		PastCalculations.setWrapStyleWord(true);
		
		
		Buttons = new GridLayout(4,5,2,2);
		
		Panel = new JPanel();
		ControlPanel = new JPanel();
		CalculationsPanel = new JPanel();
		//Panel3 = new JPanel();
		//Panel4 = new JPanel();
		//Panel5 = new JPanel();
		WholePanel = new JPanel();
		RightPanel = new JPanel();
		
		Left = new JScrollPane(History);
		RightAbove = new JScrollPane(Calculations);
		RightBottom = new JScrollPane(PastCalculations);
		
		Panel.setLayout(Buttons);
				
		//Panel.setLayout(new BoxLayout(Panel, BoxLayout.X_AXIS));
		//Panel2.setLayout(new BoxLayout(Panel2, BoxLayout.X_AXIS));
		//Panel3.setLayout(new BoxLayout(Panel3, BoxLayout.X_AXIS));
		//Panel4.setLayout(new BoxLayout(Panel4, BoxLayout.X_AXIS));
		//Panel5.setLayout(new BoxLayout(Panel5, BoxLayout.X_AXIS));
		
		WholePanel.setLayout(new BoxLayout(WholePanel, BoxLayout.Y_AXIS));
		RightPanel.setLayout(new BoxLayout(RightPanel, BoxLayout.X_AXIS));
		CalculationsPanel.setLayout(new BoxLayout(CalculationsPanel, BoxLayout.Y_AXIS));
		

		
		
		
		
		ControlPanel.add(BackSpace);
		ControlPanel.add(ClearAll);
		ControlPanel.add(Clear);
		Panel.add(Seven);
		Panel.add(Eight);
		Panel.add(Nine);
		Panel.add(Divide);
		Panel.add(SquareRoot);
		Panel.add(Four);
		Panel.add(Five);
		Panel.add(Six);
		Panel.add(Multiply);
		Panel.add(Reciprocal);
		Panel.add(One);
		Panel.add(Two);
		Panel.add(Three);
		Panel.add(Minus);
		Panel.add(Percentage);
		Panel.add(Zero);
		Panel.add(Decimal);
		Panel.add(Equals);
		Panel.add(Plus);
		Panel.add(PlusMinus);
		
		Dimension d = SquareRoot.getPreferredSize();
		
		Panel.setPreferredSize(new Dimension((int)d.getWidth(),(int)d.getHeight()*4));
		
		WholePanel.add(Menu);
		WholePanel.add(Display);
		WholePanel.add(ControlPanel);
		WholePanel.add(Panel);
		//WholePanel.add(Panel2);
		//WholePanel.add(Panel3);
		//WholePanel.add(Panel4);
		//WholePanel.add(Panel5);
		
		
		
		add(WholePanel);
		RightPanel.add(Left, BorderLayout.WEST);
		CalculationsPanel.add(RightAbove, BorderLayout.NORTH);
		CalculationsPanel.add(RightBottom, BorderLayout.SOUTH);
		RightPanel.add(CalculationsPanel, BorderLayout.EAST);
		add(RightPanel, BorderLayout.EAST);
		
		
		
	}
	
	
	
	private class ActionHandler implements ActionListener{
		
		private char OldSign;
		private char NewSign;
		private Functions fObject = new Functions();

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			
			if(event.getSource()==Display){
				if(Display.getText().length()==0){
					return;
				}
				
				if((Display.getText().charAt(0)=='+' || Display.getText().charAt(0)=='-' || Display.getText().charAt(0)=='*' || Display.getText().charAt(0)=='/') && (Display.getText().length()==1)){
					
					Display.setText(Calculations.getText());
					PastCalculations.append(History.getText()+" = "+Calculations.getText()+"\n");
					Calculations.setText("0");
					History.setText("");
				}
				else{
					if(History.getText().length()==0){
						PastCalculations.append(Display.getText()+"\n");
						return;
					}
					OldSign = Display.getText().charAt(0);
					History.append(Display.getText());
					
					
					switch(OldSign){
					
					case '+' : fObject.add();
							   break;
					case '-' : fObject.subtract();
							   break;
					case '*' : fObject.multiply();
					   		   break;
					case '/' : fObject.divide();
					   		   break;
					}
					
					Display.setText(Calculations.getText());
					PastCalculations.append(History.getText()+" = "+Calculations.getText()+"\n");
					Calculations.setText("0");
					History.setText("");
				}
				
			}
			
			else if((event.getSource()==BackSpace) && (Display.getText().length()>0)){
				try {
					Display.setText(Display.getText(0,Display.getText().length()-1));
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(event.getSource()==ClearAll){
				Display.setText("");
				History.setText("");
				Calculations.setText("0");
			}
			
			else if(event.getSource()==Clear){
				int len = Display.getText().length();
				
				if(len>0){
					char sign = Display.getText().charAt(0);
					if(sign!='+' && sign!='-' && sign!='*' && sign!='/'){
						Display.setText("");
					}
					else
						Display.setText(sign+"");
				}
			}
			
			else if (event.getSource()==Zero ||   event.getSource()==One || event.getSource()==Two || event.getSource()==Three || event.getSource()==Four || event.getSource()==Five || event.getSource()==Six || event.getSource()==Seven || event.getSource()==Eight || event.getSource()==Nine || event.getSource()==Decimal){
				Display.setText(Display.getText()+event.getActionCommand());
			}
			
			else if(event.getSource()==Plus || event.getSource()==Minus || event.getSource()==Multiply || event.getSource()==Divide){
				if(Display.getText().length()==0)
					return;
				if(Display.getText().charAt(0)!='+' && Display.getText().charAt(0)!='-' && Display.getText().charAt(0)!='*' && Display.getText().charAt(0)!='/'){
					OldSign = '+';
				}
				else
					OldSign = Display.getText().charAt(0);
				History.append(Display.getText());
				
				
				switch(OldSign){
				
				case '+' : fObject.add();
						   break;
				case '-' : fObject.subtract();
						   break;
				case '*' : fObject.multiply();
				   		   break;
				case '/' : fObject.divide();
				   		   break;
				}
				
				Display.setText(event.getActionCommand());
			}
			
			else if(event.getSource()==Equals){
				if(Display.getText().length()==0)
					return;
				if((Display.getText().charAt(0)=='+' || Display.getText().charAt(0)=='-' || Display.getText().charAt(0)=='*' || Display.getText().charAt(0)=='/') && (Display.getText().length()==1)){
					Display.setText(Calculations.getText());
					PastCalculations.append(History.getText()+" = "+Calculations.getText()+"\n");
					Calculations.setText("0");
					History.setText("");
				}
				else{
					if(History.getText().length()==0){
						PastCalculations.append(Display.getText()+"\n");
						return;
					}
					OldSign = Display.getText().charAt(0);
					History.append(Display.getText());
					
					
					switch(OldSign){
					
					case '+' : fObject.add();
							   break;
					case '-' : fObject.subtract();
							   break;
					case '*' : fObject.multiply();
					   		   break;
					case '/' : fObject.divide();
					   		   break;
					}
					
					Display.setText(Calculations.getText());
					PastCalculations.append(History.getText()+" = "+Calculations.getText()+"\n");
					Calculations.setText("0");
					History.setText("");
				}
				
			
			}
			
			else if(event.getSource()==PlusMinus){
				if(Display.getText().length()==0)
					Display.setText("-");
				else if(Display.getText().length()>0){
					if(Display.getText().charAt(0)=='+'){
						String s = null;
						try {
							s = Display.getText(1,Display.getText().length());
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Display.setText("-"+s);
							
					}
					else if(Display.getText().charAt(0)=='-'){
						String s = null;
						try {
							s = Display.getText(1,Display.getText().length());
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Display.setText("+"+s);
							
					}
					else if(Display.getText().charAt(0)=='*' || Display.getText().charAt(0)=='/'){
						String s = null;
						try {
							s = Display.getText(1,Display.getText().length());
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Display.setText(Display.getText().charAt(0)+String.format("%.3f",Double.parseDouble(s)*(-1) ));
					}
					
					else if(Display.getText().charAt(0)>'0' && Display.getText().charAt(0)<'9'){
						Display.setText(String.format("%.3f",(-1)* Double.parseDouble(Display.getText())));
					}
				}
			}
			
			else if(event.getSource()==SquareRoot){
				fObject.SquareRoot();
			}
			
			else if(event.getSource()==Reciprocal){
				fObject.Reciprocal();
				
			}
			
			else if(event.getSource()==Percentage){
				fObject.Percentage();
			}
		
		}
	}
	
	private class KeyBoardHandler implements KeyListener{
		
		private char OldSign;
		private char NewSign;
		private Functions fObject = new Functions();
		//private int index;

		@Override
		public void keyPressed(KeyEvent event) {
			// TODO Auto-generated method stub
			
			
			
		}

		@Override
		public void keyReleased(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent event) {
			// TODO Auto-generated method stub
			char c = event.getKeyChar();
			if(c!='0' && c!='1' && c!='2' && c!='3' && c!='4' && c!='5' && c!='6' && c!='7' && c!='8' && c!='9' && c!='+' && c!='-' && c!='*' && c!='/' && c!='.' && c!='=' && c!=KeyEvent.VK_BACK_SPACE){
				event.consume();
			}
			
			NewSign = event.getKeyChar();
			//JOptionPane.showMessageDialog(null, NewSign, "Sign", JOptionPane.PLAIN_MESSAGE);
			if(NewSign == '+' || NewSign == '-' || NewSign == '*' || NewSign == '/'){
				if(Display.getText().length()==0){
					event.consume();
					return;
				}
				//JOptionPane.showMessageDialog(null, Display.getText().charAt(0), "OldSign", JOptionPane.PLAIN_MESSAGE);
				if(Display.getText().charAt(0)!='+' && Display.getText().charAt(0)!='-' && Display.getText().charAt(0)!='*' && Display.getText().charAt(0)!='/'){
					OldSign = '+';
				}
				else
					OldSign = Display.getText().charAt(0);
				History.append(Display.getText());
				
				
				switch(OldSign){
				
				case '+' : fObject.add();
						   break;
				case '-' : fObject.subtract();
						   break;
				case '*' : fObject.multiply();
				   		   break;
				case '/' : fObject.divide();
				   		   break;
				}
				
				Display.setText("");
				//JOptionPane.showMessageDialog(null, OldSign, "Sign", JOptionPane.PLAIN_MESSAGE);
			}
			
			if(NewSign == '='){
				if(Display.getText().length()==0){
					event.consume();
					return;
				}
				if((Display.getText().charAt(0)=='+' || Display.getText().charAt(0)=='-' || Display.getText().charAt(0)=='*' || Display.getText().charAt(0)=='/') && (Display.getText().length()==1)){
					event.consume();
					Display.setText(Calculations.getText());
					PastCalculations.append(History.getText()+" = "+Calculations.getText()+"\n");
					Calculations.setText("0");
					History.setText("");
				}
				else{
					event.consume();
					if(History.getText().length()==0){
						PastCalculations.append(Display.getText()+"\n");
						return;
					}
					OldSign = Display.getText().charAt(0);
					History.append(Display.getText());
					
					
					switch(OldSign){
					
					case '+' : fObject.add();
							   break;
					case '-' : fObject.subtract();
							   break;
					case '*' : fObject.multiply();
					   		   break;
					case '/' : fObject.divide();
					   		   break;
					}
					
					Display.setText(Calculations.getText());
					PastCalculations.append(History.getText()+" = "+Calculations.getText()+"\n");
					Calculations.setText("0");
					History.setText("");
				}
				
			
				
			}
			
		}

	}
	
	private class Functions{
		
		private double first;
		private double second;
		//private int index;
		
		public void add(){
			//JOptionPane.showMessageDialog(null, "Add", "Add", JOptionPane.PLAIN_MESSAGE);
			first = Double.parseDouble(Calculations.getText());
			if(Display.getText().charAt(0)!='+' && Display.getText().charAt(0)!='-' && Display.getText().charAt(0)!='*' && Display.getText().charAt(0)!='/'){
				second = Double.parseDouble(Display.getText());
			}
			else{
				try {
					second = Double.parseDouble(Display.getText(1, Display.getText().length()));
				} catch (NumberFormatException | BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Calculations.setText(String.format("%f", first+second));
			
		}
		public void subtract(){
			//JOptionPane.showMessageDialog(null, "Subtract", "Subtract", JOptionPane.PLAIN_MESSAGE);
			first = Double.parseDouble(Calculations.getText());
			try {
				second = Double.parseDouble(Display.getText(1, Display.getText().length()));
			} catch (NumberFormatException | BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Calculations.setText(String.format("%f", first-second));
		}
		public void multiply(){
			//JOptionPane.showMessageDialog(null, "Multiply", "Multiply", JOptionPane.PLAIN_MESSAGE);
			first = Double.parseDouble(Calculations.getText());
			try {
				second = Double.parseDouble(Display.getText(1, Display.getText().length()));
			} catch (NumberFormatException | BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Calculations.setText(String.format("%f", first*second));
		}
		public void divide(){
			//JOptionPane.showMessageDialog(null, "Divide", "Divide", JOptionPane.PLAIN_MESSAGE);
			first = Double.parseDouble(Calculations.getText());
			try {
				second = Double.parseDouble(Display.getText(1, Display.getText().length()));
			} catch (NumberFormatException | BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Calculations.setText(String.format("%f", first/second));
		}
		
		public void SquareRoot(){
			if(Display.getText().length()>0){
				String s = Display.getText();
				if(s.charAt(0)<'0'|| s.charAt(0)>'9'){
					s = s.substring(1);
					
				}
				double d = Double.parseDouble(s);
				d = Math.sqrt(d);
				//JOptionPane.showMessageDialog(null, d, "Title", JOptionPane.PLAIN_MESSAGE);
				
				if(Display.getText().charAt(0)<'0' || Display.getText().charAt(0)>'9'){
					Display.setText(Display.getText().charAt(0)+String.format("%.3f", d));
				}
				else
					Display.setText(String.format("%f", d));
			}
		}
		
		public void Reciprocal(){
			if(Display.getText().length()>0){
				String s = Display.getText();
				if(s.charAt(0)<'0'|| s.charAt(0)>'9'){
					s = s.substring(1);
					
				}
				double d = Double.parseDouble(s);
				d = 1/d;
				//JOptionPane.showMessageDialog(null, d, "Title", JOptionPane.PLAIN_MESSAGE);
				
				if(Display.getText().charAt(0)<'0' || Display.getText().charAt(0)>'9'){
					Display.setText(Display.getText().charAt(0)+String.format("%.3f", d));
				}
				else
					Display.setText(String.format("%.10f", d));
			}
		}
		
		public void Percentage(){
			if(Display.getText().length()>0){
				String s = null;
				if(Display.getText().charAt(0)!='/'){
					JOptionPane.showMessageDialog(null, "Input of the form\nx/y%\ngives what percent of y is x\n", "Percentage Syntax", JOptionPane.PLAIN_MESSAGE);
				}
				else{
					try {
						s = Display.getText(1,Display.getText().length());
					} catch (BadLocationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Double d = (Double.parseDouble(Calculations.getText())/Double.parseDouble(s))*100;
					Display.setText(String.format("%.10f", d));
					
				}
					
			}
		}
		
	}
}
