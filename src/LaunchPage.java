import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JTextField numhis = new JTextField();
	JTextField oprhis = new JTextField();
	JTextField inputline = new JTextField();

	JButton addB = new JButton("+");
	JButton subB = new JButton("-");
	JButton mulB = new JButton("x");
	JButton divB = new JButton("/");
	JButton equalsB = new JButton("=");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton dotB = new JButton(".");
	JButton cancelB = new JButton("C");

	Calculation calc = new Calculation();

	LaunchPage(){
		frame.setTitle("Calculator");
		frame.setBounds(600, 200, 350, 410);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLayout(null);
		frame.setResizable(false);
		ImageIcon icon = new ImageIcon("C:\\Users\\amlan\\eclipse-workspace\\Calculator\\src\\CalculatorLogo.png");
		frame.setIconImage(icon.getImage());
		

		inputline.setBounds(95, 65, 230, 35);
		inputline.setBorder(BorderFactory.createLineBorder(Color.black));
		inputline.setBackground(Color.BLACK);
		inputline.setForeground(Color.WHITE);
		inputline.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		inputline.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(inputline);

		numhis.setBounds(10, 20, 190, 25);
		numhis.setEditable(false);
		numhis.setBorder(BorderFactory.createLineBorder(Color.black));
		numhis.setBackground(Color.BLACK);
		numhis.setForeground(Color.WHITE);
		numhis.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		numhis.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(numhis);

		oprhis.setBounds(215, 20, 110, 25);
		oprhis.setEditable(false);
		oprhis.setBackground(Color.BLACK);
		oprhis.setForeground(Color.WHITE);
		oprhis.setBorder(BorderFactory.createLineBorder(Color.black));
		oprhis.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		oprhis.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(oprhis);

		GridLayout gridlayout = new GridLayout(4,4);
		gridlayout.setVgap(0);
		gridlayout.setHgap(0);
		panel.setLayout(gridlayout);
		panel.setBounds(10, 110, 316, 252);		

		cancelB.setBounds(10, 52, 79, 58);
		frame.add(cancelB);

		panel.setVisible(true);
		frame.add(panel);
		
		Font font = new Font("Times New Roman", Font.PLAIN, 15);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);
		b7.setFont(font);
		b8.setFont(font);
		b9.setFont(font);
		b0.setFont(font);
		addB.setFont(font);
		subB.setFont(font);
		mulB.setFont(font);
		divB.setFont(font);
		dotB.setFont(font);
		cancelB.setFont(font);
		equalsB.setFont(font);

		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.white);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.white);
		b3.setBackground(Color.DARK_GRAY);
		b3.setForeground(Color.white);
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.white);
		b5.setBackground(Color.DARK_GRAY);
		b5.setForeground(Color.white);
		b6.setBackground(Color.DARK_GRAY);
		b6.setForeground(Color.white);
		b7.setBackground(Color.DARK_GRAY);
		b7.setForeground(Color.white);
		b8.setBackground(Color.DARK_GRAY);
		b8.setForeground(Color.white);
		b9.setBackground(Color.DARK_GRAY);
		b9.setForeground(Color.white);
		b0.setBackground(Color.DARK_GRAY);
		b0.setForeground(Color.white);
		dotB.setBackground(Color.DARK_GRAY);
		dotB.setForeground(Color.white);
		addB.setBackground(Color.DARK_GRAY);
		addB.setForeground(Color.white);
		subB.setBackground(Color.DARK_GRAY);
		subB.setForeground(Color.white);
		mulB.setBackground(Color.DARK_GRAY);
		mulB.setForeground(Color.white);
		divB.setBackground(Color.DARK_GRAY);
		divB.setForeground(Color.white);
		equalsB.setBackground(Color.DARK_GRAY);
		equalsB.setForeground(Color.white);
		cancelB.setBackground(Color.DARK_GRAY);
		cancelB.setForeground(Color.white);

		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(divB);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(mulB);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(subB);
		panel.add(dotB);
		panel.add(b0);
		panel.add(equalsB);
		panel.add(addB);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		dotB.addActionListener(this);
		addB.addActionListener(this);
		subB.addActionListener(this);
		divB.addActionListener(this);
		mulB.addActionListener(this);
		equalsB.addActionListener(this);
		cancelB.addActionListener(this);

		frame.setVisible(true);
		frame.repaint();
		inputline.setFocusable(false);
	}


	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1) { inputline.setText(inputline.getText()+b1.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b2) { inputline.setText(inputline.getText()+b2.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b3) { inputline.setText(inputline.getText()+b3.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b4) { inputline.setText(inputline.getText()+b4.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b5) { inputline.setText(inputline.getText()+b5.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b6) { inputline.setText(inputline.getText()+b6.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b7) { inputline.setText(inputline.getText()+b7.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b8) { inputline.setText(inputline.getText()+b8.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b9) { inputline.setText(inputline.getText()+b9.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==b0) { inputline.setText(inputline.getText()+b0.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==dotB) { inputline.setText(inputline.getText()+dotB.getText());inputline.requestFocusInWindow();return;}
		if(e.getSource()==cancelB) {
			inputline.setText(null);
			numhis.setText(null);
			oprhis.setText(null);
			calc.setRes(0.0);
			calc.setOpr("+");
			calc.setNewCalc(true);
		}

		if(inputline.getText().equals("") && !calc.isNewCalc()) {						
			if(e.getSource()==addB) {
				calc.setOpr("+");
				oprhis.setText("+");
			} else if(e.getSource()==subB) {
				calc.setOpr("-");
				oprhis.setText("-");
			} else if(e.getSource()==mulB) {
				calc.setOpr("*");
				oprhis.setText("*");
			} else if(e.getSource()==divB) {
				calc.setOpr("/");
				oprhis.setText("/");
			} else if(e.getSource()==equalsB) {
				oprhis.setText("=");
			}
		}


		if(e.getSource()==addB || e.getSource()==subB || 
				e.getSource()==mulB || e.getSource()==divB || e.getSource()==equalsB) {	

			Double inp;
			try {
				inp = Double.valueOf(inputline.getText());
				calc.setNewCalc(false);
				inputline.setText(null);
				inputline.requestFocusInWindow();
			} catch (NumberFormatException x) {
				inputline.setText(null);
				inputline.requestFocusInWindow();
				return;
			}

			if(e.getSource()==addB) {
				calc.calculate(inp,"+");
				oprhis.setText("+");
			} else if(e.getSource()==subB) {
				calc.calculate(inp,"-");
				oprhis.setText("-");
			} else if(e.getSource()==mulB) {
				calc.calculate(inp, "*");
				oprhis.setText("*");
			} else if(e.getSource()==divB) {
				calc.calculate(inp, "/");
				oprhis.setText("/");
			} else if(e.getSource()==equalsB) {
				calc.calculate(inp, "=");
				oprhis.setText("=");
			}
			numhis.setText(calc.getRes().toString());
		}

	}

}

