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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;


public class Finance extends JFrame {

	private JPanel contentPane;
	private JTable FinanceTable;
	private JTable model;
	private JTextField QweekdaysTextField;
	private JFrame frame;
	private JTextField QWeekendTextField;
	private JTextField PrizeTextField;
	private JTextField FeesTextField;
	private JTextField totalEmpSalarytextField;
	private double netProfit= 0;
	private JTextField textField;
	private JTextField textField_1;
	private String totalEmSalary,prize;
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
	
	public Finance(String s) {
		this.totalEmSalary=s;
		
		setTitle("Ultimate Gamer Center System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1027, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel.setBounds(0, 0, 1007, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
				
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(21, 48, 421, 398);
		panel.add(panel_1);

		JLabel lblPQuantityWeekday = new JLabel("Quantity of participant registration in Weekdays");
		lblPQuantityWeekday.setForeground(new Color(255, 255, 255));
		lblPQuantityWeekday.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblPQuantityWeekday.setBounds(10, 72, 401, 30);
		panel_1.add(lblPQuantityWeekday);

		QweekdaysTextField = new JTextField();
		QweekdaysTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		QweekdaysTextField.setBounds(74, 98, 156, 30);
		panel_1.add(QweekdaysTextField);
		QweekdaysTextField.setColumns(10);
		
		JLabel lblQuantityOfRegistration = new JLabel("Quantity of participant registration in Weekend");
		lblQuantityOfRegistration.setForeground(new Color(255, 255, 255));
		lblQuantityOfRegistration.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblQuantityOfRegistration.setBounds(10, 136, 401, 30);
		panel_1.add(lblQuantityOfRegistration);
		
		QWeekendTextField = new JTextField();
		QWeekendTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		QWeekendTextField.setColumns(10);
		QWeekendTextField.setBounds(74, 166, 156, 30);
		panel_1.add(QWeekendTextField);
		
		JLabel lblPrizeAmount = new JLabel("Prize amount (RM)");
		lblPrizeAmount.setForeground(new Color(255, 255, 255));
		lblPrizeAmount.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblPrizeAmount.setBounds(20, 211, 150, 30);
		panel_1.add(lblPrizeAmount);
		
		PrizeTextField = new JTextField();
		PrizeTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		PrizeTextField.setColumns(10);
		PrizeTextField.setBounds(255, 210, 156, 30);
		panel_1.add(PrizeTextField);
		
		JLabel lblExpenses = new JLabel("Total Expenses (RM)");
		lblExpenses.setForeground(new Color(255, 255, 255));
		lblExpenses.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblExpenses.setBounds(20, 256, 225, 30);
		panel_1.add(lblExpenses);
		
		FeesTextField = new JTextField();
		FeesTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		FeesTextField.setColumns(10);
		FeesTextField.setBounds(255, 255, 156, 30);
		panel_1.add(FeesTextField);
		
		totalEmpSalarytextField = new JTextField();
		totalEmpSalarytextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		totalEmpSalarytextField.setColumns(10);
		totalEmpSalarytextField.setBounds(255, 300, 156, 30);
		totalEmpSalarytextField.setText(totalEmSalary);
		panel_1.add(totalEmpSalarytextField);
		
		JLabel lblEmployeeSalary = new JLabel("Total Employee Salary (RM)");
		lblEmployeeSalary.setForeground(new Color(255, 255, 255));
		lblEmployeeSalary.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblEmployeeSalary.setBounds(20, 301, 229, 30);
		panel_1.add(lblEmployeeSalary);
		
		JButton btnNetProfit = new JButton("Calc Net Profit (RM)");
		btnNetProfit.setBounds(10, 347, 203, 41);
		panel_1.add(btnNetProfit);
		btnNetProfit.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		JLabel lblEventCat = new JLabel("Game Category");
		lblEventCat.setForeground(new Color(255, 255, 255));
		lblEventCat.setBounds(10, 31, 150, 30);
		panel_1.add(lblEventCat);
		lblEventCat.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Game Category", "FPS Game", "MOBA Game", "RTS Game"}));
		comboBox.setBounds(146, 32, 172, 24);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Gaming Pic\\3628152.jpg"));
		lblNewLabel_2.setBounds(0, 0, 421, 398);
		panel_1.add(lblNewLabel_2);
		
		
	
			
		btnNetProfit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 8));
			        
			        netProfit += Double.parseDouble(s);
			    }
			    textField_1 = new JTextField();
				textField_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
				textField_1.setEditable(false);
				textField_1.setBounds(223, 355, 162, 30);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
				String output=String.valueOf(netProfit);
				textField_1.setText(output);
			}
			});
		
		
		
		

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel_1_2.setBackground(new Color(204, 204, 255));
		panel_1_2.setBounds(452, 105, 549, 340);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 529, 269);
		panel_1_2.add(scrollPane);

		FinanceTable = new JTable();
		FinanceTable.setFont(new Font("Tahoma", Font.BOLD, 10));
		FinanceTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Game Category", "Quantity Weekdays", "Quantity Weekend", "Prize amount", "Expenses", "Total Salary", "Cost", "Earning", "Profit"
			}
		));
		FinanceTable.getColumnModel().getColumn(0).setPreferredWidth(131);
		FinanceTable.getColumnModel().getColumn(1).setPreferredWidth(102);
		FinanceTable.getColumnModel().getColumn(2).setPreferredWidth(98);
		FinanceTable.getColumnModel().getColumn(3).setPreferredWidth(82);
		FinanceTable.getColumnModel().getColumn(4).setPreferredWidth(54);
		FinanceTable.getColumnModel().getColumn(5).setPreferredWidth(81);
		FinanceTable.getColumnModel().getColumn(6).setPreferredWidth(57);
		FinanceTable.getColumnModel().getColumn(7).setMinWidth(18);
		scrollPane.setViewportView(FinanceTable);
		
	

		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {//2.2 Exception Handling
					File file = new File("/Sport Event Business/src/gaming/Finance.txt");
					if (!file.exists()) {	//2.3 File IO
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
				
					bw.write(
							"\n__________________________________________________________________________________________________________________________________\n");
					for (int i = 0; i < FinanceTable.getRowCount(); i++) {
						for (int j = 0; j < FinanceTable.getColumnCount(); j++) {
							bw.write(FinanceTable.getModel().getValueAt(i, j) + "		|");
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
		
				JButton btnPrint = new JButton("Print");
				btnPrint.setBounds(336, 289, 129, 35);
				panel_1_2.add(btnPrint);
				btnPrint.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {//2.2 Exception Handling
							FinanceTable.print();
						} catch (java.awt.print.PrinterException e) {
							System.err.format("No printer found", e.getMessage());
						}
					}
				});
				btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel_1_1_1_1.setBackground(new Color(204, 204, 255));
		panel_1_1_1_1.setBounds(21, 456, 957, 70);
		panel.add(panel_1_1_1_1);

		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				double registerFee = 0;
				 Discount dd=new WeekendDiscountRate();
				ParticipantRegistration pr=new ParticipantRegistration();
				
				if(comboBox.getSelectedItem().equals("FPS Game")) 
					if (pr.getFpsFee()==null) {
						registerFee=95;
					}
					else {registerFee=Double.parseDouble(pr.getFpsFee());
				}
					
					if(comboBox.getSelectedItem().equals("MOBA Game")) 
					if (pr.getMobaFee()==null) {
						registerFee=90;
					}
					else {registerFee=Double.parseDouble(pr.getMobaFee());
					}
				
				 if(comboBox.getSelectedItem().equals("RTS Game")) 
					if (pr.getRtsFee()==null) {
						registerFee=85;
					}else {registerFee=Double.parseDouble(pr.getRtsFee());
					}
				
				int participantWd= Integer.parseInt(QweekdaysTextField.getText());
				int participantWk= Integer.parseInt(QWeekendTextField.getText());
				
				double answerEarn=(participantWd*registerFee)+(participantWk*(registerFee*(1-dd.discountRate())));
				String earning=Double.toString(answerEarn);
				
				double prize= Integer.parseInt(PrizeTextField.getText());
				double fee= Integer.parseInt(FeesTextField.getText());
				double totalEmpSalary= Double.parseDouble(totalEmpSalarytextField.getText());
				String totalSalary = Double.toString(totalEmpSalary);
				double answerCost= prize+fee+totalEmpSalary;
				String cost=Double.toString(answerCost);
				
				double answerProfit= answerEarn-answerCost;
				String profit= Double.toString(answerProfit);
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				model.addRow(new Object[] { comboBox.getSelectedItem(),QweekdaysTextField.getText(),QWeekendTextField.getText(), PrizeTextField.getText(), FeesTextField.getText(),
						totalSalary,cost,earning,profit,

				});
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAddRecord.setBounds(10, 18, 171, 35);
		panel_1_1_1_1.add(btnAddRecord);
		btnAddRecord.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("Select Game Category");
				QweekdaysTextField.setText("");
				QWeekendTextField.setText("");
				PrizeTextField.setText("");
				FeesTextField.setText("");
				
				
			}
		});
		btnReset.setBounds(362, 18, 108, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				if (FinanceTable.getSelectedRow() == -1) {
					if (FinanceTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Participant Registration System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Participant Registration System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(FinanceTable.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(501, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit",
						"Ultimate Gamer System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(818, 18, 129, 35);
		panel_1_1_1_1.add(btnExit);
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				int i = FinanceTable.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(comboBox.getSelectedItem(), i, 0);
					model.setValueAt(QweekdaysTextField.getText(), i, 1);
					model.setValueAt(QWeekendTextField.getText(), i, 2);
					model.setValueAt(PrizeTextField.getText(), i, 3);
					model.setValueAt(FeesTextField.getText(), i, 4);
					model.setValueAt(totalEmpSalarytextField.getText(), i, 5);
					
					JOptionPane.showMessageDialog(null, "Update Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setBounds(207, 18, 133, 35);
		panel_1_1_1_1.add(btnUpdate);
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee frame = new Employee();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnBack.setBounds(658, 18, 129, 35);
		panel_1_1_1_1.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("Finance Information");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(452, 48, 361, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Finance.class.getResource("/gaming/3628152.jpg")));
		lblNewLabel.setBounds(-12, 0, 1019, 555);
		panel.add(lblNewLabel);
		
		
		
		
		
	}
}
