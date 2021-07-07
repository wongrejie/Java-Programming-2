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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;

public class UserOptionBowling extends JFrame {

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
					UserOptionBowling frame = new UserOptionBowling();
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
	public UserOptionBowling() {
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
					BowlingCentre b = new BowlingCentre();
					b.setModalExclusionType(null);
					b.setVisible(true);
					dispose();
				}
			}
		});
		lblclose.setHorizontalAlignment(SwingConstants.CENTER);
		lblclose.setBounds(936, 10, 30, 30);
		lblclose.setIcon(new ImageIcon(img_close));
		panel.add(lblclose);
		
		JLabel lblAdmin = new JLabel("");
		lblAdmin.setIcon(new ImageIcon(UserOptionBowling.class.getResource("/BowlingCentre/admin-settings-male.png")));
		lblAdmin.setBounds(211, 234, 219, 236);
		panel.add(lblAdmin);
		
		JLabel lblNewLabel = new JLabel("Hi! Please select here...");
		lblNewLabel.setBounds(147, 135, 668, 76);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(UserOptionBowling.class.getResource("/BowlingCentre/gender-neutral-user.png")));
		lblNewLabel_1.setBounds(564, 234, 213, 245);
		panel.add(lblNewLabel_1);
		
		JToggleButton tglbtnAdmin = new JToggleButton("ADMIN");
		tglbtnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeLoginBowling el = new EmployeeLoginBowling();
				el.setModalExclusionType(null);
				el.setVisible(true);
				dispose();
			}
		});
		tglbtnAdmin.setFont(new Font("Tahoma", Font.BOLD, 28));
		tglbtnAdmin.setBounds(205, 474, 225, 57);
		panel.add(tglbtnAdmin);
		
		JToggleButton tglbtnCustomer = new JToggleButton("CUSTOMER");
		tglbtnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLoginBowling c = new CustomerLoginBowling();
				c.setModalExclusionType(null);
				c.setVisible(true);
				dispose();
			}
		});
		tglbtnCustomer.setFont(new Font("Tahoma", Font.BOLD, 28));
		tglbtnCustomer.setBounds(564, 474, 225, 57);
		panel.add(tglbtnCustomer);
	}
}
