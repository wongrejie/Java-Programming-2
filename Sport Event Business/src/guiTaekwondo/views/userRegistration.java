package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userRegistration extends JFrame {

	public static JTable accountTable;
	private JPanel contentPane;
	private JButton signupButton;
	private JButton returnButton;
	private JTextField newPasswordTextField;
	private JTextField newUsernameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userRegistration frame = new userRegistration();
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
	public userRegistration() {
		initComponents();
		createEvents();

	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setForeground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel signUpPanel = new JPanel();
		signUpPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		signUpPanel.setBackground(new Color(255, 255, 255));
		
		returnButton = new JButton("Return");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(returnButton)
					.addGap(14)
					.addComponent(signUpPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(113))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(returnButton)
						.addComponent(signUpPanel, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JLabel signUpLabel = new JLabel("Sign Up");
		signUpLabel.setFont(new Font("Arial", Font.BOLD, 30));
		
		JLabel subTitleLabel = new JLabel("It's quick and easy.");
		subTitleLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel newUserNameLabel = new JLabel("Username: ");
		newUserNameLabel.setForeground(new Color(0, 0, 128));
		newUserNameLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel newPasswordLabel = new JLabel("New Password: ");
		newPasswordLabel.setForeground(new Color(0, 0, 128));
		newPasswordLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		newUsernameTextField = new JTextField();
		newUsernameTextField.setFont(new Font("Arial", Font.PLAIN, 12));
		newUsernameTextField.setColumns(10);
		
		newPasswordTextField = new JTextField();
		newPasswordTextField.setFont(new Font("Arial", Font.PLAIN, 12));
		newPasswordTextField.setColumns(10);
		
		JLabel policyLabel = new JLabel("By clicking Sign Up, you agree to our Terms, Data Policy and Cookie Policy.");
		policyLabel.setFont(new Font("Arial", Font.PLAIN, 8));
		
		signupButton = new JButton("Sign Up and Log In");

		signupButton.setBackground(new Color(100, 149, 237));
		signupButton.setForeground(new Color(255, 255, 255));
		signupButton.setFont(new Font("Arial", Font.BOLD, 20));
		GroupLayout gl_signUpPanel = new GroupLayout(signUpPanel);
		gl_signUpPanel.setHorizontalGroup(
			gl_signUpPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_signUpPanel.createSequentialGroup()
					.addContainerGap(97, Short.MAX_VALUE)
					.addGroup(gl_signUpPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_signUpPanel.createSequentialGroup()
							.addGroup(gl_signUpPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(signUpLabel, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
								.addComponent(subTitleLabel, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_signUpPanel.createSequentialGroup()
									.addGroup(gl_signUpPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(newUserNameLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
										.addComponent(newPasswordLabel))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_signUpPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(newPasswordTextField, Alignment.LEADING, 140, 140, 140)
										.addComponent(newUsernameTextField, Alignment.LEADING, 140, 140, 140))))
							.addGap(70))
						.addGroup(gl_signUpPanel.createSequentialGroup()
							.addComponent(policyLabel)
							.addGap(54))
						.addGroup(Alignment.TRAILING, gl_signUpPanel.createSequentialGroup()
							.addComponent(signupButton)
							.addGap(87))))
		);
		gl_signUpPanel.setVerticalGroup(
			gl_signUpPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_signUpPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(signUpLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(subTitleLabel)
					.addGap(40)
					.addGroup(gl_signUpPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(newUserNameLabel)
						.addComponent(newUsernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_signUpPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(newPasswordLabel)
						.addComponent(newPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(75)
					.addComponent(policyLabel)
					.addGap(41)
					.addComponent(signupButton)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		signUpPanel.setLayout(gl_signUpPanel);
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
		
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newUsernameTextField.getText().isBlank()||newPasswordTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null,"invalid username or password");
				}
				else {
					userAccount table=new userAccount();
					table.AddRowToJTable(new Object[]{
							newUsernameTextField.getText(),
							newPasswordTextField.getText()
                     });
					
					
					JOptionPane.showMessageDialog(null,"Sign Up Success.");
					participantRegistration frame = new participantRegistration();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
		            dispose();
				}
			}
		});
		
		
	}
}
