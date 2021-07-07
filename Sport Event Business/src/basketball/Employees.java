package basketball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Employees extends JFrame{

	private JPanel contentPane;
	private JTable table;
	private JTextField NametextField;
	private JTextField IDtextField;
	private JTextField SalarytextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employees frame = new Employees();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		});
	}

	/**
	 * Create the application.
	 */
	public Employees() {
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 686, 503);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(205, 92, 92));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(128, 0, 0));
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(10, 11, 645, 65);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE INFORMATION");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel.setBounds(149, 11, 342, 43);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(10, 87, 235, 285);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		NametextField = new JTextField();
		NametextField.setBounds(122, 42, 103, 20);
		panel_1.add(NametextField);
		NametextField.setColumns(10);
		
		IDtextField = new JTextField();
		IDtextField.setBounds(122, 77, 103, 18);
		panel_1.add(IDtextField);
		IDtextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Department :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblNewLabel_1.setBounds(8, 11, 111, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name         :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblNewLabel_2.setBounds(8, 39, 121, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Employee ID:");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(8, 73, 128, 20);
		panel_1.add(lblNewLabel_3);
		
		JComboBox<Object> comboBoxDepartment = new JComboBox<Object>();
		comboBoxDepartment.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "Ticket", "Referee", "Physiotheraphist", "Presenter", "Commentators"}));
		comboBoxDepartment.setBounds(122, 14, 103, 20);
		panel_1.add(comboBoxDepartment);
		
		JLabel lblNewLabel_4 = new JLabel("Gender       :");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblNewLabel_4.setBounds(8, 104, 128, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Salary        :");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 21));
		lblNewLabel_5.setBounds(10, 155, 109, 35);
		panel_1.add(lblNewLabel_5);
		
		SalarytextField = new JTextField();
		SalarytextField.setBounds(122, 165, 103, 20);
		panel_1.add(SalarytextField);
		SalarytextField.setColumns(10);
	
		JRadioButton male = new JRadioButton("MALE");
		male.setBackground(new Color(240, 128, 128));
		male.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		male.setBounds(10, 125, 97, 23);
		panel_1.add(male);
		
		JRadioButton female = new JRadioButton("FEMALE");
		female.setBackground(new Color(240, 128, 128));
		female.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		female.setBounds(116, 125, 109, 23);
		panel_1.add(female);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalarytextField.setText("");
				NametextField.setText("");
				IDtextField.setText("");
				male.setSelected(false);
				female.setSelected(false);
				comboBoxDepartment.setSelectedItem(e);
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_1.setBounds(8, 202, 97, 59);
		panel_1.add(btnNewButton_1);
			
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1_3_1.setBackground(new Color(240, 128, 128));
		panel_1_3_1.setBounds(255, 87, 400, 285);
		getContentPane().add(panel_1_3_1);
		panel_1_3_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 380, 263);
		panel_1_3_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 235, 205));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Department", "Name", "Employee ID", "Gender", "Salary (RM)"
			}
		));
		table.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String gender= " ";
					
				if (male.isSelected()) {
					gender = male.getText();
					
				} else {
					gender = female.getText();
				
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						comboBoxDepartment.getSelectedItem(),
						NametextField.getText(),
						IDtextField.getText(),
						gender,
						SalarytextField.getText(),
						
						
						
												
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(btnNewButton, "Employee Information Sucessfuly Added");
				
					}
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setBounds(128, 202, 97, 59);
		panel_1.add(btnNewButton);
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(645, 383, -595, 52);
		getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_3.setBackground(new Color(240, 128, 128));
		panel_3.setBounds(10, 383, 645, 68);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(221, 160, 221));
		btnNewButton_2.setBounds(10, 11, 121, 46);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PRINT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_3.setBackground(new Color(221, 160, 221));
		btnNewButton_3.setBounds(141, 11, 121, 46);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Admin frame =  new Admin();
			frame.setModalExclusionType(null);
			frame.setVisible(true);
			dispose();
			
		}
	});
		btnNewButton_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_4.setBackground(new Color(221, 160, 221));
		btnNewButton_4.setBounds(533, 11, 102, 46);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("UPLOAD");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				File file= new File("/Sport Event Business/src/basketball/txt/employees.txt");
				
				if(!file.exists()) {
					file.createNewFile();
				}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount();i++) {
					for(int j=0; j<table.getColumnCount();j++)
						bw.write(table.getModel().getValueAt(i, j)+"\t");
				}
			bw.write("\n");
			
			bw.close();
			fw.close();
			JOptionPane.showMessageDialog(null, "Data Exported");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		}
	});
		btnNewButton_6.setBackground(new Color(221, 160, 221));
		btnNewButton_6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_6.setBounds(272, 11, 126, 46);
		panel_3.add(btnNewButton_6);
		
		JButton btnFinance = new JButton("FINANCE");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String salary = SalarytextField.getText();
				Finance fin = new Finance();
				fin.update(salary);
				
				fin.setVisible(true);
				dispose();
			
				
			}
		});
		btnFinance.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnFinance.setBackground(new Color(221, 160, 221));
		btnFinance.setBounds(408, 11, 115, 46);
		panel_3.add(btnFinance);
		
		JButton btnNewButton_5 = new JButton("UPLOAD");
		btnNewButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		btnNewButton_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_5.setBackground(new Color(255, 228, 196));
		btnNewButton_5.setBounds(296, 11, 138, 46);
		panel_3.add(btnNewButton_5);
		setBounds(100, 100, 681, 501);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
		
		});
	}
	};