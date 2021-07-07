package basketball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventDetails extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventDetails frame = new EventDetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EventDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(10, 11, 441, 69);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EVENT DETAILS");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel.setBounds(71, 11, 316, 47);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(139, 69, 19), 5));
		panel_1.setBackground(new Color(245, 222, 179));
		panel_1.setBounds(10, 88, 331, 49);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Difference between 3v3 and 5v5");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(20, 11, 311, 21);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(139, 69, 19), 5));
		panel_2.setBackground(new Color(245, 222, 179));
		panel_2.setBounds(10, 148, 331, 227);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("1. 3v3 Basketball is much faster.");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 11, 311, 45);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2. Less endurance and more agility.");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 56, 311, 45);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("3. Formation and defensice structure.");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 19));
		lblNewLabel_4.setBounds(10, 107, 311, 45);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("4. Individual play more than teamwork.");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel_5.setBounds(10, 163, 311, 45);
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("3v3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ThreeVThree tvt =  new ThreeVThree();
				tvt.setModalExclusionType(null);
				tvt.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(250, 240, 230));
		btnNewButton.setBackground(new Color(221, 160, 221));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		btnNewButton.setBounds(351, 91, 100, 136);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("5v5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FiveVFive fvf =  new FiveVFive();
				fvf.setModalExclusionType(null);
				fvf.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setForeground(new Color(250, 240, 230));
		btnNewButton_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		btnNewButton_1.setBounds(351, 239, 100, 136);
		getContentPane().add(btnNewButton_1);
		setBackground(new Color(240, 128, 128));
		setBounds(100, 100, 481, 425);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


		
	}
