package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=240,9
	 */
	private final JPanel panel = new JPanel();
	private JButton btnclr;
	private JButton btnpls;
	private JButton btnminus;
	private JButton btndiv;
	private JButton btn9;
	private JButton btn5;
	private JButton btn1;
	private JButton btnmp;
	private JButton btnpctg;
	private JButton btndot;
	private JButton btn0;
	private JButton btneql;
	private JButton btnzero;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 278, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		textField.setBounds(10, 11, 241, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnbs = new JButton("\uF0E7");
		btnbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnbs.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnbs.setBounds(10, 89, 53, 43);
		frame.getContentPane().add(btnbs);
		
		btnclr = new JButton("CL");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(null);
			}
		});
		btnclr.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		btnclr.setBounds(73, 89, 53, 43);
		frame.getContentPane().add(btnclr);
		
		btnpls = new JButton("+");
		btnpls.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btnpls.setBounds(136, 89, 53, 43);
		frame.getContentPane().add(btnpls);
		
		btnminus = new JButton("-");
		btnminus.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btnminus.setBounds(199, 89, 53, 43);
		frame.getContentPane().add(btnminus);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndiv.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btndiv.setBounds(10, 145, 53, 43);
		frame.getContentPane().add(btndiv);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn9.getText();
				textField.setText(nbr);
			}
		});
		btn9.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn9.setBounds(10, 199, 53, 43);
		frame.getContentPane().add(btn9);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn5.getText();
				textField.setText(nbr);
			}
		});
		btn5.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn5.setBounds(10, 253, 53, 43);
		frame.getContentPane().add(btn5);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn1.getText();
				textField.setText(nbr);
			}
		});
		btn1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn1.setBounds(10, 307, 53, 43);
		frame.getContentPane().add(btn1);
		
		btnmp = new JButton("*");
		btnmp.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btnmp.setBounds(73, 143, 53, 43);
		frame.getContentPane().add(btnmp);
		
		btnpctg = new JButton("%");
		btnpctg.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btnpctg.setBounds(136, 145, 53, 43);
		frame.getContentPane().add(btnpctg);
		
		btndot = new JButton(".");
		btndot.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btndot.setBounds(198, 143, 53, 43);
		frame.getContentPane().add(btndot);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String nbr =textField.getText()+btn0.getText();
				textField.setText(nbr);
				}
		});
		btn0.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn0.setBounds(73, 199, 53, 43);
		frame.getContentPane().add(btn0);
		
		btneql = new JButton("=");
		btneql.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btneql.setBounds(136, 199, 53, 43);
		frame.getContentPane().add(btneql);
		
		btnzero = new JButton("00");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btnzero.getText();
				textField.setText(nbr);
			}
		});
		btnzero.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btnzero.setBounds(199, 199, 53, 43);
		frame.getContentPane().add(btnzero);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn6.getText();
				textField.setText(nbr);
			}
		});
		btn6.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn6.setBounds(73, 253, 53, 43);
		frame.getContentPane().add(btn6);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn7.getText();
				textField.setText(nbr);
			}
		});
		btn7.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn7.setBounds(136, 253, 53, 43);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn8.getText();
				textField.setText(nbr);
			}
		});
		btn8.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn8.setBounds(199, 253, 53, 43);
		frame.getContentPane().add(btn8);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn2.getText();
				textField.setText(nbr);
			}
		});
		btn2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn2.setBounds(73, 307, 53, 43);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn3.getText();
				textField.setText(nbr);
			}
		});
		btn3.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn3.setBounds(136, 307, 53, 43);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr =textField.getText()+btn4.getText();
				textField.setText(nbr);
			}
		});
		btn4.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		btn4.setBounds(198, 307, 53, 43);
		frame.getContentPane().add(btn4);
	}
}
