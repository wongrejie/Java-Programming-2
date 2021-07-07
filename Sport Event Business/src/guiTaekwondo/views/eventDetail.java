package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class eventDetail extends JFrame {

	private JPanel contentPane;
	private JButton viewButton;
	private JComboBox selectComboBox;
	private JTextArea eventDisplayTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eventDetail frame = new eventDetail();
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
	public eventDetail() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane eventDetailScrollPane = new JScrollPane();
		
		JLabel eventImageLabel = new JLabel("");
		eventImageLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/participant2.png")).getImage().getScaledInstance(117,185, Image.SCALE_SMOOTH)));
		
		JButton returnButton = new JButton("Return");
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu frame = new mainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		selectComboBox = new JComboBox();
		selectComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select event to check", "Event: Taekwondo Poomsae Open Challenge", "Event: Colombia International Open", "Event: Costa Rica Taekwondo Open"}));
		selectComboBox.setSelectedIndex(0);
		
		viewButton = new JButton("View Details");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(eventImageLabel, GroupLayout.PREFERRED_SIZE, 111, Short.MAX_VALUE)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(returnButton)
							.addGap(74)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(selectComboBox, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
							.addComponent(viewButton)
							.addGap(88))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(eventDetailScrollPane, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
							.addGap(20))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(returnButton)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(viewButton)
								.addComponent(selectComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(eventDetailScrollPane, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(eventImageLabel, GroupLayout.PREFERRED_SIZE, 310, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		eventDisplayTextArea = new JTextArea();
		eventDisplayTextArea.setEditable(false);
		eventDisplayTextArea.setFont(new Font("Arial", Font.PLAIN, 12));
		eventDisplayTextArea.setText("Join Our Spring Event Now!\r\n\r\nChallenge yourself  and win great prize!!\r\n\r\nEnjoy discount at particular day!\r\n\r\nAll at UUM Dojang!\r\n\r\n");
				eventDetailScrollPane.setViewportView(eventDisplayTextArea);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvents() {
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(selectComboBox.getSelectedIndex()==1) {
						eventDisplayTextArea.setText("Event Description:\r\n\r\nStarting from this year, WT will be organising the Online World Taekwondo Poomsae Open Challenge. \r\nThe event will be held every quarterly (i.e. March, June, September, December). The event will have an \r\nOfficial Category for national team athletes, and an Open Category for families to participate in pairs and\r\n teams.\r\n\r\nEnjoy 15% discount by participate at Friday or  Saturday!\r\n\r\n10% discount will be given for teams more or equals to 4 person!\r\n\r\nEvent Date:\r\nEvent Dates: 1st June 2021 - 3rd July 2021\r\n\r\nVenue:\r\nRegular Registration Period Start Date:\r\nSaturday\r\n\r\nRegular Registration Period End Date:\r\nFriday\r\n\r\n");
					}
					else if(selectComboBox.getSelectedIndex()==2) {
						eventDisplayTextArea.setText("Event Description:\r\n\r\nEnjoy 15% discount by participate at Friday or  Saturday!\r\n\r\n10% discount will be given for teams more or equals to 4 person!\r\n\r\nBeginning in 1945, shortly after the end of World War II and Japanese Occupation, new martial arts schools called kwans opened in Seoul. These schools were established by Korean martial artists with backgrounds in (mostly) Japanese[11] and Chinese martial arts. At the time, indigenous disciplines (such as Taekkyeon) were all but forgotten, due to years of decline and repression by the Japanese colonial government. The umbrella term traditional Taekwondo typically refers to the martial arts practiced by the kwans during the 1940s and 1950s, though in reality the term \"Taekwondo\" had not yet been coined at that time, and indeed each kwan (school) was practicing its own unique fighting style.\r\n\r\nEvent Date:\r\nEvent Dates: 1st June 2021 - 3rd July 2021\r\n\r\nVenue:\r\nRegular Registration Period Start Date:\r\nSaturday\r\n\r\nRegular Registration Period End Date:\r\nFriday\r\n\r\n");
						
					}
					else if(selectComboBox.getSelectedIndex()==3) {
						eventDisplayTextArea.setText("Event Description:\r\n\r\nEnjoy 15% discount by participate at Friday or  Saturday!\r\n\r\n10% discount will be given for teams more or equals to 4 person!\r\n\r\nTaekwondo is characterized by its emphasis on head-height kicks, jumping and spinning kicks, and fast kicking techniques. In fact, World Taekwondo sparring competitions award additional points for strikes that incorporate spinning kicks, kicks to the head, or both. To facilitate fast, turning kicks, Taekwondo generally adopts stances that are narrower and taller than the broader, wide stances used by martial arts such as karate. The tradeoff of decreased stability is believed to be worth the commensurate increase in agility, particularly in Kukkiwon-style Taekwondo.\r\n\r\nEvent Date:\r\nEvent Dates: 1st June 2021 - 3rd July 2021\r\n\r\nVenue:\r\nRegular Registration Period Start Date:\r\nSaturday\r\n\r\nRegular Registration Period End Date:\r\nFriday\r\n\r\n");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Plaese Select an event to check.");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Plaese Select an event to check.");
				}
			}
		});
		
	}
}
