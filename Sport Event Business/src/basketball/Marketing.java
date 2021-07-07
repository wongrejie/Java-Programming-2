package basketball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Marketing extends JFrame{

	private JPanel contentPane;
	private JTextField DaytextField;
	private JTextField PaymentTextField;

	/**
	 * Launch the application.
	 */
	
	   private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marketing frame = new Marketing();
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
	public Marketing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(10, 11, 680, 74);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MARKETING");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 45));
		lblNewLabel.setBounds(215, 11, 249, 52);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(10, 96, 680, 132);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Fee is only RM 50.00.");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 11, 660, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("The Champion of this event will receive prize up to RM 1000.00.");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 38, 586, 27);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("20% Discount if register during weekend.");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 65, 538, 27);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("All teams will get prizes.");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 90, 339, 27);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_2.setBackground(new Color(255, 182, 193));
		panel_2.setBounds(10, 239, 680, 74);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel Day = new JLabel("Day :");
		Day.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		Day.setBounds(10, 11, 203, 43);
		panel_2.add(Day);
		
		DaytextField = new JTextField();
		DaytextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		DaytextField.setBounds(64, 11, 195, 43);
		panel_2.add(DaytextField);
		DaytextField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Payment : RM");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_6.setBounds(380, 11, 144, 43);
		panel_2.add(lblNewLabel_6);
		
		PaymentTextField = new JTextField();
		PaymentTextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		PaymentTextField.setBounds(507, 11, 163, 43);
		panel_2.add(PaymentTextField);
		PaymentTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBackground(new Color(250, 240, 230));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton.setBounds(263, 13, 107, 33);
		panel_2.add(btnNewButton);
		
		JButton btnRegisterParticipant = new JButton("Register Participant");
		btnRegisterParticipant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Participant ad = new Participant();
				ad.setModalExclusionType(null);
				ad.setVisible(true);
				dispose();
			}
		});
				
		
		btnRegisterParticipant.setBackground(new Color(255, 218, 185));
		btnRegisterParticipant.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		btnRegisterParticipant.setBounds(398, 324, 287, 63);
		contentPane.add(btnRegisterParticipant);
		
		btnNewButton.addActionListener(event -> payment());
	
		


	
}
public void payment() {
PriceRate pay = new PriceRate();

	String c = DaytextField.getText();
	String discpay;
	
	
	if (c.equals("Friday") || c.equals("Saturday")) {
		WeekendDiscount calc = new WeekendDiscount();
		double discount = calc.disc();
		discpay = String.valueOf(df2.format(pay.totalPrice(discount)));
	}
	
	else
		discpay = String.valueOf(pay.totalPrice());
	
	PaymentTextField.setText("RM " + discpay);
}


}





