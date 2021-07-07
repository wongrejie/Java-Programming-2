package mainMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BowlingCentre.BowlingCentre;
import basketball.MainPage;
import futsal.Company_Background;
import gaming.GamingCenter;
import guiTaekwondo.views.mainMenu;

import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("Sport Event Business System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 795, 489);
		contentPane.add(panel);
		
		JButton btnBowling = new JButton("Bowling Centre");
		btnBowling.setForeground(Color.BLACK);
		btnBowling.setBackground(SystemColor.control);
		btnBowling.setBounds(131, 251, 152, 33);
		btnBowling.setFont(new Font("High Tower Text", Font.BOLD, 16));
		btnBowling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				BowlingCentre frame = new BowlingCentre();
				frame.setVisible(true);
				dispose();
			}
		});
		panel.setLayout(null);
		panel.add(btnBowling);
		
		JLabel title = new JLabel("");
		title.setBounds(79, -80, 646, 194);
		title.setIcon(new ImageIcon(MainMenu.class.getResource("/mainMenu/sport-removebg-preview.png")));
		panel.add(title);
		
		JLabel taekwondo = new JLabel("");
		taekwondo.setIcon(new ImageIcon(MainMenu.class.getResource("/mainMenu/taekwondo-black-glyph-icon-vector-removebg-preview.png")));
		taekwondo.setBounds(637, 59, 180, 139);
		panel.add(taekwondo);
		
		JLabel Gaming = new JLabel("");
		Gaming.setIcon(new ImageIcon(MainMenu.class.getResource("/mainMenu/123929-200-removebg-preview.png")));
		Gaming.setBounds(549, 296, 200, 139);
		panel.add(Gaming);
		
		JLabel bowling = new JLabel("");
		bowling.setIcon(new ImageIcon(MainMenu.class.getResource("/mainMenu/illust58-1456-removebg-preview.png")));
		bowling.setBounds(10, 278, 200, 166);
		panel.add(bowling);
		
		JLabel football = new JLabel("");
		football.setIcon(new ImageIcon(MainMenu.class.getResource("/mainMenu/football.png")));
		football.setBounds(0, 59, 152, 128);
		panel.add(football);
		
		JLabel basketball = new JLabel("");
		basketball.setIcon(new ImageIcon(MainMenu.class.getResource("/mainMenu/vector60-389-01-removebg-preview.png")));
		basketball.setBounds(277, 329, 189, 160);
		panel.add(basketball);
		
		JButton btnFutsal = new JButton("Futsal Centre");
		btnFutsal.setForeground(Color.BLACK);
		btnFutsal.setBackground(SystemColor.controlHighlight);
		btnFutsal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Company_Background frame = new Company_Background();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFutsal.setFont(new Font("High Tower Text", Font.BOLD, 16));
		btnFutsal.setBounds(30, 195, 136, 33);
		panel.add(btnFutsal);
		
		JButton btnBasketball = new JButton("Basketball Centre");
		btnBasketball.setForeground(Color.BLACK);
		btnBasketball.setBackground(SystemColor.controlHighlight);
		btnBasketball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage frame = new MainPage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBasketball.setFont(new Font("High Tower Text", Font.BOLD, 16));
		btnBasketball.setBounds(291, 296, 168, 33);
		panel.add(btnBasketball);
		
		JButton btnGaming = new JButton("Gaming Center");
		btnGaming.setForeground(Color.BLACK);
		btnGaming.setBackground(SystemColor.control);
		btnGaming.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GamingCenter frame = new GamingCenter();
				frame.setVisible(true);
				dispose();
			}
		});
		btnGaming.setFont(new Font("High Tower Text", Font.BOLD, 16));
		btnGaming.setBounds(462, 251, 162, 33);
		panel.add(btnGaming);
		
		JButton btnTaekwondo = new JButton(" Taekwondo Dojang");
		btnTaekwondo.setForeground(Color.BLACK);
		btnTaekwondo.setBackground(SystemColor.controlHighlight);
		btnTaekwondo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu frame =new mainMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnTaekwondo.setFont(new Font("High Tower Text", Font.BOLD, 16));
		btnTaekwondo.setBounds(565, 195, 184, 33);
		panel.add(btnTaekwondo);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/mainMenu/rainbow-watercolor-brush-strokes-background-vector-version-58965661.jpg")));
		lblBackground.setBounds(0, 67, 795, 422);
		panel.add(lblBackground);
	}
}
