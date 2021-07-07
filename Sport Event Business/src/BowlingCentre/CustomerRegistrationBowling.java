package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class CustomerRegistrationBowling extends JFrame {

	private JPanel contentPane;
	private JTextField NameTextField;
	private JTextField AgeTextField;
	private JTextField NoOfParticipantTextField;
	private JTextField TeamNameTextField;
	JTextField Registration_FeeTextField;
	private JTable table;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TotalTextField;
	private JTextField FeeTextField;
	private JTextField textField;
	JComboBox DayComboBox;
	JComboBox EventComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistrationBowling frame = new CustomerRegistrationBowling();
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
	public CustomerRegistrationBowling() {	
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
		mntmParticipantRegistration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnNewMenu.add(mntmParticipantRegistration);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 976, 676);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(62, 26, 844, 81);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblParticipant = new JLabel("Participant Registration System");
		lblParticipant.setHorizontalAlignment(SwingConstants.CENTER);
		lblParticipant.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblParticipant.setBounds(10, 10, 824, 61);
		panel_1.add(lblParticipant);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(62, 130, 381, 465);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setBounds(29, 64, 119, 32);
		panel_2.add(lblName);
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		NameTextField.setBounds(149, 64, 199, 32);
		panel_2.add(NameTextField);
		NameTextField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblGender.setBounds(29, 106, 119, 32);
		panel_2.add(lblGender);
		
		JLabel lblNewLabel = new JLabel("Please fill in your details...");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(29, 10, 319, 32);
		panel_2.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblAge.setBounds(29, 148, 119, 32);
		panel_2.add(lblAge);
		
		AgeTextField = new JTextField();
		AgeTextField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		AgeTextField.setColumns(10);
		AgeTextField.setBounds(149, 148, 199, 32);
		panel_2.add(AgeTextField);
		
		JLabel lblNoOfParticipant = new JLabel("No of participant:");
		lblNoOfParticipant.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoOfParticipant.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNoOfParticipant.setBounds(26, 190, 199, 32);
		panel_2.add(lblNoOfParticipant);
		
		NoOfParticipantTextField = new JTextField();
		NoOfParticipantTextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		NoOfParticipantTextField.setColumns(10);
		NoOfParticipantTextField.setBounds(235, 189, 113, 32);
		panel_2.add(NoOfParticipantTextField);
		
		JLabel lblTeamName = new JLabel("Team Name:");
		lblTeamName.setHorizontalAlignment(SwingConstants.LEFT);
		lblTeamName.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTeamName.setBounds(29, 232, 199, 32);
		panel_2.add(lblTeamName);
		
		TeamNameTextField = new JTextField();
		TeamNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		TeamNameTextField.setColumns(10);
		TeamNameTextField.setBounds(182, 231, 166, 32);
		panel_2.add(TeamNameTextField);
		
		JLabel lblRegistrationFee = new JLabel("Registration Fee:");
		lblRegistrationFee.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegistrationFee.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRegistrationFee.setBounds(29, 332, 199, 32);
		panel_2.add(lblRegistrationFee);
		
		Registration_FeeTextField = new JTextField();
		Registration_FeeTextField.setEditable(false);
		Registration_FeeTextField.setHorizontalAlignment(SwingConstants.LEFT);
		Registration_FeeTextField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Registration_FeeTextField.setColumns(10);
		Registration_FeeTextField.setBounds(235, 333, 113, 32);
		panel_2.add(Registration_FeeTextField);
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup.add(male);
		male.setSelected(true);
		male.setBackground(Color.WHITE);
		male.setFont(new Font("Tahoma", Font.PLAIN, 23));
		male.setBounds(141, 105, 87, 35);
		panel_2.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setSelected(true);
		female.setBackground(Color.WHITE);
		female.setFont(new Font("Tahoma", Font.PLAIN, 23));
		female.setBounds(243, 105, 105, 35);
		panel_2.add(female);
		
		JLabel lblDay_1 = new JLabel("Day           :\r\n");
		lblDay_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblDay_1.setBounds(26, 290, 199, 32);
		panel_2.add(lblDay_1);
		
		JLabel lblTypeOfEvent = new JLabel("Type of Event   :");
		lblTypeOfEvent.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTypeOfEvent.setBounds(29, 374, 199, 32);
		panel_2.add(lblTypeOfEvent);
		
		JComboBox DayComboBox = new JComboBox();
		DayComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TotalPayment wdp = new PriceRate();
				if(DayComboBox.getSelectedItem() == "Sunday" || DayComboBox.getSelectedItem() == "Saturday") {
					Discount dd = new WeekendDiscount();
					double disc = dd.discountRate();
					String resultWithDisc = String.valueOf(df2.format(wdp.totalPrice((String) DayComboBox.getSelectedItem(), disc)));
					Registration_FeeTextField.setText(resultWithDisc);
				}
				else {
					String resultWithoutDisc = String.valueOf(wdp.totalPrice());
					Registration_FeeTextField.setText(resultWithoutDisc);	
				}
			}
		});
		DayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));
		DayComboBox.setFont(new Font("Tahoma", Font.PLAIN, 23));
		DayComboBox.setBounds(182, 290, 165, 32);
		panel_2.add(DayComboBox);
		
		JComboBox EventComboBox = new JComboBox();
		EventComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Duck Pin Bowling", "5-pin Bowling", "Candlepin Bowling"}));
		EventComboBox.setFont(new Font("Tahoma", Font.PLAIN, 23));
		EventComboBox.setBounds(29, 416, 319, 32);
		panel_2.add(EventComboBox);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(453, 130, 453, 139);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 433, 119);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Gender", "Age", "No of Participant", "Team Name", "Registration Fee", "Type of Event"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("ADD RECORD");
		btnAdd.setBounds(236, 605, 175, 45);
		panel.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name;
				boolean save = false;
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				try {
					for(int i = 0; i<model.getRowCount(); i++) {
						name = String.valueOf(model.getValueAt(i, 0));
						
						if(NameTextField.getText().equals(name)) {
							save = true;
						}
					}
					
					if(save == true) {
						JOptionPane.showMessageDialog(null, "This participant's name is already exist!\nOne participant can only register once.", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else if(NameTextField.getText().equals("") || AgeTextField.getText().equals("") || 
							NoOfParticipantTextField.getText().equals("") || TeamNameTextField.getText().equals("") ||
							Registration_FeeTextField.getText().equals("") || EventComboBox.getSelectedItem().equals("Select") ||
							DayComboBox.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(null, "The record cannot be null!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else if(male.isSelected()) {
						String m = "male";
						
						model.addRow(new Object[]{
								NameTextField.getText(),
								m,
								AgeTextField.getText(),
								NoOfParticipantTextField.getText(),
								TeamNameTextField.getText(),
								Registration_FeeTextField.getText(),
								EventComboBox.getSelectedItem()
						});
						JOptionPane.showMessageDialog(null, "Participant Info is added successfully!");
					}
					else if(female.isSelected()) {
						String f = "female";
						model.addRow(new Object[]{
								NameTextField.getText(),
								f,
								AgeTextField.getText(),
								NoOfParticipantTextField.getText(),
								TeamNameTextField.getText(),
								Registration_FeeTextField.getText(),
								EventComboBox.getSelectedItem()
						});
						JOptionPane.showMessageDialog(null, "Participant Info is added successfully!");
					}
					else {
						JOptionPane.showMessageDialog(null, "The record is failed to add!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Make sure your password are matched!",
							"Message", JOptionPane.OK_OPTION);
				}
				
				
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBackground(new Color(255, 240, 245));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(93, 605, 133, 45);
		panel.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NameTextField.setText("");
				male.setSelected(false);
				female.setSelected(false);
				AgeTextField.setText("");
				NoOfParticipantTextField.setText("");
				TeamNameTextField.setText("");
				DayComboBox.setSelectedItem("Select");
				Registration_FeeTextField.setText("");
				EventComboBox.setSelectedItem("Select");
				textField.setText("");
				FeeTextField.setText("");
				TotalTextField.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBackground(new Color(255, 240, 245));
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.setBounds(619, 279, 133, 51);
		panel.add(btnUpload);
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("/Sport Event Business/src/BowlingCentre/ParticipantRegistration.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUpload.setBackground(new Color(255, 240, 245));
		
		JButton Updatebtn = new JButton("UPDATE");
		Updatebtn.setBounds(468, 279, 133, 51);
		panel.add(Updatebtn);
		Updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	if(male.isSelected()) {
			    		String m = "male";
			    		model.setValueAt(NameTextField.getText(),i,0);
				    	model.setValueAt(m,i,1);
				    	model.setValueAt(AgeTextField.getText(),i,2);
				    	model.setValueAt(NoOfParticipantTextField.getText(),i,3);
				    	model.setValueAt(TeamNameTextField.getText(),i,4);
				    	model.setValueAt(Registration_FeeTextField.getText(),i,5);
				    	model.setValueAt(EventComboBox.getSelectedItem(), i, 6);
						JOptionPane.showMessageDialog(null, "Update Successfully");
			    	}
			    	else if(female.isSelected()) {
			    		String f = "female";
			    		model.setValueAt(NameTextField.getText(),i,0);
				    	model.setValueAt(f,i,1);
				    	model.setValueAt(AgeTextField.getText(),i,2);
				    	model.setValueAt(NoOfParticipantTextField.getText(),i,3);
				    	model.setValueAt(TeamNameTextField.getText(),i,4);
				    	model.setValueAt(Registration_FeeTextField.getText(),i,5);
				    	model.setValueAt(DayComboBox.getSelectedItem(), i, 6);
						JOptionPane.showMessageDialog(null, "Update Successfully");
			    	}
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			}
		});
		Updatebtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Updatebtn.setBackground(new Color(255, 240, 245));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(773, 605, 131, 45);
		panel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Participant Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					UserOptionBowling u = new UserOptionBowling();
					u.setModalExclusionType(null);
					u.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(773, 279, 133, 51);
		panel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Participant Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Participant Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDelete.setBackground(new Color(255, 240, 245));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.window);
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(453, 353, 453, 243);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnAmount = new JButton("TOTAL AMOUNT");
		btnAmount.setBackground(new Color(255, 255, 240));
		btnAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(NoOfParticipantTextField.getText());
				FeeTextField.setText(Registration_FeeTextField.getText());
				String f = FeeTextField.getText();
				String n = textField.getText();

				double total = Integer.valueOf(n) * Double.parseDouble(f);
				String totalPrice = String.valueOf(df2.format(total));
				
				TotalPayment w = new PriceRate();
				if(Integer.parseInt(n) == 4 || Integer.parseInt(n)<4) {
					double tPrice1 = w.totalPrice() * Integer.valueOf(n);
					String result1 = String.valueOf(df2.format(tPrice1));
					TotalTextField.setText("RM " + result1);
				}
				else {
					Discount d2 = new ParticipantDiscount();
					double disc = d2.discountRate();
					double tPrice2 = w.totalPrice(disc) * Integer.valueOf(n);
					String result2 = String.valueOf(df2.format(tPrice2));
					TotalTextField.setText("RM " + result2);
				}
			}
		});
		btnAmount.setBounds(124, 10, 200, 47);
		panel_4.add(btnAmount);
		btnAmount.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblTotal = new JLabel("Total                     :");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setBounds(23, 179, 181, 47);
		panel_4.add(lblTotal);
		
		TotalTextField = new JTextField();
		TotalTextField.setEditable(false);
		TotalTextField.setText("RM ");
		TotalTextField.setHorizontalAlignment(SwingConstants.LEFT);
		TotalTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TotalTextField.setColumns(10);
		TotalTextField.setBounds(214, 179, 190, 47);
		panel_4.add(TotalTextField);
		
		JLabel lblFeePaid = new JLabel("Fee paid               :");
		lblFeePaid.setHorizontalAlignment(SwingConstants.LEFT);
		lblFeePaid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFeePaid.setBounds(23, 122, 190, 47);
		panel_4.add(lblFeePaid);
		
		FeeTextField = new JTextField();
		FeeTextField.setHorizontalAlignment(SwingConstants.LEFT);
		FeeTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		FeeTextField.setEditable(false);
		FeeTextField.setColumns(10);
		FeeTextField.setBounds(214, 122, 190, 47);
		panel_4.add(FeeTextField);
		
		JLabel lblNoOfParticipant_1 = new JLabel("No of participant   :");
		lblNoOfParticipant_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoOfParticipant_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNoOfParticipant_1.setBounds(23, 67, 190, 41);
		panel_4.add(lblNoOfParticipant_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(214, 67, 190, 41);
		panel_4.add(textField);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPrint.setBackground(new Color(255, 240, 245));
		btnPrint.setBounds(635, 605, 118, 45);
		panel.add(btnPrint);
	}
}
