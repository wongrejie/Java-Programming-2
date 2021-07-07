package basketball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThreeVThree extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreeVThree frame = new ThreeVThree();
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
	public ThreeVThree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(10, 11, 570, 68);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("3v3");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		lblNewLabel.setBounds(243, 11, 69, 46);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Participant pa = new Participant();
				pa.setModalExclusionType(null);
				pa.setVisible(true);
				dispose();
			}
		});
			
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(205, 92, 92));
		btnNewButton.setBounds(10, 11, 108, 46);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBackground(new Color(255, 182, 193));
		panel_1.setBounds(10, 90, 570, 74);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("1.Each game will be to 21 points or 15 minutes long.");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 11, 503, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("The team must win by only one point.");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2.setBounds(37, 38, 335, 25);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_2.setBackground(new Color(255, 192, 203));
		panel_2.setBounds(10, 175, 570, 102);
		getContentPane().add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2.Teams score by either regular two-point baskets,");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 11, 450, 29);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("or by three-point shots taken from outside");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_4.setBounds(40, 37, 530, 29);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_10 = new JLabel(" the three-point circle.");
		lblNewLabel_10.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_10.setBounds(40, 62, 359, 29);
		panel_2.add(lblNewLabel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_3.setBackground(new Color(255, 192, 203));
		panel_3.setBounds(10, 288, 570, 74);
		getContentPane().add(panel_3);
		
		JLabel lblNewLabel_5 = new JLabel("3.All held balls will be put into play behind the three-point line");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 11, 550, 29);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("with possession given alternately to each team.");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_6.setBounds(40, 37, 426, 27);
		panel_3.add(lblNewLabel_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_4.setBackground(new Color(255, 192, 203));
		panel_4.setBounds(10, 373, 570, 154);
		getContentPane().add(panel_4);
		
		JLabel lblNewLabel_8 = new JLabel("However, once a team reaches 15 points they will be in the bonus");
		lblNewLabel_8.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel_8.setBackground(new Color(255, 228, 225));
		lblNewLabel_8.setBounds(10, 81, 550, 29);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Every foul committed against the offense will result in free throws.");
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel_9.setBackground(new Color(245, 245, 245));
		lblNewLabel_9.setBounds(10, 114, 550, 29);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_7 = new JLabel("4. Each team is only allowed one 30-second timeout under the ");
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_7.setBounds(10, 11, 550, 29);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_11 = new JLabel("last minute of play.");
		lblNewLabel_11.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_11.setBounds(33, 37, 436, 29);
		panel_4.add(lblNewLabel_11);
	}

}
