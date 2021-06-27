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

public class EventUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFee;
	private String discount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventUpdate frame = new EventUpdate();
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
	public EventUpdate() {
		EventDetail d = new EventDetail();
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 570); // set for 0,0,1400,800
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

		JLabel lblNewLabel = new JLabel("Update Game Info :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(363, 205, 180, 29);
		panel.add(lblNewLabel);

		JButton btnEventDetail = new JButton("Event Detail");
		btnEventDetail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEventDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d.setVisible(true);

			}
		});
		btnEventDetail.setBounds(679, 479, 140, 29);
		panel.add(btnEventDetail);

		JButton btnpass = new JButton("UPDATE");
		btnpass.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnpass.setBounds(518, 479, 119, 29);
		panel.add(btnpass);

		textFieldFee = new JTextField();
		textFieldFee.setColumns(10);
		textFieldFee.setBounds(293, 266, 140, 29);
		panel.add(textFieldFee);

		JLabel lblUpdateFee = new JLabel("Update Registration Fee (RM) :");
		lblUpdateFee.setForeground(Color.WHITE);
		lblUpdateFee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUpdateFee.setBounds(34, 264, 251, 29);
		panel.add(lblUpdateFee);

		JLabel lblOriginalRegistrationFee = new JLabel("Original Registration Fee : ");
		lblOriginalRegistrationFee.setForeground(Color.WHITE);
		lblOriginalRegistrationFee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOriginalRegistrationFee.setBounds(34, 322, 231, 48);
		panel.add(lblOriginalRegistrationFee);

		JLabel lblOriginalRegistrationFeeFPS = new JLabel("FPS -> RM95.00");
		lblOriginalRegistrationFeeFPS.setForeground(Color.WHITE);
		lblOriginalRegistrationFeeFPS.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOriginalRegistrationFeeFPS.setBounds(275, 322, 231, 48);
		panel.add(lblOriginalRegistrationFeeFPS);

		JLabel lblOriginalRegistrationFeeMOBA = new JLabel("MOBA -> RM90.00");
		lblOriginalRegistrationFeeMOBA.setForeground(Color.WHITE);
		lblOriginalRegistrationFeeMOBA.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOriginalRegistrationFeeMOBA.setBounds(275, 380, 231, 48);
		panel.add(lblOriginalRegistrationFeeMOBA);

		JLabel lblOriginalRegistrationFeeRTS = new JLabel("RTS -> RM85.00");
		lblOriginalRegistrationFeeRTS.setForeground(Color.WHITE);
		lblOriginalRegistrationFeeRTS.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOriginalRegistrationFeeRTS.setBounds(277, 438, 231, 48);
		panel.add(lblOriginalRegistrationFeeRTS);

		JButton btnEventBack = new JButton("BACK");
		btnEventBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin frame = new Admin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		btnEventBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEventBack.setBounds(847, 479, 113, 29);
		panel.add(btnEventBack);

		JLabel lblEventUpdate = new JLabel("EVENT INFORMATION UPDATE");
		lblEventUpdate.setForeground(Color.WHITE);
		lblEventUpdate.setFont(new Font("Sylfaen", Font.PLAIN, 30));
		lblEventUpdate.setBackground(new Color(204, 204, 255));
		lblEventUpdate.setBounds(226, 44, 512, 51);
		panel.add(lblEventUpdate);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Gaming Pic\\3628152.jpg"));
		lblNewLabel_1.setBounds(10, 10, 965, 510);
		panel.add(lblNewLabel_1);

		btnpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
					if (comboBox.getSelectedItem().equals("First Person Shooter (FPS)")) {
						d.setFpsDetail(textPane.getText());
						d.setFpsFee(textFieldFee.getText());

					} else if (comboBox.getSelectedItem().equals("Multiplayer online battle arena (MOBA)")) {
						d.setMobaDetail(textPane.getText());
						d.setMobaFee(textFieldFee.getText());

					} else if (comboBox.getSelectedItem().equals("Real Time Strategy (RTS)")) {
						d.setRtsDetail(textPane.getText());
						d.setRtsFee(textFieldFee.getText());

					}
					JOptionPane.showMessageDialog(null, "Update Succesful");

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
					if (comboBox.getSelectedItem().equals("First Person Shooter (FPS)")) {
						textPane.setText(
								"\n1. First-person shooter (FPS) is a sub-genre of shooter video games centered on gun "
										+ "and other weapon-based combat in a first-person perspective."
										+ "\n2. The FPS game in this event is Counter Strike: Global Offensive, published by Valve."
										+ "\n3. It is a Team based game. Team up to join the event!"
										+ "\n4. Players must know the objectives to win the game."
										+ "\n5. Counter Strike: Global Offensive is a 5 versus 5 game."
										+ "\n=====================================================================");

					} else if (comboBox.getSelectedItem().equals("Multiplayer online battle arena (MOBA)")) {
						textPane.setText(
								"\n1. Multiplayer online battle arena Info(MOBA) is a subgenre of strategy video games "
										+ "in which two teams of players compete against each other on a predefined battlefield."
										+ "\n2. The MOBA game in this event is League Of Legends, published by Riot Games."
										+ "\n3. It is a Team based game. Team up to join the event!"
										+ "\n4. Each player controls a single character with a set of unique abilities that improve over the course of a game "
										+ "and which contribute to the team's overall strategy."
										+ "\n5. League Of Legends is a 5 versus 5 game"
										+ "\n=====================================================================");

					} else if (comboBox.getSelectedItem().equals("Real Time Strategy (RTS)")) {
						textPane.setText("\n1. Real Time Strategy (RTS) games have the characteristics of"
								+ " huge state space, imperfect information, sparse rewards and various strategies."
								+ "\n2. The RTS game in this event is Clash Royale, published by Supercell."
								+ "\n3. It can be played in 1 versus 1 or multiplayer, participant can either team up "
								+ "or solo to defeat opponents in this event!"
								+ "\n4. The objective of the game is to destroy the other player’s King’s Tower (middle building) while protecting your own."
								+ "\n5. If the participant destroy the opponent's King’s Tower, the participant will win immediately."
								+ "\n=====================================================================");

					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		});

	}
}