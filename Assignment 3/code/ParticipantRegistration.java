package gaming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;

public class ParticipantRegistration extends JFrame {

	private JPanel contentPane;
	JTable ParticipantTable;
	private JTable model;
	JTextField name;
	JTextField TeamName;
	JTextField participantNum;
	JFrame frame;
	private double total = 0;
	private JTextField totalPricetextField;
	private static String fpsFee;
	private static String mobaFee;
	private static String rtsFee;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParticipantRegistration frame = new ParticipantRegistration();
					frame.setVisible(true);
				} catch (Exception arg0) {
					arg0.printStackTrace();
				}
			}
		});
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
	
	public ParticipantRegistration() {
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(null);
		panel.setBounds(10, 10, 1011, 567);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(15, 28, 325, 411);
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 81, 30);
		panel_1.add(lblNewLabel);

		name = new JTextField();
		name.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		name.setBounds(159, 11, 156, 30);
		panel_1.add(name);
		name.setColumns(10);

		JLabel lblGame = new JLabel("Game Category");
		lblGame.setForeground(new Color(255, 255, 255));
		lblGame.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblGame.setBounds(75, 101, 156, 30);
		panel_1.add(lblGame);

		TeamName = new JTextField();
		TeamName.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		TeamName.setColumns(10);
		TeamName.setBounds(159, 173, 156, 30);
		panel_1.add(TeamName);

		JLabel lblTeamName = new JLabel("Team Name");
		lblTeamName.setForeground(new Color(255, 255, 255));
		lblTeamName.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblTeamName.setBounds(10, 161, 149, 54);
		panel_1.add(lblTeamName);

		participantNum = new JTextField();
		participantNum.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		participantNum.setColumns(10);
		participantNum.setBounds(75, 255, 156, 30);
		panel_1.add(participantNum);

		JLabel lblParticipantNo = new JLabel("Participant Number in Team");
		lblParticipantNo.setForeground(new Color(255, 255, 255));
		lblParticipantNo.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblParticipantNo.setBounds(10, 223, 295, 35);
		panel_1.add(lblParticipantNo);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblGender.setBounds(10, 57, 95, 30);
		panel_1.add(lblGender);

		JComboBox Gender = new JComboBox();
		Gender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		Gender.setModel(new DefaultComboBoxModel(new String[] { "Make a selection", "Female", "Male" }));
		Gender.setBounds(159, 56, 156, 35);
		panel_1.add(Gender);

		JLabel lblDayRegister = new JLabel("Registration Day");
		lblDayRegister.setForeground(new Color(255, 255, 255));
		lblDayRegister.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDayRegister.setBounds(75, 294, 163, 54);
		panel_1.add(lblDayRegister);

		JComboBox registerDay = new JComboBox();
		registerDay.setModel(new DefaultComboBoxModel(
				new String[] { "Select registration day", "Sunday ~ Thursday", "Friday ~ Saturday" }));
		registerDay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		registerDay.setBounds(64, 340, 192, 35);
		panel_1.add(registerDay);

		JComboBox gameCtgr = new JComboBox();
		gameCtgr.setModel(new DefaultComboBoxModel(new String[] { "Make a selection", "Fps (Counter Strike :GO)",
				"Moba (League of Legends)", "Rts (Clash Royale)" }));
		gameCtgr.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		gameCtgr.setBounds(49, 133, 225, 30);
		panel_1.add(gameCtgr);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Gaming Pic\\photo-1542751371-adc38448a05e.jpg"));
		lblNewLabel_2.setBounds(0, 0, 335, 411);
		panel_1.add(lblNewLabel_2);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_2.setBackground(new Color(204, 204, 255));
		panel_1_2.setBounds(362, 60, 626, 333);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 606, 269);
		panel_1_2.add(scrollPane);

		ParticipantTable = new JTable();
		ParticipantTable.setFont(new Font("Tahoma", Font.BOLD, 10));
		ParticipantTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Name", "Gender",
				"Game Category", "Team Name", "ParticipantNum", "Registration Day", "Price (RM)" }));
		ParticipantTable.getColumnModel().getColumn(1).setPreferredWidth(65);
		ParticipantTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		ParticipantTable.getColumnModel().getColumn(4).setPreferredWidth(81);
		ParticipantTable.getColumnModel().getColumn(5).setPreferredWidth(99);
		ParticipantTable.getColumnModel().getColumn(5).setMinWidth(18);
		ParticipantTable.getColumnModel().getColumn(6).setPreferredWidth(86);
		scrollPane.setViewportView(ParticipantTable);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_1_1_1.setBackground(new Color(204, 204, 255));
		panel_1_1_1_1.setBounds(34, 449, 942, 70);
		panel.add(panel_1_1_1_1);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				Gender.setSelectedItem("Make a selection");
				gameCtgr.setSelectedItem("Make a selection");
				TeamName.setText("");
				participantNum.setText("");
				registerDay.setSelectedItem("Select registration day");
				totalPricetextField.setText("");

			}
		});
		btnReset.setBounds(212, 18, 129, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) ParticipantTable.getModel();
				if (ParticipantTable.getSelectedRow() == -1) {
					if (ParticipantTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Participant Registration System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Participant Registration System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(ParticipantTable.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(404, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GamingCenter frame = new GamingCenter();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Log Out",
						"Participant Registration System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnLogOut.setBounds(789, 18, 129, 35);
		panel_1_1_1_1.add(btnLogOut);
		btnLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) ParticipantTable.getModel();
				int i = ParticipantTable.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(name.getText(), i, 0);
					model.setValueAt(Gender.getSelectedItem(), i, 1);
					model.setValueAt(gameCtgr.getSelectedItem(), i, 2);
					model.setValueAt(TeamName.getText(), i, 3);
					model.setValueAt(participantNum.getText(), i, 4);
					model.setValueAt(registerDay.getSelectedItem(), i, 5);
					

					JOptionPane.showMessageDialog(null, "Update Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnUpdate.setBounds(609, 18, 129, 35);
		panel_1_1_1_1.add(btnUpdate);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try { //2.2 Exception Handling
					File file = new File("D:\\upload file\\ParticipantList.txt");
					if (!file.exists()) {	//2.3 File IO
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(
							"\n__________________________________________________________________________________________________________________________________\n");
					for (int i = 0; i < ParticipantTable.getRowCount(); i++) {
						for (int j = 0; j < ParticipantTable.getColumnCount(); j++) {
							bw.write(ParticipantTable.getModel().getValueAt(i, j) + "		|");
						}
						bw.write(
								"\n__________________________________________________________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnUpload.setBounds(140, 289, 129, 35);
		panel_1_2.add(btnUpload);
				JButton btnAddRecord = new JButton("Apply");
				btnAddRecord.setBounds(31, 18, 129, 35);
				panel_1_1_1_1.add(btnAddRecord);
				btnAddRecord.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int participantNumber;
						double answer;
						double registrationFee = 0;
						if (gameCtgr.getSelectedItem().equals("Fps (Counter Strike :GO)")) {
						registrationFee = 95;
						}
						if (gameCtgr.getSelectedItem().equals("Moba (League of Legends)")) {
							registrationFee = 90;
							}
						if (gameCtgr.getSelectedItem().equals("Rts (Clash Royale)")) {
							registrationFee = 85;
							}
						participantNumber = Integer.parseInt(participantNum.getText());
						 if (registerDay.getSelectedItem().equals("Friday ~ Saturday")) {
							 
							 Discount ds=new WeekendDiscountRate();
							registrationFee = registrationFee*(1-ds.discountRate());

						}
						answer = participantNumber * registrationFee;
						String price = Double. toString(answer);
						DefaultTableModel model = (DefaultTableModel) ParticipantTable.getModel();
						model.addRow(new Object[] { name.getText(), Gender.getSelectedItem(), gameCtgr.getSelectedItem(),
								TeamName.getText(), participantNum.getText(), registerDay.getSelectedItem(), price,

						});

					}
				});
				btnAddRecord.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(376, 289, 129, 35);
		panel_1_2.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ParticipantTable.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Participant Registration");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(new Color(204, 204, 255));
		lblNewLabel_1.setBounds(535, 0, 384, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Gaming Pic\\e16d4219e671bac00d1c23131e6d723f.jpg"));
		lblNewLabel_4.setBounds(490, 0, 442, 64);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Gaming Pic\\photo-1542751371-adc38448a05e.jpg"));
		lblNewLabel_3.setBounds(-11, 0, 1022, 567);
		panel.add(lblNewLabel_3);
		
	}
	
	public ParticipantRegistration(String fpsFee,String mobaFee,String rtsFee) {
		ParticipantRegistration.fpsFee=fpsFee;
		ParticipantRegistration.mobaFee=mobaFee;
		ParticipantRegistration.rtsFee=rtsFee;
		
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(null);
		panel.setBounds(10, 10, 1011, 567);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(15, 28, 325, 411);
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 81, 30);
		panel_1.add(lblNewLabel);

		name = new JTextField();
		name.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		name.setBounds(159, 11, 156, 30);
		panel_1.add(name);
		name.setColumns(10);

		JLabel lblGame = new JLabel("Game Category");
		lblGame.setForeground(new Color(255, 255, 255));
		lblGame.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblGame.setBounds(75, 101, 156, 30);
		panel_1.add(lblGame);

		TeamName = new JTextField();
		TeamName.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		TeamName.setColumns(10);
		TeamName.setBounds(159, 173, 156, 30);
		panel_1.add(TeamName);

		JLabel lblTeamName = new JLabel("Team Name");
		lblTeamName.setForeground(new Color(255, 255, 255));
		lblTeamName.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblTeamName.setBounds(10, 161, 149, 54);
		panel_1.add(lblTeamName);

		participantNum = new JTextField();
		participantNum.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		participantNum.setColumns(10);
		participantNum.setBounds(75, 255, 156, 30);
		panel_1.add(participantNum);

		JLabel lblParticipantNo = new JLabel("Participant Number in Team");
		lblParticipantNo.setForeground(new Color(255, 255, 255));
		lblParticipantNo.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblParticipantNo.setBounds(10, 223, 295, 35);
		panel_1.add(lblParticipantNo);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblGender.setBounds(10, 57, 95, 30);
		panel_1.add(lblGender);

		JComboBox Gender = new JComboBox();
		Gender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		Gender.setModel(new DefaultComboBoxModel(new String[] { "Make a selection", "Female", "Male" }));
		Gender.setBounds(159, 56, 156, 35);
		panel_1.add(Gender);

		JLabel lblDayRegister = new JLabel("Registration Day");
		lblDayRegister.setForeground(new Color(255, 255, 255));
		lblDayRegister.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDayRegister.setBounds(75, 294, 163, 54);
		panel_1.add(lblDayRegister);

		JComboBox registerDay = new JComboBox();
		registerDay.setModel(new DefaultComboBoxModel(
				new String[] { "Select registration day", "Sunday ~ Thursday", "Friday ~ Saturday" }));
		registerDay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		registerDay.setBounds(64, 340, 192, 35);
		panel_1.add(registerDay);

		JComboBox gameCtgr = new JComboBox();
		gameCtgr.setModel(new DefaultComboBoxModel(new String[] { "Make a selection", "Fps (Counter Strike :GO)",
				"Moba (League of Legends)", "Rts (Clash Royale)" }));
		gameCtgr.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		gameCtgr.setBounds(49, 133, 225, 30);
		panel_1.add(gameCtgr);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Gaming Pic\\photo-1542751371-adc38448a05e.jpg"));
		lblNewLabel_2.setBounds(0, 0, 335, 411);
		panel_1.add(lblNewLabel_2);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_2.setBackground(new Color(204, 204, 255));
		panel_1_2.setBounds(362, 60, 626, 333);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 606, 269);
		panel_1_2.add(scrollPane);

		ParticipantTable = new JTable();
		ParticipantTable.setFont(new Font("Tahoma", Font.BOLD, 10));
		ParticipantTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Name", "Gender",
				"Game Category", "Team Name", "ParticipantNum", "Registration Day", "Price (RM)" }));
		ParticipantTable.getColumnModel().getColumn(1).setPreferredWidth(65);
		ParticipantTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		ParticipantTable.getColumnModel().getColumn(4).setPreferredWidth(81);
		ParticipantTable.getColumnModel().getColumn(5).setPreferredWidth(99);
		ParticipantTable.getColumnModel().getColumn(5).setMinWidth(18);
		ParticipantTable.getColumnModel().getColumn(6).setPreferredWidth(86);
		scrollPane.setViewportView(ParticipantTable);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_1_1_1.setBackground(new Color(204, 204, 255));
		panel_1_1_1_1.setBounds(34, 449, 942, 70);
		panel.add(panel_1_1_1_1);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				Gender.setSelectedItem("Make a selection");
				gameCtgr.setSelectedItem("Make a selection");
				TeamName.setText("");
				participantNum.setText("");
				registerDay.setSelectedItem("Select registration day");
				totalPricetextField.setText("");

			}
		});
		btnReset.setBounds(212, 18, 129, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) ParticipantTable.getModel();
				if (ParticipantTable.getSelectedRow() == -1) {
					if (ParticipantTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Participant Registration System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Participant Registration System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(ParticipantTable.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(404, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GamingCenter frame = new GamingCenter();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Log Out",
						"Participant Registration System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnLogOut.setBounds(789, 18, 129, 35);
		panel_1_1_1_1.add(btnLogOut);
		btnLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) ParticipantTable.getModel();
				int i = ParticipantTable.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(name.getText(), i, 0);
					model.setValueAt(Gender.getSelectedItem(), i, 1);
					model.setValueAt(gameCtgr.getSelectedItem(), i, 2);
					model.setValueAt(TeamName.getText(), i, 3);
					model.setValueAt(participantNum.getText(), i, 4);
					model.setValueAt(registerDay.getSelectedItem(), i, 5);
					

					JOptionPane.showMessageDialog(null, "Update Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnUpdate.setBounds(609, 18, 129, 35);
		panel_1_1_1_1.add(btnUpdate);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("D:\\upload file\\ParticipantList.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(
							"\n__________________________________________________________________________________________________________________________________\n");
					for (int i = 0; i < ParticipantTable.getRowCount(); i++) {
						for (int j = 0; j < ParticipantTable.getColumnCount(); j++) {
							bw.write(ParticipantTable.getModel().getValueAt(i, j) + "		|");
						}
						bw.write(
								"\n__________________________________________________________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnUpload.setBounds(140, 289, 129, 35);
		panel_1_2.add(btnUpload);
				JButton btnAddRecord = new JButton("Apply");
				btnAddRecord.setBounds(31, 18, 129, 35);
				panel_1_1_1_1.add(btnAddRecord);
				btnAddRecord.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int participantNumber;
						double answer;
						double registrationFee = 0;
						if (gameCtgr.getSelectedItem().equals("Fps (Counter Strike :GO)")) {
						registrationFee = Double.parseDouble(getFpsFee());
						}
						if (gameCtgr.getSelectedItem().equals("Moba (League of Legends)")) {
							registrationFee = Double.parseDouble(getMobaFee());
							}
						if (gameCtgr.getSelectedItem().equals("Rts (Clash Royale)")) {
							registrationFee =  Double.parseDouble(getRtsFee());
							}
						participantNumber = Integer.parseInt(participantNum.getText());
						 if (registerDay.getSelectedItem().equals("Friday ~ Saturday")) {
							 
							 Discount ds=new WeekendDiscountRate();
							registrationFee = registrationFee*(1-ds.discountRate());

						}
						answer = participantNumber * registrationFee;
						String price = Double. toString(answer);
						DefaultTableModel model = (DefaultTableModel) ParticipantTable.getModel();
						model.addRow(new Object[] { name.getText(), Gender.getSelectedItem(), gameCtgr.getSelectedItem(),
								TeamName.getText(), participantNum.getText(), registerDay.getSelectedItem(), price,

						});

					}
				});
				btnAddRecord.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(376, 289, 129, 35);
		panel_1_2.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ParticipantTable.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Participant Registration");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(new Color(204, 204, 255));
		lblNewLabel_1.setBounds(535, 0, 384, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Gaming Pic\\e16d4219e671bac00d1c23131e6d723f.jpg"));
		lblNewLabel_4.setBounds(490, -46, 442, 110);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Gaming Pic\\photo-1542751371-adc38448a05e.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1001, 557);
		panel.add(lblNewLabel_3);
		
		
	}
}
