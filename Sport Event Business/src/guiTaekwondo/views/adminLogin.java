package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField adminNameTextField;
	private JPasswordField adminPasswordField;
	private JButton returnButton;
	private JButton adminSignInButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin frame = new adminLogin();
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
	public adminLogin() {

		initComponents();
		createEvents();
	}

	private void initComponents() {
		setTitle("Admin Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(adminLogin.class.getResource("/gui/resources/administrator.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
		);
		
		JLabel adminLoginLabel = new JLabel("Administrator");
		adminLoginLabel.setForeground(new Color(25, 25, 112));
		adminLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adminLoginLabel.setFont(new Font("Arial", Font.BOLD, 40));
		adminLoginLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/admin.png")).getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH)));
		
		JLabel adminNameLabel = new JLabel("Username:");
		adminNameLabel.setFont(new Font("Arial", Font.BOLD, 15));
		
		adminNameTextField = new JTextField();
		adminNameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
		adminNameTextField.setColumns(10);
		
		adminPasswordField = new JPasswordField();
		adminPasswordField.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JLabel adminPasswordLabel = new JLabel("Password:");
		adminPasswordLabel.setFont(new Font("Arial", Font.BOLD, 15));
		
		adminSignInButton = new JButton("Sign In\r\n");

		adminSignInButton.setForeground(new Color(255, 255, 255));
		adminSignInButton.setBackground(new Color(25, 25, 112));
		adminSignInButton.setFont(new Font("Arial", Font.PLAIN, 20));
		
		returnButton = new JButton("Return");
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		returnButton.setFont(new Font("Arial", Font.PLAIN, 12));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(262)
					.addComponent(adminSignInButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(263))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(182)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(adminPasswordLabel)
						.addComponent(adminNameLabel, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(adminPasswordField, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(adminNameTextField, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
					.addGap(168))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(returnButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(adminLoginLabel, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
					.addGap(92))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(returnButton)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(adminLoginLabel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(85)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(adminNameLabel)
								.addComponent(adminNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(adminPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(adminPasswordLabel))
							.addGap(51)
							.addComponent(adminSignInButton)))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvents() {
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu frame = new mainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		adminSignInButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String password=String.valueOf(adminPasswordField.getPassword()) ;
				if(adminNameTextField.getText().equals("admin")&&password.equals("admin") ) {
					JOptionPane.showMessageDialog(null, "Login success.");
					adminMainMenu frame = new adminMainMenu();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
		            dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid username or password.");
				}
			}
		});
		
	}
}
