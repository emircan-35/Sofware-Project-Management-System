package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ITWorkerScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ITWorkerScreen window = new ITWorkerScreen();
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
	public ITWorkerScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 537, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(359, 0, 171, 528);
		frame.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(42, 63, 107, 68);
		gradientPanel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Project Tasks");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton.setBounds(32, 188, 101, 34);
		gradientPanel.add(btnNewButton);
		
		JButton btnReports = new JButton("Report");
		btnReports.setBounds(32, 249, 101, 34);
		gradientPanel.add(btnReports);
		
		JButton btnNewButton_1_1 = new JButton("Meets");
		btnNewButton_1_1.setBounds(32, 310, 101, 34);
		gradientPanel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Personal \r");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 11, 339, 75);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\nInformation");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 82, 284, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(67, 190, 83, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 179, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 224, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(80, 238, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 269, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(114, 283, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Current Project:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(10, 314, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_3.setBounds(178, 328, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Experience:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(10, 359, 140, 34);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_4.setBounds(135, 373, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Salary:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(10, 404, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("New label");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_5.setBounds(96, 415, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Phone Number:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(10, 449, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("New label");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_6.setBounds(178, 460, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_6);
	}
}
