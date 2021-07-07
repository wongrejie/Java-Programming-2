package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FinanceBowling extends JFrame {

	private JPanel contentPane;
	private JTextField UtilityFeeTextField;
	private JTextField AdvertisingFeeTextField;
	private JTextField PrizeBudgetedTextField;
	JTextField RMTextField;
	private JTextField QuantityEmployeeTextField;
	private JTextField totalSalaryTextField;
	JTextField RfTextField;
	private JTextField NoPtTextField;
	JTextField IncomeTextField;
	private JTextField UfTextField;
	private JTextField AfTextField;
	private JTextField PbTextField;
	private JTextField TotalSalaryTextField;
	private JTextField TotalIncomeTextField;
	JTextField txtRm;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private JToggleButton tglbtnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinanceBowling frame = new FinanceBowling();
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
	public FinanceBowling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnBowlingCentre = new JMenu("Bowling Centre");
		mnBowlingCentre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnBowlingCentre);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(mntmClose, "Confirm if you want to exit", "Time Zone Bowling Centre", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mntmClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnBowlingCentre.add(mntmClose);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnAbout);
		
		JMenuItem mntmEventDetails = new JMenuItem("Event Details");
		mntmEventDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDetailsBowling ed = new EventDetailsBowling();
				ed.setModalExclusionType(null);
				ed.setVisible(true);
				dispose();
			}
		});
		mntmEventDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnAbout.add(mntmEventDetails);
		
		JMenu mnNewMenu = new JMenu("Customer");
		mnNewMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmParticipantRegistration = new JMenuItem("Participant Registration");
		mntmParticipantRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistrationBowling c  = new CustomerRegistrationBowling();
				c.setModalExclusionType(null);
				c.setVisible(true);
				dispose();
			}
		});
		mntmParticipantRegistration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnNewMenu.add(mntmParticipantRegistration);
		
		JMenu mnEmployee = new JMenu("Employee");
		mnEmployee.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.add(mnEmployee);
		
		JMenuItem mntmEmployeeLogin = new JMenuItem("Employee Login");
		mntmEmployeeLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeLoginBowling el = new EmployeeLoginBowling();
				el.setModalExclusionType(null);
				el.setVisible(true);
				dispose();
			}
		});
		mntmEmployeeLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEmployee.add(mntmEmployeeLogin);
		
		JMenuItem mntmEmployeeRegistration = new JMenuItem("Employee Registration");
		mntmEmployeeRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeRegistrationBowling er = new EmployeeRegistrationBowling();
				er.setModalExclusionType(null);
				er.setVisible(true);
				dispose();
			}
		});
		mntmEmployeeRegistration.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEmployee.add(mntmEmployeeRegistration);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinanceBowling f = new FinanceBowling();
				f.setModalExclusionType(null);
				f.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEmployee.add(mntmFinance);
		
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 976, 676);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel General = new JPanel();
		General.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		General.setBackground(new Color(255, 255, 255));
		General.setBounds(37, 89, 427, 177);
		panel.add(General);
		General.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(0, 0, 922, 43);
		General.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("General");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(23, 0, 297, 43);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Utility Fee             :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(21, 53, 177, 31);
		General.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Advertising Fee      :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(21, 92, 177, 31);
		General.add(lblNewLabel_2_1);
		
		UtilityFeeTextField = new JTextField();
		UtilityFeeTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		UtilityFeeTextField.setBounds(197, 53, 144, 31);
		General.add(UtilityFeeTextField);
		UtilityFeeTextField.setColumns(10);
		
		AdvertisingFeeTextField = new JTextField();
		AdvertisingFeeTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AdvertisingFeeTextField.setColumns(10);
		AdvertisingFeeTextField.setBounds(197, 92, 144, 31);
		General.add(AdvertisingFeeTextField);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Prize budgeted       :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(21, 133, 177, 31);
		General.add(lblNewLabel_2_1_1);
		
		PrizeBudgetedTextField = new JTextField();
		PrizeBudgetedTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		PrizeBudgetedTextField.setColumns(10);
		PrizeBudgetedTextField.setBounds(197, 133, 144, 31);
		General.add(PrizeBudgetedTextField);
		
		JLabel lblNewLabel = new JLabel("Finance Details");
		lblNewLabel.setBounds(165, 0, 636, 105);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JPanel Employee = new JPanel();
		Employee.setLayout(null);
		Employee.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		Employee.setBackground(Color.WHITE);
		Employee.setBounds(37, 287, 427, 177);
		panel.add(Employee);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.BLACK);
		panel_3_1.setBounds(0, 0, 922, 43);
		Employee.add(panel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(23, 0, 297, 43);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Employee Salary    :");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(21, 53, 177, 31);
		Employee.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Employee Quantity :");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(21, 92, 177, 31);
		Employee.add(lblNewLabel_2_1_2);
		
		RMTextField = new JTextField();
		RMTextField.setEditable(false);
		RMTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RMTextField.setColumns(10);
		RMTextField.setBounds(197, 53, 144, 31);
		Employee.add(RMTextField);
		
		QuantityEmployeeTextField = new JTextField();
		QuantityEmployeeTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		QuantityEmployeeTextField.setColumns(10);
		QuantityEmployeeTextField.setBounds(197, 92, 144, 31);
		Employee.add(QuantityEmployeeTextField);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Total Salary          :");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(21, 133, 177, 31);
		Employee.add(lblNewLabel_2_1_1_1);
		
		totalSalaryTextField = new JTextField();
		totalSalaryTextField.setEditable(false);
		totalSalaryTextField.setText("RM ");
		totalSalaryTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		totalSalaryTextField.setColumns(10);
		totalSalaryTextField.setBounds(197, 133, 144, 31);
		Employee.add(totalSalaryTextField);
		
		JPanel Participant = new JPanel();
		Participant.setLayout(null);
		Participant.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		Participant.setBackground(Color.WHITE);
		Participant.setBounds(37, 488, 427, 170);
		panel.add(Participant);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(Color.BLACK);
		panel_3_2.setBounds(0, 0, 922, 43);
		Participant.add(panel_3_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Revenue");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1_2.setBounds(23, 0, 297, 43);
		panel_3_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Registration Fee without discount:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(21, 53, 288, 31);
		Participant.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Total number of Participant        :");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_3.setBounds(21, 92, 288, 31);
		Participant.add(lblNewLabel_2_1_3);
		
		RfTextField = new JTextField();
		RfTextField.setEditable(false);
		RfTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RfTextField.setColumns(10);
		RfTextField.setBounds(298, 53, 107, 31);
		Participant.add(RfTextField);
		
		NoPtTextField = new JTextField();
		NoPtTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NoPtTextField.setColumns(10);
		NoPtTextField.setBounds(298, 92, 107, 31);
		Participant.add(NoPtTextField);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Total Income        :");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1.setBounds(21, 129, 177, 31);
		Participant.add(lblNewLabel_2_1_1_1_1);
		
		IncomeTextField = new JTextField();
		IncomeTextField.setEditable(false);
		IncomeTextField.setText("RM ");
		IncomeTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IncomeTextField.setColumns(10);
		IncomeTextField.setBounds(192, 129, 144, 31);
		Participant.add(IncomeTextField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 102));
		panel_1.setBounds(10, 61, 302, 10);
		panel.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 0, 102));
		panel_1_1.setBounds(657, 61, 309, 10);
		panel.add(panel_1_1);
		
		JPanel Record = new JPanel();
		Record.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		Record.setBackground(SystemColor.menu);
		Record.setBounds(506, 103, 427, 464);
		panel.add(Record);
		Record.setLayout(null);
		
		JLabel lblUtilityFee = new JLabel("Utility Fee             :");
		lblUtilityFee.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUtilityFee.setBounds(42, 61, 177, 31);
		Record.add(lblUtilityFee);
		
		UfTextField = new JTextField();
		UfTextField.setBackground(SystemColor.info);
		UfTextField.setEditable(false);
		UfTextField.setText("RM");
		UfTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		UfTextField.setColumns(10);
		UfTextField.setBounds(235, 61, 144, 31);
		Record.add(UfTextField);
		
		JLabel lblAdvertisingFee = new JLabel("Advertising Fee      :");
		lblAdvertisingFee.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdvertisingFee.setBounds(42, 102, 177, 31);
		Record.add(lblAdvertisingFee);
		
		AfTextField = new JTextField();
		AfTextField.setBackground(SystemColor.info);
		AfTextField.setEditable(false);
		AfTextField.setText("RM ");
		AfTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AfTextField.setColumns(10);
		AfTextField.setBounds(235, 102, 144, 31);
		Record.add(AfTextField);
		
		JLabel lblPrize = new JLabel("Prize budgeted       :");
		lblPrize.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrize.setBounds(42, 143, 177, 31);
		Record.add(lblPrize);
		
		PbTextField = new JTextField();
		PbTextField.setBackground(SystemColor.info);
		PbTextField.setEditable(false);
		PbTextField.setText("RM ");
		PbTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		PbTextField.setColumns(10);
		PbTextField.setBounds(235, 143, 144, 31);
		Record.add(PbTextField);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.inactiveCaptionText);
		panel_5.setBounds(25, 195, 373, 5);
		Record.add(panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Record Details");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(97, 10, 236, 41);
		Record.add(lblNewLabel_3);
		
		JLabel lblTotalSalary = new JLabel("Total Salary           :");
		lblTotalSalary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalSalary.setBounds(42, 226, 177, 31);
		Record.add(lblTotalSalary);
		
		TotalSalaryTextField = new JTextField();
		TotalSalaryTextField.setBackground(SystemColor.info);
		TotalSalaryTextField.setEditable(false);
		TotalSalaryTextField.setText("RM ");
		TotalSalaryTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TotalSalaryTextField.setColumns(10);
		TotalSalaryTextField.setBounds(235, 224, 144, 35);
		Record.add(TotalSalaryTextField);
		
		JLabel lblTotalIncome = new JLabel("Total Income         :");
		lblTotalIncome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotalIncome.setBounds(42, 267, 177, 31);
		Record.add(lblTotalIncome);
		
		TotalIncomeTextField = new JTextField();
		TotalIncomeTextField.setBackground(SystemColor.info);
		TotalIncomeTextField.setEditable(false);
		TotalIncomeTextField.setText("RM ");
		TotalIncomeTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TotalIncomeTextField.setColumns(10);
		TotalIncomeTextField.setBounds(235, 267, 144, 31);
		Record.add(TotalIncomeTextField);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.BLACK);
		panel_5_1.setBounds(25, 319, 373, 5);
		Record.add(panel_5_1);
		
		JLabel lblTotalNetProfit = new JLabel("Total Net Profit budgeted:");
		lblTotalNetProfit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotalNetProfit.setBounds(42, 343, 314, 31);
		Record.add(lblTotalNetProfit);
		
		txtRm = new JTextField();
		txtRm.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtRm.setText("RM");
		txtRm.setBounds(42, 394, 314, 31);
		Record.add(txtRm);
		txtRm.setColumns(10);
		
		JToggleButton tglbtnCalculate = new JToggleButton("Calculate");
		tglbtnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//General panel
				String u = UtilityFeeTextField.getText();
				String a = AdvertisingFeeTextField.getText();
				String p = PrizeBudgetedTextField.getText();
				
				double totalBudget = Double.parseDouble(u) + Double.parseDouble(a) + Double.parseDouble(p);
				
				//set the data at record details panel
				UfTextField.setText(u);
				AfTextField.setText(a);
				PbTextField.setText(p);
				
				//Employee panel
				
				//calculate total salary
				String eS = RMTextField.getText();
				String ep = QuantityEmployeeTextField.getText();
				
				double totalSalary = Integer.parseInt(ep) * Double.parseDouble(eS);
				String tSalary = String.valueOf(df2.format(totalSalary));
				totalSalaryTextField.setText("RM " + tSalary);
				
				//set the data at record details panel
				TotalSalaryTextField.setText("RM " + tSalary);
				
				//Participant panel
				//calculate total income
				String rf = RfTextField.getText();
				String noPt = NoPtTextField.getText();
				
				double totalIncome = Integer.parseInt(noPt) * Double.parseDouble(rf);
				String tIncome = String.valueOf(df2.format(totalIncome));
				IncomeTextField.setText("RM " + tIncome);
				
				//set the data at record details panel
				TotalIncomeTextField.setText("RM " + tIncome);
				
				//calculate total net profit
				double totalNetProfit = totalIncome - (totalBudget + totalSalary);
				String tNetProfit = String.valueOf(df2.format(totalNetProfit));
				txtRm.setText("RM " + tNetProfit);
			}
		});
		tglbtnCalculate.setFont(new Font("Tahoma", Font.BOLD, 24));
		tglbtnCalculate.setBounds(657, 591, 149, 55);
		panel.add(tglbtnCalculate);
		
		JToggleButton tglbtnExit = new JToggleButton("Back");
		tglbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(tglbtnExit, "Confirm if you want to exit", "Finance Details", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					EmployeeRegistrationBowling er = new EmployeeRegistrationBowling();
					er.setModalExclusionType(null);
					er.setVisible(true);
					dispose();
				}
			}
		});
		tglbtnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		tglbtnExit.setBounds(818, 591, 115, 55);
		panel.add(tglbtnExit);
		
		tglbtnReset = new JToggleButton("Reset");
		tglbtnReset.setBounds(514, 591, 135, 55);
		panel.add(tglbtnReset);
		tglbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UtilityFeeTextField.setText("");
				AdvertisingFeeTextField.setText("");
				PrizeBudgetedTextField.setText("");
				QuantityEmployeeTextField.setText("");
				NoPtTextField.setText("");
				
				UfTextField.setText("RM ");
				AfTextField.setText("RM ");
				PbTextField.setText("RM ");
				
				totalSalaryTextField.setText("RM ");
				IncomeTextField.setText("RM ");
				
				TotalSalaryTextField.setText("RM ");
				TotalIncomeTextField.setText("RM ");
				txtRm.setText("RM ");
				
			}
		});
		tglbtnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
	}
}
