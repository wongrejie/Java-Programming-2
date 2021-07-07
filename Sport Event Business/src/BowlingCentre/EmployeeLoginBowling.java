package BowlingCentre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class EmployeeLoginBowling extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLoginBowling frame = new EmployeeLoginBowling();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeLoginBowling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 976, 704);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(94, 89, 812, 524);
		panel.add(panel_2);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(147, 112, 219));
		panel_5.setBounds(217, 70, 378, 9);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EmployeeLoginBowling.class.getResource("/BowlingCentre/242-2426653_service-and-support-icon-employee-with-computer-icon.png")));
		lblNewLabel.setBounds(32, 58, 308, 417);
		panel_2.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUserName.setBackground(Color.BLACK);
		lblUserName.setBounds(361, 109, 200, 61);
		panel_2.add(lblUserName);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField.setColumns(10);
		textField.setBounds(530, 112, 249, 60);
		panel_2.add(textField);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setBounds(361, 179, 234, 60);
		panel_2.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(passwordField.getText().equals("123456")) {
					passwordField.setEchoChar('*');
					passwordField.setText("");
				}
				else {
					passwordField.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals("")) {
					passwordField.setText("123456");
					passwordField.setEchoChar((char)0);
				}
			}
		});
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		passwordField.setBounds(530, 178, 249, 60);
		panel_2.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show password");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(530, 264, 165, 25);
		panel_2.add(rdbtnNewRadioButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnReset.setBackground(new Color(255, 250, 240));
		btnReset.setBounds(437, 404, 124, 55);
		panel_2.add(btnReset);
		
		JButton LoginButton = new JButton("Login now!");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if((textField.getText().equals("Roon Yi") && passwordField.getText().equals("123456")) ||
							(textField.getText().equals("Azman") && passwordField.getText().equals("aby123")) ||
							(textField.getText().equals("Janice") && passwordField.getText().equals("135791"))) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						EmployeeRegistrationBowling er  = new EmployeeRegistrationBowling();
						er.setModalExclusionType(null);
						er.setVisible(true);
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Login unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		LoginButton.setForeground(Color.BLACK);
		LoginButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		LoginButton.setBackground(new Color(248, 248, 255));
		LoginButton.setBounds(411, 318, 327, 55);
		panel_2.add(LoginButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Message", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					UserOptionBowling u = new UserOptionBowling();
					u.setModalExclusionType(null);
					u.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnExit.setBackground(new Color(255, 250, 240));
		btnExit.setBounds(593, 404, 113, 55);
		panel_2.add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Login Page");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setBounds(10, 21, 792, 53);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.control);
		panel_3.setBounds(10, 10, 334, 504);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 204));
		panel_1.setBounds(27, 35, 244, 198);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(766, 496, 128, 198);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(255, 228, 225));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(255, 182, 193));
		panel_3_1.setBounds(27, 255, 115, 25);
		panel.add(panel_3_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 192, 203));
		panel_4.setBounds(721, 582, 23, 112);
		panel.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel("- - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(64, 620, 812, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("- - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(154, 54, 750, 25);
		panel.add(lblNewLabel_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-");
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textArea.setBackground(new Color(255, 250, 250));
		textArea.setBounds(913, 54, 23, 580);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-\r\n-");
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textArea_1.setBackground(new Color(255, 250, 250));
		textArea_1.setBounds(64, 73, 23, 561);
		panel.add(textArea_1);
	}
}
