package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import mainMenu.MainMenu;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;

public class BowlingCentre extends JFrame {

	private JPanel contentPane;
	private Image img_close = new ImageIcon(UserOptionBowling.class.getResource("closebtn.jpeg")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BowlingCentre frame = new BowlingCentre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public BowlingCentre() {
		initComponents();
	}
	
	/**
	 * Create the frame.
	 */
	public void initComponents() {
		setTitle("Bowling Centre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblclose = new JLabel("");
		lblclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		lblclose.setHorizontalAlignment(SwingConstants.CENTER);
		lblclose.setBounds(936, 10, 30, 30);
		lblclose.setIcon(new ImageIcon(img_close));
		contentPane.add(lblclose);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 204));
		menuBar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		setJMenuBar(menuBar);
		
		JMenu mnBowlingCentre = new JMenu("Bowling Centre");
		mnBowlingCentre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnBowlingCentre);
		
		JRadioButtonMenuItem rdbtnmntmClose = new JRadioButtonMenuItem("Close");
		rdbtnmntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(rdbtnmntmClose, "Confirm if you want to exit", "Time Zone Bowling Centre", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		rdbtnmntmClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnBowlingCentre.add(rdbtnmntmClose);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnAbout);
		
		JRadioButtonMenuItem rdbtnmntmEventDetails = new JRadioButtonMenuItem("Event Details");
		rdbtnmntmEventDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDetailsBowling ed = new EventDetailsBowling();
				ed.setModalExclusionType(null);
				ed.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmEventDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnAbout.add(rdbtnmntmEventDetails);
		
		JMenu mnCustomer = new JMenu("Customer");
		mnCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnCustomer);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_3 = new JRadioButtonMenuItem("Participant Login");
		rdbtnmntmNewRadioItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLoginBowling cl = new CustomerLoginBowling();
				cl.setModalExclusionType(null);
				cl.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmNewRadioItem_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnCustomer.add(rdbtnmntmNewRadioItem_3);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Participant Register");
		rdbtnmntmNewRadioItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistrationBowling cr = new CustomerRegistrationBowling();
				cr.setModalExclusionType(null);
				cr.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmNewRadioItem_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnCustomer.add(rdbtnmntmNewRadioItem_1);
		
		JLabel lblNewLabel_1 = new JLabel("Let's bowl now!");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 293, 956, 52);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Discover");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarketingBowling m = new MarketingBowling();
				m.setModalExclusionType(null);
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(385, 375, 222, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Let's bowl now!");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel_1_1.setBounds(26, 293, 940, 47);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 1, 5, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 66, 956, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Login?");
		btnNewButton_1.setBounds(810, 10, 136, 36);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserOptionBowling u = new UserOptionBowling();
				u.setModalExclusionType(null);
				u.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 240, 245));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblContactUsAt = new JLabel("Contact us at 012-3456789");
		lblContactUsAt.setBounds(10, 0, 535, 33);
		panel.add(lblContactUsAt);
		lblContactUsAt.setHorizontalAlignment(SwingConstants.LEFT);
		lblContactUsAt.setForeground(Color.BLACK);
		lblContactUsAt.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel lblOrYouCan = new JLabel("or you can follow our FB page at TimeZoneBowlingCentre@fb.com!");
		lblOrYouCan.setBounds(10, 19, 623, 37);
		panel.add(lblOrYouCan);
		lblOrYouCan.setHorizontalAlignment(SwingConstants.LEFT);
		lblOrYouCan.setForeground(Color.BLACK);
		lblOrYouCan.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 204));
		panel_1.setBounds(10, 10, 956, 56);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Time Zone Bowling Centre");
		lblNewLabel_2.setBounds(-12, -10, 981, 66);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setForeground(new Color(51, 51, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BowlingCentre.class.getResource("/BowlingCentre/bowling-alley-interior-flat-vector-32291596.jpg")));
		//lblNewLabel.setIconImage(Toolkit.getDefaultToolkit().getImage(BowlingCentre.class.getResource("C:\\Users\\User\\eclipse-workspace\\P2 Project\\src\\insAsg3\\bowling-alley-interior-flat-vector-32291596.jpg")));
		lblNewLabel.setBounds(10, 10, 956, 656);
		contentPane.add(lblNewLabel);
	}
}
