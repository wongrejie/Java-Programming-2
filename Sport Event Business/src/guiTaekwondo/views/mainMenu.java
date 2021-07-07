package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import mainMenu.MainMenu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private JButton adminButton;
	private JButton exitButton;
	private JButton aboutButton;
	private JButton logInButton;
	private JButton signInButton;
	private JButton learnMoreButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenu frame = new mainMenu();
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
	public mainMenu() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setForeground(new Color(176, 196, 222));
		setIconImage(Toolkit.getDefaultToolkit().getImage(mainMenu.class.getResource("/gui/resources/taekwondo icon.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel backgroundPpanel = new JPanel();
		backgroundPpanel.setBackground(new Color(230, 230, 250));
		backgroundPpanel.setForeground(new Color(230, 230, 250));
		backgroundPpanel.setBorder(null);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setLabelFor(contentPane);
		backgroundLabel.setIcon(new ImageIcon(mainMenu.class.getResource("/gui/resources/pngwing.com.png")));
		
		JPanel loginPanel = new JPanel();
		loginPanel.setForeground(new Color(240, 248, 255));
		loginPanel.setBackground(new Color(240, 255, 240));
		
		exitButton = new JButton("");

		exitButton.setForeground(new Color(255, 255, 255));
		exitButton.setBackground(new Color(255, 255, 255));
		exitButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/exit.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		exitButton.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		usernameTextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		passwordTextField = new JTextField();
		passwordTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		passwordTextField.setColumns(10);
		
		logInButton = new JButton("Log In");

		logInButton.setBackground(new Color(224, 255, 255));
		logInButton.setFont(new Font("Arial", Font.BOLD, 11));
		
		signInButton = new JButton("Sign In");
		signInButton.setBackground(new Color(175, 238, 238));
		signInButton.setFont(new Font("Arial", Font.BOLD, 11));
		GroupLayout gl_loginPanel = new GroupLayout(loginPanel);
		gl_loginPanel.setHorizontalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(144)
					.addComponent(usernameLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(usernameTextField, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordTextField, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(signInButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(logInButton, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_loginPanel.setVerticalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addGap(4)
							.addComponent(usernameLabel))
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addGroup(gl_loginPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordLabel)
								.addComponent(logInButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(signInButton)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		loginPanel.setLayout(gl_loginPanel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(backgroundPpanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(backgroundPpanel, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
		);
		
		adminButton = new JButton("");

		adminButton.setBackground(new Color(255, 250, 240));
		adminButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/admin.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		
		JLabel titleLabel = new JLabel("UUM DOJANG");
		titleLabel.setForeground(new Color(178, 34, 34));
		titleLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		
		aboutButton = new JButton("About Us");


		aboutButton.setBackground(new Color(255, 255, 255));
		aboutButton.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JLabel eventLabel = new JLabel("Log in and join our event now!!");
		eventLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		
		learnMoreButton = new JButton("Learn more...");

		learnMoreButton.setBackground(new Color(255, 255, 255));
		learnMoreButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_backgroundPpanel = new GroupLayout(backgroundPpanel);
		gl_backgroundPpanel.setHorizontalGroup(
			gl_backgroundPpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_backgroundPpanel.createSequentialGroup()
					.addComponent(backgroundLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_backgroundPpanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(learnMoreButton, Alignment.LEADING)
						.addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
						.addComponent(aboutButton)
						.addComponent(adminButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(eventLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
					.addContainerGap())
				.addComponent(loginPanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
		);
		gl_backgroundPpanel.setVerticalGroup(
			gl_backgroundPpanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_backgroundPpanel.createParallelGroup(Alignment.TRAILING, false)
					.addGroup(Alignment.LEADING, gl_backgroundPpanel.createSequentialGroup()
						.addComponent(loginPanel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addGap(74)
						.addComponent(titleLabel)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(aboutButton)
						.addGap(27)
						.addComponent(eventLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(learnMoreButton)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(adminButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addComponent(backgroundLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
		);
		backgroundPpanel.setLayout(gl_backgroundPpanel);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	private void createEvents() {
		
		adminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminLogin frame = new adminLogin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dojangDetail frame = new dojangDetail();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
			}
		});
		
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userAccount accountData=new userAccount();
				DefaultTableModel model = (DefaultTableModel) accountData.getAccountTable().getModel();
				
				int row=model.getRowCount();
				int check=0;
				for(int i=0;i<row;i++) {
					if(usernameTextField.getText().equals(model.getValueAt(i, 0))&&passwordTextField.getText().equals(model.getValueAt(i, 1))) {
						participantRegistration frame = new participantRegistration();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
			            dispose();
			            check=1;
					}
				}
				if(check==0) {
					JOptionPane.showMessageDialog(null, "Invalid username or password.");
				}
			}
		});
		
		signInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userRegistration frame = new userRegistration();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
			}
		});
		
		learnMoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				learnMoreButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						eventDetail frame = new eventDetail();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
			            dispose();
					}
				});
			}
		});
		
		
	}
}
