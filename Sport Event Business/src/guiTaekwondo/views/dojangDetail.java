package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dojangDetail extends JFrame {

	private JPanel contentPane;
	private JButton backButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dojangDetail frame = new dojangDetail();
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
	public dojangDetail() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		
		JPanel aboutTitlePanel = new JPanel();
		aboutTitlePanel.setBorder(new TitledBorder(null, "About UUM Dojang", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel dojangImageLabel = new JLabel("");
		dojangImageLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/logo.png")).getImage().getScaledInstance(340,156, Image.SCALE_SMOOTH)));
		
		backButton = new JButton("Back");

		backButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(backButton)
							.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
							.addComponent(dojangImageLabel, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE))
						.addComponent(aboutTitlePanel, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(dojangImageLabel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(backButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(aboutTitlePanel, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_aboutTitlePanel = new GroupLayout(aboutTitlePanel);
		gl_aboutTitlePanel.setHorizontalGroup(
			gl_aboutTitlePanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
		);
		gl_aboutTitlePanel.setVerticalGroup(
			gl_aboutTitlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_aboutTitlePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextArea txtrHiThereWelcome = new JTextArea();
		txtrHiThereWelcome.setText("Hi there! Welcome to UUM Dojang!!\r\n\r\nOur Mission\r\nSince 2009, our mission has been to teach and develop well-rounded students all around the world.\r\n\r\nTaekwondo, Tae Kwon Do or Taekwon-Do is a Korean martial art, characterized by punching and kicking \r\ntechniques, with emphasis on head-height kicks, jumping spinning kicks, and fast kicking techniques. \r\nThe literal translation for tae kwon do is \"kicking,\" \"punching,\" and \"the art or way of.\"[6] It is a martial art \r\nthat attacks or defends with hands and feet anytime, anywhere without any weapons, and the purpose of\r\n physical training is important, but it also has great significance in fostering the right mind through \r\nmental armament.\r\n\r\n\r\nCall us   : 012-3456789\r\nLocation: Changlung, Sintok, Kedah.\r\n");
		txtrHiThereWelcome.setEditable(false);
		scrollPane.setViewportView(txtrHiThereWelcome);
		aboutTitlePanel.setLayout(gl_aboutTitlePanel);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvents() {
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu frame = new mainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
	}
}
