package gaming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import mainMenu.MainMenu;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class GamingCenter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamingCenter frame = new GamingCenter();
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
	public GamingCenter() {
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 581); //set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Home");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GamingCenter frame = new GamingCenter();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				 dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);

		JMenu mnNewMenu_4 = new JMenu("Event");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuDetail = new JMenuItem("Event Detail");
		mnNewMenu_4.add(mntmNewMenuDetail);
		mntmNewMenuDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDetail frame = new EventDetail();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				 dispose();
			}
		});
		JMenuItem mntmNewMenuItem_6_1 = new JMenuItem("Advertisement");
		mnNewMenu_4.add(mntmNewMenuItem_6_1);
		
		 mntmNewMenuItem_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing frame = new Marketing();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				 dispose();
			}
		});
		 JMenu mnNewMenu_4_1 = new JMenu("Account");
			menuBar.add(mnNewMenu_4_1);
			
			JMenuItem mntmLogin = new JMenuItem("Login");
			mnNewMenu_4_1.add(mntmLogin);
			mntmLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Login frame = new Login();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						 dispose();
					}
				});
			JMenuItem mntmRegisterNewAccount = new JMenuItem("Register New Account");
			mnNewMenu_4_1.add(mntmRegisterNewAccount);
			mntmRegisterNewAccount.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserRegistration frame = new UserRegistration();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					 dispose();
				}
			});
			
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel.setBounds(0, 0, 1000, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton EventDetail_1 = new JButton("Recent Event");
		EventDetail_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		EventDetail_1.setBounds(35, 293, 324, 53);
		panel.add(EventDetail_1);
		EventDetail_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDetail ed = new EventDetail(); //calling another frame/window
				ed.setModalExclusionType(null);
	            ed.setVisible(true);
	            dispose();
			}
		});
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(259, 72, 536, 440);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(GamingCenter.class.getResource("/gaming/ultimate_Gamer-removebg-preview.png")));
		
		JLabel lblNameUltimate = new JLabel(" Ultimate Gamer Center");
		lblNameUltimate.setForeground(new Color(255, 255, 255));
		lblNameUltimate.setFont(new Font("Sylfaen", Font.BOLD, 50));
		lblNameUltimate.setBounds(191, 10, 581, 74);
		panel.add(lblNameUltimate);
		
		JLabel lblLocation_1 = new JLabel("Location : Kuala Terengganu City Center");
		lblLocation_1.setForeground(new Color(255, 255, 255));
		lblLocation_1.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblLocation_1.setBackground(Color.LIGHT_GRAY);
		lblLocation_1.setBounds(52, 85, 503, 33);
		panel.add(lblLocation_1);
		
		JLabel lblOperatingHour = new JLabel("Operating Hour : 10a.m~10p.m");
		lblOperatingHour.setForeground(new Color(255, 255, 255));
		lblOperatingHour.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblOperatingHour.setBounds(52, 136, 357, 33);
		panel.add(lblOperatingHour);
		
		JLabel lblContact = new JLabel("Contact : 012-9988564 (WONG)");
		lblContact.setForeground(new Color(255, 255, 255));
		lblContact.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblContact.setBounds(52, 187, 379, 33);
		panel.add(lblContact);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GamingCenter.class.getResource("/gaming/e16d4219e671bac00d1c23131e6d723f.jpg")));
		lblNewLabel.setBounds(178, 10, 569, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNameUltimate_1 = new JLabel("Loading...");
		lblNameUltimate_1.setForeground(Color.WHITE);
		lblNameUltimate_1.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lblNameUltimate_1.setBounds(24, 438, 363, 74);
		panel.add(lblNameUltimate_1);
		
		JButton advertisement = new JButton("Advertisement");
		advertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing ed = new Marketing(); //calling another frame/window
				ed.setModalExclusionType(null);
	            ed.setVisible(true);
	            dispose();
			}
		});
		advertisement.setFont(new Font("Times New Roman", Font.BOLD, 20));
		advertisement.setBounds(677, 293, 298, 53);
		panel.add(advertisement);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		Back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Back.setBounds(857, 453, 118, 45);
		panel.add(Back);
		
		JLabel lblEmail = new JLabel("E-mail: Wongx@gmail.com");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblEmail.setBounds(52, 230, 379, 33);
		panel.add(lblEmail);
		
		JButton btnExit = new JButton("X");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Ultimate Gamer Center", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(255, 0, 51));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(934, 10, 56, 33);
		panel.add(btnExit);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(GamingCenter.class.getResource("/gaming/abstract-black-hexagon-pattern-on-red-neon-vector-24410569.jpg")));
		background.setBounds(10, 10, 980, 502);
		panel.add(background);
		
	}
}