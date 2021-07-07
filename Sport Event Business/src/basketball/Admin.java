package basketball;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 434);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton MarketingButton = new JButton("MARKETING");
		MarketingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Marketing frame = new Marketing();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		MarketingButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		MarketingButton.setBackground(new Color(255, 204, 204));
		MarketingButton.setBounds(142, 200, 188, 75);
		getContentPane().add(MarketingButton);
		
		JButton EmployeeButton = new JButton("EMPLOYEE");
		EmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Employees frame =  new Employees();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		EmployeeButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		EmployeeButton.setBackground(new Color(255, 204, 204));
		EmployeeButton.setBounds(346, 114, 188, 75);
		getContentPane().add(EmployeeButton);
		
		JButton FiananceButton = new JButton("FINANCE");
		FiananceButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		FiananceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Finance frame =  new Finance();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		FiananceButton.setBackground(new Color(255, 204, 204));
		FiananceButton.setBounds(346, 200, 188, 75);
		getContentPane().add(FiananceButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(139, 0, 0), 5));
		panel.setBackground(new Color(240, 128, 128));
		panel.setBounds(10, 11, 676, 75);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KNBASKETBALL CENTRE");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 45));
		lblNewLabel.setBounds(106, 11, 463, 53);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(139, 0, 0), 6));
		panel_1.setBackground(new Color(240, 128, 128));
		panel_1.setBounds(131, 97, 417, 276);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton BackButton = new JButton("Back");
		BackButton.setBounds(113, 190, 188, 75);
		panel_1.add(BackButton);
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainPage frame =  new MainPage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
				
			}
		});
		BackButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		BackButton.setBackground(new Color(255, 204, 204));
		
		JButton EventDetailsButton = new JButton("EVENT DETAILS");
		EventDetailsButton.setBounds(10, 21, 188, 75);
		panel_1.add(EventDetailsButton);
		EventDetailsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventDetails frame = new EventDetails();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		EventDetailsButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		EventDetailsButton.setBackground(new Color(255, 204, 204));
	}
}