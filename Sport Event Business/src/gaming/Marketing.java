package gaming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.AncestorListener;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
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
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Marketing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marketing frame = new Marketing();
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
	public Marketing() {
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1009, 574); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Discount d= new WeekendDiscountRate();
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


		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		panel.setBounds(0, 0, 985, 516);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setForeground(Color.WHITE);
		panel_1_1_1_2_1.setBounds(763, 301, 199, 194);
		panel_1_1_1_2_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel_1_1_1_2_1.setBackground(Color.WHITE);
		panel.add(panel_1_1_1_2_1);
		panel_1_1_1_2_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Marketing.class.getResource("/gaming/League_of_Legends_icon.png")));
		lblNewLabel_1.setBounds(10, 0, 179, 193);
		panel_1_1_1_2_1.add(lblNewLabel_1);

		JPanel panel_1_1_1_2_1_1 = new JPanel();
		panel_1_1_1_2_1_1.setBounds(723, 79, 199, 194);
		panel_1_1_1_2_1_1.setLayout(null);
		panel_1_1_1_2_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel_1_1_1_2_1_1.setBackground(new Color(204, 204, 255));
		panel.add(panel_1_1_1_2_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Marketing.class.getResource("/gaming/1502212035_preview_download.jpg")));
		lblNewLabel_1_1.setBounds(10, 10, 179, 174);
		panel_1_1_1_2_1_1.add(lblNewLabel_1_1);

		JPanel panel_1_1_1_2_1_1_1 = new JPanel();
		panel_1_1_1_2_1_1_1.setBounds(516, 267, 199, 194);
		panel_1_1_1_2_1_1_1.setLayout(null);
		panel_1_1_1_2_1_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel_1_1_1_2_1_1_1.setBackground(new Color(204, 204, 255));
		panel.add(panel_1_1_1_2_1_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Marketing.class.getResource("/gaming/War_Shield.png")));
		lblNewLabel_1_1_1.setBounds(-27, 10, 216, 206);
		panel_1_1_1_2_1_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblPrize = new JLabel("Prize up to: RM 999.00");
		lblPrize.setForeground(Color.BLACK);
		lblPrize.setFont(new Font("Perpetua", Font.BOLD | Font.ITALIC, 40));
		lblPrize.setBounds(155, 70, 381, 44);
		panel.add(lblPrize);
		
		JLabel lblEventName = new JLabel(" ULTIMATE GAMERS EVENT TORNAMENT");
		lblEventName.setForeground(Color.BLACK);
		lblEventName.setFont(new Font("Papyrus", Font.BOLD, 25));
		lblEventName.setBackground(new Color(204, 204, 255));
		lblEventName.setBounds(31, 27, 770, 33);
		panel.add(lblEventName);
		
		JTextPane txtpnAdvertisement = new JTextPane();
		txtpnAdvertisement.setText("=====================================================================\r\nSkilled gamer? \r\nfinding a place to unleash your skills to defeat your opponents?\r\nULTIMATE GAMERS EVENT TORNAMENT IS COMING SOON!\r\n\r\nThe total winning prizes are up to RM 999!\r\nThe registration fee is RM 85~95 for each participants!\r\n\r\nSPECIAL WEEKEND PRICE ("+ 
		d.discountRate()*100+"% off) for participant that register at FRIDAY/SATURDAY.\r\n\r\nHurry up and grab the chance to win the prize by defeating your opponent!\r\n\r\nKindly contact 012-9988564 for more details.\r\n=====================================================================");
		txtpnAdvertisement.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtpnAdvertisement.setBounds(32, 261, 457, 234);
		panel.add(txtpnAdvertisement);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Marketing.class.getResource("/gaming/wp8371602.jpg")));
		lblNewLabel_2.setBounds(165, 27, 810, 492);
		panel.add(lblNewLabel_2);

	}
}
