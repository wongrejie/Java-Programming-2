package basketball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Participant extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField ParticipantNameTextField;
	private JTextField TeamNameTextField;
	private JTextField AgeTextField;
	private JTextField NumberOfParticipantTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Participant frame= new Participant();
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
	public Participant() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(10, 11, 893, 70);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PARTICIPANT");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 45));
		lblNewLabel.setBounds(312, 11, 276, 48);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_6 = new JButton("Back");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage frame =  new MainPage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_6.setBackground(new Color(255, 228, 181));
		btnNewButton_6.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_6.setBounds(10, 11, 102, 48);
		panel.add(btnNewButton_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBackground(new Color(240, 128, 128));
		panel_1.setBounds(10, 92, 264, 356);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 11, 77, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender :");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 42, 77, 29);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Team Name :");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 108, 113, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age :");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 177, 64, 26);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Number of Participant :");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 214, 244, 29);
		panel_1.add(lblNewLabel_5);
		
		ParticipantNameTextField = new JTextField();
		ParticipantNameTextField.setBounds(77, 10, 177, 29);
		panel_1.add(ParticipantNameTextField);
		ParticipantNameTextField.setColumns(10);
		
		TeamNameTextField = new JTextField();
		TeamNameTextField.setBounds(10, 137, 244, 29);
		panel_1.add(TeamNameTextField);
		TeamNameTextField.setColumns(10);
		
		AgeTextField = new JTextField();
		AgeTextField.setBounds(84, 176, 170, 35);
		panel_1.add(AgeTextField);
		AgeTextField.setColumns(10);
		
		JRadioButton Male = new JRadioButton("Male");
		Male.setBackground(new Color(240, 128, 128));
		Male.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		Male.setBounds(38, 78, 77, 23);
		panel_1.add(Male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBackground(new Color(240, 128, 128));
		female.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		female.setBounds(131, 78, 109, 23);
		panel_1.add(female);
		

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_4.setBackground(new Color(240, 128, 128));
		panel_4.setBounds(284, 92, 134, 356);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Category = new JLabel("Category :");
		Category.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		Category.setBounds(10, 11, 193, 36);
		panel_4.add(Category);
		
		JLabel lblNewLabel_7 = new JLabel("Court :");
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_7.setBounds(10, 150, 193, 36);
		panel_4.add(lblNewLabel_7);
		
		JComboBox comboBoxCourt = new JComboBox();
		comboBoxCourt.setModel(new DefaultComboBoxModel(new String[] {"Select", "A", "B","C","D","E","F"}));
		comboBoxCourt.setBackground(new Color(192, 192, 192));
		comboBoxCourt.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		comboBoxCourt.setBounds(10, 197, 114, 46);
		panel_4.add(comboBoxCourt);
		
		JRadioButton tvt = new JRadioButton("3v3");
		tvt.setBackground(new Color(240, 128, 128));
		tvt.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		tvt.setBounds(43, 54, 58, 23);
		panel_4.add(tvt);
		
		JRadioButton fvf = new JRadioButton("5v5");
		fvf.setBackground(new Color(240, 128, 128));
		fvf.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		fvf.setBounds(43, 85, 58, 23);
		panel_4.add(fvf);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender= " ";
				
				
				if (Male.isSelected()) {
					gender = Male.getText();
					
				} else {
					gender = female.getText();
				
				}
				String category= " ";
				if (tvt.isSelected()) {
					category = tvt.getText();
					
				}else {
					category = fvf.getText();
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						ParticipantNameTextField.getText(),
						gender,
						TeamNameTextField.getText(),
						AgeTextField.getText(),
						NumberOfParticipantTextField.getText(),
						category,
						comboBoxCourt.getSelectedItem(),
						
					
						
						
												
				});
		if (table.getSelectedRow() == -1) {
				if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(btnNewButton, "Participant Information Sucessfuly Added");
				
				}
		}
	}
});
		btnNewButton.setBounds(10, 265, 114, 80);
		panel_4.add(btnNewButton);
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(255, 182, 193));
		
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ParticipantNameTextField.setText("");
				TeamNameTextField.setText("");
				AgeTextField.setText("");
				Male.setSelected(false);
				female.setSelected(false);
				tvt.setSelected(false);
				fvf.setSelected(false);
				NumberOfParticipantTextField.setText("");
				comboBoxCourt.setSelectedItem(e);
				
			}
	
		});
		btnNewButton_4.setBackground(new Color(255, 182, 193));
		btnNewButton_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_4.setBounds(62, 282, 144, 63);
		panel_1.add(btnNewButton_4);
		
		NumberOfParticipantTextField = new JTextField();
		NumberOfParticipantTextField.setBounds(10, 242, 244, 35);
		panel_1.add(NumberOfParticipantTextField);
		NumberOfParticipantTextField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 0));
		panel_2.setBounds(428, 92, 475, 260);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 455, 238);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Gender", "Team Name", "Age", "Number of Participant", "Category", "Court"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(51);
		table.getColumnModel().getColumn(4).setPreferredWidth(114);
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(139, 0, 0), 5));
		panel_3.setBackground(new Color(255, 182, 193));
		panel_3.setBounds(428, 363, 475, 85);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Participant Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Participant Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_1.setForeground(new Color(220, 220, 220));
		btnNewButton_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1.setBounds(10, 11, 109, 63);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnNewButton_2.setForeground(new Color(230, 230, 250));
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_2.setBounds(129, 11, 109, 63);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Event Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventDetails ed = new EventDetails();
				ed.setModalExclusionType(null);
				ed.setVisible(true);
				dispose();
			}
	
		});
		btnNewButton_3.setBackground(new Color(220, 20, 60));
		btnNewButton_3.setForeground(new Color(220, 220, 220));
		btnNewButton_3.setFont(new Font("Tw Cen MT", Font.BOLD, 11));
		btnNewButton_3.setBounds(354, 12, 100, 63);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("UPLOAD");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file= new File("/Sport Event Business/src/basketball/txt/participant.txt");
					
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
			
	
		btnNewButton_5.setForeground(new Color(230, 230, 250));
		btnNewButton_5.setBackground(new Color(220, 20, 60));
		btnNewButton_5.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton_5.setBounds(248, 11, 96, 63);
		panel_3.add(btnNewButton_5);
		
		setBounds(100, 100, 929, 498);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
