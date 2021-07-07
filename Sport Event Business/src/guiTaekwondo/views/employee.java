package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class employee extends JFrame {

	private JPanel contentPane;
	private JTable employeeTable;
	private JTextField nameTextField;
	private JTextField emailTextField;
	private JTextField salaryTextField;
	private JTextField totalSalaryTextField;
	private JButton calculateButton;
	private JButton returnButton;
	private JButton exportButton;
	private JButton addButton;
	private JButton editButton;
	private JButton removeButton;
	private JButton resetButton;
	private JButton printButton;
	private JButton financialButton;
	private JComboBox genderComboBox;
	private JComboBox ageComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee frame = new employee();
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
	public employee() {
		initComponents();
		createEvents();
	}
	
	public double totalSalary() {
		DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
		 int i = employeeTable.getRowCount();
		 double salary=0;
		 for(int j=0;j<i;j++) {
			 salary=(double) model.getValueAt(j, 4)+salary;
		 }
		 return salary;
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(250, 240, 230));
		
		JScrollPane tableScrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
						.addComponent(tableScrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
						.addComponent(titlePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(titlePanel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 112, Short.MAX_VALUE))
		);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel genderLabel = new JLabel("Gender:");
		genderLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel ageLabel = new JLabel("Age:");
		ageLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		nameTextField.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setText(".com");
		emailTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		emailTextField.setColumns(10);
		
		genderComboBox = new JComboBox();
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		genderComboBox.setSelectedIndex(0);
		genderComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		
		ageComboBox = new JComboBox();
		ageComboBox.setModel(new DefaultComboBoxModel(new String[] {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55+"}));
		ageComboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel salaryLabel = new JLabel("Salary: RM");
		salaryLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		salaryTextField = new JTextField();
		salaryTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		salaryTextField.setColumns(10);
		
		addButton = new JButton("Add");


		addButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		editButton = new JButton("Edit");
		editButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		removeButton = new JButton("Remove");

		removeButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		printButton = new JButton("Print");

		printButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel totalSalaryLabel = new JLabel("Total Salary: RM");
		totalSalaryLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		totalSalaryTextField = new JTextField();
		totalSalaryTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		totalSalaryTextField.setColumns(10);
		
		calculateButton = new JButton("Calculate");

		
		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		exportButton = new JButton("Export");

		exportButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		financialButton = new JButton("Financial");

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addComponent(genderLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(ageLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(ageComboBox, 0, 102, Short.MAX_VALUE)
						.addComponent(emailTextField, 102, 102, 102)
						.addComponent(nameTextField, 102, 102, 102)
						.addComponent(genderComboBox, 0, 102, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(salaryLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(salaryTextField, 101, 101, 101)
							.addGap(18)
							.addComponent(totalSalaryLabel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(calculateButton)
								.addComponent(totalSalaryTextField, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(editButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(addButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(printButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(removeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(exportButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addGap(51)
									.addComponent(financialButton, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
								.addComponent(resetButton))))
					.addGap(39))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameLabel)
						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(salaryLabel)
						.addComponent(salaryTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(totalSalaryLabel)
						.addComponent(totalSalaryTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(removeButton)
								.addComponent(addButton)
								.addComponent(resetButton)
								.addComponent(calculateButton))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(editButton)
								.addComponent(printButton)
								.addComponent(exportButton)
								.addComponent(financialButton)))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(genderLabel)
								.addComponent(genderComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(ageLabel)
								.addComponent(ageComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(emailLabel)
								.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		employeeTable = new JTable();
		employeeTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Adam", "Male", "22", "adam@gmail.com", new Double(2000.0)},
				{"Mary", "Female", "24", "mary@gmail.com", new Double(2000.0)},
				{"Alice", "Female", "33", "alice@yahoo.com", new Double(2000.0)},
				{"John", "Male", "35", "john@hotmail.com", new Double(2000.0)},
			},
			new String[] {
				"Name", "Gender", "Age", "Email", "Salary(RM)"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		employeeTable.setFont(new Font("Arial", Font.PLAIN, 11));
		tableScrollPane.setViewportView(employeeTable);
		
		JLabel titleLabel = new JLabel("Employees Data");
		titleLabel.setForeground(new Color(0, 128, 128));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		returnButton = new JButton("");

		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		returnButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_titlePanel = new GroupLayout(titlePanel);
		gl_titlePanel.setHorizontalGroup(
			gl_titlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(111)
					.addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
					.addGap(195))
		);
		gl_titlePanel.setVerticalGroup(
			gl_titlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_titlePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(returnButton)
						.addComponent(titleLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		titlePanel.setLayout(gl_titlePanel);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvents() {
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
				 int i = employeeTable.getRowCount();
				 double salary=0;
				 for(int j=0;j<i;j++) {
					 salary=(double) model.getValueAt(j, 4)+salary;
				 }
				 totalSalaryTextField.setText(String.valueOf(salary));
			}
		});
		

		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMainMenu frame = new adminMainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
		exportButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File(
							"/Sport Event Business/src/guiTaekwondo/views/EmployeeDetail.text");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < employeeTable.getRowCount(); i++) {
						for (int j = 0; j < employeeTable.getColumnCount(); j++) {
							bw.write(employeeTable.getModel().getValueAt(i, j) + "  ");
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
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
				if(nameTextField.getText().isBlank()||salaryTextField.getText().isBlank()||emailTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Please input all data.");
				}
				else {
					model.addRow(new Object[] {nameTextField.getText(),genderComboBox.getSelectedItem(),
							ageComboBox.getSelectedItem(),emailTextField.getText(),Double.parseDouble(salaryTextField.getText()) });
				}


				if (employeeTable.getSelectedRow() == -1) {
					if (employeeTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee added.",
								"User Account", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
				if (employeeTable.getSelectedRow() == -1) {
					if (employeeTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "User Account",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "User Account",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(employeeTable.getSelectedRow());
				}
			}
		});
		
		editButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
                // i = the index of the selected row
                int i = employeeTable.getSelectedRow();
                
				if(nameTextField.getText().isBlank()||salaryTextField.getText().isBlank()||emailTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Please input all data.");
				}
				else {
	                if(i >= 0) 
	                {
	                   model.setValueAt(nameTextField.getText(), i, 0);
	                   model.setValueAt(genderComboBox.getSelectedItem(), i, 1);
	                   model.setValueAt(ageComboBox.getSelectedItem(), i, 2);
	                   model.setValueAt(emailTextField.getText(), i, 3);
	                   model.setValueAt(Double.parseDouble(salaryTextField.getText()) , i, 4);
	                }
				}

            }
        });

		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("");
				ageComboBox.setSelectedIndex(18);
				genderComboBox.setSelectedIndex(-1);
				emailTextField.setText("");
				salaryTextField.setText("");

			}
		});
		
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // change e with other variable
				try {
					employeeTable.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
		}
	});
		
		financialButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				financial frame = new financial(Double.parseDouble(totalSalaryTextField.getText()) );
				frame.setModalExclusionType(null);
				frame.setVisible(true);
	            dispose();
			}
		});
		
	}

}
