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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.accessibility.AccessibleContext;
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

public class FirstTimeLoginBowling extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameTextField;
	private JTextField CreatePasswordTextField;
	private JTextField ConfirmAgainPasswordTextField;
	private JTextField AgeTextField;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstTimeLoginBowling frame = new FirstTimeLoginBowling();
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
	public FirstTimeLoginBowling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 976, 704);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(54, 61, 864, 98);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("If you are a first login user, please fill in the details...");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 844, 78);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(54, 186, 419, 330);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblUserName_1 = new JLabel("User Name           :");
		lblUserName_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblUserName_1.setBackground(Color.BLACK);
		lblUserName_1.setBounds(10, 24, 209, 37);
		panel_2.add(lblUserName_1);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		UsernameTextField.setColumns(10);
		UsernameTextField.setBounds(211, 24, 186, 37);
		panel_2.add(UsernameTextField);
		
		JLabel lblCreatePassword = new JLabel("Create password   :");
		lblCreatePassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreatePassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCreatePassword.setBackground(Color.BLACK);
		lblCreatePassword.setBounds(10, 228, 198, 37);
		panel_2.add(lblCreatePassword);
		
		CreatePasswordTextField = new JTextField();
		CreatePasswordTextField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		CreatePasswordTextField.setColumns(10);
		CreatePasswordTextField.setBounds(211, 228, 186, 37);
		panel_2.add(CreatePasswordTextField);
		
		ConfirmAgainPasswordTextField = new JTextField();
		ConfirmAgainPasswordTextField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		ConfirmAgainPasswordTextField.setColumns(10);
		ConfirmAgainPasswordTextField.setBounds(211, 275, 186, 37);
		panel_2.add(ConfirmAgainPasswordTextField);
		
		JLabel lblAge = new JLabel("Age                     :");
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAge.setBounds(10, 82, 198, 32);
		panel_2.add(lblAge);
		
		AgeTextField = new JTextField();
		AgeTextField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		AgeTextField.setColumns(10);
		AgeTextField.setBounds(211, 77, 186, 37);
		panel_2.add(AgeTextField);
		
		JLabel lblState = new JLabel("State                   :");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblState.setBounds(10, 186, 209, 32);
		panel_2.add(lblState);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Johor", "Kedah", "Kelantan", "Melaka", "Negeri Sembilan", "Pahang", "Perak", "Perlis", "Pulau Pinang", "Sabah", "Sarawak", "Selangor", "Terengganu"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox.setBounds(211, 181, 186, 37);
		panel_2.add(comboBox);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password :");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConfirmPassword.setBackground(Color.BLACK);
		lblConfirmPassword.setBounds(10, 275, 198, 37);
		panel_2.add(lblConfirmPassword);
		
		JLabel lblGender = new JLabel("Gender                :");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblGender.setBounds(10, 136, 198, 32);
		panel_2.add(lblGender);
		
		JComboBox GenderComboBox = new JComboBox();
		GenderComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female"}));
		GenderComboBox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GenderComboBox.setBackground(Color.WHITE);
		GenderComboBox.setBounds(211, 134, 186, 37);
		panel_2.add(GenderComboBox);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_2_1.setBounds(499, 186, 419, 330);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 399, 244);
		panel_2_1.add(scrollPane);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"User Name", "Password"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton Updatebtn = new JButton("UPDATE");
		Updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(CreatePasswordTextField.getText().equals(ConfirmAgainPasswordTextField.getText())) 
				    {
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						int i = table.getSelectedRow();
						if(i>=0) //if single row is selected than update
						{
							model.setValueAt(UsernameTextField.getText(),i,0);
							model.setValueAt(CreatePasswordTextField.getText(), i, 1);
							JOptionPane.showMessageDialog(null, "Update Successfully");
						}
					}
					else 
						JOptionPane.showMessageDialog(null, "The record is failed to update! ", "Error", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Make sure your password are matched!",
							"Message", JOptionPane.OK_OPTION);
				}
				
						
			}
		});
		Updatebtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Updatebtn.setBackground(new Color(255, 228, 225));
		Updatebtn.setBounds(51, 264, 145, 51);
		panel_2_1.add(Updatebtn);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("/Sport Event Business/src/BowlingCentre/FirstTimeLoginInfo.txt");
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
		btnUpload.setBackground(new Color(255, 228, 225));
		btnUpload.setBounds(223, 264, 145, 51);
		panel_2_1.add(btnUpload);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(54, 547, 864, 115);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnAdd = new JButton("ADD RECORD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un;
				boolean login = false;
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				try {
					for(int i = 0; i<model.getRowCount(); i++) {
						un = String.valueOf(model.getValueAt(i, 0));
						
						if(UsernameTextField.getText().equals(un)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "This username is already exist!");
					}
					else if(UsernameTextField.getText().equals("") || CreatePasswordTextField.getText().equals("") || 
							ConfirmAgainPasswordTextField.getText().equals("") || AgeTextField.getText().equals("") ||
							comboBox.getSelectedItem().equals("Select") || GenderComboBox.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(null, "The record cannot be null!");
					}
					else if(CreatePasswordTextField.getText().equals(ConfirmAgainPasswordTextField.getText())) 
			    	{
						
						model.addRow(new Object[]{
							UsernameTextField.getText(),
							CreatePasswordTextField.getText()
						});
						JOptionPane.showMessageDialog(null, "The record is added successfully!");
			    	}
					else {
						JOptionPane.showMessageDialog(null, "The record is failed to add!");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Make sure your password are matched!",
							"Message", JOptionPane.OK_OPTION);
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBackground(new Color(255, 228, 225));
		btnAdd.setBounds(24, 25, 186, 66);
		panel_1_1.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameTextField.setText("");
				AgeTextField.setText("");
				GenderComboBox.setSelectedItem("Select");
				comboBox.setSelectedItem("Select");
				CreatePasswordTextField.setText("");
				ConfirmAgainPasswordTextField.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBackground(new Color(255, 228, 225));
		btnReset.setBounds(232, 25, 133, 66);
		panel_1_1.add(btnReset);
		
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
		btnPrint.setBackground(new Color(255, 228, 225));
		btnPrint.setBounds(394, 26, 133, 65);
		panel_1_1.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Message", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Message", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDelete.setBackground(new Color(255, 228, 225));
		btnDelete.setBounds(561, 25, 133, 66);
		panel_1_1.add(btnDelete);
		
		JButton btnExit = new JButton("BACK");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Message", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					CustomerLoginBowling lp = new CustomerLoginBowling();
					lp.setModalExclusionType(null);
					lp.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBackground(new Color(255, 228, 225));
		btnExit.setBounds(722, 23, 121, 68);
		panel_1_1.add(btnExit);
	}
	
	                                  
    
    public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		FirstTimeLoginBowling.table = table;
	}
}
