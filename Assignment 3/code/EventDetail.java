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
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class EventDetail extends JFrame {
	private String fpsDetail,mobaDetail,rtsDetail;
	private String fpsFee,mobaFee,rtsFee;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventDetail frame = new EventDetail();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void setFpsDetail(String fpsD) {
		fpsDetail=fpsD;
	}
	
	public void setMobaDetail(String mobaD) {
		mobaDetail=mobaD;
	}
	public void setRtsDetail(String rtsD) {
		rtsDetail=rtsD;
	}

	public String getFpsDetail() {
		return fpsDetail;
	} 
	
	public String getMobaDetail() {
		return mobaDetail;
	}
	
	
	public String getRtsDetail() {
		return rtsDetail;
	}
	
	public void setFpsFee(String fpsF) {
		fpsFee=fpsF;
	}
	
	public void setMobaFee(String mobaF) {
		mobaFee=mobaF;
	}
	public void setRtsFee(String rtsF) {
		rtsFee=rtsF;
	}

	public String getFpsFee() {
		return fpsFee;
	} 
	
	public String getMobaFee() {
		return mobaFee;
	}
	
	
	public String getRtsFee() {
		return rtsFee;
	}
	
	
	/**
	 * Create the frame.
	 */
	public EventDetail() {
		
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 593); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(153, 102, 255)));
		panel.setBounds(0, 0, 985, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
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

		

		JButton ParRegistration = new JButton("Login to Apply Now!");
		ParRegistration.setBounds(43, 404, 237, 53);
		ParRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				Login par = new Login(getFpsFee(),getMobaFee(),getRtsFee()); // calling another frame/window
				par.setModalExclusionType(null);
				par.setVisible(true);
				 dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
		});

		ParRegistration.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(ParRegistration);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(153, 102, 255)));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(474, 95, 477, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblFee = new JLabel("Contact : 012-9988564");
		lblFee.setBounds(32, 65, 503, 43);
		lblFee.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		panel_1.add(lblFee);

		JLabel lblCategory = new JLabel("E-Sport Tornament mix gender");
		lblCategory.setForeground(Color.BLACK);
		lblCategory.setBackground(Color.LIGHT_GRAY);
		lblCategory.setBounds(42, 10, 503, 33);
		panel_1.add(lblCategory);
		lblCategory.setFont(new Font("Papyrus", Font.BOLD, 25));

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(153, 102, 255)));
		panel_1_1_2.setBackground(new Color(204, 204, 255));
		panel_1_1_2.setBounds(197, 22, 758, 53);
		panel.add(panel_1_1_2);

		JLabel lblEventName = new JLabel("ULTIMATE GAMERS EVENT TORNAMENT");
		lblEventName.setForeground(Color.BLACK);
		lblEventName.setBackground(new Color(204, 204, 255));
		lblEventName.setFont(new Font("Papyrus", Font.BOLD, 25));
		lblEventName.setBounds(22, 10, 726, 33);
		panel_1_1_2.add(lblEventName);


		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Select Game Info", "First Person Shooter (FPS)",
				"Multiplayer online battle arena (MOBA)", "Real Time Strategy (RTS)" }));
		comboBox.setBounds(555, 206, 313, 29);
		panel.add(comboBox);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane.setBounds(532, 245, 428, 215);
		panel.add(textPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(297, 245, 223, 231);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Gaming Pic\\esports-gaming-event-gamer-looks-crowd.jpg"));
		lblNewLabel_1.setBounds(10, 10, 965, 510);
		panel.add(lblNewLabel_1);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				if (comboBox.getSelectedItem().equals("First Person Shooter (FPS)")) {
					if (getFpsDetail()==null) {
						textPane.setText("====================================================================="
								+ "\n Registration fee= RM 95.00"
								+ "\n====================================================================="
								+"\n1. First-person shooter (FPS) is a sub-genre of shooter video games centered on gun "
								+ "and other weapon-based combat in a first-person perspective."
								+ "\n2. The FPS game in this event is Counter Strike: Global Offensive, published by Valve."
								+ "\n3. It is a Team based game. Team up to join the event!"
								+ "\n4. Players must know the objectives to win the game."
								+ "\n5. Counter Strike: Global Offensive is a 5 versus 5 game."
								+ "\n=====================================================================");
					}
					else {textPane.setText("====================================================================="
							+ "\n Registration fee= RM "+getFpsFee()
							+ "\n====================================================================="
							+getFpsDetail());
					
					}
					lblNewLabel_2.setIcon(new ImageIcon("D:\\Gaming Pic\\1502212035_preview_download.jpg"));
				} else if (comboBox.getSelectedItem().equals("Multiplayer online battle arena (MOBA)")) {
					if (getMobaDetail()==null) {
					textPane.setText("====================================================================="
							+ "\n Registration fee= RM85.00 "
							+ "\n====================================================================="
							+ "\n1. Multiplayer online battle arena Info(MOBA) is a subgenre of strategy video games "
							+ "in which two teams of players compete against each other on a predefined battlefield."
							+ "\n2. The MOBA game in this event is League Of Legends, published by Riot Games."
							+ "\n3. It is a Team based game. Team up to join the event!"
							+ "\n4. Each player controls a single character with a set of unique abilities that improve over the course of a game "
							+ "and which contribute to the team's overall strategy."
							+ "\n5. League Of Legends is a 5 versus 5 game"
							+ "\n=====================================================================");
					}
					else {textPane.setText("====================================================================="
							+ "\n Registration fee= RM "+getMobaFee()
							+ "\n====================================================================="
							+getMobaDetail());
					
					}
					lblNewLabel_2.setIcon(new ImageIcon("D:\\Gaming Pic\\League_of_Legends_icon.png"));

				} else if (comboBox.getSelectedItem().equals("Real Time Strategy (RTS)")) {
					if (getRtsDetail()==null) {
					textPane.setText("====================================================================="
							+ "\n Registration fee= RM80.00 "
							+ "\n====================================================================="
							+ "\n1. Real Time Strategy (RTS) games have the characteristics of"
							+ " huge state space, imperfect information, sparse rewards and various strategies."
							+ "\n2. The RTS game in this event is Clash Royale, published by Supercell."
							+ "\n3. It can be played in 1 versus 1 or multiplayer, participant can either team up "
							+ "or solo to defeat opponents in this event!"
							+ "\n4. The objective of the game is to destroy the other player’s King’s Tower (middle building) while protecting your own."
							+ "\n5. If the participant destroy the opponent's King’s Tower, the participant will win immediately."
							+ "\n=====================================================================");
					}
					else {textPane.setText("====================================================================="
							+ "\n Registration fee= RM "+getRtsFee()
							+ "\n====================================================================="
							+getRtsDetail());
					
					}
					lblNewLabel_2.setIcon(new ImageIcon("D:\\Gaming Pic\\War_Shield.png"));
				}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

	}
	
}
