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
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTable EmployeeTable;
	private JTable model;
	private JFrame frame;
	private JTextField salary;
	private JTextField name;
	private JTextField employeeID;
	private JTextField department;
	private JTextField phoneNum;
	private double totalSalary=0;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception arg0) {
					arg0.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employee() {
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(102, 51, 204)));
		panel.setBounds(0, 0, 930, 540);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnNewMenu_1 = new JMenu("About Us");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Center");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin frame = new Admin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_2.setBackground(new Color(255, 204, 255));
		panel_1_2.setBounds(369, 105, 553, 334);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 533, 269);
		panel_1_2.add(scrollPane);
		
		EmployeeTable = new JTable();
		EmployeeTable.setFont(new Font("Tahoma", Font.BOLD, 10));
		EmployeeTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = EmployeeTable.getSelectedRow();
				if(i>=0) {
					name.setText(model.getValueAt(i,0).toString());
					employeeID.setText(model.getValueAt(i,1).toString());
					department.setText(model.getValueAt(i,2).toString());
					phoneNum.setText(model.getValueAt(i,4).toString());
					salary.setText(model.getValueAt(i,4).toString());
					
				    
					JOptionPane.showMessageDialog(null, "Update Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
				
			}
		});
			EmployeeTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Employee ID", "Department", "Phone Num", "Salary (RM)"
				}
			));
		scrollPane.setViewportView(EmployeeTable);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {//2.2 Exception Handling
				File file = new File("D:\\upload file\\EmployeeList.txt");
				if(!file.exists()) { 	//2.3 File IO
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
			
				bw.write("\n_________________________________________________________________________________\n");
				for (int i=0; i<EmployeeTable.getRowCount(); i++) {
					for (int j=0; j<EmployeeTable.getColumnCount(); j++) {
						bw.write(EmployeeTable.getModel().getValueAt(i, j) + "		|");
						}
					bw.write("\n_________________________________________________________________________________\n");
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
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnUpload.setBounds(123, 289, 129, 35);
		panel_1_2.add(btnUpload);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(347, 289, 129, 35);
		panel_1_2.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {//2.2 Exception Handling
					EmployeeTable.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_1_1_1.setBackground(new Color(255, 204, 255));
		panel_1_1_1_1.setBounds(53, 449, 869, 70);
		panel.add(panel_1_1_1_1);
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
				model.addRow(new Object[]{
						name.getText(),
						employeeID.getText(),
						department.getText(),
						phoneNum.getText(),
						salary.getText(),
				});
				
				if (EmployeeTable.getSelectedRow() == -1) {
					if (EmployeeTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Information Update confirmed", "Employee Registration System",
								JOptionPane.OK_OPTION);
					}
				}
				}
			}
		);
		btnAddRecord.setBounds(10, 18, 171, 35);
		panel_1_1_1_1.add(btnAddRecord);
		btnAddRecord.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				employeeID.setText("");
				department.setText("");
				phoneNum.setText("");
				salary.setText("");
				
			}
		});
		btnReset.setBounds(223, 18, 108, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)EmployeeTable.getModel();
				if(EmployeeTable.getSelectedRow()==-1) {
					if(EmployeeTable.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(EmployeeTable.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(387, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)EmployeeTable.getModel();
				int i = EmployeeTable.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(name.getText(),i,0);
			    	model.setValueAt(employeeID.getText(),i,1);
			    	model.setValueAt(department.getText(),i,2);
			    	model.setValueAt(salary.getText(),i,3);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setBounds(554, 18, 133, 35);
		panel_1_1_1_1.add(btnUpdate);
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		salary = new JTextField();
		salary.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		salary.setColumns(10);
		salary.setBounds(183, 312, 156, 30);
		panel.add(salary);
		
		JLabel lblSalary = new JLabel("Salary  (RM)");
		lblSalary.setForeground(new Color(255, 255, 255));
		lblSalary.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		lblSalary.setBounds(34, 300, 149, 54);
		panel.add(lblSalary);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(255, 255, 255));
		lblDepartment.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		lblDepartment.setBounds(34, 206, 139, 30);
		panel.add(lblDepartment);
		
		JLabel lblEmpID = new JLabel("Employee ID");
		lblEmpID.setForeground(new Color(255, 255, 255));
		lblEmpID.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblEmpID.setBounds(34, 157, 139, 30);
		panel.add(lblEmpID);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		lblName.setBounds(34, 105, 81, 30);
		panel.add(lblName);
		
		name = new JTextField();
		name.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		name.setColumns(10);
		name.setBounds(183, 106, 156, 30);
		panel.add(name);
		
		employeeID = new JTextField();
		employeeID.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		employeeID.setColumns(10);
		employeeID.setBounds(183, 157, 156, 30);
		panel.add(employeeID);
		
		department = new JTextField();
		department.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		department.setColumns(10);
		department.setBounds(183, 207, 156, 30);
		panel.add(department);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Information");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(new Color(204, 204, 255));
		lblNewLabel_1.setBounds(447, 44, 374, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblPhoneNum = new JLabel("Phone Num");
		lblPhoneNum.setForeground(Color.WHITE);
		lblPhoneNum.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		lblPhoneNum.setBounds(34, 257, 139, 30);
		panel.add(lblPhoneNum);
		
		JButton btnTotalSalaryButton = new JButton("Total Salary(RM)");
		btnTotalSalaryButton.setBounds(76, 364, 185, 30);
		panel.add(btnTotalSalaryButton);
		btnTotalSalaryButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTotalSalaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 4));
			        
			        totalSalary += Double.parseDouble(s);
			    }
			    textField = new JTextField();
				textField.setBounds(76, 404, 185, 37);
				panel.add(textField);
				textField.setColumns(10);
			    textField.setEditable(false);
			    textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
				String result=String.valueOf(totalSalary);
				textField.setText(result);
			}
			});
		JButton btnExit = new JButton("Finance");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result=String.valueOf(totalSalary);
				Finance f= new Finance(result);
				f.setVisible(true);
				dispose();
				}
			
		});
		btnExit.setBounds(730, 18, 129, 35);
		panel_1_1_1_1.add(btnExit);
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		phoneNum = new JTextField();
		phoneNum.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		phoneNum.setColumns(10);
		phoneNum.setBounds(183, 258, 156, 30);
		panel.add(phoneNum);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Gaming Pic\\maxresdefault.jpg"));
		lblNewLabel.setBounds(10, 10, 912, 520);
		panel.add(lblNewLabel);
		
		
	}

}
