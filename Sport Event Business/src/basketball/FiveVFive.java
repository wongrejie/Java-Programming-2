package basketball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FiveVFive extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiveVFive frame = new FiveVFive();
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
	public FiveVFive() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 485, 68);
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBackground(new Color(255, 182, 193));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("5v5");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel.setBounds(202, 11, 69, 46);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Participant pa = new Participant();
			pa.setModalExclusionType(null);
			pa.setVisible(true);
			dispose();
		}
	});
			
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(165, 42, 42));
		btnNewButton.setBounds(10, 11, 94, 46);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBackground(new Color(255, 182, 193));
		panel_1.setBounds(10, 90, 485, 47);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1. 1 timeout per half.");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 11, 503, 25);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 192, 203));
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_2.setBounds(10, 148, 485, 47);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("2. No dunking.");
		lblNewLabel_3.setBounds(10, 11, 450, 29);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 192, 203));
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_3.setBounds(10, 206, 485, 74);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("3. Personal Fouls are not tracked, but do count towards ");
		lblNewLabel_5.setBounds(10, 11, 550, 29);
		panel_3.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		JLabel lblNewLabel_6 = new JLabel("team fouls.");
		lblNewLabel_6.setBounds(32, 36, 426, 27);
		panel_3.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 192, 203));
		panel_4.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_4.setBounds(10, 291, 485, 53);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("4. Clock does NOT stop in the 1st half.");
		lblNewLabel_7.setBounds(10, 11, 550, 29);
		panel_4.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_5.setBackground(new Color(255, 182, 193));
		panel_5.setBounds(10, 355, 485, 74);
		getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("5. Clock stops in the 2nd half in the last 2 minutes.");
		lblNewLabel_8.setBounds(10, 11, 396, 21);
		panel_5.add(lblNewLabel_8);
		lblNewLabel_8.setBackground(new Color(255, 228, 225));
		lblNewLabel_8.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		
		JLabel lblNewLabel_9 = new JLabel("ONLY if a team is losing by 10 points or less");
		lblNewLabel_9.setBounds(33, 34, 364, 29);
		panel_5.add(lblNewLabel_9);
		lblNewLabel_9.setBackground(new Color(245, 245, 245));
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		setBounds(100, 100, 521, 475);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
