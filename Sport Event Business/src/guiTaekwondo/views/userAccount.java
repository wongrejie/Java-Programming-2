package guiTaekwondo.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class userAccount extends JFrame {

	private JPanel contentPane;
	private JTable accountTable;
	private JButton addButton;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private JButton editButton;
	private JButton removeButton;
	private JButton exportButton;
	private JButton returnButton;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userAccount frame = new userAccount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
    public void AddRowToJTable(Object[] dataRow)
    {
        DefaultTableModel model = (DefaultTableModel)accountTable.getModel();
        model.addRow(dataRow);
    }            
	
	/**
	 * Create the frame.
	 */
	public userAccount() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(0, 0, 139));
		
		JScrollPane tableScrollPane = new JScrollPane();
		
		JPanel actionPanel = new JPanel();
		actionPanel.setBackground(new Color(240, 248, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(titlePanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
				.addComponent(tableScrollPane, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
				.addComponent(actionPanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(titlePanel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(actionPanel, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
		);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		usernameTextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password:");
		
		passwordTextField = new JTextField();
		passwordTextField.setFont(new Font("Arial", Font.PLAIN, 11));
		passwordTextField.setText("");
		passwordTextField.setColumns(10);
		
		addButton = new JButton("Add");

		addButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		editButton = new JButton("Edit");

		editButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		removeButton = new JButton("Remove");
		removeButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		exportButton = new JButton("Export");
		exportButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_actionPanel = new GroupLayout(actionPanel);
		gl_actionPanel.setHorizontalGroup(
			gl_actionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_actionPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_actionPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(usernameLabel, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_actionPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(usernameTextField)
						.addComponent(passwordTextField))
					.addGap(39)
					.addComponent(addButton)
					.addGap(18)
					.addComponent(editButton)
					.addGap(18)
					.addComponent(removeButton)
					.addGap(18)
					.addComponent(exportButton)
					.addContainerGap(88, Short.MAX_VALUE))
		);
		gl_actionPanel.setVerticalGroup(
			gl_actionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_actionPanel.createSequentialGroup()
					.addGroup(gl_actionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_actionPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_actionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(usernameLabel)
								.addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_actionPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordLabel)
								.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_actionPanel.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_actionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(addButton)
								.addComponent(editButton)
								.addComponent(removeButton)
								.addComponent(exportButton))))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		actionPanel.setLayout(gl_actionPanel);
		
		JLabel titleLabel = new JLabel("User Account");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setForeground(new Color(224, 255, 255));
		titleLabel.setFont(new Font("Arial", Font.BOLD, 25));
		
		returnButton = new JButton("");

		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		returnButton.setBackground(new Color(0, 0, 128));
		GroupLayout gl_titlePanel = new GroupLayout(titlePanel);
		gl_titlePanel.setHorizontalGroup(
			gl_titlePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(128)
					.addComponent(titleLabel, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
					.addGap(179))
		);
		gl_titlePanel.setVerticalGroup(
			gl_titlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_titlePanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		titlePanel.setLayout(gl_titlePanel);
		
		setAccountTable(new JTable());
		getAccountTable().setForeground(new Color(255, 255, 255));
		getAccountTable().setFont(new Font("Arial", Font.PLAIN, 11));
		getAccountTable().setBackground(new Color(0, 0, 0));
		getAccountTable().setModel(new DefaultTableModel(
			new Object[][] {
				{"max", "12345"},
				{"bu", "12345"},
			},
			new String[] {
				"Username", "Password"
			}
		));
		tableScrollPane.setViewportView(getAccountTable());
		contentPane.setLayout(gl_contentPane);
		
	}


	private void createEvents() {
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) getAccountTable().getModel();
				if(usernameTextField.getText().isBlank()||passwordTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Invalid username and password.");
				}
				else {
					model.addRow(new Object[] { usernameTextField.getText(),passwordTextField.getText() });
				}


				if (getAccountTable().getSelectedRow() == -1) {
					if (getAccountTable().getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Account added.",
								"User Account", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		
		editButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) getAccountTable().getModel();
                // i = the index of the selected row
                int i = getAccountTable().getSelectedRow();
                
                if(usernameTextField.getText().isBlank()||passwordTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Invalid username and password.");
				}
				else {
	                if(i >= 0) 
	                {
	                   model.setValueAt(usernameTextField.getText(), i, 0);
	                   model.setValueAt(passwordTextField.getText(), i, 1);
	                }
				}

            }
        });
		
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) getAccountTable().getModel();
				if (getAccountTable().getSelectedRow() == -1) {
					if (getAccountTable().getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "User Account",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "User Account",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(getAccountTable().getSelectedRow());
				}
			}
		});
		
		exportButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\xuan2\\Downloads\\test.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < getAccountTable().getRowCount(); i++) {
						for (int j = 0; j < getAccountTable().getColumnCount(); j++) {
							bw.write(getAccountTable().getModel().getValueAt(i, j) + "  ");
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
		
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMainMenu frame = new adminMainMenu();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();

			}
		});
		
		
		
		}

	public JTable getAccountTable() {
		return accountTable;
	}

	public void setAccountTable(JTable accountTable) {
		this.accountTable = accountTable;
	}
	}	
