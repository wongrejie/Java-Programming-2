package gaming;

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

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setTitle("Ultimate Gamer Center System (ADMIN)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1023, 577); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel.setBounds(0, 0, 1009, 518);
		contentPane.add(panel);
		panel.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnNewMenu_1 = new JMenu("About Us");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Center");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin frame = new Admin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);

		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);

		JMenuItem employeeInfo = new JMenuItem("Employee Information");
		mnEmployee.add(employeeInfo);
		employeeInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
	
		JMenu mnEventInfoUpdate = new JMenu("Event Info ");
		menuBar.add(mnEventInfoUpdate);
		
		JMenuItem mntmNewMenuItem_7_1 = new JMenuItem("Update");
		mntmNewMenuItem_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				EventUpdate frame = new EventUpdate();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		mnEventInfoUpdate.add(mntmNewMenuItem_7_1);
		
				JMenu mnNewMenu = new JMenu("Admin");
				menuBar.add(mnNewMenu);
				
				JMenuItem mntmNewMenuLogout = new JMenuItem("Log out");
				mntmNewMenuLogout.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try { // 2.2 Exception Handling
							GamingCenter frame = new GamingCenter();
							if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Log Out",
									"Event Admin System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
							frame.setModalExclusionType(null);
							frame.setVisible(true);
								dispose();
							}
						}catch (Exception e1) {
								e1.printStackTrace();
							}	
					}
				});
				mnNewMenu.add(mntmNewMenuLogout);
							
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(255, 88, 536, 440);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\ultimate_Gamer-removebg-preview.png"));

		JLabel lblLocation_1 = new JLabel("Location : Kuala Terengganu City Center");
		lblLocation_1.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblLocation_1.setBackground(Color.LIGHT_GRAY);
		lblLocation_1.setBounds(36, 104, 503, 33);
		panel.add(lblLocation_1);

		JLabel lblOperatingHour = new JLabel("Operating Hour : 10a.m~10p.m");
		lblOperatingHour.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblOperatingHour.setBounds(36, 147, 357, 33);
		panel.add(lblOperatingHour);

		JLabel lblContact = new JLabel("Contact : 012-9988564 (WONG)");
		lblContact.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		lblContact.setBounds(36, 190, 355, 33);
		panel.add(lblContact);

		JLabel lblNameUltimate = new JLabel(" Ultimate Gamer Center");
		lblNameUltimate.setForeground(Color.BLACK);
		lblNameUltimate.setFont(new Font("Sylfaen", Font.BOLD, 50));
		lblNameUltimate.setBounds(224, 20, 581, 74);
		panel.add(lblNameUltimate);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				new ImageIcon("D:\\Gaming Pic\\159-1597906_esl-wallpaper-ninjas-in-pyjamas-black-and-white.jpg"));
		lblNewLabel.setBounds(10, 10, 989, 498);
		panel.add(lblNewLabel);

	}
}
