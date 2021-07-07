package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class participantDetail extends JFrame {

	private JPanel participantContentPane;
	private JTable registrationTable;
	private JTextField nameTextField;
	private JTextField teamTextField;
	private JTextField priceTextField;
	private JButton returnButton;
	private JButton saveButton;
	private JButton calculateButton;
	private JButton resetButton;
	private JButton addButton;
	private JButton deleteButton;
	private JButton editButton;
	private JButton printButton;
	private JComboBox ageComboBox;
	private JComboBox eventComboBox;
	private JComboBox participantNumComboBox;
	private JComboBox genderComboBox;
	private JComboBox dayComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					participantDetail frame = new participantDetail();
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
	public participantDetail() {
		initComponents();
		createEvents();
	}
	
	public double totalFee() {
		DefaultTableModel model = (DefaultTableModel) registrationTable.getModel();
		 int i = registrationTable.getRowCount();
		 double fee=0;
		 for(int j=0;j<i;j++) {
			 fee=(double) model.getValueAt(j, 7)+fee;
		 }
		 return fee;
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		participantContentPane = new JPanel();
		participantContentPane.setBackground(new Color(165, 42, 42));
		participantContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(participantContentPane);
		
		JScrollPane tableScrollPane = new JScrollPane();
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(0, 0, 0));
		
		JPanel toolPanel = new JPanel();
		toolPanel.setBorder(new TitledBorder(null, "Tools", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		toolPanel.setBackground(new Color(255, 250, 240));
		GroupLayout gl_participantContentPane = new GroupLayout(participantContentPane);
		gl_participantContentPane.setHorizontalGroup(
			gl_participantContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_participantContentPane.createSequentialGroup()
					.addGap(2)
					.addGroup(gl_participantContentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(titlePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
						.addComponent(tableScrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toolPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_participantContentPane.setVerticalGroup(
			gl_participantContentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_participantContentPane.createSequentialGroup()
					.addComponent(titlePanel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_participantContentPane.createSequentialGroup()
					.addComponent(toolPanel, GroupLayout.PREFERRED_SIZE, 428, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel editPanel = new JPanel();
		editPanel.setBorder(new TitledBorder(null, "edit", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		editPanel.setBackground(new Color(176, 224, 230));
		
		editButton = new JButton("Edit");
		editButton.setBackground(new Color(176, 196, 222));
		editButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		saveButton = new JButton("Save As");

		saveButton.setBackground(new Color(240, 255, 255));
		saveButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		addButton = new JButton("Add");
		addButton.setBackground(new Color(175, 238, 238));
		addButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		deleteButton = new JButton("Delete");
		deleteButton.setBackground(new Color(176, 196, 222));
		deleteButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		printButton = new JButton("Print");
		printButton.setBackground(new Color(240, 248, 255));
		printButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_toolPanel = new GroupLayout(toolPanel);
		gl_toolPanel.setHorizontalGroup(
			gl_toolPanel.createParallelGroup(Alignment.TRAILING)
				.addComponent(editPanel, GroupLayout.PREFERRED_SIZE, 239, Short.MAX_VALUE)
				.addGroup(gl_toolPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(addButton, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_toolPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_toolPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(deleteButton, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(saveButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_toolPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(printButton, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
						.addComponent(editButton, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_toolPanel.setVerticalGroup(
			gl_toolPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_toolPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(editPanel, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(addButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_toolPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(editButton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_toolPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(saveButton)
						.addComponent(printButton, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		nameTextField.setColumns(10);
		
		JLabel teamLabel = new JLabel("Team Name:");
		teamLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		teamTextField = new JTextField();
		teamTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		teamTextField.setText("team");
		teamTextField.setForeground(Color.BLACK);
		teamTextField.setColumns(10);
		
		JLabel ageLabel = new JLabel("Age Range:");
		ageLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		ageComboBox = new JComboBox();
		ageComboBox.setModel(new DefaultComboBoxModel(new String[] {"7-9", "10-12", "13-15", "16-18", ">18"}));
		ageComboBox.setSelectedIndex(0);
		ageComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		ageComboBox.setBackground(Color.WHITE);
		
		JLabel genderLabel = new JLabel("Gender:");
		genderLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel participantNumLabel = new JLabel("Perticipants' Number:");
		participantNumLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel eventLabel = new JLabel("Event:");
		eventLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		eventComboBox = new JComboBox();
		eventComboBox.setModel(new DefaultComboBoxModel(new String[] {"Event: Taekwondo Poomsae Open Challenge", "Event: Colombia International Open", "Event: Costa Rica Taekwondo Open"}));
		eventComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel dayLabel = new JLabel("Day:");
		dayLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		dayComboBox = new JComboBox();
		dayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"}));
		
		JLabel totalPriceLabel = new JLabel("Total Price: RM");
		totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		priceTextField = new JTextField();
		priceTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		priceTextField.setText("00.00");
		priceTextField.setColumns(10);
		
		calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calculateButton.setFont(new Font("Arial", Font.PLAIN, 11));
		calculateButton.setBackground(new Color(224, 255, 255));
		
		resetButton = new JButton("Reset");
		resetButton.setBackground(new Color(176, 196, 222));
		resetButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		genderComboBox = new JComboBox();
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		genderComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		
		participantNumComboBox = new JComboBox();
		participantNumComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		participantNumComboBox.setSelectedIndex(0);
		participantNumComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_editPanel = new GroupLayout(editPanel);
		gl_editPanel.setHorizontalGroup(
			gl_editPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_editPanel.createSequentialGroup()
					.addGap(4)
					.addComponent(dayLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dayComboBox, 0, 49, Short.MAX_VALUE)
					.addGap(136))
				.addGroup(gl_editPanel.createSequentialGroup()
					.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_editPanel.createSequentialGroup()
							.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
						.addGroup(gl_editPanel.createSequentialGroup()
							.addComponent(teamLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(teamTextField, 0, 0, Short.MAX_VALUE))
						.addGroup(gl_editPanel.createSequentialGroup()
							.addComponent(ageLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ageComboBox, 0, 148, Short.MAX_VALUE)
							.addGap(3))
						.addGroup(gl_editPanel.createSequentialGroup()
							.addComponent(genderLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(genderComboBox, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_editPanel.createSequentialGroup()
							.addComponent(participantNumLabel, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(participantNumComboBox, 0, 68, Short.MAX_VALUE)
							.addGap(26))
						.addComponent(eventLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addComponent(eventComboBox, 0, 227, Short.MAX_VALUE)
						.addGroup(gl_editPanel.createSequentialGroup()
							.addGroup(gl_editPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(priceTextField, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(totalPriceLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(resetButton, GroupLayout.PREFERRED_SIZE, 132, Short.MAX_VALUE)
								.addComponent(calculateButton, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
					.addGap(0))
		);
		gl_editPanel.setVerticalGroup(
			gl_editPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_editPanel.createSequentialGroup()
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameLabel)
						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(teamLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
						.addComponent(teamTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(ageLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
						.addComponent(ageComboBox, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(genderLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
						.addComponent(genderComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_editPanel.createSequentialGroup()
							.addComponent(participantNumLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(eventLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
						.addComponent(participantNumComboBox, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(eventComboBox, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(dayLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
						.addComponent(dayComboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(totalPriceLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
						.addComponent(calculateButton, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(priceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(resetButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		editPanel.setLayout(gl_editPanel);
		toolPanel.setLayout(gl_toolPanel);
		
		registrationTable = new JTable();
		registrationTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"John", "Tiger", ">18", "Male", "Spring Event", "Sun", "20", new Double(3600.0)},
				{"Peter", "Bear", ">18", "Male", "Spring Event", "Thur", "4", new Double(720.0)},
				{"Adam", "Rabbit", "13-15", "Male", "Spring Event", "Mon", "20", new Double(3600.0)},
				{"Ismail", "Hamster", "13-15", "Male", "Spring Event", "Fri", "4", new Double(800.0)},
			},
			new String[] {
				"Name", "Team", "Age Range", "Gender", "Event", "Day", "Members", "Total Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		registrationTable.setFont(new Font("Arial", Font.PLAIN, 11));
		tableScrollPane.setViewportView(registrationTable);
		
		JLabel titleLabel = new JLabel("Participants Data");
		titleLabel.setForeground(new Color(255, 255, 255));
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		
		returnButton = new JButton("");

		returnButton.setBackground(new Color(0, 0, 0));
		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		GroupLayout gl_titlePanel = new GroupLayout(titlePanel);
		gl_titlePanel.setHorizontalGroup(
			gl_titlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(119))
		);
		gl_titlePanel.setVerticalGroup(
			gl_titlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_titlePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(titleLabel)
						.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		titlePanel.setLayout(gl_titlePanel);
		participantContentPane.setLayout(gl_participantContentPane);
		
	}

	private void createEvents() {
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMainMenu frame = new adminMainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File(
							"/Sport Event Business/src/guiTaekwondo/views/participantDetail.txt");
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
		
		calculateButton.addActionListener(new ActionListener() {
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
	                if(i >= 0) 
	                {
	                   model.setValueAt(nameTextField.getText(), i, 0);
	                   model.setValueAt(teamTextField.getText(), i, 1);
	                   model.setValueAt(ageComboBox.getSelectedItem(), i, 2);
	                   model.setValueAt(genderComboBox, i, 3);
	                   model.setValueAt(eventComboBox.getSelectedItem(), i, 4);
	                   model.setValueAt(dayComboBox.getSelectedItem(), i, 5);
	                   model.setValueAt(participantNumComboBox.getSelectedItem(), i, 6);
	                   model.setValueAt( Double.parseDouble(priceTextField.getText()), i, 7);
	                }
				

            }
        });
		
		addButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) registrationTable.getModel();
				
				model.addRow(new Object[] { nameTextField.getText(), teamTextField.getText(), ageComboBox.getSelectedItem(),
						genderComboBox.getSelectedItem(), eventComboBox.getSelectedItem(),dayComboBox.getSelectedItem(),participantNumComboBox.getSelectedItem(), 
						 Double.parseDouble(priceTextField.getText())});

				if (registrationTable.getSelectedRow() == -1) {
					if (registrationTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
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
