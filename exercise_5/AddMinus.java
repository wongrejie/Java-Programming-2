package exercise_5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class AddMinus {

	private JFrame frame;
	private JTextField IntTextField;
	private JTextField IntTextField_1;
	private JTextField AnswertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
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
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton AddButton = new JButton("Add");
		AddButton.setBackground(new Color(238, 130, 238));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,answer;
				try {
					  num1 = Integer.parseInt(IntTextField.getText());
					  num2 = Integer.parseInt(IntTextField_1.getText());
					  
					  answer = num1+num2;
					  AnswertextField.setText(Integer.toString(answer));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter only integers. ");
				}
			}
		});
		AddButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AddButton.setBounds(101, 113, 135, 35);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("Minus");
		MinusButton.setBackground(new Color(218, 112, 214));
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,answer;
				try {
					  num1 = Integer.parseInt(IntTextField.getText());
					  num2 = Integer.parseInt(IntTextField_1.getText());
					  
					  answer = num1-num2;
					  AnswertextField.setText(Integer.toString(answer));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter only integers.");
				}
			}
		});
		MinusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MinusButton.setBounds(326, 113, 135, 35);
		frame.getContentPane().add(MinusButton);
		
		IntTextField = new JTextField();
		IntTextField.setBounds(101, 65, 135, 35);
		frame.getContentPane().add(IntTextField);
		IntTextField.setColumns(10);
		
		IntTextField_1 = new JTextField();
		IntTextField_1.setColumns(10);
		IntTextField_1.setBounds(326, 65, 135, 35);
		frame.getContentPane().add(IntTextField_1);
		
		JLabel AnswerLabel = new JLabel("Answer :");
		AnswerLabel.setForeground(Color.DARK_GRAY);
		AnswerLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		AnswerLabel.setBounds(132, 213, 91, 35);
		frame.getContentPane().add(AnswerLabel);
		
		AnswertextField = new JTextField();
		AnswertextField.setColumns(10);
		AnswertextField.setBounds(223, 216, 135, 35);
		frame.getContentPane().add(AnswertextField);
	}
}
