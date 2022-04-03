package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void openManagerScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerScreen window = new ManagerScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManagerScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 575, 527);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kEndColor = Color.RED;
		gradientPanel.kStartColor = Color.BLUE;
		gradientPanel.setBounds(359, 0, 243, 573);
		frame.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("MENU");
		lblNewLabel_4.setForeground(new Color(255, 255, 224));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(56, 84, 107, 48);
		gradientPanel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Meets");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("MeetsScreen");
			}
		});
		btnNewButton.setBounds(38, 161, 115, 32);
		gradientPanel.add(btnNewButton);
		
		JButton btnProjectTasks = new JButton("Project Tasks");
		btnProjectTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Project Tasks");
				
			}
		});
		btnProjectTasks.setBounds(38, 204, 115, 32);
		gradientPanel.add(btnProjectTasks);
		
		JButton btnTeam = new JButton("Team");
		btnTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Team Screen");
				
			}
		});
		btnTeam.setBounds(38, 247, 115, 32);
		gradientPanel.add(btnTeam);
		
		JButton btnProject = new JButton("Project");
		btnProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Project Info Screen");
				
				
			}
		});
		btnProject.setBounds(38, 290, 115, 32);
		gradientPanel.add(btnProject);
		
		JButton btnReports = new JButton("Reports");
		btnReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Reports Screen");
				
			}
		});
		btnReports.setBounds(38, 333, 115, 32);
		gradientPanel.add(btnReports);
		
		JLabel lblNewLabel = new JLabel("Personal \r");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 339, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Title:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 156, 103, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\nInformation");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 75, 284, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 201, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 246, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Current Project:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(10, 291, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Experience:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(10, 336, 140, 34);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Salary:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(10, 381, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Phone Number:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(10, 426, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(67, 167, 83, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(80, 215, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(114, 260, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_3.setBounds(178, 305, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_4.setBounds(135, 350, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("New label");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_5.setBounds(96, 392, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("New label");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_6.setBounds(178, 440, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_6);
	}
}
