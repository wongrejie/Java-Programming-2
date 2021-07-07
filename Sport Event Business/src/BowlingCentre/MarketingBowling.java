package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.text.DecimalFormat;

public class MarketingBowling extends JFrame {

	private JPanel contentPane;
	private JTextField txtRm;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarketingBowling frame = new MarketingBowling();
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
	public MarketingBowling() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(462, 68, 491, 110);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Let's Bowl Now!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel_2.setBounds(10, 10, 471, 90);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MarketingBowling.class.getResource("/BowlingCentre/12.jpg")));
		lblNewLabel.setBounds(659, 399, 307, 295);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MarketingBowling.class.getResource("/BowlingCentre/3.jpg")));
		lblNewLabel_1.setBounds(22, 10, 920, 283);
		panel.add(lblNewLabel_1);
		
		JLabel lblEventVenue = new JLabel("Bowling Event Venue : Time Zone Bowling Centre");
		lblEventVenue.setHorizontalAlignment(SwingConstants.LEFT);
		lblEventVenue.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEventVenue.setBounds(441, 221, 512, 25);
		panel.add(lblEventVenue);
		
		JLabel lblContact = new JLabel("Contact : 012-3456789 / FB: TimeZoneBowlingCentre@fb.com");
		lblContact.setForeground(Color.DARK_GRAY);
		lblContact.setHorizontalAlignment(SwingConstants.LEFT);
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblContact.setBounds(431, 256, 535, 24);
		panel.add(lblContact);
		
		JLabel lblLocationSkudai = new JLabel("Location                       : Skudai, Johor Bahru, Johor");
		lblLocationSkudai.setHorizontalAlignment(SwingConstants.LEFT);
		lblLocationSkudai.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLocationSkudai.setBounds(441, 188, 512, 25);
		panel.add(lblLocationSkudai);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(10, 303, 956, 10);
		panel.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.RED);
		panel_2_1.setBounds(10, 323, 956, 4);
		panel.add(panel_2_1);
		
		JTextArea txtrContactFor = new JTextArea();
		txtrContactFor.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtrContactFor.setText("Contact 012-3456789 for registration of the \r\nBowling Event in Time Zone Bowling Centre now !\r\n\r\nRegistration fee is lowest at RM 25.49 now especially\r\nfor every Saturday and Sunday!\r\n\r\nThe prizes given are up to RM 500 to the highest \r\nmark team! Let's bowling now !");
		txtrContactFor.setBounds(22, 426, 604, 244);
		panel.add(txtrContactFor);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 250, 250));
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(22, 348, 931, 55);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDay = new JLabel("Day     :\r\n");
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDay.setBounds(10, 10, 113, 35);
		panel_3.add(lblDay);
		
		JComboBox DayComboBox = new JComboBox();
		DayComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalPayment wdp = new PriceRate();
				String c = (String) DayComboBox.getSelectedItem();
				if(DayComboBox.getSelectedItem() == "Sunday" || DayComboBox.getSelectedItem() == "Saturday") {
					Discount dd = new WeekendDiscount();
					double disc = dd.discountRate();
					String result = String.valueOf(df2.format(wdp.totalPrice(c, disc)));
					txtRm.setText("RM " + result);
				}
				else {
					String result = String.valueOf(wdp.totalPrice());
					txtRm.setText("RM " + result);
				}
			}
		});
		DayComboBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		DayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
		DayComboBox.setBackground(new Color(255, 255, 255));
		DayComboBox.setBounds(123, 10, 220, 35);
		panel_3.add(DayComboBox);
		
		JLabel lblNewLabel_3_1 = new JLabel("Registration Fee:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3_1.setBounds(437, 10, 197, 35);
		panel_3.add(lblNewLabel_3_1);
		
		txtRm = new JTextField();
		txtRm.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtRm.setText("RM ");
		txtRm.setBounds(642, 10, 197, 35);
		panel_3.add(txtRm);
		txtRm.setColumns(10);
		
		JButton btnNewButton = new JButton("<Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BowlingCentre b = new BowlingCentre();
				b.setModalExclusionType(null);
				b.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(852, 20, 101, 38);
		panel.add(btnNewButton);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarketingDetailsBowling md = new MarketingDetailsBowling();
				md.setModalExclusionType(null);
				md.setVisible(true);
				dispose();
			}
		});
		btnDetails.setForeground(Color.BLUE);
		btnDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDetails.setBackground(new Color(255, 240, 245));
		btnDetails.setBounds(734, 20, 108, 38);
		panel.add(btnDetails);
	}
}
