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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.MouseEvent;

public class MarketingDetailsBowling extends JFrame {

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
					MarketingDetailsBowling frame = new MarketingDetailsBowling();
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
	public MarketingDetailsBowling() {
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
				if (JOptionPane.showConfirmDialog(frame, "Are you confirm to exit?", "Time Zone Bowling Centre", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					MarketingBowling m = new MarketingBowling();
					m.setModalExclusionType(null);
					m.setVisible(true);
					dispose();
				}
			}
		});
		lblclose.setHorizontalAlignment(SwingConstants.CENTER);
		lblclose.setBounds(936, 10, 30, 30);
		lblclose.setIcon(new ImageIcon(img_close));
		panel.add(lblclose);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(345, 234, 288, 301);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(31, 234, 288, 301);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea DuckPinTextArea = new JTextArea();
		DuckPinTextArea.setEditable(false);
		DuckPinTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		DuckPinTextArea.setBounds(31, 567, 287, 90);
		panel.add(DuckPinTextArea);
		
		JTextArea FivePinTextArea = new JTextArea();
		FivePinTextArea.setEditable(false);
		FivePinTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FivePinTextArea.setBounds(345, 567, 288, 90);
		panel.add(FivePinTextArea);
		
		JTextArea CandlepinTextArea = new JTextArea();
		CandlepinTextArea.setEditable(false);
		CandlepinTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CandlepinTextArea.setBounds(658, 567, 288, 90);
		panel.add(CandlepinTextArea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t1 = "\nType of Event       : Duck Pin Bowling";
				String t2 = "\nCategory of Event : 10-pin Bowling";
				DuckPinTextArea.setText(t1 + "\n" + t2);
				DuckPinTextArea.setLineWrap(true);
				DuckPinTextArea.setWrapStyleWord(true);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(MarketingDetailsBowling.class.getResource("/BowlingCentre/ballandpins.jpg")));
		lblNewLabel.setBounds(10, 10, 268, 281);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t1 = "\nType of Event       : 5 Pin Bowling";
				String t2 = "\nCategory of Event : 5-pin Bowling";
				FivePinTextArea.setText(t1 + "\n" + t2);
				FivePinTextArea.setLineWrap(true);
				FivePinTextArea.setWrapStyleWord(true);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(MarketingDetailsBowling.class.getResource("/BowlingCentre/five-white-bowling-pins-260nw-285728342.jpg")));
		lblNewLabel_1.setBounds(10, 32, 268, 248);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(658, 234, 288, 301);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t1 = "\nType of Event       : Candlepin Bowling";
				String t2 = "\nCategory of Event : 10-pin Bowling";
				CandlepinTextArea.setText(t1 + "\n" + t2);
				CandlepinTextArea.setLineWrap(true);
				CandlepinTextArea.setWrapStyleWord(true);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(MarketingDetailsBowling.class.getResource("/BowlingCentre/candlepin-bowling.jpg")));
		lblNewLabel_3.setBounds(10, 10, 268, 281);
		panel_1_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("We provide these types of bowling events:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(31, 114, 786, 77);
		panel.add(lblNewLabel_2);	
		
		JLabel lblNewLabel_4 = new JLabel("You may click on the pictures to know the events provided.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(31, 177, 637, 38);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5_1 = new JLabel("Let's bowling!");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel_5_1.setBounds(31, 23, 689, 108);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("Let's bowling!");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(31, 23, 704, 108);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(MarketingDetailsBowling.class.getResource("/BowlingCentre/images.jpg")));
		lblNewLabel_6.setBounds(678, 10, 270, 209);
		panel.add(lblNewLabel_6);
	}
}
