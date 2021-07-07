package basketball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Login extends JFrame{

	private JPanel contentPane;
	private JTextField UsernameTextField;
	private JTextField PasswordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
	
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 472, 453);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(205, 92, 92));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(139, 0, 0), 5));
		panel.setBackground(new Color(240, 128, 128));
		panel.setBounds(10, 11, 432, 67);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KNBASKETBALL CENTRE");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 11, 496, 45);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(139, 0, 0), 5));
		panel_1.setBackground(new Color(240, 128, 128));
		panel_1.setBounds(10, 167, 211, 67);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 27));
		lblNewLabel_1.setBounds(10, 11, 191, 45);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(139, 0, 0), 5));
		panel_1_1.setBackground(new Color(240, 128, 128));
		panel_1_1.setBounds(10, 245, 211, 67);
		getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 27));
		lblNewLabel_2.setBounds(10, 11, 191, 45);
		panel_1_1.add(lblNewLabel_2);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 27));
		UsernameTextField.setBounds(231, 167, 211, 67);
		getContentPane().add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(139, 0, 0), 5));
		panel_1_1_1.setBackground(new Color(240, 128, 128));
		panel_1_1_1.setBounds(10, 89, 432, 67);
		getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("LOGIN");
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 27));
		lblNewLabel_2_1.setBounds(173, 11, 84, 45);
		panel_1_1_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setForeground(new Color(255, 182, 193));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					if(UsernameTextField.getText().equals("Afiza") && PasswordTextField.getText().equals("123456")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						Admin frame =  new Admin();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						dispose();
						
					}
					else
						JOptionPane.showMessageDialog(null, "Please enter the right username and password !!!!");
				}
				catch (Exception f) {
					f.printStackTrace();
						}
					}
				
		});
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 27));
		btnNewButton.setBounds(231, 340, 211, 58);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setForeground(new Color(255, 182, 193));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameTextField.setText("");
				PasswordTextField.setText("");
			}
		});
		btnNewButton_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 27));
		btnNewButton_1.setBounds(10, 340, 211, 58);
		getContentPane().add(btnNewButton_1);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 27));
		PasswordTextField.setBounds(231, 245, 211, 67);
		getContentPane().add(PasswordTextField);
		PasswordTextField.setColumns(10);
	}
}
