package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class participantRegistration extends JFrame {

	private JPanel contentPane;
	private JTable registrationTable;
	private final ButtonGroup genderButtonGroup = new ButtonGroup();
	
	
	private JButton addButton;
	
	//text field
	private JTextField nameTextField;
	private JTextField teamTextField;
	private JComboBox ageComboBox;
	private JRadioButton femaleRd;
	private JRadioButton maleRd;
	private JComboBox participantNumComboBox;
	private JComboBox eventComboBox;
	private JComboBox dayComboBox;
	private JTextField priceTextField;
	private JButton returnButton;
	private JButton comfirmButton;
	private JButton editButton;
	private JButton printButton;
	private JButton deleteButton;
	private JButton resetButton;
	private JButton saveButton;
	private JButton submitButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					participantRegistration frame = new participantRegistration();
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

	public participantRegistration() {
		setTitle("Event Registration");
		setIconImage(Toolkit.getDefaultToolkit().getImage(participantRegistration.class.getResource("/gui/resources/icon2.png")));
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		setContentPane(contentPane);
		
		JPanel registrantDetailPanel = new JPanel();
		registrantDetailPanel.setBackground(new Color(255, 228, 181));
		registrantDetailPanel.setBorder(new TitledBorder(null, "Registrant's Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel tiltleLabel = new JLabel("EVENT REGISTRATION");
		tiltleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tiltleLabel.setForeground(Color.WHITE);	
		tiltleLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/participant.png")).getImage().getScaledInstance(100,58, Image.SCALE_SMOOTH)));
		tiltleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		JScrollPane tableScrollPane = new JScrollPane();
		
		JPanel functionPanel = new JPanel();
		functionPanel.setBorder(new TitledBorder(null, "Functions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		submitButton = new JButton("Submit");

		submitButton.setBackground(new Color(230, 230, 250));
		submitButton.setForeground(new Color(0, 0, 0));
		submitButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		returnButton = new JButton("Return");

		returnButton.setForeground(new Color(245, 255, 250));
		returnButton.setFont(new Font("Arial", Font.PLAIN, 10));
		returnButton.setBackground(new Color(128, 0, 0));
		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		
		saveButton = new JButton("Save As");

		saveButton.setBackground(new Color(176, 224, 230));
		saveButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(functionPanel, GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(registrantDetailPanel, GroupLayout.PREFERRED_SIZE, 223, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(132)
									.addComponent(saveButton, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(submitButton, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
								.addComponent(tableScrollPane, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tiltleLabel, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
							.addGap(80)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(returnButton))
						.addComponent(tiltleLabel))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(registrantDetailPanel, GroupLayout.PREFERRED_SIZE, 334, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tableScrollPane, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(submitButton)
								.addComponent(saveButton))
							.addGap(14)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(functionPanel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		addButton = new JButton("Add");
		addButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		resetButton = new JButton("Reset");

		resetButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		deleteButton = new JButton("Delete");
		deleteButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		printButton = new JButton("Print");

		printButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		editButton = new JButton("Edit");

		editButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_functionPanel = new GroupLayout(functionPanel);
		gl_functionPanel.setHorizontalGroup(
			gl_functionPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_functionPanel.createSequentialGroup()
					.addComponent(addButton, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(27)
					.addComponent(editButton, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(resetButton, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(deleteButton, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(printButton, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_functionPanel.setVerticalGroup(
			gl_functionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_functionPanel.createSequentialGroup()
					.addGroup(gl_functionPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(addButton)
						.addComponent(printButton)
						.addComponent(deleteButton)
						.addComponent(resetButton)
						.addComponent(editButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		functionPanel.setLayout(gl_functionPanel);
		
		JLabel nameLabel = new JLabel("Registrant's Name:");
		nameLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		nameTextField = new JTextField();
		nameTextField.setText("name");
		nameTextField.setForeground(new Color(0, 0, 0));
		nameTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		nameTextField.setColumns(10);
		
		JLabel ageLabel = new JLabel("Age Range:");
		ageLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		ageComboBox = new JComboBox();
		ageComboBox.setModel(new DefaultComboBoxModel(new String[] {"7-9", "10-12", "13-15", "16-18", ">18"}));
		ageComboBox.setSelectedIndex(0);
		ageComboBox.setBackground(new Color(255, 255, 255));
		ageComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel genderLabel = new JLabel("Gender:");
		genderLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		femaleRd = new JRadioButton("Female");
		genderButtonGroup.add(femaleRd);
		femaleRd.setBackground(new Color(255, 228, 181));
		femaleRd.setSelected(true);
		femaleRd.setFont(new Font("Arial", Font.PLAIN, 11));
		
		maleRd = new JRadioButton("Male");
		maleRd.setBackground(new Color(255, 228, 181));
		genderButtonGroup.add(maleRd);
		maleRd.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel participantNumLabel = new JLabel("Perticipants' Number:");
		participantNumLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		participantNumComboBox = new JComboBox();
		participantNumComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		participantNumComboBox.setSelectedIndex(0);
		participantNumComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel teamLabel = new JLabel("Team Name:");
		teamLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		teamTextField = new JTextField();
		teamTextField.setForeground(new Color(0, 0, 0));
		teamTextField.setText("team");
		teamTextField.setColumns(10);
		
		comfirmButton = new JButton("Comfirm");

		comfirmButton.setBackground(new Color(224, 255, 255));
		comfirmButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel totalPriceLabel = new JLabel("Total Price: RM");
		totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		priceTextField = new JTextField();
		priceTextField.setEditable(false);
		priceTextField.setText("00.00");
		priceTextField.setColumns(10);
		
		JLabel eventLabel = new JLabel("Event:");
		eventLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		eventComboBox = new JComboBox();
		eventComboBox.setModel(new DefaultComboBoxModel(new String[] {"Event: Taekwondo Poomsae Open Challenge", "Event: Colombia International Open", "Event: Costa Rica Taekwondo Open"}));
		eventComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel dayLabel = new JLabel("Day:");
		dayLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		dayComboBox = new JComboBox();
		dayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"}));
		GroupLayout gl_registrantDetailPanel = new GroupLayout(registrantDetailPanel);
		gl_registrantDetailPanel.setHorizontalGroup(
			gl_registrantDetailPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registrantDetailPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_registrantDetailPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_registrantDetailPanel.createSequentialGroup()
							.addComponent(eventComboBox, 0, 201, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_registrantDetailPanel.createSequentialGroup()
							.addGroup(gl_registrantDetailPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(teamTextField, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
								.addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
								.addGroup(gl_registrantDetailPanel.createSequentialGroup()
									.addComponent(ageLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ageComboBox, 0, 119, Short.MAX_VALUE))
								.addGroup(gl_registrantDetailPanel.createSequentialGroup()
									.addComponent(genderLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(femaleRd, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(maleRd, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_registrantDetailPanel.createSequentialGroup()
									.addComponent(participantNumLabel, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(participantNumComboBox, 0, 68, Short.MAX_VALUE)))
							.addContainerGap())
						.addGroup(gl_registrantDetailPanel.createSequentialGroup()
							.addComponent(teamLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(102, Short.MAX_VALUE))
						.addComponent(nameLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_registrantDetailPanel.createSequentialGroup()
							.addComponent(eventLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(133, Short.MAX_VALUE))
						.addGroup(gl_registrantDetailPanel.createSequentialGroup()
							.addComponent(dayLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dayComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(comfirmButton)
							.addContainerGap())
						.addGroup(gl_registrantDetailPanel.createSequentialGroup()
							.addComponent(totalPriceLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(priceTextField, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
							.addGap(12))))
		);
		gl_registrantDetailPanel.setVerticalGroup(
			gl_registrantDetailPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registrantDetailPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(nameLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(teamLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(teamTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(gl_registrantDetailPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(ageLabel)
						.addComponent(ageComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_registrantDetailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(genderLabel)
						.addComponent(femaleRd)
						.addComponent(maleRd))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_registrantDetailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(participantNumLabel)
						.addComponent(participantNumComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(eventLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(eventComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_registrantDetailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(dayLabel)
						.addComponent(dayComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comfirmButton))
					.addGap(18)
					.addGroup(gl_registrantDetailPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(totalPriceLabel)
						.addComponent(priceTextField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		registrantDetailPanel.setLayout(gl_registrantDetailPanel);
		
		registrationTable = new JTable();
		registrationTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Team", "Age Range", "Gender", "Event", "Day", "Members", "Total Price"
			}
		));
		registrationTable.setFont(new Font("Arial", Font.PLAIN, 11));
		tableScrollPane.setViewportView(registrationTable);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvents() {
		addButton.addActionListener(new ActionListener() {
			private String gender;

			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) registrationTable.getModel();
				
				if(femaleRd.isSelected())
					gender="Female";
				else
					gender="Male";
				
				model.addRow(new Object[] { nameTextField.getText(), teamTextField.getText(), ageComboBox.getSelectedItem(),
						gender, eventComboBox.getSelectedItem(),dayComboBox.getSelectedItem(),participantNumComboBox.getSelectedItem(), 
						 priceTextField.getText()});

				if (registrationTable.getSelectedRow() == -1) {
					if (registrationTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu frame = new mainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		comfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double member=Double.parseDouble((String) participantNumComboBox.getSelectedItem());
				String day=(String)dayComboBox.getSelectedItem();
				double price=totalPrice(day,(int)member);
				priceTextField.setText(String.valueOf(price));
			}
		});
		
		editButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    			String gender;
				DefaultTableModel model = (DefaultTableModel) registrationTable.getModel();
                // i = the index of the selected row
                int i = registrationTable.getSelectedRow();
				if(femaleRd.isSelected())
					gender="Female";
				else
					gender="Male";
	                if(i >= 0) 
	                {
	                   model.setValueAt(nameTextField.getText(), i, 0);
	                   model.setValueAt(teamTextField.getText(), i, 1);
	                   model.setValueAt(ageComboBox.getSelectedItem(), i, 2);
	                   model.setValueAt(gender, i, 3);
	                   model.setValueAt(eventComboBox.getSelectedItem(), i, 4);
	                   model.setValueAt(dayComboBox.getSelectedItem(), i, 5);
	                   model.setValueAt(participantNumComboBox.getSelectedItem(), i, 6);
	                   model.setValueAt(priceTextField.getText(), i, 7);
	                }
				

            }
        });
		
		
		printButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) { // change e with other variable
					try {
						registrationTable.print();
					} catch (java.awt.print.PrinterException e) {
						System.err.format("No printer found", e.getMessage());
					}
			}
		});
		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("");
				teamTextField.setText("");
				ageComboBox.setSelectedIndex(0);
				eventComboBox.setSelectedIndex(0);
				dayComboBox.setSelectedIndex(0);
				participantNumComboBox.setSelectedIndex(0);
				priceTextField.setText("0.00");
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) registrationTable.getModel();
				if (registrationTable.getSelectedRow() == -1) {
					if (registrationTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "User Account",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "User Account",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(registrationTable.getSelectedRow());
				}
			}
		});
		
		
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File(
							"C:\\Users\\xuan2\\Downloads\\participantRecord.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < registrationTable.getRowCount(); i++) {
						for (int j = 0; j < registrationTable.getColumnCount(); j++) {
							bw.write(registrationTable.getModel().getValueAt(i, j) + "  ");
						}
						bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Submit Success.");
				mainMenu frame = new mainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
	}
	
	public double totalPrice() {
		return 200;
	}
	//total price of registration fee
	public double totalPrice(int noOfParticipant) {
		if(noOfParticipant>=4) {
			return 200*noOfParticipant*0.9;
		}
		return 200*noOfParticipant;
	}
	//discount if day is weekend
	public double totalPrice(String day,int noOfParticipant) {
		if (day=="Sat"||day=="Fri") 
			return totalPrice(noOfParticipant)*0.85;
		else
			return totalPrice(noOfParticipant);
	}
}
