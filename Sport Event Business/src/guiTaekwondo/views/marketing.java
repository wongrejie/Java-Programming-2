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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class marketing extends JFrame {

	private JPanel contentPane;
	private JTable eventTable;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField nameTextField;
	private JButton addButton;
	private JTextArea descriptionTextArea;
	private JComboBox dayComboBox;
	private JTextField rateTextField;
	private JButton editButton;
	private JButton exportButton;
	private JButton printButton;
	private JButton removeButton;
	private JButton resetButton;
	private JButton returnButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					marketing frame = new marketing();
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
	public marketing() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(0, 0, 128));
		titlePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JScrollPane tableScrollPane = new JScrollPane();
		
		JPanel editPanel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(titlePanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(editPanel, GroupLayout.PREFERRED_SIZE, 266, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(titlePanel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(editPanel, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addComponent(tableScrollPane, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))
		);
		
		JLabel nameLabel = new JLabel("Event Name:");
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		
		JLabel advLabel = new JLabel("Description:");
		
		descriptionTextArea = new JTextArea();
		
		addButton = new JButton("Add");
		
		editButton = new JButton("Edit");
		
		removeButton = new JButton("Remove");

		
		resetButton = new JButton("Reset");
		
		printButton = new JButton("Print");
		
		exportButton = new JButton("Export");
		
		JLabel dayLabel = new JLabel("Discount Day:");
		
		dayComboBox = new JComboBox();
		dayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"}));
		
		JLabel rateLabel = new JLabel("Discount Rate(%):");
		
		rateTextField = new JTextField();
		rateTextField.setText("00");
		rateTextField.setColumns(10);
		GroupLayout gl_editPanel = new GroupLayout(editPanel);
		gl_editPanel.setHorizontalGroup(
			gl_editPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_editPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(descriptionTextArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
						.addGroup(gl_editPanel.createSequentialGroup()
							.addComponent(nameLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nameTextField, 120, 120, 120)
							.addGap(69))
						.addGroup(Alignment.TRAILING, gl_editPanel.createSequentialGroup()
							.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(dayLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(rateLabel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(rateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_editPanel.createSequentialGroup()
									.addComponent(dayComboBox, 0, 92, Short.MAX_VALUE)
									.addGap(53))))
						.addComponent(advLabel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_editPanel.createSequentialGroup()
							.addGap(1)
							.addComponent(exportButton, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(printButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_editPanel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(resetButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_editPanel.createSequentialGroup()
								.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(editButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(removeButton))))
					.addContainerGap())
		);
		gl_editPanel.setVerticalGroup(
			gl_editPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_editPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameLabel)
						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(advLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(descriptionTextArea, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(dayLabel)
						.addComponent(dayComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rateLabel)
						.addComponent(rateTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(exportButton)
						.addComponent(printButton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(addButton)
						.addComponent(editButton)
						.addComponent(removeButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(resetButton)
					.addGap(20))
		);
		editPanel.setLayout(gl_editPanel);
		
		
		eventTable = new JTable();
		eventTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Event Name", "Description", "Discount Day", "Discount Rate (%)"
			}
		));
		tableScrollPane.setViewportView(eventTable);
		
		JLabel titlleLabel = new JLabel("Advertisement");
		titlleLabel.setForeground(new Color(245, 255, 250));
		titlleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titlleLabel.setFont(new Font("Arial", Font.BOLD, 28));
		
		returnButton = new JButton("");

		returnButton.setBackground(new Color(135, 206, 250));
		returnButton.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/return.png")).getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH)));
		GroupLayout gl_titlePanel = new GroupLayout(titlePanel);
		gl_titlePanel.setHorizontalGroup(
			gl_titlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addComponent(returnButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(126)
					.addComponent(titlleLabel, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
					.addGap(202))
		);
		gl_titlePanel.setVerticalGroup(
			gl_titlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_titlePanel.createSequentialGroup()
					.addGroup(gl_titlePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(returnButton)
						.addComponent(titlleLabel))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		titlePanel.setLayout(gl_titlePanel);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvents() {
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
				if(nameTextField.getText().isBlank()||descriptionTextArea.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Please input both event name and description.");
				}
				else {
					model.addRow(new Object[] { nameTextField.getText(),descriptionTextArea.getText(),dayComboBox.getSelectedItem(),rateTextField.getText() });
				}


				if (eventTable.getSelectedRow() == -1) {
					if (eventTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Info added.",
								"Advertisement", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		
		editButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
                // i = the index of the selected row
                int i = eventTable.getSelectedRow();
                
				if(nameTextField.getText().isBlank()||descriptionTextArea.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Please input both event name and description.");
				}
				else {
	                if(i >= 0) 
	                {
	                   model.setValueAt(nameTextField.getText(), i, 0);
	                   model.setValueAt(descriptionTextArea.getText(), i, 1);
	                   model.setValueAt(dayComboBox.getSelectedItem(), i, 2);
	                   model.setValueAt(rateTextField.getText(), i, 3);
	                }
				}

            }
        });
		
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // change e with other variable
				try {
					eventTable.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
		}
	});
		
		exportButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File(
							"/Sport Event Business/src/guiTaekwondo/views/advertisementRecord.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < eventTable.getRowCount(); i++) {
						for (int j = 0; j < eventTable.getColumnCount(); j++) {
							bw.write(eventTable.getModel().getValueAt(i, j) + "  ");
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
		
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
				if (eventTable.getSelectedRow() == -1) {
					if (eventTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "User Account",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "User Account",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(eventTable.getSelectedRow());
				}
			}
		});

		
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("");
				descriptionTextArea.setText("");
				rateTextField.setText("");
				dayComboBox.setSelectedItem("Sun");

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
}
