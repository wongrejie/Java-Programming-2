package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class financial extends JFrame {

	private JPanel contentPane;
	private JTextField expenseTextField;
	private JTextField totalSalaryextField;
	private JTextField incomeTextField;
	private JButton returnButton;
	private JButton salaryButton;
	private JButton incomeButton;
	private JButton profitButton;
	private JTextField netTextField;
	private double totalSalary;
	private JLabel participantLabel;
	private JTextField particiapantTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					financial frame = new financial();
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
	public financial(Double salary) {
		this.totalSalary=salary;
		initComponents();
		createEvents();
	}
	
	public financial() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		
		JPanel reportPanel = new JPanel();
		reportPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		reportPanel.setBackground(new Color(175, 238, 238));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(reportPanel, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(reportPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel utilityLabel = new JLabel("Utility Expense: RM");
		utilityLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		
		expenseTextField = new JTextField();
		expenseTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		expenseTextField.setColumns(10);
		
		JLabel totalSalaryLabel = new JLabel("Total Salary: RM");
		totalSalaryLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		totalSalaryextField = new JTextField();
		totalSalaryextField.setText("0.00");
		totalSalaryextField.setEditable(false);
		totalSalaryextField.setFont(new Font("Arial", Font.PLAIN, 11));
		totalSalaryextField.setBackground(new Color(192, 192, 192));
		totalSalaryextField.setColumns(10);
		
		JLabel totalIncomeLabel = new JLabel("Total Income: RM");
		totalIncomeLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		salaryButton = new JButton("Calculate");

		
		incomeTextField = new JTextField();
		incomeTextField.setBackground(new Color(192, 192, 192));
		incomeTextField.setText("0.00");
		incomeTextField.setEditable(false);
		incomeTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		incomeTextField.setColumns(10);
		
		incomeButton = new JButton("Calculate");

		
		JLabel profitLabel = new JLabel("Net Profit: RM");
		profitLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		netTextField = new JTextField();
		netTextField.setBackground(new Color(224, 255, 255));
		netTextField.setEditable(false);
		netTextField.setColumns(10);
		
		profitButton = new JButton("Calculate");
		
		participantLabel = new JLabel("Number of participants:");
		participantLabel.setFont(new Font("Arial", Font.BOLD, 11));
		
		particiapantTextField = new JTextField();
		particiapantTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		particiapantTextField.setColumns(10);

		GroupLayout gl_reportPanel = new GroupLayout(reportPanel);
		gl_reportPanel.setHorizontalGroup(
			gl_reportPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_reportPanel.createSequentialGroup()
					.addGap(209)
					.addGroup(gl_reportPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(expenseTextField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, gl_reportPanel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(totalSalaryLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(totalSalaryextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(salaryButton, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_reportPanel.createSequentialGroup()
							.addGroup(gl_reportPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(profitLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(incomeButton, Alignment.LEADING))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(netTextField, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
						.addComponent(profitButton, Alignment.LEADING)
						.addComponent(utilityLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_reportPanel.createSequentialGroup()
							.addComponent(totalIncomeLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(incomeTextField, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_reportPanel.createSequentialGroup()
							.addComponent(participantLabel, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(particiapantTextField, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
					.addGap(152))
		);
		gl_reportPanel.setVerticalGroup(
			gl_reportPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_reportPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(utilityLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(expenseTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(totalSalaryLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(totalSalaryextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(salaryButton)
					.addGap(26)
					.addGroup(gl_reportPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(totalIncomeLabel)
						.addComponent(incomeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_reportPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(participantLabel)
						.addComponent(particiapantTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(incomeButton)
					.addGap(18)
					.addGroup(gl_reportPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(profitLabel)
						.addComponent(netTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(profitButton)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		reportPanel.setLayout(gl_reportPanel);
		
		JLabel titleLabel = new JLabel("Financial");
		titleLabel.setForeground(new Color(255, 250, 250));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 27));
		
		returnButton = new JButton("");

		returnButton.setBackground(new Color(240, 255, 255));
		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(173)
					.addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
					.addGap(210))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(566, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(titleLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(returnButton)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
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
		
		salaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String total=String.valueOf(totalSalary);
				totalSalaryextField.setText(total);
			}
		});
		
		incomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double income=Double.parseDouble(particiapantTextField.getText())*200;
				String cost=String.valueOf(income);
				incomeTextField.setText(cost);
				
			}
		});
		
		profitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double uti=Double.parseDouble(expenseTextField.getText());
				Double sal=Double.parseDouble(totalSalaryextField.getText());
				Double inc=Double.parseDouble(incomeTextField.getText());
				
				Double net=inc-(uti+sal);
				
				netTextField.setText(String.valueOf(net));
			}
		});
	}
}
