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
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminMainMenu extends JFrame {

	private JPanel contentPane;
	private JButton returnButton;
	private JButton participantButton;
	private JButton employeeButton;
	private JButton accountButton;
	private JButton marketingButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminMainMenu frame = new adminMainMenu();
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
	public adminMainMenu() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel adminPanel = new JPanel();
		adminPanel.setBackground(new Color(65, 105, 225));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		
		participantButton = new JButton("Participant Details");
		participantButton.setBackground(new Color(255, 204, 255));
		participantButton.setFont(new Font("Arial", Font.BOLD, 18));
		
		employeeButton = new JButton("Human Resources\r\n");
		employeeButton.setBackground(new Color(153, 153, 204));
		employeeButton.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/icon2.png")).getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH)));
		
		accountButton = new JButton("Account");
		accountButton.setBackground(new Color(204, 255, 255));
		accountButton.setFont(new Font("Arial", Font.BOLD, 18));
		
		marketingButton = new JButton("Marketing");

		marketingButton.setFont(new Font("Arial", Font.BOLD, 20));
		GroupLayout gl_adminPanel = new GroupLayout(adminPanel);
		gl_adminPanel.setHorizontalGroup(
			gl_adminPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_adminPanel.createSequentialGroup()
					.addGroup(gl_adminPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_adminPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
						.addGroup(gl_adminPanel.createSequentialGroup()
							.addGap(61)
							.addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_adminPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_adminPanel.createSequentialGroup()
									.addGap(68)
									.addComponent(marketingButton))
								.addGroup(gl_adminPanel.createSequentialGroup()
									.addGap(34)
									.addGroup(gl_adminPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(employeeButton)
										.addComponent(participantButton)))
								.addGroup(gl_adminPanel.createSequentialGroup()
									.addGap(82)
									.addComponent(accountButton)))))
					.addContainerGap())
		);
		gl_adminPanel.setVerticalGroup(
			gl_adminPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_adminPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(gl_adminPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_adminPanel.createSequentialGroup()
							.addGap(10)
							.addComponent(participantButton)
							.addGap(18)
							.addComponent(marketingButton)
							.addGap(18)
							.addComponent(employeeButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(accountButton)))
					.addGap(48))
		);
		
		JLabel DashboardLabel = new JLabel("Dashboard");
		DashboardLabel.setForeground(new Color(0, 0, 128));
		DashboardLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/administrator.png")).getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH)));
		DashboardLabel.setFont(new Font("Arial", Font.BOLD, 25));
		
		returnButton = new JButton("Return\r\n");

		returnButton.setBackground(new Color(30, 144, 255));
		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		returnButton.setFont(new Font("Arial", Font.PLAIN, 12));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(185)
					.addComponent(DashboardLabel, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
					.addGap(213))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(returnButton)
					.addContainerGap(489, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addComponent(DashboardLabel)
					.addGap(27))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(returnButton)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		adminPanel.setLayout(gl_adminPanel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(adminPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(adminPanel, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
		);
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
	
		
		participantButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				participantDetail frame = new participantDetail();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		employeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employee frame = new employee();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		accountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userAccount frame = new userAccount();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();

			}
		});
		
		marketingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marketing frame = new marketing();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();

			}
		});
		
		
	}
}
