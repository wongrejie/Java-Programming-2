package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class EmployeeRegistrationBowling extends JFrame {

	private JPanel contentPane;
	private JTextField EmployeeIDTextField;
	private JTextField NameTextField;
	private JTextField AgeTextField;
	JTextField RMTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;
	private JTextField ContactNoTextField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRegistrationBowling frame = new EmployeeRegistrationBowling();
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
	public EmployeeRegistrationBowling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		setJMenuBar(menuBar);
		
		JMenu mnBowlingCentre = new JMenu("Bowling Centre");
		mnBowlingCentre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnBowlingCentre);
		
		JRadioButtonMenuItem rdbtnmntmClose = new JRadioButtonMenuItem("Close");
		rdbtnmntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(rdbtnmntmClose, "Confirm if you want to exit", "Time Zone Bowling Centre", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		rdbtnmntmClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnBowlingCentre.add(rdbtnmntmClose);
		
		JMenu mnCustomer = new JMenu("Customer");
		mnCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnCustomer);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_3 = new JRadioButtonMenuItem("Participant Login");
		rdbtnmntmNewRadioItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLoginBowling cl = new CustomerLoginBowling();
				cl.setModalExclusionType(null);
				cl.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmNewRadioItem_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnCustomer.add(rdbtnmntmNewRadioItem_3);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Participant Register");
		rdbtnmntmNewRadioItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistrationBowling c = new CustomerRegistrationBowling();
				c.setModalExclusionType(null);
				c.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmNewRadioItem_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnCustomer.add(rdbtnmntmNewRadioItem_1);
		
		JMenu mnEmployee = new JMenu("Employee");
		mnEmployee.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnEmployee);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Employee Login");
		rdbtnmntmNewRadioItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeLoginBowling el = new EmployeeLoginBowling();
				el.setModalExclusionType(null);
				el.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmNewRadioItem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEmployee.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("Employee Registration");
		rdbtnmntmNewRadioItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeRegistrationBowling er = new EmployeeRegistrationBowling();
				er.setModalExclusionType(null);
				er.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmNewRadioItem_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEmployee.add(rdbtnmntmNewRadioItem_2);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_4 = new JRadioButtonMenuItem("Finance");
		rdbtnmntmNewRadioItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rm = RMTextField.getText();
				FinanceBowling f = new FinanceBowling();
				f.setVisible(true);
				f.RMTextField.setText(rm);
				
				TotalPayment t = new PriceRate();
				f.RfTextField.setText(String.valueOf(t.totalPrice()));
				
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				f.setModalExclusionType(null);
				f.setVisible(true);
				dispose();
			}
		});
		rdbtnmntmNewRadioItem_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEmployee.add(rdbtnmntmNewRadioItem_4);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Update Event Details");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateEventBowling u = new UpdateEventBowling();
				u.setModalExclusionType(null);
				u.setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEmployee.add(mntmNewMenuItem);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 976, 676);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EmployeeRegistrationBowling.class.getResource("/BowlingCentre/2735734-200.png")));
		lblNewLabel.setBounds(97, 29, 226, 183);
		panel.add(lblNewLabel);
		
		JLabel lblEmployeeID = new JLabel("Employee ID:");
		lblEmployeeID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmployeeID.setBounds(24, 289, 156, 46);
		panel.add(lblEmployeeID);
		
		EmployeeIDTextField = new JTextField();
		EmployeeIDTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		EmployeeIDTextField.setBounds(157, 289, 166, 46);
		panel.add(EmployeeIDTextField);
		EmployeeIDTextField.setColumns(10);
		
		JLabel lblName = new JLabel("Name         :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(24, 345, 156, 46);
		panel.add(lblName);
		
		NameTextField = new JTextField();
		NameTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NameTextField.setColumns(10);
		NameTextField.setBounds(157, 345, 166, 46);
		panel.add(NameTextField);
		
		JLabel lblAge = new JLabel("Age            :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAge.setBounds(24, 401, 156, 46);
		panel.add(lblAge);
		
		JLabel lblDepartment = new JLabel("Department  :");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartment.setBounds(24, 233, 156, 46);
		panel.add(lblDepartment);
		
		JLabel lblSalary = new JLabel("Basic Salary  :");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalary.setBounds(24, 569, 156, 46);
		panel.add(lblSalary);
		
		AgeTextField = new JTextField();
		AgeTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AgeTextField.setColumns(10);
		AgeTextField.setBounds(157, 401, 166, 46);
		panel.add(AgeTextField);
		
		RMTextField = new JTextField();
		RMTextField.setEditable(false);
		RMTextField.setText(" ");
		RMTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RMTextField.setColumns(10);
		RMTextField.setBounds(157, 569, 166, 46);
		panel.add(RMTextField);
		
		JLabel lblGender = new JLabel("Gender        :");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGender.setBounds(24, 457, 156, 46);
		panel.add(lblGender);
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup.add(male);
		male.setSelected(true);
		male.setFont(new Font("Tahoma", Font.PLAIN, 18));
		male.setBackground(Color.WHITE);
		male.setBounds(157, 453, 63, 50);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setSelected(true);
		female.setFont(new Font("Tahoma", Font.PLAIN, 18));
		female.setBackground(Color.WHITE);
		female.setBounds(234, 453, 89, 50);
		panel.add(female);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "Event Team" || comboBox.getSelectedItem() == "Marketing Team" ||
				   comboBox.getSelectedItem() == "Customer Service Team" || comboBox.getSelectedItem() == "Logistics Team" ||
				   comboBox.getSelectedItem() == "HR Team"|| comboBox.getSelectedItem() == "Finance Team") {
					RMTextField.setText("1300");
				}
			}
		});
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Event Team", "Marketing Team", "HR Team", "Customer Service Team", "Logistics Team", "Finance Team"}));
		comboBox.setBounds(157, 235, 166, 44);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("Select");
				EmployeeIDTextField.setText("");
				NameTextField.setText("");
				AgeTextField.setText("");
				male.setSelected(false);
				female.setSelected(false);
				ContactNoTextField.setText("");
				RMTextField.setText("");
			}
		});
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(381, 523, 120, 46);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(360, 171, 578, 332);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 558, 312);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Department", "ID", "Name", "Age", "Gender", "Contact No", "Salary"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(32);
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id;
				boolean save = false;
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				try {
					for(int i = 0; i<model.getRowCount(); i++) {
						id = String.valueOf(model.getValueAt(i, 1));
						
						if(EmployeeIDTextField.getText().equals(id)) {
							save = true;
						}
					}
					
					if(save == true) {
						JOptionPane.showMessageDialog(null, "This record is already exist!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else if(EmployeeIDTextField.getText().equals("") || NameTextField.getText().equals("") || 
							AgeTextField.getText().equals("") || ContactNoTextField.getText().equals("") ||
							comboBox.getSelectedItem().equals("Select")) {
						JOptionPane.showMessageDialog(null, "The record cannot be null!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else if(male.isSelected()) {
						String m = "male";
						model.addRow(new Object[]{
								comboBox.getSelectedItem(),
								EmployeeIDTextField.getText(),
								NameTextField.getText(),
								AgeTextField.getText(),
								m,
								ContactNoTextField.getText(),
								RMTextField.getText()
						});
						JOptionPane.showMessageDialog(null, "Employee Info is added successfully!");
					}
					else if(female.isSelected()) {
						String f = "female";
						model.addRow(new Object[]{
								comboBox.getSelectedItem(),
								EmployeeIDTextField.getText(),
								NameTextField.getText(),
								AgeTextField.getText(),
								f,
								ContactNoTextField.getText(),
								RMTextField.getText()
						});
						JOptionPane.showMessageDialog(null, "Employee Info is added successfully!");
					}
					else {
						JOptionPane.showMessageDialog(null, "The record is failed to add!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,"Make sure your password are matched!", "Message", JOptionPane.OK_OPTION);
				}
				
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setBackground(new Color(255, 240, 245));
		btnSubmit.setBounds(520, 523, 120, 46);
		panel.add(btnSubmit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Information System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Information System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBackground(new Color(255, 240, 245));
		btnDelete.setBounds(661, 523, 120, 46);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	if(male.isSelected()) {
			    		String m = "male";
			    		model.setValueAt(comboBox.getSelectedItem(), i, 0);
			    		model.setValueAt(EmployeeIDTextField.getText(), i, 1);
			    		model.setValueAt(NameTextField.getText(),i,2);
			    		model.setValueAt(AgeTextField.getText(),i,3);
				    	model.setValueAt(m,i,4);
				    	model.setValueAt(ContactNoTextField.getText(),i,5);
				    	model.setValueAt(RMTextField.getText(), i, 6);
						JOptionPane.showMessageDialog(null, "Update Successfully");
			    	}
			    	else if(female.isSelected()) {
			    		String f = "female";
			    		model.setValueAt(comboBox.getSelectedItem(), i, 0);
			    		model.setValueAt(EmployeeIDTextField.getText(), i, 1);
			    		model.setValueAt(NameTextField.getText(),i,2);
			    		model.setValueAt(AgeTextField.getText(),i,3);
				    	model.setValueAt(f,i,4);
				    	model.setValueAt(ContactNoTextField.getText(),i,5);
				    	model.setValueAt(RMTextField.getText(), i, 6);
						JOptionPane.showMessageDialog(null, "Update Successfully");
			    	}
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(255, 240, 245));
		btnUpdate.setBounds(802, 523, 120, 46);
		panel.add(btnUpdate);
		
		JLabel lblContactno = new JLabel("Contact No   :");
		lblContactno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContactno.setBounds(24, 513, 156, 46);
		panel.add(lblContactno);
		
		ContactNoTextField = new JTextField();
		ContactNoTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ContactNoTextField.setColumns(10);
		ContactNoTextField.setBounds(157, 513, 166, 46);
		panel.add(ContactNoTextField);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Information System");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_1.setBounds(360, 59, 578, 81);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 51));
		panel_2.setBounds(390, 125, 517, 5);
		panel.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 0, 51));
		panel_2_1.setBounds(390, 70, 517, 5);
		panel.add(panel_2_1);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("/Sport Event Business/src/BowlingCentre/EmployeeInfoSystem.txt");
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
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpload.setBackground(new Color(255, 240, 245));
		btnUpload.setBounds(381, 598, 120, 46);
		panel.add(btnUpload);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBackground(new Color(255, 240, 245));
		btnPrint.setBounds(520, 598, 120, 46);
		panel.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Employee Information System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					EmployeeLoginBowling el = new EmployeeLoginBowling();
					el.setModalExclusionType(null);
					el.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 240, 245));
		btnExit.setBounds(802, 598, 120, 46);
		panel.add(btnExit);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.setBackground(new Color(255, 240, 245));
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rm = RMTextField.getText();
				FinanceBowling f = new FinanceBowling();
				f.setVisible(true);
				f.RMTextField.setText(rm);
				
				TotalPayment t = new PriceRate();
				f.RfTextField.setText(String.valueOf(t.totalPrice()));
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				if (JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to go to Finance page", "Employee Information System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					f.setModalExclusionType(null);
					f.setVisible(true);
					dispose();
				}
			}
		});
		btnFinance.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFinance.setBounds(661, 598, 120, 46);
		panel.add(btnFinance);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(EmployeeRegistrationBowling.class.getResource("/BowlingCentre/bigstock_bowling_strike_icon_realistic_253910683.jpg")));
		lblNewLabel_2.setBounds(10, 10, 956, 654);
		panel.add(lblNewLabel_2);
	}
	
	public JTextField getTxtRm() {
		return RMTextField;
	}
}
