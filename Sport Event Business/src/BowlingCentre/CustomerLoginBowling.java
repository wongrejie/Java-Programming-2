package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class CustomerLoginBowling extends JFrame {

	private JPanel contentPane;
	JTextField UserNameTextField;
	JPasswordField passwordField;
	private Image img_close = new ImageIcon(UserOptionBowling.class.getResource("closebtn.jpeg")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	protected JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLoginBowling frame = new CustomerLoginBowling();
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
	public CustomerLoginBowling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 976, 704);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblclose = new JLabel("");
		lblclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you confirm to exit", "Time Zone Bowling Centre", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					UserOptionBowling u = new UserOptionBowling();
					u.setModalExclusionType(null);
					u.setVisible(true);
					dispose();
				}
			}
		});
		lblclose.setHorizontalAlignment(SwingConstants.CENTER);
		lblclose.setBounds(936, 10, 30, 30);
		lblclose.setIcon(new ImageIcon(img_close));
		panel.add(lblclose);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to Bowling Event!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(124, 62, 702, 95);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(124, 62, 702, 95);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(10, 55, 60, 10);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.RED);
		panel_2_1.setBounds(632, 55, 60, 10);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.RED);
		panel_2_1_1.setBounds(632, 35, 60, 10);
		panel_1.add(panel_2_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.RED);
		panel_2_2.setBounds(10, 35, 60, 10);
		panel_1.add(panel_2_2);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblUserName.setBackground(Color.BLACK);
		lblUserName.setBounds(72, 245, 234, 68);
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setBounds(72, 376, 234, 68);
		panel.add(lblPassword);
		
		UserNameTextField = new JTextField();
		UserNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		UserNameTextField.setColumns(10);
		UserNameTextField.setBounds(349, 247, 286, 68);
		panel.add(UserNameTextField);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNameTextField.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnReset.setBackground(new Color(255, 228, 225));
		btnReset.setBounds(116, 531, 150, 55);
		panel.add(btnReset);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = FirstTimeLoginBowling.getTable();
				String un;
				String pw;
				boolean login = false;
				
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						un = String.valueOf(t.getValueAt(i, 0));
						pw = String.valueOf(t.getValueAt(i, 1));
						
						if(UserNameTextField.getText().equals(un) && passwordField.getText().equals(pw)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						EventDetailsBowling ed = new EventDetailsBowling();
						ed.setModalExclusionType(null);
						ed.setVisible(true);
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
		LoginButton.setBackground(new Color(255, 228, 225));
		LoginButton.setBounds(343, 531, 150, 55);
		panel.add(LoginButton);
		
		JButton btnFirstTimeLogin = new JButton("First Time Login?");
		btnFirstTimeLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstTimeLoginBowling f = new FirstTimeLoginBowling();
				f.setModalExclusionType(null);
				f.setVisible(true);
				dispose();
			}
		});
		btnFirstTimeLogin.setForeground(Color.BLACK);
		btnFirstTimeLogin.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnFirstTimeLogin.setBackground(new Color(255, 228, 225));
		btnFirstTimeLogin.setBounds(571, 531, 265, 55);
		panel.add(btnFirstTimeLogin);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 35));
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
		passwordField.setBounds(349, 376, 286, 68);
		panel.add(passwordField);
		
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
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(349, 472, 165, 25);
		panel.add(rdbtnNewRadioButton);
		
		JLabel lblBowling = new JLabel("");
		lblBowling.setIcon(new ImageIcon(CustomerLoginBowling.class.getResource("/BowlingCentre/13278508_G.jpg")));
		lblBowling.setBounds(247, 150, 719, 544);
		panel.add(lblBowling);
	}

}
