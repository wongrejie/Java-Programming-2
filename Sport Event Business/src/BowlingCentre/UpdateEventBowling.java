package BowlingCentre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class UpdateEventBowling extends JFrame {

	private JPanel contentPane;
	static JTable table;
	protected static String filePath = "/Sport Event Business/src/BowlingCentre/UpdateEvent.txt";
	private Image img_close = new ImageIcon(UserOptionBowling.class.getResource("closebtn.jpeg")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	protected JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEventBowling frame = new UpdateEventBowling();
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
	public UpdateEventBowling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 976, 704);
		contentPane.add(panel);
		
		JLabel lblclose = new JLabel("");
		lblclose.setBounds(936, 10, 30, 30);
		lblclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you confirm to exit", "Time Zone Bowling Centre", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					EmployeeRegistrationBowling er = new EmployeeRegistrationBowling();
					er.setModalExclusionType(null);
					er.setVisible(true);
					dispose();
				}
			}
		});
		panel.setLayout(null);
		lblclose.setHorizontalAlignment(SwingConstants.CENTER);
		lblclose.setIcon(new ImageIcon(img_close));
		panel.add(lblclose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(82, 158, 802, 397);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 87, 782, 300);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Duck Pin Bowling", "10-pin", "\n1. A game consists of 10 frames. Each box on the score sheet represents one frame."
						+ "\n 2. Maximum number of balls rolled in each frame is three."
						+ "\n 3. Add each frame\u2019s score to the previous one so that the game score progressively increases."
						+ "\n 4. If all ten pins are knocked down by the first ball in any frame, it is called a 'Strike' and is usually symbolised on the score sheet with an X."
						+ "\n 5. The maximum score is 300."},
				{"5-Pin Bowling", "5-pin", "\n1. In each frame, each player gets three attempts to knock all five pins over.\n "
						+ "2. Knocking all five pins down with the first ball is a strike, worth 15 points."
						+ "\n 3. If a bowler manages to clear the pins with the first ball, then this is a 'strike'."
						+ "\n 4. If a bowler succeeds upon his second attempt, then this is a 'spare'."
						+ "\n 5. The maximum score is 450."},
				{"Candlepin Bowling", "10-pin", "\n1. Each player gets three rolls per turn."
						+ "\n 2. This is scored by bowling 12 strikes: one in each box, and a strike with both bonus balls in the 10th box."
						+ "\n 3. Candlepins are thinner (hence the name \"candlepin\"), and thus harder to knock down."
						+ "\n 4. The candlepin pinsetter is triggered manually with a reset button after each frame rather than automatically."
						+ "\n 5. The maximum score is 300."},
			},
			new String[] {
				"Type of Event", "Category of Event", "Information"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(101);
		table.setForeground(Color.BLACK);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Update Bowling Event ");
		lblNewLabel_1.setBounds(80, 14, 643, 63);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton btnUpdateEvent = new JButton("Update Event");
		btnUpdateEvent.setBackground(new Color(240, 248, 255));
		btnUpdateEvent.setBounds(362, 595, 209, 54);
		btnUpdateEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int selectedRowIndex = table.getSelectedRow();
				
				String event = model.getValueAt(selectedRowIndex, 0).toString();
				String category = model.getValueAt(selectedRowIndex, 1).toString();
				String info = model.getValueAt(selectedRowIndex, 2).toString();
				
				String newEvent = JOptionPane.showInputDialog(null, "Enter new event here!", event);
				String newCategory = JOptionPane.showInputDialog(null, "Enter new category here!", category);
				String newInfo = JOptionPane.showInputDialog(null, "Enter new info here!", info);
				
				model.setValueAt(newEvent, selectedRowIndex, 0);
				model.setValueAt(newCategory, selectedRowIndex, 1);
				model.setValueAt(newInfo, selectedRowIndex, 2);
				
				try {
					File file = new File(filePath);
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpdateEvent.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnUpdateEvent);
		
		JLabel lblNewLabel = new JLabel("Time Zone Bowling Centre");
		lblNewLabel.setBackground(new Color(255, 255, 204));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(174, 32, 643, 76);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblNewLabel);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(240, 248, 255));
		btnDelete.setBounds(120, 595, 151, 54);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Time Zone Bowling Centre", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Time Zone Bowling Centre", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnDelete);
		
		JButton btnNewButton = new JButton("< Back");
		btnNewButton.setBounds(21, 20, 104, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeRegistrationBowling er = new EmployeeRegistrationBowling();
				er.setModalExclusionType(null);
				er.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 250, 240));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(btnNewButton);
		
		JButton btnGoToEvent = new JButton("Go to Event Details");
		btnGoToEvent.setBackground(new Color(240, 248, 255));
		btnGoToEvent.setBounds(647, 596, 215, 54);
		btnGoToEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDetailsBowling ed = new EventDetailsBowling();
				ed.setModalExclusionType(null);
				ed.setVisible(true);
				dispose();
			}
		});
		btnGoToEvent.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(btnGoToEvent);
		
		JLabel lblNewLabel_2 = new JLabel("Contact: 012-3456789 / Facebook page: TimeZoneBowlingCentre@fb.com");
		lblNewLabel_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(174, 101, 643, 24);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(UpdateEventBowling.class.getResource("/BowlingCentre/wp1929738.jpg")));
		lblNewLabel_3.setLabelFor(this);
		lblNewLabel_3.setBounds(10, 10, 956, 684);
		panel.add(lblNewLabel_3);
	}
}
