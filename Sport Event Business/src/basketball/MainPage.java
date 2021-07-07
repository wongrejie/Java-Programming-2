package basketball;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import mainMenu.MainMenu;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 737, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBackground(new Color(219, 112, 147));
		panel_1.setBounds(376, 64, 351, 385);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_3.setBackground(Color.PINK);
		panel_3.setBounds(10, 11, 331, 117);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME ");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel_1.setBounds(108, 11, 116, 35);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("to");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
		lblNewLabel_3.setBounds(152, 46, 26, 21);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("KNBASKETBALL CENTRE");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 26));
		lblNewLabel_4.setBounds(27, 66, 294, 40);
		panel_3.add(lblNewLabel_4);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ad = new Login();
				ad.setModalExclusionType(null);
				ad.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setForeground(new Color(255, 245, 238));
		btnAdmin.setBackground(new Color(205, 92, 92));
		btnAdmin.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnAdmin.setBounds(78, 181, 204, 57);
		panel_1.add(btnAdmin);
		
		JButton btnNewButton_1 = new JButton("PARTICIPANT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marketing pa = new Marketing();
				pa.setModalExclusionType(null);
				pa.setVisible(true);
				dispose();
			}
		});
				
			
		btnNewButton_1.setForeground(new Color(255, 228, 225));
		btnNewButton_1.setBackground(new Color(205, 92, 92));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_1.setBounds(78, 274, 204, 57);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Choose if you are :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 139, 187, 31);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 0, 737, 53);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("CONTACT : 0012-4536987      knbasketball@gmail.com");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(10, 11, 717, 31);
		panel_2.add(lblNewLabel_5);
		
		JButton MainMenubtn = new JButton("Main Menu");
		MainMenubtn.setBackground(new Color(220, 220, 220));
		MainMenubtn.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		MainMenubtn.setBounds(564, 13, 147, 32);
		panel_2.add(MainMenubtn);
		 MainMenubtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu frame = new MainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/basketball/Picture/photo-1546519638-68e109498ffc.jpg")));
		lblNewLabel.setBounds(-146, 0, 883, 460);
		panel.add(lblNewLabel);
	}
}
