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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finance extends JFrame{
	

	private JPanel contentPane;
	private JTextField EmpQuantityTextField;
	private JTextField EmpSalaryTextField;
	private JTextField UtilityTextField;
	private JTextField PrizeTextField;
	private JTextField AdsTextField;
	private JTextField FeeTextField;
	private JTextField ParticipantTextField;
	private JTextField TotalBudgetTextField;
	private JTextField IncomeTextField;
	private JTextField ProfitTextField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(10, 11, 961, 85);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FINANCE");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 45));
		lblNewLabel.setBounds(399, 11, 210, 63);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBackground(new Color(240, 128, 128));
		panel_1.setBounds(10, 100, 364, 341);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel EmployeeQuantity = new JLabel("Employee Quantity :");
		EmployeeQuantity.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		EmployeeQuantity.setBounds(24, 15, 177, 23);
		panel_1.add(EmployeeQuantity);
		
		JLabel EmployeeSalary = new JLabel("Employee Salary : RM");
		EmployeeSalary.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		EmployeeSalary.setBounds(24, 62, 204, 23);
		panel_1.add(EmployeeSalary);
		
		JLabel Prize = new JLabel(" Prize up to : RM");
		Prize.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		Prize.setBounds(64, 109, 148, 23);
		panel_1.add(Prize);
		
		JLabel UtilityFee = new JLabel("Utility Fee : RM");
		UtilityFee.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		UtilityFee.setBounds(75, 156, 134, 23);
		panel_1.add(UtilityFee);
		
		JLabel AdsFee = new JLabel("Advertisement Fee : RM");
		AdsFee.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		AdsFee.setBounds(10, 203, 218, 23);
		panel_1.add(AdsFee);
		
		EmpQuantityTextField = new JTextField();
		EmpQuantityTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		EmpQuantityTextField.setBounds(214, 11, 140, 36);
		panel_1.add(EmpQuantityTextField);
		EmpQuantityTextField.setColumns(10);
		
		EmpSalaryTextField = new JTextField();
		EmpSalaryTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		EmpSalaryTextField.setColumns(10);
		EmpSalaryTextField.setBounds(214, 58, 140, 36);
		panel_1.add(EmpSalaryTextField);
		
		UtilityTextField = new JTextField();
		UtilityTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		UtilityTextField.setColumns(10);
		UtilityTextField.setBounds(214, 152, 140, 36);
		panel_1.add(UtilityTextField);
		
		PrizeTextField = new JTextField();
		PrizeTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		PrizeTextField.setColumns(10);
		PrizeTextField.setBounds(214, 105, 140, 36);
		panel_1.add(PrizeTextField);
		
		AdsTextField = new JTextField();
		AdsTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		AdsTextField.setColumns(10);
		AdsTextField.setBounds(214, 199, 140, 36);
		panel_1.add(AdsTextField);
		
		JLabel TotalBudget = new JLabel("Total Budget : RM");
		TotalBudget.setBounds(10, 284, 177, 43);
		panel_1.add(TotalBudget);
		TotalBudget.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		TotalBudgetTextField = new JTextField();
		TotalBudgetTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		TotalBudgetTextField.setBounds(177, 280, 177, 49);
		panel_1.add(TotalBudgetTextField);
		TotalBudgetTextField.setColumns(10);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int EmpQuantity,EmpSalary,Utility,Prize,Ads;
				try {
					EmpQuantity=Integer.parseInt(EmpQuantityTextField.getText());
					EmpSalary=Integer.parseInt(EmpSalaryTextField.getText());
					Utility=Integer.parseInt(UtilityTextField.getText());
					Prize=Integer.parseInt(PrizeTextField.getText());
					Ads=Integer.parseInt(AdsTextField.getText());
					
					int Total = EmpQuantity+EmpSalary+Utility+Prize+Ads;
					TotalBudgetTextField.setText(Integer.toString(Total));
				
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				
			}}
		});
		Calculate.setBackground(new Color(255, 182, 193));
		Calculate.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		Calculate.setBounds(240, 246, 114, 23);
		panel_1.add(Calculate);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_2.setBackground(new Color(240, 128, 128));
		panel_2.setBounds(384, 332, 587, 113);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel Totalincome = new JLabel("Total Income : RM");
		Totalincome.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		Totalincome.setBounds(10, 49, 157, 23);
		panel_2.add(Totalincome);
		
		JLabel NetProfit = new JLabel("Net Profit : RM");
		NetProfit.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		NetProfit.setBounds(38, 66, 129, 36);
		panel_2.add(NetProfit);
		
		JLabel ParticipantQuantity = new JLabel("Participant Quantity :");
		ParticipantQuantity.setBounds(10, 15, 185, 23);
		panel_2.add(ParticipantQuantity);
		ParticipantQuantity.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		ParticipantTextField = new JTextField();
		ParticipantTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		ParticipantTextField.setBounds(191, 11, 108, 36);
		panel_2.add(ParticipantTextField);
		ParticipantTextField.setColumns(10);
		
		JLabel RegistrationFee = new JLabel("Registration Fee : RM");
		RegistrationFee.setBounds(309, 15, 185, 23);
		panel_2.add(RegistrationFee);
		RegistrationFee.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		
		FeeTextField = new JTextField();
		FeeTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		FeeTextField.setBounds(490, 11, 87, 36);
		panel_2.add(FeeTextField);
		FeeTextField.setColumns(10);
		
		IncomeTextField = new JTextField();
		IncomeTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		IncomeTextField.setBounds(172, 49, 137, 23);
		panel_2.add(IncomeTextField);
		IncomeTextField.setColumns(10);
		
		ProfitTextField = new JTextField();
		ProfitTextField.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		ProfitTextField.setColumns(10);
		ProfitTextField.setBounds(172, 76, 137, 26);
		panel_2.add(ProfitTextField);
		
		JButton Calculate_1 = new JButton("Calculate");
		Calculate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int EmpQuantity,EmpSalary,Utility,Prize,Ads,ParticipantQ,RegFee;
			
			try {
				EmpQuantity=Integer.parseInt(EmpQuantityTextField.getText());
				EmpSalary=Integer.parseInt(EmpSalaryTextField.getText());
				Utility=Integer.parseInt(UtilityTextField.getText());
				Prize=Integer.parseInt(PrizeTextField.getText());
				Ads=Integer.parseInt(AdsTextField.getText());
				
				ParticipantQ=Integer.parseInt(ParticipantTextField.getText());
				RegFee=Integer.parseInt(FeeTextField.getText());
				
				int TotalBudget = EmpQuantity+EmpSalary+Utility+Prize+Ads;
				TotalBudgetTextField.setText(Integer.toString(TotalBudget ));
				
				int Totalincome = ParticipantQ*RegFee;
				IncomeTextField.setText(Integer.toString(Totalincome));
				
				int netprofit = Totalincome-TotalBudget;
				ProfitTextField.setText(Integer.toString(netprofit));
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						EmpQuantityTextField.getText(),
						EmpSalaryTextField.getText(),
						UtilityTextField.getText(),
						PrizeTextField.getText(),
						AdsTextField.getText(),
						

						ParticipantTextField.getText(),
						FeeTextField.getText(),
						TotalBudget,
						Totalincome,
						netprofit,
						
						
												
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
					JOptionPane.showMessageDialog(Calculate_1 , "Participant Information Sucessfuly Added");
				
				}
		}
			}
			catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			
		}}
	});
		
		Calculate_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		Calculate_1.setBackground(new Color(255, 182, 193));
		Calculate_1.setBounds(319, 56, 129, 46);
		panel_2.add(Calculate_1);
		
		
		JButton btnSaveButton = new JButton("Save Data");
		btnSaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		try {
					File file= new File("/Sport Event Business/src/basketball/txt/finance.txt");
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
			
			
		btnSaveButton.setBackground(new Color(255, 192, 203));
		btnSaveButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnSaveButton.setBounds(457, 56, 120, 46);
		panel_2.add(btnSaveButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(384, 107, 587, 214);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 567, 192);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{},
			},
			new String[] {
				"Employee Quantity", "Employee Salary", "Prize", "Utility Fee", "Ads fee", "Participant Quantity", "Registration Fee", "Budget", "Total Income", "Net Profit"
			}
		));
		scrollPane.setViewportView(table);
	}

	public void update(String salary) {
		EmpSalaryTextField.setText(salary);
		// TODO Auto-generated method stub
		
	}

}