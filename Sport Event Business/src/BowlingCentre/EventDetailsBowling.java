package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EventDetailsBowling extends JFrame {

	private JPanel contentPane;
	JTextField txtRm;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	protected static Object file;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventDetailsBowling frame = new EventDetailsBowling();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setRegistrationFee(String rf) {
		txtRm.setText(rf);
	}
	 
	public String getRegistrationFee() {
		return txtRm.getText();
	}
	    
	/**
	 * Create the frame.
	 */
	public EventDetailsBowling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnBowlingCentre = new JMenu("Bowling Centre");
		mnBowlingCentre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnBowlingCentre);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(mntmClose, "Confirm if you want to exit", "Time Zone Bowling Centre", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mntmClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnBowlingCentre.add(mntmClose);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnAbout);
		
		JMenuItem mntmEventDetails = new JMenuItem("Event Details");
		mntmEventDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDetailsBowling ed = new EventDetailsBowling();
				ed.setModalExclusionType(null);
				ed.setVisible(true);
				dispose();
			}
		});
		mntmEventDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnAbout.add(mntmEventDetails);
		
		JMenu mnNewMenu = new JMenu("Customer");
		mnNewMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmParticipantLogin = new JMenuItem("Participant Login");
		mntmParticipantLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLoginBowling cl = new CustomerLoginBowling();
				cl.setModalExclusionType(null);
				cl.setVisible(true);
				dispose();
			}
		});
		mntmParticipantLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnNewMenu.add(mntmParticipantLogin);
		
		JMenuItem mntmParticipantRegistration = new JMenuItem("Participant Registration");
		mntmParticipantRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistrationBowling cr = new CustomerRegistrationBowling();
				cr.setModalExclusionType(null);
				cr.setVisible(true);
				dispose();
			}
		});
		
		mntmParticipantRegistration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnNewMenu.add(mntmParticipantRegistration);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EventDetailsBowling.class.getResource("/BowlingCentre/bowling-vector-icon-260nw-1350995225.jpg")));
		lblNewLabel.setBounds(47, 75, 192, 133);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(252, 63, 610, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEventDetails = new JLabel("Event Details");
		lblEventDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventDetails.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblEventDetails.setBounds(10, 10, 590, 55);
		panel.add(lblEventDetails);
		
		JLabel lblEventVenue = new JLabel("Bowling Event Venue : Time Zone Bowling Centre");
		lblEventVenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEventVenue.setHorizontalAlignment(SwingConstants.LEFT);
		lblEventVenue.setBounds(100, 66, 459, 25);
		panel.add(lblEventVenue);
		
		JLabel lblContact = new JLabel("Contact : 012-3456789 / FB: TimeZoneBowlingCentre@fb.com");
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContact.setBounds(26, 98, 559, 25);
		panel.add(lblContact);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(26, 230, 408, 335);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(453, 230, 497, 335);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea.setBounds(10, 10, 477, 244);
		panel_2.add(textArea);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setEditable(false);
		textArea2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textArea2.setBounds(10, 257, 477, 68);
		panel_2.add(textArea2);
		
		JLabel lblChooseEvent = new JLabel("Type of Event:");
		lblChooseEvent.setBounds(27, 20, 357, 41);
		panel_1.add(lblChooseEvent);
		lblChooseEvent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblChooseTheCategory = new JLabel("Choose the category:");
		lblChooseTheCategory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChooseTheCategory.setBounds(27, 115, 357, 41);
		panel_1.add(lblChooseTheCategory);
		
		JComboBox CategoryComboBox = new JComboBox();
		CategoryComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "10-pin", "5-pin"}));
		CategoryComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CategoryComboBox.setBounds(27, 155, 357, 33);
		panel_1.add(CategoryComboBox);
		
		JComboBox EventComboBox = new JComboBox();
		EventComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        File f = new File(UpdateEventBowling.filePath);
		        
		        try {
		            BufferedReader br = new BufferedReader(new FileReader(UpdateEventBowling.filePath));
		            Object[] lines = br.lines().toArray();
		            
		            for(int i = 0; i < lines.length; i++){
		                String line = lines[i].toString();
		                EventComboBox.addItem(line);
		            }
		            
		        } catch(Exception ex) {
					ex.printStackTrace();
				}
		        
				if(EventComboBox.getSelectedItem() == "Duck Pin Bowling" ) {
					String text1 = "=> Duck Pin Bowling" +
								   "\nHere comes the rules..." +
								   "\n===============================" +
								   "\n1. A game consists of 10 frames. Each box on the score sheet represents one frame." +
								   "\n2. Maximum number of balls rolled in each frame is three." +
								   "\n3. Add each frame’s score to the previous one so that the game score progressively increases." +
								   "\n4. If all ten pins are knocked down by the first ball in any frame, it is called a 'Strike' and is usually symbolised on the score sheet with an X." +
								   "\n5. The maximum score is 300.";
					String text2 = "\n\nIt is 10-pin bowling.";
					textArea.setText(text1 + text2);
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
					
					CategoryComboBox.setSelectedItem("10-pin");
				}
				else if(EventComboBox.getSelectedItem() == "5-Pin Bowling" ){
					String text3 = "=> 5-Pin Bowling" +
							   "\nHere comes the rules..." +
							   "\n===============================" +
							   "\n1. In each frame, each player gets three attempts to knock all five pins over." +
							   "\n2. Knocking all five pins down with the first ball is a strike, worth 15 points." +
							   "\n3. If a bowler manages to clear the pins with the first ball, then this is a 'strike'." +
							   "\n4. If a bowler succeeds upon his second attempt, then this is a 'spare'." +
							   "\n5. The maximum score is 450.";
					String text4 = "\n\nIt is 5-pin bowling.";
					textArea.setText(text3 + text4);
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
					
					CategoryComboBox.setSelectedItem("5-pin");
				}
				else if(EventComboBox.getSelectedItem() == "Candlepin Bowling" ){
					String text5 = "=> Candlepin Bowling" +
							   "\nHere comes the rules..." +
							   "\n===============================" +
							   "\n1. Each player gets three rolls per turn." +
							   "\n2. This is scored by bowling 12 strikes: one in each box, and a strike with both bonus balls in the 10th box." +
							   "\n3. Candlepins are thinner (hence the name \"candlepin\"), and thus harder to knock down." +
							   "\n4. The candlepin pinsetter is triggered manually with a reset button after each frame rather than automatically." +
							   "\n5. The maximum score is 300.";
					String text6 = "\n\nIt is 10-pin bowling.";
					textArea.setText(text5 + text6);
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
					
					CategoryComboBox.setSelectedItem("10-pin");
				}
				
			}
		});
		EventComboBox.setBounds(27, 61, 357, 33);
		panel_1.add(EventComboBox);
		EventComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EventComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Duck Pin Bowling", "5-Pin Bowling", "Candlepin Bowling"}));
		
		JLabel lblRegistrationFee = new JLabel("Registration Fee:");
		lblRegistrationFee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegistrationFee.setBounds(25, 269, 179, 41);
		panel_1.add(lblRegistrationFee);
		
		txtRm = new JTextField();
		txtRm.setEditable(false);
		txtRm.setHorizontalAlignment(SwingConstants.LEFT);
		txtRm.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtRm.setColumns(10);
		txtRm.setBounds(193, 267, 129, 41);
		panel_1.add(txtRm);
		
		JLabel lblDay_1 = new JLabel("Day                  :\r\n");
		lblDay_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDay_1.setBounds(27, 214, 177, 35);
		panel_1.add(lblDay_1);
		
		JComboBox DayComboBox = new JComboBox();
		DayComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultWithDisc = null;
				String resultWithoutDisc = null;
				
				TotalPayment wdp = new PriceRate();
				if(DayComboBox.getSelectedItem() == "Sunday" || DayComboBox.getSelectedItem() == "Saturday") {
					Discount dd = new WeekendDiscount();
					double disc = dd.discountRate();
					resultWithDisc = String.valueOf(df2.format(wdp.totalPrice((String) DayComboBox.getSelectedItem(), disc)));
					txtRm.setText(resultWithDisc);
				}
				else {
					resultWithoutDisc = String.valueOf(wdp.totalPrice());
					txtRm.setText(resultWithoutDisc);	
				}
				
				if(DayComboBox.getSelectedItem() == "Sunday") {
					String text1 = "Day                     : Sunday";
					String text2 = "\nRegistration Fee : RM ";
					textArea2.setText(text1 + text2 + " " + resultWithDisc);
					textArea2.setLineWrap(true);
					textArea2.setWrapStyleWord(true);
					textArea2.setVisible(true);
				}
				else if(DayComboBox.getSelectedItem() == "Saturday") {
					String text1 = "Day                     : Saturday";
					String text2 = "\nRegistration Fee : RM ";
					textArea2.setText(text1 + text2 + " " + resultWithDisc);
					textArea2.setLineWrap(true);
					textArea2.setWrapStyleWord(true);
					textArea2.setVisible(true);
				}
				if(DayComboBox.getSelectedItem() == "Monday") {
					String text1 = "Day                     : Monday";
					String text2 = "\nRegistration Fee : RM ";
					textArea2.setText(text1 + text2 + " " + resultWithoutDisc);
					textArea2.setLineWrap(true);
					textArea2.setWrapStyleWord(true);
					textArea2.setVisible(true);
				}
				else if(DayComboBox.getSelectedItem() == "Tuesday") {
					String text1 = "Day                     : Tuesday";
					String text2 = "\nRegistration Fee : RM ";
					textArea2.setText(text1 + text2 + " " + resultWithoutDisc);
					textArea2.setLineWrap(true);
					textArea2.setWrapStyleWord(true);
					textArea2.setVisible(true);
				}
				else if(DayComboBox.getSelectedItem() == "Wednesday") {
					String text1 = "Day                     : Wednesday";
					String text2 = "\nRegistration Fee : RM ";
					textArea2.setText(text1 + text2 + " " + resultWithoutDisc);
					textArea2.setLineWrap(true);
					textArea2.setWrapStyleWord(true);
					textArea2.setVisible(true);
				}
				else if(DayComboBox.getSelectedItem() == "Thursday") {
					String text1 = "Day                     : Thursday";
					String text2 = "\nRegistration Fee : RM ";
					textArea2.setText(text1 + text2 + " " + resultWithoutDisc);
					textArea2.setLineWrap(true);
					textArea2.setWrapStyleWord(true);
					textArea2.setVisible(true);
				}
				else if(DayComboBox.getSelectedItem() == "Friday") {
					String text1 = "Day                     : Friday";
					String text2 = "\nRegistration Fee : RM ";
					textArea2.setText(text1 + text2 + " " + resultWithoutDisc);
					textArea2.setLineWrap(true);
					textArea2.setWrapStyleWord(true);
					textArea2.setVisible(true);
				}
			}
		});
		DayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
		DayComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		DayComboBox.setBackground(Color.WHITE);
		DayComboBox.setBounds(193, 214, 191, 35);
		panel_1.add(DayComboBox);
		
		JButton btnRegister = new JButton("Register now!");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean register = false;
				
				if(EventComboBox.getSelectedItem().equals("Select") && DayComboBox.getSelectedItem().equals("Select")) {
					register = true;
				}
					
				if(register == true) {
					JOptionPane.showMessageDialog(null, "The record cannot be null!");
				}
				else if((EventComboBox.getSelectedItem().equals("Duck Pin Bowling") && DayComboBox.getSelectedItem().equals("Sunday")) ||
						(EventComboBox.getSelectedItem().equals("Duck Pin Bowling") && DayComboBox.getSelectedItem().equals("Monday")) ||
						(EventComboBox.getSelectedItem().equals("Duck Pin Bowling") && DayComboBox.getSelectedItem().equals("Tuesday")) ||
						(EventComboBox.getSelectedItem().equals("Duck Pin Bowling") && DayComboBox.getSelectedItem().equals("Wednesday")) ||
						(EventComboBox.getSelectedItem().equals("Duck Pin Bowling") && DayComboBox.getSelectedItem().equals("Thursday")) ||
						(EventComboBox.getSelectedItem().equals("Duck Pin Bowling") && DayComboBox.getSelectedItem().equals("Friday")) ||
						(EventComboBox.getSelectedItem().equals("Duck Pin Bowling") && DayComboBox.getSelectedItem().equals("Saturday")) ||
						
						(EventComboBox.getSelectedItem().equals("5-Pin Bowling") && DayComboBox.getSelectedItem().equals("Sunday")) ||
						(EventComboBox.getSelectedItem().equals("5-Pin Bowling") && DayComboBox.getSelectedItem().equals("Monday")) ||
						(EventComboBox.getSelectedItem().equals("5-Pin Bowling") && DayComboBox.getSelectedItem().equals("Tuesday")) ||
						(EventComboBox.getSelectedItem().equals("5-Pin Bowling") && DayComboBox.getSelectedItem().equals("Wednesday")) ||
						(EventComboBox.getSelectedItem().equals("5-Pin Bowling") && DayComboBox.getSelectedItem().equals("Thursday")) ||
						(EventComboBox.getSelectedItem().equals("5-Pin Bowling") && DayComboBox.getSelectedItem().equals("Friday")) ||
						(EventComboBox.getSelectedItem().equals("5-Pin Bowling") && DayComboBox.getSelectedItem().equals("Saturday")) ||
						
						(EventComboBox.getSelectedItem().equals("Candlepin Bowling") && DayComboBox.getSelectedItem().equals("Sunday")) ||
						(EventComboBox.getSelectedItem().equals("Candlepin Bowling") && DayComboBox.getSelectedItem().equals("Monday")) ||
						(EventComboBox.getSelectedItem().equals("Candlepin Bowling") && DayComboBox.getSelectedItem().equals("Tuesday")) ||
						(EventComboBox.getSelectedItem().equals("Candlepin Bowling") && DayComboBox.getSelectedItem().equals("Wednesday")) ||
						(EventComboBox.getSelectedItem().equals("Candlepin Bowling") && DayComboBox.getSelectedItem().equals("Thursday")) ||
						(EventComboBox.getSelectedItem().equals("Candlepin Bowling") && DayComboBox.getSelectedItem().equals("Friday")) ||
						(EventComboBox.getSelectedItem().equals("Candlepin Bowling") && DayComboBox.getSelectedItem().equals("Saturday")) ||
						
						(DayComboBox.getSelectedItem().equals("Sunday") && EventComboBox.getSelectedItem().equals("Duck Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Monday") && EventComboBox.getSelectedItem().equals("Duck Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Tuesday") && EventComboBox.getSelectedItem().equals("Duck Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Wednesday") && EventComboBox.getSelectedItem().equals("Duck Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Thursday") && EventComboBox.getSelectedItem().equals("Duck Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Friday") && EventComboBox.getSelectedItem().equals("Duck Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Saturday") && EventComboBox.getSelectedItem().equals("Duck Pin Bowling")) ||
						
						(DayComboBox.getSelectedItem().equals("Sunday") && EventComboBox.getSelectedItem().equals("5-Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Monday") && EventComboBox.getSelectedItem().equals("5-Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Tuesday") && EventComboBox.getSelectedItem().equals("5-Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Wednesday") && EventComboBox.getSelectedItem().equals("5-Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Thursday") && EventComboBox.getSelectedItem().equals("5-Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Friday") && EventComboBox.getSelectedItem().equals("5-Pin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Saturday") && EventComboBox.getSelectedItem().equals("5-Pin Bowling")) ||
						
						(DayComboBox.getSelectedItem().equals("Sunday") && EventComboBox.getSelectedItem().equals("Candlepin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Monday") && EventComboBox.getSelectedItem().equals("Candlepin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Tuesday") && EventComboBox.getSelectedItem().equals("Candlepin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Wednesday") && EventComboBox.getSelectedItem().equals("Candlepin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Thursday") && EventComboBox.getSelectedItem().equals("Candlepin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Friday") && EventComboBox.getSelectedItem().equals("Candlepin Bowling")) ||
						(DayComboBox.getSelectedItem().equals("Saturday") && EventComboBox.getSelectedItem().equals("Candlepin Bowling"))){
					
					JOptionPane.showMessageDialog(null, "Let's go registration!");
					
					CustomerRegistrationBowling r = new CustomerRegistrationBowling(); //call another window or frame
					r.Registration_FeeTextField.setText(txtRm.getText());
					r.setModalExclusionType(null);
					r.setVisible(true);
					dispose();
			    }
				else {
					JOptionPane.showMessageDialog(null, "Please enter event type and day!", "Meesage", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnRegister.setBackground(new Color(255, 240, 245));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnRegister.setBounds(252, 591, 203, 57);
		contentPane.add(btnRegister);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Bowling Event Details", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					BowlingCentre b = new BowlingCentre();
					b.setModalExclusionType(null);
					b.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnExit.setBackground(new Color(255, 240, 245));
		btnExit.setBounds(493, 591, 203, 57);
		contentPane.add(btnExit);
	}
}
